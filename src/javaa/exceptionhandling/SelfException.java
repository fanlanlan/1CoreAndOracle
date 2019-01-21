package javaa.exceptionhandling;

public class SelfException {

	public static void main(String[] args) {
		String name="fanlanlan";
		String password="fanlanla";
		try {
			login(name, password);
		} catch (Exception e) {
			System.out.println("登录不成功的处理异常");
		}
	}

	private static void login(String name,String password) {
		if("fanlanlan".equals(name) && "fanlanlan".equals(password)){	
			System.out.println("您已经登陆成功");
		}else{
			System.out.println("登录不成功");
			throw new LoginException(); 
		}
	}
}
class LoginException extends RuntimeException{
	public LoginException(){}
	public LoginException(String massage){
		super(massage);
	}
}
