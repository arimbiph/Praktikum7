import java.util.Scanner;
public class ForKelipatan06{
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        double rataRata;
        int bilangan, total, counter;

        total = 0;
        counter = 0;
        
        System.out.print("Masukkan bilangan kelipatan 1-9: ");
        bilangan = input06.nextInt();

        for (int i = 0; i < 50; i++) {
            if (i % bilangan == 0){
                total += i;
                counter++;
      }
   }
if (counter > 0) {
rataRata = (double) total / counter;

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", bilangan , counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah  %d\n", bilangan, total);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n,", bilangan, rataRata);
       
        }
    }
}
