package Test2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
public class Test1 {

	@SuppressWarnings("unchecked")//压制警告注解
	@Deprecated // 使用@deprecated的annotation
	@Override // @Override的Annotation
	public String toString() { //复写toString()
		return "Hello Annotation!!!" ;// 返回
		}
	
}

