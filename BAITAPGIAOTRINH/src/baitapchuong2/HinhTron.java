package baitapchuong2;

import java.util.Scanner;


public class HinhTron {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Nhập bán kính của hình tròn
	        System.out.print("Nhập bán kính của hình tròn: ");
	        double radius = scanner.nextDouble();
	        
	        // Tính diện tích và chu vi
	        double area = Math.PI * radius * radius;
	        double perimeter = 2 * Math.PI * radius;
	        
	        // Hiển thị kết quả
	        System.out.println("Diện tích của hình tròn: " + area);
	        System.out.println("Chu vi của hình tròn: " + perimeter);
	        
	        scanner.close();
	    }

}
