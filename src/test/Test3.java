package test;
/**
 * 

 * <p>Title: ���520</p>  

 * <p>Description: </p>  

 * @author yangshuxin 

 * @date 2018��10��26��
 */
public class Test3 {
	public static void main(String[] args) {
		int n = 4;
		for(int i = 0; i < n; i++){
			System.out.print("*");
		}
		for(int j = 0; j < 2; j++){
			System.out.print(" ");
		}
		for(int i = 0; i < n; i++){
			System.out.print("*");
		}
		for(int j = 0; j < 2; j++){
			System.out.print(" ");
		}
		for(int i = 0; i < n; i++){
			System.out.print("*");
		}
		System.out.println();
		
		
		for(int i = 0; i < (n-1)/2; i++){
			System.out.print("*");
			for(int j = 0; j < (n-1)+2+(n-1); j++){
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = 0; j < 2; j++){
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = 0; j < n-2; j++){
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		
		
		
		for(int i = 0; i < n; i++){
			System.out.print("*");
		}
		for(int j = 0; j < 2; j++){
			System.out.print(" ");
		}
		for(int i = 0; i < n; i++){
			System.out.print("*");
		}
		for(int j = 0; j < 2; j++){
			System.out.print(" ");
		}
		System.out.print("*");
		for(int j = 0; j < n-2; j++){
			System.out.print(" ");
		}
		System.out.print("*");
		System.out.println();
		
		
		for(int i = 0; i < (n-1)/2+1; i++){
			for(int j = 0; j < n-1; j++){
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = 0; j < 2; j++){
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = 0; j < (n-1)+2; j++){
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = 0; j < n-2; j++){
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		
		
		
		for(int i = 0; i < n; i++){
			System.out.print("*");
		}
		for(int j = 0; j < 2; j++){
			System.out.print(" ");
		}
		for(int i = 0; i < n; i++){
			System.out.print("*");
		}
		for(int j = 0; j < 2; j++){
			System.out.print(" ");
		}
		for(int i = 0; i < n; i++){
			System.out.print("*");
		}
	
	}

}
