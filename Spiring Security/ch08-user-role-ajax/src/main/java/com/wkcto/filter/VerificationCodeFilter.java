package com.wkcto.filter;

import com.wkcto.common.MyFailureHandler;
import com.wkcto.common.MySuccessHandler;
import com.wkcto.common.VerificationException;
import com.wkcto.vo.Result;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class VerificationCodeFilter extends OncePerRequestFilter {

    private MyFailureHandler failureHandler = new MyFailureHandler();
    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

        System.out.println("VerificationCodeFilter  doFilterInternal ");
        //只有是login操作，才需要这个过滤器参与验证码的使用
        String uri = request.getRequestURI();
        if( !"/login".equals(uri)){
            //过滤器正常执行，不参与验证码操作
            filterChain.doFilter(request,response);
        } else {
            //登录操作，需要验证code
            try{
                //验证：code是否正确
                verifcatioinCode(request);
                //如果验证通过，过滤器正常执行
                filterChain.doFilter(request,response);


            }catch (VerificationException e){
                Result result  = new Result();
                result.setCode(1);
                result.setError(1002);
                result.setMsg("验证码错误！！！");
                failureHandler.setResult(result);
                failureHandler.onAuthenticationFailure(request,response,e);
            }
        }
    }

    private void verifcatioinCode(HttpServletRequest request){
        HttpSession session = request.getSession();
        //获取请求中的code
        String requestCode = request.getParameter("code");
        //获取session中的code
        String sessionCode = "";

        Object attr = session.getAttribute("code");
        if(attr !=null ){
            sessionCode = (String)attr;
        }
        System.out.println("VerificationCodeFilter  doFilterInternal requestCode:"+requestCode+"|sessionCode:"+sessionCode);
        //处理逻辑
        if(!StringUtils.isEmpty(sessionCode)){
            //在session中的code， 用户看到这个code了。
            //如果能到这段代码，说明用户已经发起了登录请求的。
            //session中的现在的这个code就应该无用
            session.removeAttribute("code");
        }

        //判断code是否正确。
        if( StringUtils.isEmpty(requestCode) ||
                StringUtils.isEmpty(sessionCode) ||
                !requestCode.equals(sessionCode) ){
            //失败
            throw new VerificationException();
        }
    }
}
