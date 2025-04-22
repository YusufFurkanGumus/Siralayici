import java.util.Scanner;

public class Siralayici {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan a, b, c sayıları alınır
        System.out.print("a sayısını girin: ");
        int a = scanner.nextInt();

        System.out.print("b sayısını girin: ");
        int b = scanner.nextInt();

        System.out.print("c sayısını girin: ");
        int c = scanner.nextInt();

        System.out.println("Sıralama (büyükten küçüğe):");

        // if yapısıyla sıralama
        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println(a + " > " + b + " > " + c);
            } else {
                System.out.println(a + " > " + c + " > " + b);
            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                System.out.println(b + " > " + a + " > " + c);
            } else {
                System.out.println(b + " > " + c + " > " + a);
            }
        } else { // c en büyükse
            if (a >= b) {
                System.out.println(c + " > " + a + " > " + b);
            } else {
                System.out.println(c + " > " + b + " > " + a);
            }
        }

        scanner.close();
    }
}
