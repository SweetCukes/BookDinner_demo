package com.hangtao;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(value=RetentionPolicy.RUNTIME)//��Annotation����ִ��ʱ��Ȼ��Ч
public @interface Test3 {
	public String key() default "Hello";//����һ��key����,Ĭ��ֵΪ��Hello��
	public String value() default "���޼�";//����һ��value����,Ĭ��ֵΪ�����޼ɡ�
}
