package aula5;

import java.util.Scanner;

public class Ex1Aula5 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		String dataeua = in.nextLine();
		formatarData(dataeua);
		in.close();
	}
	private static void formatarData(String dataeua) {
		String[] databr = dataeua.split("/");
		System.out.println(databr[1] + "/" + databr[0] + "/" + databr[2]);
	}
}