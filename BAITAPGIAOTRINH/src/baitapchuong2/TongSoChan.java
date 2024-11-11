package baitapchuong2;

public class TongSoChan {
	 public static void main(String[] args) {
	        int sum = 0;
	        for (int i = 2; i <= 100; i += 2) { // Chỉ lặp qua các số chẵn
	            sum += i;
	        }
	        System.out.println("Tổng các số chẵn từ 1 đến 100: " + sum);
	    }

}
