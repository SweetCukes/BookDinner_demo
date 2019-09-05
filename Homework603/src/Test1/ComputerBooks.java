package Test1;

public class ComputerBooks implements IComputerBooks{

		private String name;
	    private String scope;
	    private String author;
	    private int price;
	    public ComputerBooks(String _name,String _scope,String _author,int _price) {
	    	this.name = _name ;
	    	this.scope = _scope ;
	    	this.author = _author ;
	    	this.price = _price ;
	    }
	    
	     public String getScope() {
	         return this.scope;
	    }
	 
	     public String getAuthor() {
	         return this.author;
	    }
	 
	     public String getName() {
	         return this.name;
	     }
	     
	     public int getPrice() {
	         return this.price;
	     }
	 
	 }