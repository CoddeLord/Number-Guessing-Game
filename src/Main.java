import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, tahmin, hakkiniz;
        hakkiniz = 3;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı Tahmin Oyununa Hoş geldiniz. 3 Tahmin Hakkınız Var. Tahmin Aralığınız 1 ile 100 Arasıdır.");
        sayi = random.nextInt(100) + 1; // 1 ile 100 arasındaki sayıları almasıdır.

        while (hakkiniz > 0) {
            System.out.println("Sayı Oluşturuldu... Tahmininiz Nedir?");
            tahmin = scanner.nextInt();

            if (tahmin < 1 || tahmin > 100) {
                System.out.println("Geçersiz Sayı Girdiniz.");
                break;
            }

            if (sayi == tahmin) {
                System.out.println("Doğru tahmin :)");
                break;
            } else {
                hakkiniz--;
                if (hakkiniz > 0) {
                    System.out.println("Yanlış Tahmin! Kalan Tahmin Hakkınız: " + hakkiniz);
                } else {
                    System.out.println("Üzgünüm, Tahmin Hakkınız Kalmadı. Doğru Cevap: " + sayi + " idi. Oyunu Kaybettiniz.");
                }
            }
        }

        scanner.close();
    }
}
