package controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ReceteKaydet {

    public void kaydet(String baslik, String karb, String prot, String yag, String alerjen, String kalori) {

        String recete = null;

        //File file = new File("C:\\Users\\cafer\\Desktop\\1.txt");
        File file = new File(System.getProperty("user.home") + "/Desktop" + "/" + baslik + ".txt");

        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            br.write("Yemek Adı: " + baslik);
            br.newLine();
            br.write("Toplam Karbonhidrat: " + karb);
            br.newLine();
            br.write("Toplam Protein: " + prot);
            br.newLine();
            br.write("Toplam Yag: " + yag);
            br.newLine();
            br.write("Alerjen Maddeler: " + alerjen);
            br.newLine();
            br.write("Toplam Kalori: " + kalori);
            
            //JOptionPane.showMessageDialog(null, "Masaüstüne " +baslik+ " reçetesi kaydedildi.");
            JOptionPane.showMessageDialog(null, "Masaüstüne " +baslik+ " reçetesi kaydedildi.", "Reçete Özeti", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException e) {
            System.out.println("Unable to read file " + file.toString());
        }

    }

}
