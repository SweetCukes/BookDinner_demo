package Test2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE) // ��Annotationֻ����������
@Retention(value=RetentionPolicy.RUNTIME)
// ��Annotation����ִ��ʱ��Ȼ��Ч
public @interface Test7 {
	// ����һ��key����,Ĭ��ֵΪ��Hello��
	public String key() default "Hello" ;
	// ����һ��value����,Ĭ��ֵΪ�����޼ɡ�
	public String value() default "���޼�" ;
}