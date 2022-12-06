/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.praktikumpbo.trialphone;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TrialPhone {
    public void choosePhone(String aksi){
        Scanner input = new Scanner(System.in);
        PhoneUser user;
        boolean condition = true;
        while (condition){
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("Pilih Jenis Hp Anda ");
            System.out.println("[1] Xiaomi");
            System.out.println("[2] Iphone");
            System.out.println("[3] Samsung");
            System.out.println("[4] Oppo");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi > ");
            aksi = input.next();

            if(aksi.equalsIgnoreCase("1")){
                Phone redmi10 = new Xiaomi();
                user = new PhoneUser(redmi10);
                user.turnOnThePhone();
                user.onPhone(user, aksi, redmi10);
            }else if(aksi.equalsIgnoreCase("2")){
                Phone iPhone14 = new iPhone();
                user = new PhoneUser(iPhone14);
                user.turnOnThePhone();
                user.onPhone(user, aksi, iPhone14);
            }else if(aksi.equalsIgnoreCase("3")){
                Phone SamsungZFlip = new Samsung();
                user = new PhoneUser(SamsungZFlip);
                user.turnOnThePhone();
                user.onPhone(user, aksi, SamsungZFlip);
            }else if(aksi.equalsIgnoreCase("4")){
                Phone OppoA3s = new Samsung();
                user = new PhoneUser(OppoA3s);
                user.turnOnThePhone();
                user.onPhone(user, aksi, OppoA3s);
            }else if(aksi.equalsIgnoreCase("0")){
                System.exit(0);
            }else{
                System.out.println("Aksi Salah!");
            }
        }
    }
    public static void main(String[] args) {
        String beraksi = null;
        TrialPhone saya = new TrialPhone();
        saya.choosePhone(beraksi);
    }
}
