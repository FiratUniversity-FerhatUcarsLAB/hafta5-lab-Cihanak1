
 * Ad Soyad: Cihan Akalın
 * Ogrenci No: 250541107
 * Tarih: 11.11.2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.





package odev_3;

import java.util.Scanner;


public class geo {

    // HESAPLAMA METOTLARI

    // KARE METOTLARI
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    // DİKDÖRTGEN METOTLARI
    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    public static double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    // DAİRE METOTLARI
    public static double calculateCircleArea(double radius) {
        // Math.PI ve Math.pow() kullanıldı.
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // ÜÇGEN METOTLARI
    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    public static double calculateTrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }


    // GİRDİ/ÇIKTI YÖNETİM METOTLARI

    public static void processSquare(Scanner scanner) {
        System.out.print("\n--- KARE ---\nKenar uzunluğunu (cm) girin: ");
        double kareKenar = scanner.nextDouble();

        double kareAlan = calculateSquareArea(kareKenar); 
        double kareCevre = calculateSquarePerimeter(kareKenar);

        System.out.printf("-> SONUÇ (K: %.2f) -> ALAN: %.2f cm², ÇEVRE: %.2f cm\n", 
                          kareKenar, kareAlan, kareCevre);
    }

    public static void processRectangle(Scanner scanner) {
        System.out.print("\n--- DİKDÖRTGEN ---\nGenişlik (cm) girin: ");
        double dikdortgenG = scanner.nextDouble();
        System.out.print("Yükseklik (cm) girin: ");
        double dikdortgenY = scanner.nextDouble();

        double dikdortgenAlan = calculateRectangleArea(dikdortgenG, dikdortgenY);
        double dikdortgenCevre = calculateRectanglePerimeter(dikdortgenG, dikdortgenY);

        System.out.printf("-> SONUÇ (G: %.2f, Y: %.2f) -> ALAN: %.2f cm², ÇEVRE: %.2f cm\n", 
                          dikdortgenG, dikdortgenY, dikdortgenAlan, dikdortgenCevre);
    }

    public static void processCircle(Scanner scanner) {
        System.out.print("\n--- DAİRE ---\nYarıçapı (cm) girin: ");
        double daireYaricap = scanner.nextDouble();

        double daireAlan = calculateCircleArea(daireYaricap);
        double daireCevre = calculateCircleCircumference(daireYaricap);

        System.out.printf("-> SONUÇ (r: %.2f) -> ALAN: %.2f cm², ÇEVRE: %.2f cm\n", 
                          daireYaricap, daireAlan, daireCevre);
    }

    public static void processTriangle(Scanner scanner) {
        // Alan ve Çevre için girdiler
        System.out.print("\n--- ÜÇGEN ---\nTaban uzunluğunu (cm) girin: ");
        double ucgenTaban = scanner.nextDouble();
        System.out.print("Yüksekliği (cm) girin: ");
        double ucgenYukseklik = scanner.nextDouble();
        
        System.out.print("1. Kenar (a) uzunluğunu girin: ");
        double kenarA = scanner.nextDouble();
        System.out.print("2. Kenar (b) uzunluğunu girin: ");
        double kenarB = scanner.nextDouble();
        System.out.print("3. Kenar (c) uzunluğunu girin: ");
        double kenarC = scanner.nextDouble();

        double ucgenAlan = calculateTriangleArea(ucgenTaban, ucgenYukseklik);
        double ucgenCevre = calculateTrianglePerimeter(kenarA, kenarB, kenarC);

        System.out.printf("-> ALAN SONUCU (T: %.2f, Y: %.2f): %.2f cm²\n", 
                          ucgenTaban, ucgenYukseklik, ucgenAlan);
        System.out.printf("-> ÇEVRE SONUCU (a+b+c: %.2f+%.2f+%.2f): %.2f cm\n", 
                          kenarA, kenarB, kenarC, ucgenCevre);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- GÖREV 1: GEOMETRİK ŞEKİL HESAPLAYICISI BAŞLADI ---\n");

        // Tüm şekillerin girdi/çıktı metotları sırayla çağrılıyor
        processSquare(scanner);
        processRectangle(scanner);
        processCircle(scanner);
        processTriangle(scanner);

        System.out.println("\n İşlem Tamamlandı \n");
        
        scanner.close();
    }
}
