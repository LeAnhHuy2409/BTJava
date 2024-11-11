package baitapchuong2;

import java.util.Scanner;

public class UngDungSwitchCase {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Nhập hai số thực
	        System.out.print("Nhập số thực thứ nhất: ");
	        double num1 = scanner.nextDouble();
	        System.out.print("Nhập số thực thứ hai: ");
	        double num2 = scanner.nextDouble();

	        // Nhập ký tự (A, S, M, D)
	        System.out.print("Nhập ký tự phép toán ('A' - cộng, 'S' - trừ, 'M' - nhân, 'D' - chia): ");
	        char operator = scanner.next().charAt(0);

	        // Thực hiện phép toán căn cứ vào ký tự nhập vào
	        double result;
	        boolean isValid = true;

	        switch (operator) {
	            case 'A':  // Tính tổng
	                result = num1 + num2;
	                System.out.println("Tổng: " + result);
	                break;
	            case 'S':  // Tính hiệu
	                result = num1 - num2;
	                System.out.println("Hiệu: " + result);
	                break;
	            case 'M':  // Tính tích
	                result = num1 * num2;
	                System.out.println("Tích: " + result);
	                break;
	            case 'D':  // Tính thương
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("Thương: " + result);
	                } else {
	                    System.out.println("Không thể chia cho 0");
	                }
	                break;
	            default:  // Ký tự không hợp lệ
	                System.out.println("Ký tự vừa nhập không hợp lệ");
	                isValid = false;
	        }

	        scanner.close();
	    }

}
