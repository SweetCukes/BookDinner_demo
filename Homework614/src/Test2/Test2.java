package Test2;

class ValHold{
	public int i = 0;
}
public class Test2 {
	public static void main(String[] args) {
		Test2 o = new Test2();
		o.amethod();
	}

	private void amethod() {
		int i = 99;
		ValHold v = new ValHold();
		v.i = 30;
		another(v,i	);
		System.out.print(v.i);
	}

	private void another(ValHold v, int i) {
		i = 0;
		v.i = 20;
		ValHold vh = new ValHold();
		v = vh;
		System.out.println(v.i);
		System.out.println(v);
	}
	//
}
