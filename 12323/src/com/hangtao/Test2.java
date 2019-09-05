package com.hangtao;

public class Test2 {
	@SuppressWarnings("unchecked")//使用压制警告注解
	@Deprecated // 使用@Deprecated的Annotation
	@Override // 使用@Override的Annotation
	public String toString() { // 覆写toString()方法
		return "Hello Annotation!!!" ;// 返回信息
	}
}
