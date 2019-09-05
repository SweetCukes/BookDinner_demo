package com.hangtao;

public class Test13 {
	public static void main(String args[]) throws Exception {
		Class<?> c = null ; // 取得Class实例
		c = Class.forName("com.ch23.inheriteddemo.Student") ;
		Annotation ann[] = c.getAnnotations();
		for (Annotation a : ann) { //输出全部的Annotation
			System.out.println(a);
		}
		if (c.isAnnotationPresent(MyInheritedAnnotation.class)) {
			MyInheritedAnnotation mda = null;//声明自定义的注解对象
			// 取得自定义的Annotation,此Annotation是从父类继承而来
			mda = c.getAnnotation(MyInheritedAnnotation.class);
			String name = mda.name();//得到自定义注解指定变量内容
			System.out.println("name = "+name);//输出name变量的内容
		}
	}
}
