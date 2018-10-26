package test;
/**
 * 

 * <p>Title: 输出520</p>  

 * <p>Description: </p>  

 * @author yangshuxin 

 * @date 2018年10月26日
 */
public class Test3 {
	public static void main(String[] args) {
		int n = 10;
		for(int i = 0; i < n; i++){
			System.out.print("*");
		}
		System.out.println();
		for(int i = 0; i < (n-1)/2; i++){
			System.out.println("*");
		}
		for(int i = 0; i < n; i++){
			System.out.print("*");
		}
		System.out.println();
		for(int i = 0; i < (n-1)/2+1; i++){
			for(int j = 0; j < n-1; j++){
				System.out.print(" ");
			}
			System.out.println(""+"*");
		}
		for(int i = 0; i < n; i++){
			System.out.print("*");
		}
	
	}

}
