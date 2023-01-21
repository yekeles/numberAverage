import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x, y, z, sum = 0;
        double average;
        Scanner input = new Scanner(System.in);
        System.out.print("Hangi sayıya kadar üçe ve dörde tam bölünen sayıların ortalamasını istiyorsanız yazınız : ");
        x = input.nextInt();
        // Sıfır sayıya bölümüden sıfır elde edileceği sorunsalından sayaç vazifesi gören int z -1 den başlamalıdır.
        z = -1 ;
        for (y = 0; y <= x; y++) {
            if ((y % 3 == 0) && (y % 4 == 0)) {
                sum += y;
                z++;
            }
        }
        average = (sum / z);
        System.out.println("0'dan " + x + " sayısına kadar hem 3 hemde 4'e tam bölünen sayıların ortalaması " + average);
    }
}