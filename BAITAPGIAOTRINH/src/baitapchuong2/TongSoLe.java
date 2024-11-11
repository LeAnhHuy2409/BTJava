package baitapchuong2;

public class TongSoLe {
	public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i += 2) { // Chỉ lặp qua các số lẻ
            sum += i;
        }
        System.out.println("Tổng các số lẻ từ 1 đến 100: " + sum);
    }

}
