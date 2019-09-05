package com.hangtao;

public class Test4 {
	// 使用@SuppressWarnings的Annotation
	@SuppressWarnings("unchecked")
	@Deprecated // 使用@Deprecated的Annotation
	@Override // 使用@Override的Annotation
	// 使用自定义的Annotation并设置两个属性内容
	@Test3(key = "JXCX", value = "www.JXCX.cn")
	public String toString() { // 覆写toString()方法
		return "Hello Annotation!!!" ; // 返回信息
	}
}
