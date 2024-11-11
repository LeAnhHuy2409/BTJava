package baitapchuong2;
import java.util.Scanner;

public class Bai6 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Nhập hai số nguyên
	        System.out.print("Nhập số nguyên thứ nhất: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Nhập số nguyên thứ hai: ");
	        int num2 = scanner.nextInt();

	        // Tính toán và hiển thị kết quả
	        int sum = num1 + num2;
	        int difference = num1 - num2;
	        int product = num1 * num2;
	        double quotient = (num2 != 0) ? (double) num1 / num2 : Double.NaN;

	        // In kết quả
	        System.out.println("\nKết quả:");
	        System.out.println("Tổng: " + sum);
	        System.out.println("Hiệu: " + difference);
	        System.out.println("Tích: " + product);
	        if (num2 != 0) {
	            System.out.println("Thương: " + quotient);
	        } else {
	            System.out.println("Thương: Không thể chia cho 0");
	        }

	        scanner.close();
	    }

}
