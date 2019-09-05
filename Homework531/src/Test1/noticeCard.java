package Test1;

public class noticeCard {
	
	private static String cardId; 
	private static String password;
	
	String regex1 = "\\d{12,21}";
	String regex2 = "\\d{6}";
	public void IsPass(){
		if(!cardId.matches(regex1)) {
			throw new RuntimeException("卡号不规范");
		}else {
			System.out.println("卡号正确！");
		}
		
		if(!password.matches(regex2)) {
			throw new RuntimeException("密码不符合要求");
		}else {
			System.out.println("密码正确");
			System.out.println("验证成功！！");
		}
	}
	
	public static void main(String[] args){
		noticeCard nc = new noticeCard();
		cardId = "1232424";
		password = "874832";
		nc.IsPass();
	}
}
