
public class test4 {
	public static void main(String[] args) {
	
	Float totalMeoney = 20000.8f;
	Float ownMeoney = 17000.5f;
	Float leftMeoney = totalMeoney - ownMeoney; 
	System.out.println("剩余金额:"+leftMeoney);
//两个float类型的数据相减会丢失精度，尾部带着长长的一串数字。
//	可以用bigdecimal进行计算，也可以把单位做成整数再做除法。
}}
