
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        for(int i=1;i<=100;i++){
            n = input.nextInt();

            if(n%2 == 1){
                System.out.println("Weird");
            }
            else if(n%2==0 && (n>=2 && n<=5)){
                System.out.println("Not weird");
            }
            else if(n%2==0 && (n>=6 && n<=20)){
                System.out.println("Weird");
            }
            else if(n%2==0 && n>20){
                System.out.println("Not Weird");
            }
        }
    }
}
