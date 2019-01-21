package javaa.exceptionhandling;
import java.io.IOException;
import java.sql.SQLException;
public class TestTryCatch2 {
	public static void main(String[] args) {
		System.out.println("main begin");
		try {
			show(0);
		} catch (ClassNotFoundException | IOException | SQLException e) {
			System.out.println("对异常进行了处理");
		}
		System.out.println("main end");
	}
	private static void show(int i) throws ClassNotFoundException,IOException,SQLException{
		System.out.println("+++++++");
		if(i==0) throw new IOException("输入输出流异常");
		System.out.println("=======");
		if(i==1) throw new SQLException("sql异常");
		if(i==2) throw new ClassNotFoundException("文件未找到异常");
		System.out.println("show run");
	}
}
