import java.util.Scanner;
public class PRAK103_2410817110004_MuhammadNaufalKhalish {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        int startnumber=sc.nextInt();

        int count=0;

        do {
            if (startnumber % 2 != 0){
            System.out.print(startnumber);
            count++;

            if (count<N){
                System.out.print(", ");
            }
                } startnumber++;
        }
        while (count<N);
        sc.close();
} }
