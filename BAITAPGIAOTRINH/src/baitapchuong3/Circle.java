package baitapchuong3;
import java.util.Scanner;

public class Circle implements GeometricObject {
public double radium;
	
	public  Circle() {
		
	}

	public Circle(double radium) {
		this.radium = radium;
	}
	
	@Override
	public double getPerimeter() {
		double cv;
		cv = 2*Math.PI*radium;
		return cv;
		
	}
	
	@Override
	public double getArea() {
		double dt;
		dt = Math.PI*radium*radium;
		return dt;
	}
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ban kinh:");
		radium = sc.nextDouble();
	}
	
	public void Xuat() {
		System.out.println("Chu vi hinh tron la :" + getPerimeter());
		System.out.println("Dien tich hinh tron la :" + getArea());
	}

}
