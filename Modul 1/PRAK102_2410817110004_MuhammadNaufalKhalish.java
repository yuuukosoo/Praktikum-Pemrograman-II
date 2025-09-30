import java.util.Scanner;
public class PRAK102_2410817110004_MuhammadNaufalKhalish {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        int currentnumber=sc.nextInt();
        int count =0;

        while (count <= 10){
            int numbertoprint = currentnumber;
            if(currentnumber%5 ==0){
                numbertoprint = (currentnumber/5)-1;
            }
            System.out.print(numbertoprint);

            if(count <= 9){
                System.out.print(", ");}

            currentnumber++;
            count++;}

        System.out.println();
        sc.close();
    }
}
