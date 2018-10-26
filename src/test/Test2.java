package test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**

 * <p>Title: Test2</p>  

 * <p>Description: 读取文件，并想另一个文件写数据</p>  

 * @author yangshuxin 

 * @date 2018年10月24日
 */
public class Test2 {
	
	public static void main(String[] args) throws IOException{
		FileReader in = null;
		FileWriter out = null;
		in = new FileReader("E:/yusys/workBeMySelf/ysx2/WebContent/input.txt");
		out = new FileWriter("E:/yusys/workBeMySelf/ysx2/WebContent/output.txt");
		int c;
		while((c = in.read()) != -1){
			out.write(c);
		}
		if(in != null){
			in.close();
		}
		if(out != null){
			out.close();
		}
		
	}

}
