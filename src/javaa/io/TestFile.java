package javaa.io;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
public class TestFile {
	/**
	 * I/O学习前的File讲解
	 */
	public static void main(String[] args){
		//在指定目录下创建指定名字的文件或者文件夹
		File f=new File("E://BaiduNetdiskDownload/a.java");//创建File对象
		if(f.exists()){//exist();是否存在
			f.delete();//delete();删除文件
			f.mkdir();//mkdir();创建Fire文件夹
		}else{
			f.mkdir();//创建Fire名的文件夹
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//创建Fire名的文件
		}
		System.out.println(f.getAbsolutePath());//获取绝对路径
		File f2=new File("E://BaiduNetdiskDownload");
		//FileFilter-------继承FileFilter接口的文件检索类 *
		File[] ff=f2.listFiles(new FileFilter(){
			public boolean accept(File f) {
				//System.out.println("File对象以"+f.getName()+"为参数调用accept");
				if(f.isDirectory())return true;
				String name=f.getName();
				//过滤关于.Java文件
				if(name.endsWith(".java")) {
					System.out.println("我是Java文件"+name+".java");
					return true;
				}else return false;
			}
		});
		//指定目录下的文件或者目录名的遍历
		for(File a:ff){
			if(a.isDirectory()){
				System.out.println("目录名为："+a.getName());
			}else if(a.isFile()){
				System.out.println("文件名为："+a.getName());
			}
		}
	}
}