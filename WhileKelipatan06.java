import java.util.Scanner;
public class WhileKelipatan06 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        double rataRata;
        int bilangan, total, counter;

        total = 0;
        counter = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        bilangan = input06.nextInt();

        int i = 1;
        while (i <= 50){
            if (i% bilangan == 0) {
                total += i;
                counter++;
            }
            
        }
        if (counter > 0) {
            rataRata = (double) total / counter;
     System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", bilangan, counter);
     System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", bilangan, total);   
     System.out.printf("Rata-rata kelipatan %d dari 1 sampai 50 adalah %.2f\n, kelipatan,rataRata");
    }
}   
}
