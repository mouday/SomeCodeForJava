package com.imooc;
import java.util.Scanner;
/*
 * ���ܣ�ʵ�ֽ��������༶������ѧ���ĳɼ���Ϣ������ƽ����
 * ֪ʶ�㣺����ѭ�������ѭ�����ư༶�������ڲ�ѭ������ѧԱ����*/
public class demo2 {
public static void main(String[] args) {
	int classNum=3;//�༶����
	int stuNum=4;//ѧ������
	double sum=0;//�ɼ��ܺ�
	double avg=0;//ƽ����
	Scanner input=new Scanner(System.in);//����Scanner����
	for(int i=1;i<=classNum;i++){//���ѭ�����ư༶����
		sum=0;//�ܷ����㣬��ʼ�ڶ���ѭ��
		System.out.println("****�������"+i+"���༶�ĳɼ�****");
	    for(int j=1;j<=stuNum;j++){//�ڲ�ѭ������ѧԱ����
	    	System.out.println("�������"+j+"��ѧԱ�ĳɼ�");
	    	int score=input.nextInt();//��ȡ����ĳɼ�
	    	sum=sum+score;//�ۼӷ���
	    }
	    avg=sum/stuNum;//����ƽ����
	    System.out.println("��"+i+"���༶ѧ����ƽ����Ϊ��"+avg);
	    
	}
}
}
