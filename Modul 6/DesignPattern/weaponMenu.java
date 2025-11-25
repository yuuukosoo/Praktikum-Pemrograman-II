package Praktikum.praktikum6.DesignPattern;

import java.util.List;
import java.util.Scanner;

public class weaponMenu {
    private final UI ui;
    private final Scanner input;
    private final weaponService service;
    private final List<staff> weapons;

    public weaponMenu(UI ui, Scanner input, weaponService service){
        this.ui=ui;
        this.input=input;
        this.service=service;
        this.weapons= service.getAllWeapons();
    }

    public void start(){
        while(true){
            ui.showPage(
                    "1. Masukkan Username \n" +
                            "2. Lihat Deskripsi Senjata\n" +
                            "3. Tambah Buff Damage (Decorator)\n" +
                            "4. Pesan Feedback\n" +
                            "5. Keluar"
            );

            System.out.print(">> ");
            String choice = input.nextLine();

            switch(choice){
                case "1" : inputUsername(); break;
                case "2" : selectWeaponDescription(); break;
                case "3" : addDamageBuff(); break;
                case "4" : feedbackMessage(); break;
                case "5" : return;
                default: break;
            }
        }
    }

    private void inputUsername(){
        ui.showPage("Masukkan username:");
        System.out.print(">> ");
        String username = input.nextLine();
        ui.showPage("Halo " + username + "! (ENTER untuk kembali)");
        input.nextLine();
    }

    private void selectWeaponDescription(){
        StringBuilder menuContent = new StringBuilder("Pilih Senjata:\n\n");
        for(int i = 0; i < weapons.size(); i++){
            menuContent.append(i+1).append(". ").append(weapons.get(i).getName()).append("\n");
        }

        ui.showPage(menuContent.toString());
        System.out.print(">> ");
        String choice = input.nextLine();

        try {
            int index = Integer.parseInt(choice) - 1;
            if(index >= 0 && index < weapons.size()){
                showStaffDetail(weapons.get(index));
            } else {
                ui.showPage("Input tidak valid.");
                input.nextLine();
            }
        } catch (NumberFormatException e){
            ui.showPage("Input harus berupa angka.");
            input.nextLine();
        }
    }

    private void showStaffDetail(staff s){
        ui.showPage(service.getStaffDetail(s) + "\n\n(ENTER untuk kembali)");
        input.nextLine();
    }

    private void addDamageBuff() {
        StringBuilder menuContent = new StringBuilder("Pilih Staff untuk diberi buff damage:\n\n");
        for (int i = 0; i < weapons.size(); i++) {
            menuContent.append(i + 1).append(". ").append(weapons.get(i).getName()).append("\n");
        }

        ui.showPage(menuContent.toString());
        System.out.print(">> ");
        String choice = input.nextLine();

        try {
            int index = Integer.parseInt(choice) - 1;
            if (index < 0 || index >= weapons.size()) {
                ui.showPage("Pilihan tidak valid.");
                input.nextLine();
                return;
            }

            staff selected = weapons.get(index);


            ui.showPage("Masukkan jumlah bonus damage (angka, mis. 5):");
            System.out.print(">> ");
            String amtStr = input.nextLine();
            int amt;
            try {
                amt = Integer.parseInt(amtStr);
            } catch (NumberFormatException ex) {
                ui.showPage("Input harus angka. (ENTER untuk kembali)");
                input.nextLine();
                return;
            }


            selected.addBonusDamage(amt);


            Skill oldSkill = selected.getSkill();
            Skill decorated = new buffDamageDecorator(oldSkill, amt);
            selected.setSkill(decorated);

            ui.showPage("Buff berhasil diterapkan!\n\n" + service.getStaffDetail(selected) + "\n\n(ENTER untuk kembali)");
            input.nextLine();

        } catch (Exception e) {
            ui.showPage("Kesalahan input");
            input.nextLine();
        }
    }

    private void feedbackMessage(){
        ui.showPage("Tulis feedback:");
        System.out.println(">> ");
        String text = input.nextLine();
        ui.showPage("Feedback diterima:\n\n" +  text + "\n\n(ENTER untuk kembali");
        input.nextLine();
    }



}
