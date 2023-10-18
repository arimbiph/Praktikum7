import java.util.Scanner;
public class ForKelipatan06{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int bilangan, total = 0, counter = 0;
        System.out.print("Masukkan bilangan 1-9: ");
        bilangan = scan.nextInt();

        for (int i = 0; i < 50; i++) {
            if (i % bilangan == 0){
                total += i;
                counter++;
      }
   }
        System.out.printf("Pada rentang 1-50 terdapat %d bilangan kelipatan %d dengan total %d", counter, bilangan, total);5  
}
}
