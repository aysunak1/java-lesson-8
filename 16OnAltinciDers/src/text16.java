import java.util.Scanner;

public class text16 {
	static String username = "aysun";
	static String password = "123";

	public static void main(String[] args) {
		// KULLANICI ADI : AYSUN ��FRE :123
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			System.out.print("Kullan�c� ad�n�z� giriniz:");
			String kullanici = scanner.nextLine();

			System.out.print("�ifrenizi girin:");
			String sifre = scanner.nextLine();
			boolean sonuc = hak(kullanici, sifre);
			if (sonuc) {
				System.out.println("Giri� yap�ld�.");
				break;
			}

			else {

				System.out.println("Yanl�� �ifre girdiniz.");
			}
			if (i == 2) {
				System.out.println("Hesab�n�z bloke olmu�tur.");
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
