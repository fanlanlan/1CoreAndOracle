package javaa.io;
import java.io.File;
import java.io.FileFilter;
/**
 * 面试（笔试题）
 * 遍历一个根目录文件夹下的所有.Java文件
 * 用递归方法
 */
public class TestJavaFilesList {
	public static void main(String[] args) {
		File f = new File("E://BaiduNetdiskDownload");
		javaListFiles(f);
	}
	static void javaListFiles(File fil){
		File[] files = fil.listFiles(new FileFilter() {
			@Override
			public boolean accept(File fil) {
				if(fil.isDirectory()) javaListFiles(fil);
				if(fil.isFile()) {
					String name = fil.getName();
					if(name.endsWith(".java")){
					System.out.println(name);
					return true;
					}
				else{
					return false;
				} 
				}
				return false;
			}
		});
	}
}