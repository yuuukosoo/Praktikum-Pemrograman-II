import java.util.Scanner;
public class PRAK101_2410817110004_MuhammadNaufalKhalish {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String FullName = sc.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String birthplace = sc.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int date = sc.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int birthmonth = sc.nextInt() ;

        System.out.print("Masukkan Tahun Lahir: ");
        int birthyear = sc.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int Height = sc.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double weight = sc.nextDouble();

        String birthdate;
        if (date>=1 && date<=31){
           birthdate = Integer.toString(date);
        }
        else {
            birthdate="tidak valid";
        }

        String[] Monthname = {"Januari","Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        System.out.println("Nama Lengkap " + FullName + " , Lahir di " + birthplace + " pada Tanggal " +  birthdate + " " + Monthname[birthmonth -1] + " " + birthyear );
        System.out.println("Tinggi Badan " + Height + " cm dan Berat Badan " + weight + " kilogram" );
    }
}
