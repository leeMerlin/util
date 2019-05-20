package com.java.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.SQLOutput;
import java.util.Random;

public class RandomColoer {
    public static void main(String[] args) throws IOException {
        //随机种子
        Random random = new Random();
        //生成redRandom随机值
        int redRandom = random.nextInt(256);
        //生成greenRandom随机值
        int greenRandom = random.nextInt(256);
        //生成buleRandom随机值
        int buleRandom = random.nextInt(256);
        System.out.println("R:" + redRandom + ",G:" + greenRandom + ",B:" + buleRandom);
        //开始用随机颜色绘制图片
        //在图片缓冲区生成一个图片对象，指定图片大小和类型
        BufferedImage bufferedImage = new BufferedImage(120, 40, BufferedImage.TYPE_INT_RGB);
        //获取画笔
        Graphics g = bufferedImage.getGraphics();
        //设置画笔颜色，使用随机生成的颜色
        Color color = new Color(redRandom, greenRandom, buleRandom);
        g.setColor(color);
        //开始绘制矩形，充满图片缓冲区
        g.fillRect(0, 0, 120, 40);
        //用黑色绘制文字
        g.setColor(Color.BLACK);
        g.drawString("验证码", 40, 50);
        //输出图片
        //指定文件路径
        File file = new File("F:/code.jpg");
        //获取字节输出流
        OutputStream outputStream = new FileOutputStream(file);
        //将图片从缓冲区通过字节流写到文件
        ImageIO.write(bufferedImage, "jpg", outputStream);
        //及时关闭这个输出流
        outputStream.close();
    }
}
