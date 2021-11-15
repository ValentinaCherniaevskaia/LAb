package Lab1;
import java.util.Scanner;
public class Lab1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Введите первое число: ");
		int a = in.nextInt();
		System.out.print("Введите второе число: ");
		int b = in.nextInt();
		System.out.print("Введите третье число: ");
		int c = in.nextInt();
		System.out.print("Введите четверное число: ");
		int d = in.nextInt();

		if ((a < b) && (a < c) && (a < d)) {
		System.out.println("Первое число наименьшее");
		} else if ((b < a) && (b < c) && (b < d)) {
		System.out.println("Второе число наименьшее");
		} else if ((c < a) && (c < b) && (c < d)) {
		System.out.println("Третье число наименьшее");
		} else if ((d < a) && (d < b) && (d < c)) {
		System.out.println("Четвертое число наименьшее");
		}
		in.close();
		}
	}