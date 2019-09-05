package com.hangtao;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
public class Test1 {
	public static void main(String args[])throws Exception {//异常抛出
		Class<?> c = null ; // 取得Class实例
		c = Class.forName("com.ch23.hangtao.Test2") ;
		Method toM = c.getMethod("toString"); // 取得toString()方法
		Annotation an[] = toM.getAnnotations(); // 取得全部的Annotation
		for (Annotation a : an) { // foreach输出
			System.out.println(a); // 直接输出信息
		}
	}
}