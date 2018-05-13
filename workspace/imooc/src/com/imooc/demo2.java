package com.imooc;
import java.util.Scanner;
/*
 * 功能：实现接受三个班级的四名学生的成绩信息，计算平均分
 * 知识点：二重循环，外层循环控制班级数量，内层循环控制学员数量*/
public class demo2 {
public static void main(String[] args) {
	int classNum=3;//班级数量
	int stuNum=4;//学生数量
	double sum=0;//成绩总和
	double avg=0;//平均分
	Scanner input=new Scanner(System.in);//创建Scanner对象
	for(int i=1;i<=classNum;i++){//外层循环控制班级数量
		sum=0;//总分清零，开始第二次循环
		System.out.println("****请输入第"+i+"个班级的成绩****");
	    for(int j=1;j<=stuNum;j++){//内层循环控制学员个数
	    	System.out.println("请输入第"+j+"个学员的成绩");
	    	int score=input.nextInt();//获取输入的成绩
	    	sum=sum+score;//累加分数
	    }
	    avg=sum/stuNum;//计算平均分
	    System.out.println("第"+i+"个班级学生的平均分为："+avg);
	    
	}
}
}
