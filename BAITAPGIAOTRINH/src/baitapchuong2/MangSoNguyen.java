package baitapchuong2;

import java.util.Scanner;

public class MangSoNguyen {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Nhập số phần tử của mảng
	        System.out.print("Nhập số phần tử của mảng: ");
	        int n = scanner.nextInt();
	        
	        // Khai báo mảng số nguyên
	        int[] a = new int[n];
	        
	        // Nhập các phần tử vào mảng
	        System.out.println("Nhập các phần tử của mảng:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Phần tử thứ " + (i + 1) + ": ");
	            a[i] = scanner.nextInt();
	        }
	        
	        // Hiển thị các phần tử của mảng
	        System.out.println("Các phần tử của mảng là:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(a[i] + " ");
	        }
	        
	        scanner.close();
	    }

}
