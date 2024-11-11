package baitapchuong2;
import java.util.Scanner;
import java.util.Arrays;

public class SapXepMang {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Nhập số sinh viên
	        System.out.print("Nhập số sinh viên: ");
	        int n = scanner.nextInt();
	        
	        // Khai báo mảng điểm sinh viên
	        int[] scores = new int[n];
	        
	        // Nhập điểm các sinh viên
	        System.out.println("Nhập điểm các sinh viên (0-100):");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Điểm của sinh viên " + (i + 1) + ": ");
	            scores[i] = scanner.nextInt();
	        }
	        
	        // Tìm điểm cao nhất
	        int maxScore = scores[0];
	        for (int i = 1; i < n; i++) {
	            if (scores[i] > maxScore) {
	                maxScore = scores[i];
	            }
	        }
	        
	        // Tìm sinh viên có điểm cao nhất
	        int studentIndex = -1;
	        for (int i = 0; i < n; i++) {
	            if (scores[i] == maxScore) {
	                studentIndex = i + 1; // Sinh viên có điểm cao nhất
	                break;
	            }
	        }
	        
	        // Sắp xếp các điểm sinh viên theo thứ tự tăng dần
	        Arrays.sort(scores);
	        
	        // In ra kết quả
	        System.out.println("Điểm cao nhất: " + maxScore);
	        System.out.println("Sinh viên có điểm cao nhất là sinh viên thứ " + studentIndex);
	        System.out.println("Danh sách điểm các sinh viên theo thứ tự tăng dần:");
	        for (int score : scores) {
	            System.out.print(score + " ");
	        }
	        
	        scanner.close();
	    }

}
