import java.util.Scanner;

public class SoucetSoucin {
    
    public static void main(String[] args) {
        int cislo_1, cislo_2, soucin, soucet;
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte prvni cislo");
        cislo_1 = sc.nextInt();
        System.out.println("Zadejte druhe cislo");
        cislo_2 = sc.nextInt();
        sc.close();
        soucet = cislo_1 + cislo_2;
        soucin = cislo_1 * cislo_2;
        System.out.println("soucet cisel je: " + soucet);
        System.out.println("soucin cisel je: " + soucin);
    }
}