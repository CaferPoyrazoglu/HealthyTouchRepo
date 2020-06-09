package controller;

import java.text.DecimalFormat;
import javax.swing.JLabel;
import model.OturumModel;

public class KiloYonetici {

    public static void hesapla(OturumModel yo, JLabel AdSoyadLabel, JLabel YasLabel, JLabel KiloLabel, JLabel HedefKiloLabel, JLabel TavsiyeLabel, JLabel vki_label) {

        AdSoyadLabel.setText(yo.getAd());
        YasLabel.setText(yo.getYas() + " Yaşında.");
        KiloLabel.setText(yo.getKilo() + " Kilo");

        int boy = Integer.parseInt(yo.getBoy());
        int kilo = Integer.parseInt(yo.getKilo());

        double sea = boy * boy;
        sea = kilo / sea;

        String sea2 = String.valueOf(sea);
        sea2 = sea2.replace("0", "");
        sea2 = sea2.replace(".", "");

        /*sea2 = sea2.substring(0, sea2.length() - deger);*/
        int sayac = sea2.length();
        while (sayac >= 3) {
            sea2 = sea2.substring(0, sea2.length() - 1);
            sayac--;
        }

        int vkiSon = Integer.parseInt(sea2);
        System.out.println(vkiSon);

        if (vkiSon <= 18.4) {
            HedefKiloLabel.setText("Zayıfsınız");
        } else if (vkiSon <= 24.9) {
            HedefKiloLabel.setText("Normal");

        } else if (vkiSon <= 29.9) {
            HedefKiloLabel.setText("Fazla Kilolu");
        } else if (vkiSon <= 34.9) {
            HedefKiloLabel.setText("1. Sınıf Obez");
        } else {
            HedefKiloLabel.setText("2. Sınıf Obez");
        }

        vki_label.setText("VKI: " + sea2);

        if (yo.getKilotercih().equals("kvermek")) {
            TavsiyeLabel.setText("Kilo vermek istiyorsanız, günlük en fazla 2600 kalori almalısınız.");
        } else if (yo.getKilotercih().equals("kkorumak")) {
            TavsiyeLabel.setText("Kilonuzu korumak istiyorsanız günlük 2300 - 2600 kalori almalısınız.");
        } else {
            TavsiyeLabel.setText("Kilo almak istiyorsanız günlük en az 2600 kalori almalısınız.");
        }
        //Kadınlar İçin:      İdeal Kilo = 45,5 + (2,3 / 2,54) x (boy(cm) - 152,4)
        //Erkekler İçin:      İdeal Kilo = 50 + (2,3 / 2,54) x (boy(cm) - 152,4)
    }

}
