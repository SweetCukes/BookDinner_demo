package Test5;
import java.lang.reflect.Array;
public class ChangeArrayDemo {
	public static void main(String[] args) throws Exception {
		int temp[] = {1,2,3} ; // 声明一个整型数组
		int newTemp[] = (int[])arrayInc(temp,5);//扩大数组长度 
		print(newTemp) ;// 打印数组信息 
		System.out.println("\n----------------------------") ; 
		String t[] = { "Hello", "word", "java" };//字符串数组 
		String nt[] = (String[])arrayInc(t,8) ;//扩大数组长度
		print(nt);
	}
public static Object arrayInc(Object obj,int len){
	//改数组大小 
	Class<?> c = obj.getClass() ; 
	// 通过数组得到Class对象 
	Class<?> arr =c.getComponentType();
	//数组的Class对象 
	Object newO =Array.newInstance(arr, len);
	//新的数组大小 
	int co = Array.getLength(obj) ;
	// 取得数组长度 
	System.arraycopy(obj,0,newO,0,co) ;
	// 拷贝数组内容
	return co;
}
public static void print(Object obj){ // 输出数组
Class<?> c = obj.getClass() ; //通过数组得到Class对象 if(!c.isArray()){ //判断是否是数组
return ; // 不是则返回
} 
}
