package com.imooc;
import java.util.Scanner;
/*
 * �ӷ�ֱ��60��ͳ���ۼӴ���
 * ���裺
 * �����������
 * ʹ��ѭ��
 * ÿ�μ�1��
 * ����java.util.scanner
 * ��������
 * ���ܱ�������ֵ��
 * */
public class demo {
      public static void main(String[] args){
    	  Scanner input=new Scanner(System.in);
    	  System.out.print("�����뿼�Գɼ���");
    	  int score=input.nextInt();//��ȡ����ɼ�
    	  int count=0;//����
    	  System.out.println("�ӷ�ǰ�ĳɼ���"+score);
    	  while(score<60){
    		  score++;
    		  count++;
    	  }
    	  System.out.println("�ӷֺ�ĳɼ���"+score);
    	  System.out.println("���Ƽ��ˣ�"+count+"��");
      }
}
