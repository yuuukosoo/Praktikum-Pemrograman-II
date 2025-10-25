package Praktikum.praktikum3.soal3;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        ArrayList<Student> listStudent = new ArrayList<>();
        int choice;

        do{
            System.out.println("Menu");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM ");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String name= sc.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim= sc.nextLine();

                    boolean exists = false;
                    for(Student stude : listStudent){
                        if(stude.getNim().equals(nim)){
                            exists = true;
                            break;
                        }
                    }

                    if(exists){
                        System.out.println("Mahasiswa dengan NIM " + nim + " sudah ada.");
                    }    else {
                        listStudent.add(new Student(name, nim));
                        System.out.println("Mahasiswa " + name + " ditambahkan.");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String deleteNim = sc.nextLine();
                    Student deleteTarget = null;

                    for(Student student : listStudent){
                        if(student.getNim().equals(deleteNim)){
                            deleteTarget = student;
                            break;
                        }
                    }

                    if(deleteTarget != null){
                        listStudent.remove(deleteTarget);
                        System.out.println("Mahasiswa dengan NIM " + deleteNim + " dihapus.");
                    }

                    else{
                        System.out.println("Mahasiswa dengan NIM " + deleteNim + " tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang ingin dicari: ");
                    String searchNim = sc.nextLine();
                    boolean found = false;

                    for(Student student : listStudent){
                        if(student.getNim().equals(searchNim)){
                            System.out.println("Data ditemukan: " + student);
                            found = true;
                            break;
                        }
                    }

                    if(!found){
                        System.out.println("Mahasiswa dengan NIM " + searchNim + " tidak ditemukan");
                    }
                    break;

                case 4:
                    if(listStudent.isEmpty()){
                        System.out.println("Daftar Mahasiswa kosong");
                    }
                    else {
                        System.out.println("Daftar Mahasiswa:");
                        for(Student student : listStudent){
                            System.out.println(student);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

            System.out.println();
        } while(choice != 0);
    }
}
