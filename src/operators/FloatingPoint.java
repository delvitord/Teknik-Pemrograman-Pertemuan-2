package operators;

public class FloatingPoint {
	public static void main(String[] args) {
		double x = 92.98;
		int nx = (int) Math.round(x);
		System.out.println(nx);
	}
}

/**
 * 1. Pada kasus berikut jelaskan nilai nx setelah digunakan Math.round(x);
 * 		Nilai nx akan menampung hasil dari operasi Math.round(x), yaitu membulatkan value dari variabel x.
 * 
 * 2. Kenapa dibutuhkan cast (int) dalam penggunaan Math.round(x) ?
 * 		Karena nilai kembalian dari Math.round untuk variabel bertipe double adalah long. Sedangkan variabel nx
 * 		bertipe int, maka nilai kembalian long dari Math.round tersebut diubah ke int.
 * 
 */


