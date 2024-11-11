package baitapchuong2;
import java.util.Scanner;

public class ChuoiKyTu {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên: ");
        int soNguyen = scanner.nextInt();

        System.out.print("Nhập số thực: ");
        double soThuc = scanner.nextDouble();

        System.out.print("Nhập ký tự: ");
        char kyTu = scanner.next().charAt(0); // Lấy ký tự đầu tiên của chuỗi nhập vào
        
        scanner.nextLine();

        System.out.print("Nhập chuỗi: ");
        String chuoi = scanner.nextLine();

        System.out.println("Số nguyên: " + soNguyen);
        System.out.println("Số thực: " + soThuc);
        System.out.println("Ký tự: " + kyTu);
        System.out.println("Chuỗi:" + chuoi);
    }

}
