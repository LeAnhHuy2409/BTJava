package baitapchuong2;

import java.util.Scanner;

public class HinhChuNhat {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập vào hai cạnh của hình chữ nhật
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double length = scanner.nextDouble();
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double width = scanner.nextDouble();
        
        // Tính diện tích và chu vi
        double area = length * width;
        double perimeter = 2 * (length + width);
        
        // Hiển thị kết quả
        System.out.println("Diện tích của hình chữ nhật: " + area);
        System.out.println("Chu vi của hình chữ nhật: " + perimeter);
        
        scanner.close();
    }

}
