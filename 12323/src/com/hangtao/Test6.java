package com.hangtao;

import com.ch23.reflectannotation.MyAnnotationReflect;
@MyAnnotationReflect(key = "JXCX", value = "www.JXCX.cn")
public class Test6 {// ʹ���Զ����Annotation������������������
@MyAnnotationReflect(key = "JXCX", value = "www.JXCX.cn")
	public String toString() { // ��дtoString()����
		return "Hello Annotion!!!" ; // ������Ϣ
	}
}
