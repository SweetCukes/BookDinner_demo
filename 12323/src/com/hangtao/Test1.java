package com.hangtao;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
public class Test1 {
	public static void main(String args[])throws Exception {//�쳣�׳�
		Class<?> c = null ; // ȡ��Classʵ��
		c = Class.forName("com.ch23.hangtao.Test2") ;
		Method toM = c.getMethod("toString"); // ȡ��toString()����
		Annotation an[] = toM.getAnnotations(); // ȡ��ȫ����Annotation
		for (Annotation a : an) { // foreach���
			System.out.println(a); // ֱ�������Ϣ
		}
	}
}