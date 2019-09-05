package com.hangtao;

import com.ch23.reflectannotation.MyAnnotationReflect;
@MyAnnotationReflect(key = "JXCX", value = "www.JXCX.cn")
public class Test6 {// 使用自定义的Annotation并设置两个属性内容
@MyAnnotationReflect(key = "JXCX", value = "www.JXCX.cn")
	public String toString() { // 覆写toString()方法
		return "Hello Annotion!!!" ; // 返回信息
	}
}
