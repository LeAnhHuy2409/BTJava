package baitapchuong2;

import java.util.Scanner;

public class SoNguyenTo {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập một số nguyên
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();
        
        // Kiểm tra số nguyên tố
        boolean isPrime = true;
        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime) {
            System.out.println(number + " là số nguyên tố.");
        } else {
            System.out.println(number + " không phải là số nguyên tố.");
        }
        
	}
}
