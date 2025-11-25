package Praktikum.praktikum6.SOLID;

import java.util.List;

public class weaponMenu {
    private final UI ui;
    private final inputHelper input;
    private final weaponService service;
    private final staffFormatter formatter;
    private final List<staff> weapons;

    public weaponMenu(UI ui, inputHelper input, weaponService service, staffFormatter formatter){
        this.ui= ui;
        this.input=input;
        this.service=service;
        this.formatter=formatter;
        this.weapons=service.getAllWeapons();
    }
public void start(){
        while(true) {
            ui.showPage("1. Masukkan Useername\n" +
                                "2. Lihat Deskripsi Senjata\n" +
                                "3. Pesan Feedback\n" +
                                "4. Keluar");

            int choice = input.getInt(">> ");

            switch (choice){
                case 1 -> inputUsername();
                case 2 -> selectWeaponDescription();
                case 3 -> feedbackMessage();
                case 4 -> { return; }
                default -> ui.showPage("Pesan Tidak Valid");
            }
        }
}

private void inputUsername(){
        String username = input.getString(">> Masukkan Username: ");
        ui.showPage("halo " + username + "! (ENTER untuk kembali)");
        input.getString("");
}

private void selectWeaponDescription(){
        StringBuilder menuContent = new StringBuilder("Pilih Senjata:\n\n");
        for(int i=0; i< weapons.size(); i++){
            menuContent.append(i + 1).append(". ").append(weapons.get(i).getName()).append("\n");
        }

        ui.showPage(menuContent.toString());
        int index=input.getInt(">> ") - 1;

        if(index >= 0 && index < weapons.size()){
            showStaffDetail(weapons.get(index));
        } else {
            ui.showPage("Input tidak valid");
        }
}

private void showStaffDetail(staff s){
        ui.showPage(formatter.format(s) + "\n\n(ENTER untuk kembali");
        input.getString("");
}

private void feedbackMessage(){
        String text = input.getString(">> Tulis feedback: ");
        ui.showPage("Feedback diterima:\n\n" +  text + "\n\n(ENTER untuk kembali)");
        input.getString("");
}

}
