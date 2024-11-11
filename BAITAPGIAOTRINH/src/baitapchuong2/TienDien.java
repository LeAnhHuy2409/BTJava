package baitapchuong2;

import java.util.Scanner;

public class TienDien {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Nhập số điện tiêu thụ
	        System.out.print("Nhập số điện tiêu thụ trong tháng: ");
	        double consumption = scanner.nextDouble();
	        
	        // Tính tiền điện phải thanh toán theo đơn giá
	        double amount;
	        if (consumption <= 50) {
	            amount = consumption * 1.5;
	        } else if (consumption <= 100) {
	            amount = 50 * 1.5 + (consumption - 50) * 2;
	        } else if (consumption <= 200) {
	            amount = 50 * 1.5 + 50 * 2 + (consumption - 100) * 3;
	        } else {
	            amount = 50 * 1.5 + 50 * 2 + 100 * 3 + (consumption - 200) * 4;
	        }
	        
	        // Hiển thị kết quả
	        System.out.println("Số tiền phải thanh toán: " + amount);
	        
	        scanner.close();
	    }

}
