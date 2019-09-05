package Test1;

import java.text.NumberFormat;
import java.util.ArrayList;

public class NovelBook implements IBook {

	private String Name;
	private String Author;
	private int Price;
	@Override
	public String getName() {
		return this.Name;
	}@Override
	public int getPrice() {
		return this.Price;
	}@Override
	public String getAuthor() {
		return this.Author;
	}
	
	public NovelBook(String _name,int _price,String _Author) {
		this.Name = _name ;
		this.Price = _price ;
		this.Author = _Author ;
		
	}
}
	
	