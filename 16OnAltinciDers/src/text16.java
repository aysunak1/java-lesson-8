import java.util.Scanner;

public class text16 {
	static String username = "aysun";
	static String password = "123";

	public static void main(String[] args) {
		// KULLANICI ADI : AYSUN ÞÝFRE :123
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			System.out.print("Kullanýcý adýnýzý giriniz:");
			String kullanici = scanner.nextLine();

			System.out.print("Þifrenizi girin:");
			String sifre = scanner.nextLine();
			boolean sonuc = hak(kullanici, sifre);
			if (sonuc) {
				System.out.println("Giriþ yapýldý.");
				break;
			}

			else {

				System.out.println("Yanlýþ þifre girdiniz.");
			}
			if (i == 2) {
				System.out.println("Hesabýnýz bloke olmuþtur.");
			}

		}

	}

	public static boolean hak(String kullanici, String sifre) {
		if (kullanici.equals(username) && sifre.equals(password)) {
			return true;
		} else {
			return false;

		}
	}

}
