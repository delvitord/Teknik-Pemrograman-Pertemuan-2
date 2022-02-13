package operatorsone;

class ConvertDataType {
	static short methodOne(long l)
	{
		int i = (int) l;
		return (short) i;
	}
	public static void main(String[] args)
	{
		double d = 10.25;
		float f = (float) d;
		byte b = (byte) methodOne((long)f);
		System.out.println(b);
	}
}

/**
 * 1. Jelaskan output nilai dari variable b.
 *		Variabel b akan menampung nilai return dari modul methodOne (yang bertipe short) yang diubah ke tipe data byte.
 *		Sehingga outputnya tidak akan menjadi bilangan desimal.
 *
 * 2. Jelaskan apa yang berubah dari variable d menjadi variable b setelah dilakukan cast 
 * 		a. variabel d yang bertipe data double yang bernilai 10.25, ditampung ke variabel f yang bertipe data float, sehingga ada cast (float)
 * 		b. value dari variabel f akan diinput ke modul methodOne. Karena parameter inputnya yaitu variabel l bertipe long, maka ada cast (long) untuk variabel f
 * 		c. nilai dari variabel l akan dimasukkan ke variabel i. Variabel i bertipe data int, sehingga ada cast (int) untuk variabel l.
 * 		d. variabel i akan menjadi return value bertipe short dari modul methodOne. Karena variabel bertipe int, maka terdapat cast (short)
 * 		e. nilai kembalian dari modul methodOne tersebut dimasukkan ke variabel b yang bertipe byte. Sehingga nilai kembalian dari modul yang bertipe short, 
 * 		diubah dengan cast (byte)
 */