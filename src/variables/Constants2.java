package variables;

public class Constants2 {
	public static final double CM_PER_INCH = 2.54;
	public static void main(String[] args) {
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
	}
}


/**
 * 1. Bagaimana output dari masing masing class Constants dan Constants2?
 * 		Output dari class Constants dan Constants2 itu sama, yaitu konversi paperWidth dan paperHeight yang asalnya inci menjadi CM
 * 		dengan cara mengalikan bilangan inci masing-masing dengan konstanta CM_PER_INCH
 * 
 * 2. Apa perbedaan penggunaan final double dengan public static final double?
 * 		final double yang ada pada Constants hanya bisa diakses di dalam modul main saja.
 * 		public static final double yang ada pada Constants2 bisa diakses oleh semua class dalam package yang sama.
 * 	
 */
