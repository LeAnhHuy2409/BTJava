package baitap;
import java.util.Scanner;

public class BaiTap {
	
		public static void main(String[] args) {
			int x;
			Scanner sc= new Scanner(System.in);
			System.out.print("x=");
			x=sc.nextInt();
		 if(x%4==0&&x%100!=0||x%4==0&&x%400!=0)
			 System.out.println("là năm nhuận");
		 else
			 System.out.println("không phải là năm nhuận");
		}

}
