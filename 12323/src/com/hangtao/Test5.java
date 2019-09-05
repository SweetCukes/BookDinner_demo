package com.hangtao;

import java.lang.reflect.Method;
public class Test5 {
	public static void main(String args[]) throws Exception {
		Class<?> c = null ; // 取得Class实例
		c = Class.forName("com.ch23.reflectannotation.SimpleBeanTwo") ;
		Method toM = c.getMethod("toString");//取得toString()方法
		if (toM.isAnnotationPresent(annotationClass)(MyAnnotationReflect.class)){
			MyAnnotationReflect mda = null; // 声明自定义的Annotation对象
			// 取得自定义的Annotation
			mda = toM.getAnnotation(MyAnnotationReflect.class);
			String key = mda.key(); // 得到Annotation中指定变量的内容
			String value = mda.value();// 得到Annotation中指定变量的内容
			System.out.println("key = " + key);// 输出Annotation中的key
			System.out.println("value = " + value);//输出Annotation中的
			value
		}
	}
}