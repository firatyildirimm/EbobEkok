import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int first, second;

        System.out.print("Enter the first number: ");
        first = inp.nextInt();

        System.out.print("Enter the second number: ");
        second = inp.nextInt();

        int i = first;
        int ebob = 1;
        int ekok=0;

        while (i>0){
            if(first%i == 0 && second%i == 0){
            ebob=i;
            break;
            }
            i--;
        }
        System.out.println(ebob);
        i=1;
        while (i<=first*second){
            if(i%first==0 && i%second==0){
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println(ekok);
    }
}
