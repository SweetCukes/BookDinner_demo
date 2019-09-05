package Test2;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Documented
@Inherited // ��Annotation���Ա��̳�
//��Annotation����ִ��ʱ��Ȼ��Ч
@Retention(value=RetentionPolicy.RUNTIME)
public @interface Test10 {
	public String name() ; // ����name������������
}