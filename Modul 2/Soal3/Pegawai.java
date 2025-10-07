package praktikum2.Soal3;

//Pada baris ini nama class tidak sesuai dengan nama file
//public class Employee {
public class Pegawai {

    //attribute-attribute yang dibawah bukan best practice
    //saran gunakan modifier private

    public String nama;

    //Pada baris ini tipe data tidak sesuai dengan nilai yang diberikan di Soal3Main.java
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;


    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    //pada baris ini merupakan method setter yang error karena tidak ada parameter di dalamnya
    //public void setJabatan() {

    //penggunaan setter dengan attribute public ,seharusnya attribute bersifat private 
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}


