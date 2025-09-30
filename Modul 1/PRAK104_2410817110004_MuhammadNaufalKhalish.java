import java.util.Scanner;

public class PRAK104_2410817110004_MuhammadNaufalKhalish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String abuInput = sc.nextLine();

        System.out.print("Tangan Bagas: ");
        String bagasInput = sc.nextLine();

        String[] abu = abuInput.split(" ");
        String[] bagas = bagasInput.split(" ");

        int pointAbu = 0;
        int pointBagas = 0;

        for (int i = 0; i < 3; i++) {
            String tanganAbu = abu[i];
            String tanganBagas = bagas[i];

            if (tanganAbu.equals(tanganBagas)) {
                continue;
            }
            if ((tanganAbu.equals("B") && tanganBagas.equals("G")) || // Batu vs Gunting
                    (tanganAbu.equals("G") && tanganBagas.equals("K")) || // Gunting vs Kertas
                    (tanganAbu.equals("K") && tanganBagas.equals("B")))   // Kertas vs Batu
            {
                pointAbu++;
            } else {
                pointBagas++;
            }
        }

        if (pointAbu > pointBagas) {
            System.out.println("Abu");
        } else if (pointBagas > pointAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }

        sc.close();
    }
}
