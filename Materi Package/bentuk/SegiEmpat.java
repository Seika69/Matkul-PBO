package bentuk;

import java.util.Scanner;

public class SegiEmpat{
	private int panjang, lebar, luas, keliling;

	Scanner input = new Scanner(System.in);

	public SegiEmpat(){
		System.out.print("Masukkan Panjang Segi Empat : ");
		panjang = input.nextInt();
		System.out.print("Masukkan Lebar Segi Empat : ");
		lebar = input.nextInt();
	}

	public int luasSegiEmpat(){
		luas = panjang * lebar;
		return luas;
	}

	public int kelilingSegiEmpat(){
		keliling = (2 * panjang) + (2 * lebar);
		return keliling;
	}
}
