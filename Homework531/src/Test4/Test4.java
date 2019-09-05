package Test4;

public class Test4 {
	 public enum Season {
		 //枚举
         SPRING{
             @Override
             public void show(){
                 System.out.println("春天 —— 相关诗句：春分又绿江南岸");
             }
         },
         SUMMER{
             @Override
             public void show() {
                 System.out.println("夏天 —— 相关诗句：映日荷花别样红");
             }
         },
         AUTOMN{
             @Override
             public void show() {
                 System.out.println("秋天 —— 相关诗句：秋水共长天一色");
             }
         },
         WINNTER{
             @Override
             public void show() {
                 System.out.println("冬天 —— 相关诗句：窗含西岭千秋雪");
             }
         };
         private String value;
     	
         public String getValue()
         {
        	 return this.value;
         }

         public abstract void show();
     }
	 public static void main(String[] args)
		{
			
			Season.SPRING.show();
			
			Season.SUMMER.show();
			
			Season.AUTOMN.show();
			
			Season.WINNTER.show();
		}
}
