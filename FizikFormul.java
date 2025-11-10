 * Ad Soyad: Cihan Akalın
 * Ogrenci No: 250541107
 * Tarih: 11.11.2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel fizik formüllerini gerekli sembol ve değerleri ile çıktı verir.


package odev_3;

import java.util.Scanner;


public class fizik_Hesaplari {

    final static double GRAVITY = 9.8; 

    //HESAPLAMA METOTLARI

    public static double calculateVelocity(double distance, double time) {
        return distance / time; // Hız (v= s / t)
    }

    public static double calculateAcceleration(double deltaVelocity, double time) {
        return deltaVelocity / time; // İvme (a= ∆v / t)
    }

    public static double calculateForce(double mass, double acceleration) {
        return mass * acceleration; // Kuvvet (F= m × a)
    }

    public static double calculateWork(double force, double distance) {
        return force * distance; // İş (W= F × d)
    }

    public static double calculatePower(double work, double time) {
        return work / time; // Güç (P= W / t)
    }

    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2); // Kinetik Enerji (KE= 0.5 × m × v^2)
    }

    public static double calculatePotentialEnergy(double mass, double height) {
        return mass * GRAVITY * height; // Potansiyel Enerji (PE= m × g × h)
    }

    public static double calculateMomentum(double mass, double velocity) {
        return mass * velocity; // Momentum (p= m × v)
    }

    //GİRDİ/ÇIKTI YÖNETİM METOTLARI
    
    public static void processPhysicsVelocity(Scanner scanner) {
        System.out.print("\n--- HIZ (V) ---\nAlınan yol (s, m) girin: ");
        double distance = scanner.nextDouble();
        System.out.print("Geçen süre (t, s) girin: ");
        double time = scanner.nextDouble();
        double velocity = calculateVelocity(distance, time);
        System.out.printf("-> SONUÇ (s=%.1f, t=%.1f) -> Hız: %.2f m/s\n", distance, time, velocity);
    }

    public static void processPhysicsAcceleration(Scanner scanner) {
        System.out.print("\n--- İVME (A) ---\nHız değişimi (∆v, m/s) girin: ");
        double deltaVelocity = scanner.nextDouble();
        System.out.print("Geçen süre (t, s) girin: ");
        double time = scanner.nextDouble();
        double acceleration = calculateAcceleration(deltaVelocity, time);
        System.out.printf("-> SONUÇ (∆v=%.1f, t=%.1f) -> İvme: %.2f m/s²\n", deltaVelocity, time, acceleration);
    }

    public static void processPhysicsForce(Scanner scanner) {
        System.out.print("\n--- KUVVET (F) ---\nKütle (m, kg) girin: ");
        double mass = scanner.nextDouble();
        System.out.print("İvme (a, m/s²) girin: ");
        double acceleration = scanner.nextDouble();
        double force = calculateForce(mass, acceleration);
        System.out.printf("-> SONUÇ (m=%.1f, a=%.1f) -> Kuvvet: %.2f Newton\n", mass, acceleration, force);
    }

    public static void processPhysicsWork(Scanner scanner) {
        System.out.print("\n--- İŞ (W) ---\nKuvvet (F, N) girin: ");
        double force = scanner.nextDouble();
        System.out.print("Yer değiştirme (d, m) girin: ");
        double distance = scanner.nextDouble();
        double work = calculateWork(force, distance);
        System.out.printf("-> SONUÇ (F=%.1f, d=%.1f) -> İş: %.2f Joule\n", force, distance, work);
    }

    public static void processPhysicsPower(Scanner scanner) {
        System.out.print("\n--- GÜÇ (P) ---\nYapılan iş (W, J) girin: ");
        double work = scanner.nextDouble();
        System.out.print("Geçen süre (t, s) girin: ");
        double time = scanner.nextDouble();
        double power = calculatePower(work, time);
        System.out.printf("-> SONUÇ (W=%.1f, t=%.1f) -> Güç: %.2f Watt\n", work, time, power);
    }

    public static void processPhysicsKineticEnergy(Scanner scanner) {
        System.out.print("\n--- KİNETİK ENERJİ (KE) ---\nKütle (m, kg) girin: ");
        double mass = scanner.nextDouble();
        System.out.print("Hız (v, m/s) girin: ");
        double velocity = scanner.nextDouble();
        double ke = calculateKineticEnergy(mass, velocity);
        System.out.printf("-> SONUÇ (m=%.1f, v=%.1f) -> KE: %.2f Joule\n", mass, velocity, ke);
    }

    public static void processPhysicsPotentialEnergy(Scanner scanner) {
        System.out.print("\n--- POTANSİYEL ENERJİ (PE) ---\nKütle (m, kg) girin: ");
        double mass = scanner.nextDouble();
        System.out.print("Yükseklik (h, m) girin: ");
        double height = scanner.nextDouble();
        double pe = calculatePotentialEnergy(mass, height);
        System.out.printf("-> SONUÇ (m=%.1f, h=%.1f, g=%.1f) -> PE: %.2f Joule\n", mass, height, GRAVITY, pe);
    }

    public static void processPhysicsMomentum(Scanner scanner) {
        System.out.print("\n--- MOMENTUM (P) ---\nKütle (m, kg) girin: ");
        double mass = scanner.nextDouble();
        System.out.print("Hız (v, m/s) girin: ");
        double velocity = scanner.nextDouble();
        double momentum = calculateMomentum(mass, velocity);
        System.out.printf("-> SONUÇ (m=%.1f, v=%.1f) -> Momentum: %.2f kg*m/s\n", mass, velocity, momentum);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- GÖREV 2: FİZİK FORMÜL ASİSTANI BAŞLADI ---\n");
        
        // Tüm fizik metotları sırayla çağrılır
        processPhysicsVelocity(scanner);
        processPhysicsAcceleration(scanner);
        processPhysicsForce(scanner);
        processPhysicsWork(scanner);
        processPhysicsPower(scanner);
        processPhysicsKineticEnergy(scanner);
        processPhysicsPotentialEnergy(scanner);
        processPhysicsMomentum(scanner);

        System.out.println("\n İşlem Tamamlandı \n");
        
        scanner.close();
    }
}
