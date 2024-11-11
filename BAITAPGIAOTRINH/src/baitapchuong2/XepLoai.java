package baitapchuong2;

import java.util.Scanner;

public class XepLoai {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập điểm thi của sinh viên
        System.out.print("Nhập điểm thi (0-100): ");
        int score = scanner.nextInt();
        
        // Xếp loại sinh viên
        if (score >= 90) {
            System.out.println("Loại A");
        } else if (score >= 80) {
            System.out.println("Loại B");
        } else if (score >= 70) {
            System.out.println("Loại C");
        } else if (score >= 60) {
            System.out.println("Loại D");
        } else {
            System.out.println("Loại F");
        }
        
        scanner.close();
    }

}
