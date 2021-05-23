package com.wkcto.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.security.util.Cache;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

@Controller
@RequestMapping("/captcha")
public class CaptchaController {

    //定义一个值，用来生成验证码的图片
    //图像宽度 120像素
    private int width = 120;

    //图像高度 30 像素
    private int height = 30;

    //图片内容在图片的起始位置 12像素
    private  int drawY = 20;

    //文字的间隔  18像素
    private int space = 15;

    //验证码有个文字
    private int charCount = 6;

    //验证码的内容数组
    private String chars []= {"A","B","C","D","E","F",
    "G","H","I","J","K","L","M","N","O","P","T","U","V","W",
    "X","Y","Z","1","2","3","4","5","6","7","8","9","0"};



    //定义方法：生成验证码内容。 在一个图片上，写入文字
    @GetMapping("/code")
    public void makeCaptchaCode(HttpServletRequest request,HttpServletResponse response) throws IOException {

        /*
           验证码：需要在内存中绘制一个图片BufferedImage.
           向这个图片中写入文字。 把绘制好内容的图片响应给请求
         */

        //创建一个背景透明的图片，使用rgb表示颜色的
        BufferedImage image = new BufferedImage(width,height, BufferedImage.TYPE_INT_RGB);

        //获取画笔
        Graphics g  = image.getGraphics();

        //设置使用画笔是白颜色
        g.setColor(Color.white);

        //给image画板都涂成白色的
        // fillRect(矩形的起始x，矩形的起始y， 矩形的宽度，矩形的高度)
        g.fillRect(0,0,width,height);

        //画内容
        //创建一个字体
        Font font  = new Font("宋体",Font.BOLD,16);
        g.setFont(font);

        g.setColor(Color.black);
        //在画布上，写一个文字
        //参数： 文字，x，y坐标
        //g.drawString("中",10,drawY);

        StringBuffer buffer = new StringBuffer("");
        int ran = 0;
        int len = chars.length;
        for(int i=0;i<charCount;i++){
            ran  = new Random().nextInt(len);
            buffer.append(chars[ran]);
            g.setColor(makeColor());
            g.drawString(chars[ran],(i+1)*space,drawY);
        }

        //绘制干扰线
        for(int m=0;m<4;m++){
            g.setColor(makeColor());
            int dot [] = makeLineDot();
            g.drawLine(dot[0],dot[1],dot[2],dot[3]);
        }

        //把生成的验证码存储到session中
        request.getSession().setAttribute("code",buffer.toString());

        //设置没有缓冲
        response.setHeader("Pragma","no-cache");
        response.setHeader("Cache-Control","no-cache");
        response.setDateHeader("Expires",0);
        response.setContentType("image/png");
        OutputStream out = response.getOutputStream();
        /*
           RenderedImage im, 输出的图像
           String formatName, 图像的格式 jpg，jpeg， png
           ImageOutputStream output 输出到哪
         */
        ImageIO.write(image,"png",out);
        out.flush();
        out.close();

    }

    private Color makeColor(){
        Random random = new Random();
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);

        return new Color(r,g,b);
    }

    private int [] makeLineDot(){
        Random random = new Random();
        int x1 = random.nextInt(width/2);
        int y1 = random.nextInt(height);
        int x2 = random.nextInt(width);
        int y2 = random.nextInt(height);
        return new int[]{x1,y1,x2,y2};

    }
}
