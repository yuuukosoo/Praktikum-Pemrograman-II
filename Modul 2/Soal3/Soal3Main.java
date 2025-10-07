package praktikum2.Soal3;

public class Soal3Main {

        public static void main(String[] args) {
            Pegawai p1 = new Pegawai();

            //pengisian nilai dibawah ini bukan best practice
            //pengisian nilai dilakukan langsung ke atribut karena masih menggunakan akses public
            //jadi nilai pada attribut dapat diubah-ubah

            //pada baris ini tidak memiliki tanda koma (;) di akhir
            // p1.nama = "Roi"
            p1.nama = "Roi";
            p1.asal = "Kingdom of Orvel";
            p1.setJabatan("Assasin");

            //pengisian nilai tidak ada pada umur
            //cara pengisian ini bukan best practice
            // nilai atribut bisa diubah secara bebas
            p1.umur= 17;


            System.out.println("Nama: " + p1.getNama());
            System.out.println("Asal: " + p1.getAsal());
            System.out.println("Jabatan: " + p1.jabatan);

            //baris di bawah tambahkan "tahun" untuk menjelaskan bahwa output di bawah merupakan umur
            //System.out.println("Umur: " + p1.umur);
            System.out.println("Umur: " +  p1.umur + " tahun");

        }
}