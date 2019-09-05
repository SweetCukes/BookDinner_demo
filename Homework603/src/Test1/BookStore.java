package Test1;

import java.text.NumberFormat;
import java.util.ArrayList;

public class BookStore  {

	private final static ArrayList<IBook> bookList = new ArrayList<IBook>();
	static {
		bookList.add(new NovelBook("123",123,"595"));
		bookList.add(new NovelBook("244", 50, "920"));
		bookList.add(new NovelBook("jkl",96,"582"));
		bookList.add(new NovelBook("rui", 483, "7777"));
		bookList.add(new ComputerBooks("C语言", "面向对象", "111", 578));
	}
	public static void main(String[] args) {
		NumberFormat fomat = NumberFormat.getCurrencyInstance();
		fomat.setMaximumFractionDigits(2);
		System.out.println("售出情况：");
		for (IBook iBook:bookList) {
			System.out.println("书籍名称：" +iBook.getName() +
										"书籍作者：" +iBook.getAuthor()+
										"书籍价格："+ iBook.getPrice());
			
}
}
}

