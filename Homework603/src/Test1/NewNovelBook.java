package Test1;

public class NewNovelBook extends NovelBook {

	public NewNovelBook(String _name, int _price, String _Author) {
		super(_name, _price, _Author);
		// TODO Auto-generated constructor stub
	}
	//复写getPrice方法，实现打折操作
	public int getPrice() {
		int newPrice = 0;
		if (super.getPrice()>40) {
			newPrice = super.getPrice() * 90/100;
		}else {
			newPrice = super.getPrice() * 80/100;
		}
		return newPrice;
		
	}

}
