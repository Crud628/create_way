package com.ihrm.demo;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

/**
 * @author lan
 * @date 2021/4/18 - 22:22
 */
public class ParseJwtTest {
    /**
     * 解析jwtToken字符串
     */
    public static void main(String[] args) {
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI4OCIsInN1YiI6IuWwj-eZvSIsImlhdCI6MTYxODc1NTg1MywiY29tcGFueUlkIjoiMTIzNDU2IiwiY29tcGFueU5hbWUiOiJsYW4ifQ.UcBMP3DCWfA7V11JjeEkKeGX-Tx57nxn6RDg2sjcD8U";
        Claims claims = Jwts.parser().setSigningKey("ihrm").parseClaimsJws(token).getBody();

        //私有数据存放在claims
        System.out.println(claims.getId());//88
        System.out.println( claims.getSubject());//小白
        System.out.println(claims.getIssuedAt());//time

        //解析自定义claim中的内容
        String companyId = (String)claims.get("companyId");
        String companyName = (String)claims.get("companyName");

        System.out.println(companyId + "---" + companyName);//123456---lan
    }
}
