package Test2;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
public class Test2 {
public static void main(String args[])throws Exception {//异常抛出
	Class<?> c = null ;
	c = Class.forName("com.ch23.retentiondemo.SimpleBeanOne") ; 
	Method toM = c.getMethod("toString"); // 取得toString()方法 
	Annotation an[] = toM.getAnnotations(); // 取得全部的
	for (Annotation a : an) {
		System.out.println(a);
	}
}
}

