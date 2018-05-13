package com.imooc;
import java.util.Scanner;
/*
 * 加分直到60，统计累加次数
 * 步骤：
 * 变量保存分数
 * 使用循环
 * 每次加1份
 * 导入java.util.scanner
 * 创建对象
 * 接受保存输入值；
 * */
public class demo {
      public static void main(String[] args){
    	  Scanner input=new Scanner(System.in);
    	  System.out.print("请输入考试成绩：");
    	  int score=input.nextInt();//获取输入成绩
    	  int count=0;//次数
    	  System.out.println("加分前的成绩："+score);
    	  while(score<60){
    		  score++;
    		  count++;
    	  }
    	  System.out.println("加分后的成绩："+score);
    	  System.out.println("共计加了："+count+"次");
      }
}
