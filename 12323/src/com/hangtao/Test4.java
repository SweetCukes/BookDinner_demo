package com.hangtao;

public class Test4 {
	// ʹ��@SuppressWarnings��Annotation
	@SuppressWarnings("unchecked")
	@Deprecated // ʹ��@Deprecated��Annotation
	@Override // ʹ��@Override��Annotation
	// ʹ���Զ����Annotation������������������
	@Test3(key = "JXCX", value = "www.JXCX.cn")
	public String toString() { // ��дtoString()����
		return "Hello Annotation!!!" ; // ������Ϣ
	}
}
