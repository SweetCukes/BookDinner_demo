package Test2;

public class Test13 {
	public static void main(String args[]) throws Exception {
		Class<?> c = null ; // ȡ��Classʵ��
		c = Class.forName("com.ch23.inheriteddemo.Student") ;
		Annotation ann[] = c.getAnnotations();
		for (Annotation a : ann) { //���ȫ����Annotation
			System.out.println(a);
		}
		if (c.isAnnotationPresent(MyInheritedAnnotation.class)) {
			MyInheritedAnnotation mda = null;//�����Զ����ע�����
			// ȡ���Զ����Annotation,��Annotation�ǴӸ���̳ж���
			mda = c.getAnnotation(MyInheritedAnnotation.class);
			String name = mda.name();//�õ��Զ���ע��ָ����������
			System.out.println("name = "+name);//���name����������
		}
	}
}
