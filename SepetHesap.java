 * Ad Soyad: Cihan Akalın
 * Ogrenci No: 250541107
 * Tarih: 11.11.2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program alışveriş sitelerindeki ürün miktarı, adedi , kdv tutarı , indirim tutarı gibi genel hesapların detaylıca işlenmesini içerir.



 
     
 package odev_3;

import java.util.Scanner;

public class sepet {

    //SABİTLER
    final static double VAT_RATE = 0.18;      // %18 KDV oranı (0.18)
    final static double SHIPPING_FEE = 29.99; // Sabit kargo ücreti

    //ZORUNLU HESAPLAMA METOTLARI
   
    // Ürün Satış Toplamı
    public static double calculateItemTotal(double price, int quantity) {
        return price * quantity;
    }

    // Ara Toplam
    public static double calculateSubtotal(double item1Total, double item2Total, double item3Total) {
        // Formül: SatışTop 1 + SatışTop 2 + SatışTop 3
        return item1Total + item2Total + item3Total;
    }

    // İndirim Tutarı
    public static double calculateDiscountAmount(double subtotal, double discountPercentage) {
         return subtotal * (discountPercentage / 100.0);
    }

    // İndirimli Toplam
    public static double calculateDiscountedTotal(double subtotal, double discountAmount) {
         return subtotal - discountAmount;
    }

    // KDV Tutarı Hesabı
    public static double calculateVatAmount(double discountedTotal) {
        return discountedTotal * VAT_RATE;
    }

    // Genel Toplamı Hesaplar
    public static double calculateGrandTotal(double discountedTotal, double vatAmount) {
       return discountedTotal + vatAmount + SHIPPING_FEE;
    }

    // GİRDİ/ÇIKTI YÖNETİM METODU

    public static void processCart(Scanner scanner) {
        System.out.println("\n--- GÖREV 3: E-TİCARET SEPET HESAPLAYICI ---\n");

        // GİRDİ ADIMI: Ürün Fiyat ve Adetlerini Almak
        
        System.out.print("Ürün 1 (Klavye) Fiyatı: ");
        double price1 = scanner.nextDouble();
        System.out.print("Ürün 1 Adedi: ");
        int quantity1 = scanner.nextInt();

        System.out.print("Ürün 2 (Mouse) Fiyatı: ");
        double price2 = scanner.nextDouble();
        System.out.print("Ürün 2 Adedi: ");
        int quantity2 = scanner.nextInt();

        System.out.print("Ürün 3 (Monitör) Fiyatı: ");
        double price3 = scanner.nextDouble();
        System.out.print("Ürün 3 Adedi: ");
        int quantity3 = scanner.nextInt();
        
        System.out.print("Uygulanacak İndirim Oranı (Örn: 10, 25): %");
        double discountRate = scanner.nextDouble();

        // HESAPLAMA ADIMI: Metotları Sırayla Çağırmak

        // 1. Satış Toplamları
        double total1 = calculateItemTotal(price1, quantity1);
        double total2 = calculateItemTotal(price2, quantity2);
        double total3 = calculateItemTotal(price3, quantity3);

        // 2. Ara Toplam
        double subtotal = calculateSubtotal(total1, total2, total3);
        
        // 3. İndirim Tutarı
        double discountAmount = calculateDiscountAmount(subtotal, discountRate);
        
        // 4. İndirimli Toplam
        double discountedTotal = calculateDiscountedTotal(subtotal, discountAmount);

        // 5. KDV Tutarı
        double vatAmount = calculateVatAmount(discountedTotal);

        // 6. Genel Toplam
        double grandTotal = calculateGrandTotal(discountedTotal, vatAmount);

        // ÇIKTI ADIMI:
        
        System.out.println("\n--- SEPET ÖZETİ ---");
        System.out.printf("Ürün Toplamı (1): %.2f TL\n", total1);
        System.out.printf("Ürün Toplamı (2): %.2f TL\n", total2);
        System.out.printf("Ürün Toplamı (3): %.2f TL\n", total3);
        
        System.out.printf("a. Ara Toplam: %.2f TL\n", subtotal);
        System.out.printf("b. İndirim (%%%s): -%.2f TL\n", (int)discountRate, discountAmount);
        System.out.printf("c. İndirimli Toplam: %.2f TL\n", discountedTotal);
        System.out.printf("d. KDV Tutarı (%%%s): +%.2f TL\n", (int)(VAT_RATE * 100), vatAmount);
        System.out.printf("e. Kargo Ücreti: +%.2f TL\n", SHIPPING_FEE);
        
        System.out.println("-------------------------");
        System.out.printf("** GENEL TOPLAM: %.2f TL **\n", grandTotal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processCart(scanner);

        System.out.println("\n İşlem Tamamlandı \n");
        
        scanner.close();
    }
}
