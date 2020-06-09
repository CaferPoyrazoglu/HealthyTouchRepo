package view;

import controller.GidaListeleRestApiYonetici;
import controller.KayitGuncelleRestApiYonetici;
import controller.KiloYonetici;
import controller.ReceteKaydet;
import controller.ReceteOlusturRestApiYonetici;
import controller.SQLite;
import controller.SuHesaplaYonetici;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.GidaBilgiModel;
import model.OturumModel;
import okhttp3.Response;

public class anaEkran extends javax.swing.JFrame {

    DefaultListModel dm = new DefaultListModel();
    OturumModel om;
    KiloYonetici ikh = new KiloYonetici();
    SQLite sql = new SQLite();

    public anaEkran() throws IOException {

    }

    anaEkran(OturumModel[] otm) throws IOException {

        initComponents();
        om = otm[0];
        GidaListeleRestApiYonetici gidaListele = new GidaListeleRestApiYonetici();
        gidaListele.comboboxEkle(gida_combobox);
        profilYaz();
        KiloYonetici.hesapla(om, AdSoyadLabel, YasLabel, KiloLabel, HedefKiloLabel, TavsiyeLabel, vki_label);
        sql.listele(gunlukCombo);

    }

    public void profilYaz() {
        kad_field.setText(om.getKad());
        ad_field.setText(om.getAd());
        soyad_field.setText(om.getSoyad());
        yas_field.setText(om.getYas());
        boy_field.setText(om.getBoy());
        kilo_field.setText(om.getKilo());
        if (om.getCinsiyet().equals("kadin")) {
            kadin_radio.setSelected(rootPaneCheckingEnabled);
        }

        if (om.getKilotercih().equals("kvermek")) {
            kilovermek_radio.setSelected(rootPaneCheckingEnabled);
        } else if (om.getKilotercih().equals("kkorumak")) {
            kilokorumak_radio.setSelected(rootPaneCheckingEnabled);
        } else {
            kiloalmak_radio.setSelected(rootPaneCheckingEnabled);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        recete_button = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        toplam_karb = new javax.swing.JTextField();
        toplam_pro = new javax.swing.JTextField();
        toplam_yag = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        alerjenler_field = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        kalori_field = new javax.swing.JTextField();
        recete_baslik = new javax.swing.JLabel();
        kac_gram = new javax.swing.JLabel();
        recete_kaydet_button = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        miktar_field = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        kac_kisilik_combo = new javax.swing.JComboBox<>();
        sil_button = new javax.swing.JButton();
        yemek_adi = new javax.swing.JTextField();
        miktar_combo = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        ekle_button = new javax.swing.JButton();
        gida_combobox = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        yeni_malzeme_button = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        sik_kullanilanlar_combobox = new javax.swing.JComboBox<>();
        sik_ekle_button = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        tum_gidalar_button = new javax.swing.JButton();
        populer_button = new javax.swing.JButton();
        admin_button = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        egzersiz_label = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        egzersiz1_label = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        egzersiz3_label = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        egzersiz2_label = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        YasLabel = new javax.swing.JLabel();
        AdSoyadLabel = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        KiloLabel = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        HedefKiloLabel = new javax.swing.JLabel();
        vki_label = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        TavsiyeLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        hareket_combo = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        su_label2 = new javax.swing.JLabel();
        su_label = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        g_mtn_area = new javax.swing.JTextArea();
        gunlukCombo = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        kad_field = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        ksifre_field = new javax.swing.JTextField();
        jPanel29 = new javax.swing.JPanel();
        ad_field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        erkek_radio = new javax.swing.JRadioButton();
        kadin_radio = new javax.swing.JRadioButton();
        jLabel36 = new javax.swing.JLabel();
        soyad_field = new javax.swing.JTextField();
        yas_field = new javax.swing.JTextField();
        boy_field = new javax.swing.JTextField();
        kilo_field = new javax.swing.JTextField();
        jPanel30 = new javax.swing.JPanel();
        kilovermek_radio = new javax.swing.JRadioButton();
        kilokorumak_radio = new javax.swing.JRadioButton();
        kiloalmak_radio = new javax.swing.JRadioButton();
        guncelle_buton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Healthy Touch");
        setMinimumSize(null);
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabbedPane1.setMaximumSize(null);
        jTabbedPane1.setRequestFocusEnabled(false);

        jPanel3.setBackground(new java.awt.Color(204, 204, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 0));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 51));
        jLabel17.setText("Yemek Reçetesi Oluştur");

        jPanel13.setBackground(new java.awt.Color(153, 204, 0));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        recete_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        recete_button.setText("Reçete Oluştur");
        recete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recete_buttonActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Toplam Karbonhidrat:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Toplam Yağ:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Toplam Protein:");

        toplam_karb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        toplam_pro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        toplam_yag.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Alerjenler:");

        alerjenler_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Toplam Kalori:");

        kalori_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        recete_baslik.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        recete_baslik.setForeground(new java.awt.Color(204, 255, 255));
        recete_baslik.setText("Reçete");

        kac_gram.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kac_gram.setForeground(new java.awt.Color(0, 0, 153));
        kac_gram.setText(" ");

        recete_kaydet_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        recete_kaydet_button.setText("Reçete Kaydet");
        recete_kaydet_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recete_kaydet_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recete_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel22)
                                .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(kac_gram))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toplam_karb)
                            .addComponent(toplam_pro)
                            .addComponent(toplam_yag)
                            .addComponent(alerjenler_field)
                            .addComponent(kalori_field, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(recete_baslik, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)))
                    .addComponent(recete_kaydet_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recete_baslik)
                    .addComponent(kac_gram))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(toplam_karb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(toplam_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(toplam_yag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(alerjenler_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(kalori_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(recete_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recete_kaydet_button)
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(0, 153, 153));
        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Gıda:");

        miktar_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Yemek Adı:");

        kac_kisilik_combo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kac_kisilik_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Kişi Tüketecek", "2 Kişi Tüketecek", "3 Kişi Tüketecek", "4 Kişi Tüketecek", "5 Kişi Tüketecek", "6 Kişi Tüketecek", "7 Kişi Tüketecek", "8 Kişi Tüketecek", "9 Kişi Tüketecek", "10 Kişi Tüketecek" }));

        sil_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sil_button.setText("Sil");
        sil_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sil_buttonActionPerformed(evt);
            }
        });

        yemek_adi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        miktar_combo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        miktar_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gram", "Mililitre", "ÇayKaşığı", "TatlıKaşığı", "YemekKaşığı", "SuBardağı" }));
        miktar_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miktar_comboActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Kaç Kişilik:");

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jList1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        ekle_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ekle_button.setText("Ekle");
        ekle_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekle_buttonActionPerformed(evt);
            }
        });

        gida_combobox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Miktar:");

        yeni_malzeme_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yeni_malzeme_button.setText("Yeni Malzeme");
        yeni_malzeme_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeni_malzeme_buttonActionPerformed(evt);
            }
        });

        jPanel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        sik_kullanilanlar_combobox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sik_kullanilanlar_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "23 Gram Aycicekyagi", "23 Gram Zeytinyagi", "200 Gram Un", "100 Gram DomatesSalca", "100 Gram BiberSalca", "50 Gram Peynir" }));
        sik_kullanilanlar_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sik_kullanilanlar_comboboxActionPerformed(evt);
            }
        });

        sik_ekle_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sik_ekle_button.setText("Ekle");
        sik_ekle_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sik_ekle_buttonActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Sık Kullanılan Gıdalar");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sik_kullanilanlar_combobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sik_ekle_button)
                .addContainerGap())
            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sik_ekle_button)
                    .addComponent(sik_kullanilanlar_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(yeni_malzeme_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ekle_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gida_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(yemek_adi)
                                        .addComponent(kac_kisilik_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(miktar_field, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(miktar_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sil_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(yemek_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(kac_kisilik_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(gida_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(miktar_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(miktar_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yeni_malzeme_button)
                    .addComponent(ekle_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sil_button)
                .addGap(23, 23, 23))
        );

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Örnek Öğün");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tum_gidalar_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tum_gidalar_button.setText("Tüm Gıdalar");
        tum_gidalar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tum_gidalar_buttonActionPerformed(evt);
            }
        });

        populer_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        populer_button.setText("Popüler Tarifler");
        populer_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                populer_buttonActionPerformed(evt);
            }
        });

        admin_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        admin_button.setText("Admin");
        admin_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tum_gidalar_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(populer_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(admin_button, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(tum_gidalar_button)
                    .addComponent(jLabel17)
                    .addComponent(populer_button)
                    .addComponent(admin_button))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 364, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Yemek Reçetesi Oluştur", jPanel3);

        jPanel18.setBackground(new java.awt.Color(51, 102, 0));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jPanel15.setBackground(new java.awt.Color(0, 102, 102));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel15.setLayout(new java.awt.GridBagLayout());

        egzersiz_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        egzersiz_label.setForeground(new java.awt.Color(255, 255, 255));
        egzersiz_label.setText("Bu değerler bir yemek reçetesi girilince tanımlanacaktır.");
        jPanel15.add(egzersiz_label, new java.awt.GridBagConstraints());

        jPanel16.setBackground(new java.awt.Color(0, 153, 102));
        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel16.setLayout(new java.awt.GridBagLayout());

        egzersiz1_label.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        egzersiz1_label.setForeground(new java.awt.Color(255, 255, 255));
        egzersiz1_label.setText("-");
        jPanel16.add(egzersiz1_label, new java.awt.GridBagConstraints());

        jPanel17.setBackground(new java.awt.Color(0, 153, 102));
        jPanel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel17.setLayout(new java.awt.GridBagLayout());

        egzersiz3_label.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        egzersiz3_label.setForeground(new java.awt.Color(255, 255, 255));
        egzersiz3_label.setText("-");
        jPanel17.add(egzersiz3_label, new java.awt.GridBagConstraints());

        jPanel20.setBackground(new java.awt.Color(0, 153, 102));
        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel20.setLayout(new java.awt.GridBagLayout());

        egzersiz2_label.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        egzersiz2_label.setForeground(new java.awt.Color(255, 255, 255));
        egzersiz2_label.setText("-");
        jPanel20.add(egzersiz2_label, new java.awt.GridBagConstraints());

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Yüzme");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Bisiklet");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Koşu");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(167, 167, 167)
                .addComponent(jLabel28)
                .addGap(49, 49, 49))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29))
                .addGap(54, 54, 54)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Egzersiz", jPanel18);

        jPanel6.setBackground(new java.awt.Color(0, 102, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jPanel22.setBackground(new java.awt.Color(153, 51, 0));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        YasLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        YasLabel.setForeground(new java.awt.Color(255, 255, 255));
        YasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        YasLabel.setText("Yas");

        AdSoyadLabel.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        AdSoyadLabel.setForeground(new java.awt.Color(255, 255, 255));
        AdSoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdSoyadLabel.setText("AdSoyad");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(YasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AdSoyadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(AdSoyadLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(YasLabel)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(153, 51, 0));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        KiloLabel.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        KiloLabel.setForeground(new java.awt.Color(255, 255, 255));
        KiloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        KiloLabel.setText("SuanKilo");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(KiloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(KiloLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new java.awt.Color(153, 51, 0));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        HedefKiloLabel.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        HedefKiloLabel.setForeground(new java.awt.Color(255, 255, 255));
        HedefKiloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HedefKiloLabel.setText("HedefKilo");

        vki_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        vki_label.setForeground(new java.awt.Color(255, 255, 255));
        vki_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vki_label.setText("Yas");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HedefKiloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vki_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(HedefKiloLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vki_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(0, 51, 102));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        TavsiyeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TavsiyeLabel.setForeground(new java.awt.Color(255, 255, 255));
        TavsiyeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TavsiyeLabel.setText("Tavsiye");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TavsiyeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(TavsiyeLabel)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("İdeal Vücudum", jPanel6);

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel2.setRequestFocusEnabled(false);

        jPanel8.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Günlük Su İhtiyacınız");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Hesapla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        hareket_combo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hareket_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Az hareketliyim.", "Orta hareketliyim.", "Çok hareketliyim." }));
        hareket_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hareket_comboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hareket_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hareket_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(51, 204, 255));
        jPanel9.setForeground(new java.awt.Color(0, 204, 255));
        jPanel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        su_label2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        su_label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        su_label2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        su_label2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        su_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        su_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        su_label.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        su_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(su_label2)
                    .addComponent(su_label))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(su_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(su_label2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(701, Short.MAX_VALUE))
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ne kadar su içmeliyim?", jPanel2);

        jPanel7.setBackground(new java.awt.Color(0, 153, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        g_mtn_area.setColumns(20);
        g_mtn_area.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g_mtn_area.setRows(5);
        jScrollPane2.setViewportView(g_mtn_area);

        gunlukCombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gunlukCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gunlukComboActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Göster");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Ekle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(gunlukCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gunlukCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Günlük", jPanel7);

        jPanel5.setBackground(new java.awt.Color(0, 204, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel5.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel5.setRequestFocusEnabled(false);

        jPanel12.setBackground(new java.awt.Color(153, 102, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14.setText("www.lezzet.com.tr");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tavsiye Siteler");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("www.yemek.com");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("www.savascebeci.com");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tavsiye Siteler", jPanel5);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel4.setMaximumSize(new java.awt.Dimension(700, 700));
        jPanel4.setMinimumSize(new java.awt.Dimension(700, 700));
        jPanel4.setPreferredSize(new java.awt.Dimension(700, 700));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jPanel10.setBackground(new java.awt.Color(255, 255, 0));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanel19.setBackground(new java.awt.Color(0, 153, 153));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Hüseyin Berk Buğur");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Cafer Erhan Poyrazoğlu");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Geliştiriciler");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Hasan Basıcı");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Çağatay Öztekin");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 153, 0));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanel21.setBackground(new java.awt.Color(0, 153, 153));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("cagatayoztekinn@gmail.com");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("hasanbsc378@gmail.com");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("cafererhan@gmail.com");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("berk.bugur@gmail.com");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("İletişim Bilgileri");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel11);

        jTabbedPane1.addTab("Hakkında", jPanel4);

        jPanel26.setBackground(new java.awt.Color(218, 238, 240));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jPanel27.setBackground(new java.awt.Color(255, 153, 0));
        jPanel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel27.setFocusTraversalPolicyProvider(true);

        jPanel28.setBackground(new java.awt.Color(255, 153, 0));

        kad_field.setEditable(false);
        kad_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kad_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kad_fieldActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Şifre:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Kullanıcı Adı:");

        ksifre_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ksifre_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ksifre_fieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kad_field, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(ksifre_field, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(kad_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(ksifre_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel29.setBackground(new java.awt.Color(255, 51, 51));

        ad_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Ad:");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Soyad:");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("Yaş:");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Boy:");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Kilo:");

        erkek_radio.setBackground(new java.awt.Color(255, 51, 51));
        buttonGroup1.add(erkek_radio);
        erkek_radio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        erkek_radio.setSelected(true);
        erkek_radio.setText("Erkek");

        kadin_radio.setBackground(new java.awt.Color(255, 51, 51));
        buttonGroup1.add(kadin_radio);
        kadin_radio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kadin_radio.setText("Kadın");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Cinsiyet:");

        soyad_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        yas_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        boy_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        kilo_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel30.setBackground(new java.awt.Color(204, 204, 0));

        kilovermek_radio.setBackground(new java.awt.Color(204, 204, 0));
        buttonGroup2.add(kilovermek_radio);
        kilovermek_radio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kilovermek_radio.setText("Kilo vermek istiyorum.");

        kilokorumak_radio.setBackground(new java.awt.Color(204, 204, 0));
        buttonGroup2.add(kilokorumak_radio);
        kilokorumak_radio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kilokorumak_radio.setSelected(true);
        kilokorumak_radio.setText("Kilomu korumak istiyorum.");

        kiloalmak_radio.setBackground(new java.awt.Color(204, 204, 0));
        buttonGroup2.add(kiloalmak_radio);
        kiloalmak_radio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kiloalmak_radio.setText("Kilo almak istiyorum.");

        guncelle_buton.setBackground(new java.awt.Color(0, 255, 102));
        guncelle_buton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        guncelle_buton.setText("Güncelle");
        guncelle_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelle_butonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kiloalmak_radio)
                    .addComponent(kilovermek_radio)
                    .addComponent(kilokorumak_radio))
                .addGap(15, 15, 15))
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(guncelle_buton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kilovermek_radio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kilokorumak_radio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kiloalmak_radio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guncelle_buton)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel36)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ad_field)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(erkek_radio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kadin_radio)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(soyad_field, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boy_field, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(yas_field)
                            .addComponent(kilo_field))))
                .addContainerGap())
            .addComponent(jPanel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ad_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(soyad_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(yas_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(boy_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(kilo_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(erkek_radio)
                    .addComponent(kadin_radio))
                .addGap(18, 18, 18)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Profilim", jPanel26);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hareket_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hareket_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hareket_comboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SuHesaplaYonetici sh = new SuHesaplaYonetici();
        String su = sh.hesap2(om, hareket_combo);

        String pattern = "#.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        String format = decimalFormat.format(Double.parseDouble(su));

        if (om.getCinsiyet().equals("erkek")) {
            su_label.setText(om.getAd() + " bey; yaşınıza, kilonuza ve günlük aktivitenize göre günde " + format + " Litre su içmelisiniz.");
        } else {
            su_label.setText(om.getAd() + " hanım; yaşınıza, kilonuza ve günlük aktivitenize göre günde " + format + " Litre su içmelisiniz.");
        }

        double bardak = Double.parseDouble(su);
        bardak = bardak / 0.2;

        String pattern2 = "#.##";
        String format2 = decimalFormat.format(Double.parseDouble(Double.toString(bardak)));

        su_label2.setText(format + " Litre su, yaklaşık " + format2 + " su bardağına denk gelmektedir.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        try {
            Desktop.getDesktop().browse(new URI("http://www.yemek.com"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(anaEkran.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(anaEkran.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        try {
            Desktop.getDesktop().browse(new URI("http://www.savascebeci.com"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(anaEkran.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(anaEkran.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        try {
            Desktop.getDesktop().browse(new URI("http://www.lezzet.com.tr"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(anaEkran.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(anaEkran.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void ekle_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekle_buttonActionPerformed
        jList1.setModel(dm);
        dm.addElement(miktar_field.getText() + " " + String.valueOf(miktar_combo.getSelectedItem()) + " " + String.valueOf(gida_combobox.getSelectedItem()));
    }//GEN-LAST:event_ekle_buttonActionPerformed

    private void miktar_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miktar_comboActionPerformed

    }//GEN-LAST:event_miktar_comboActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked

    }//GEN-LAST:event_jList1MouseClicked

    private void sil_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sil_buttonActionPerformed
        int index = jList1.getSelectedIndex();
        dm.remove(index);
    }//GEN-LAST:event_sil_buttonActionPerformed

    private void recete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recete_buttonActionPerformed
        GidaBilgiModel[] gbm;
        //REÇETE OLUŞTUR
        if (yemek_adi.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen yemek adı girin.");
        } else {

            ReceteOlusturRestApiYonetici ro = new ReceteOlusturRestApiYonetici();

            try {

                int size = jList1.getModel().getSize();
                double karbonhidrat = 0.0;
                double yag = 0.0;
                double protein = 0.0;
                String alerjen = "";
                double toplam_miktar = 0.0;

                for (int i = 0; i < size; i++) {

                    String myString = jList1.getModel().getElementAt(i);

                    String[] words = myString.split(" ");

                    String miktar = words[0];
                    String birim = words[1];
                    String gida = words[2];

                    gbm = ro.degerGetir(gida);

                    double birim2 = 0;

                    switch (birim) {
                        case "Gram":
                            birim2 = 1;
                            break;
                        case "Mililitre":
                            birim2 = 1;
                            break;
                        case "ÇayKaşığı":
                            birim2 = 1.6;
                            break;
                        case "TatlıKaşığı":
                            birim2 = 4.5;
                            break;
                        case "YemekKaşığı":
                            birim2 = 10.4;
                            break;
                        case "SuBardağı":
                            birim2 = 200;
                            break;
                        default:
                            break;
                    }
                    double k2 = 0.0;
                    double y2 = 0.0;
                    double p2 = 0.0;
                    String a2 = "";
                    double t2 = 0.0;

                    k2 = k2 + (gbm[0].getKarbonhidrat() / 100) * birim2 * Double.parseDouble(miktar);
                    y2 = y2 + (gbm[0].getYag() / 100) * birim2 * Double.parseDouble(miktar);
                    p2 = p2 + (gbm[0].getProtein() / 100) * birim2 * Double.parseDouble(miktar);
                    a2 = a2 + gbm[0].getAlerjen() + " ";
                    t2 = t2 + birim2 * Double.parseDouble(miktar);

                    karbonhidrat = karbonhidrat + k2;
                    yag = yag + y2;
                    protein = protein + p2;
                    alerjen = alerjen + a2;
                    toplam_miktar = toplam_miktar + t2;

                }

                double kackisi = 0;

                switch (kac_kisilik_combo.getSelectedItem().toString()) {
                    case "1 Kişi Tüketecek":
                        kackisi = 1;
                        break;
                    case "2 Kişi Tüketecek":
                        kackisi = 2;
                        break;
                    case "3 Kişi Tüketecek":
                        kackisi = 3;
                        break;
                    case "4 Kişi Tüketecek":
                        kackisi = 4;
                        break;
                    case "5 Kişi Tüketecek":
                        kackisi = 5;
                        break;
                    case "6 Kişi Tüketecek":
                        kackisi = 6;
                        break;
                    case "7 Kişi Tüketecek":
                        kackisi = 7;
                        break;
                    case "8 Kişi Tüketecek":
                        kackisi = 8;
                        break;
                    case "9 Kişi Tüketecek":
                        kackisi = 9;
                        break;
                    default:
                        kackisi = 10;
                        break;
                }

                double v1 = karbonhidrat / kackisi;

                double v2 = protein / kackisi;

                double v3 = yag / kackisi;

                String karbonhidrat2 = new DecimalFormat("##.##").format(v1);
                String protein2 = new DecimalFormat("##.##").format(v2);
                String yag2 = new DecimalFormat("##.##").format(v3);

                recete_baslik.setText(yemek_adi.getText());
                toplam_karb.setText(karbonhidrat2 + " gram");
                toplam_pro.setText(protein2 + " gram");
                toplam_yag.setText(yag2 + " gram");
                alerjenler_field.setText(alerjen);

                int yeni_toplam = (int) (toplam_miktar / kackisi);
                kac_gram.setText(String.valueOf(yeni_toplam) + " Gr. Porsiyon: ");

                int kalori = (int) (karbonhidrat * 4);
                kalori = (int) (kalori + (protein * 4));
                kalori = (int) (kalori + yag * 9);

                kalori_field.setText(String.valueOf(kalori / kackisi) + " kcal");

                double sayi1 = (kalori / kackisi / 400);
                double sayi2 = (kalori / kackisi / 450);
                double sayi3 = (kalori / kackisi / 625);

                kalori_field.setText(String.valueOf(kalori / kackisi) + " kcal");
                egzersiz_label.setText(String.valueOf(kalori / kackisi) + " kcal yakmak için yapmanız gereken egzersizler.");

                egzersiz1_label.setText(new DecimalFormat("##.##").format(sayi1) + " saat");
                egzersiz2_label.setText(new DecimalFormat("##.##").format(sayi2) + " saat");
                egzersiz3_label.setText(new DecimalFormat("##.##").format(sayi3) + " saat");

            } catch (IOException ex) {
                Logger.getLogger(anaEkran.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_recete_buttonActionPerformed

    private void yeni_malzeme_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeni_malzeme_buttonActionPerformed
        malzemeEkle mek = new malzemeEkle();
        mek.show();
    }//GEN-LAST:event_yeni_malzeme_buttonActionPerformed

    private void kad_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kad_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kad_fieldActionPerformed

    private void guncelle_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelle_butonActionPerformed
        KayitGuncelleRestApiYonetici kg = new KayitGuncelleRestApiYonetici();

        om.setKad(kad_field.getText());
        om.setKsifre(ksifre_field.getText());
        om.setAd(ad_field.getText());
        om.setSoyad(soyad_field.getText());
        om.setYas(yas_field.getText());
        om.setBoy(boy_field.getText());
        om.setKilo(kilo_field.getText());

        if (erkek_radio.isSelected()) {
            om.setCinsiyet("erkek");
        } else {
            om.setCinsiyet("kadin");
        }

        if (kilovermek_radio.isSelected()) {
            om.setKilotercih("kvermek");
        } else if (kilokorumak_radio.isSelected()) {
            om.setKilotercih("kkorumak");
        } else {
            om.setKilotercih("kalmak");
        }

        try {
            kg.guncelle(om);
        } catch (Exception ex) {
            System.out.println(ex);
        }


    }//GEN-LAST:event_guncelle_butonActionPerformed

    private void ksifre_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ksifre_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ksifre_fieldActionPerformed

    private void gunlukComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gunlukComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gunlukComboActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        gunlukEkran ge = new gunlukEkran(gunlukCombo);
        ge.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String mtn2 = null;
        String mtn = gunlukCombo.getSelectedItem().toString();
        try {
            mtn2 = sql.goster(mtn);
        } catch (SQLException ex) {
            Logger.getLogger(anaEkran.class.getName()).log(Level.SEVERE, null, ex);
        }

        g_mtn_area.setText(mtn2);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ornekOgun oog = null;
        try {
            oog = new ornekOgun();
        } catch (IOException ex) {
            Logger.getLogger(anaEkran.class.getName()).log(Level.SEVERE, null, ex);
        }
        oog.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void recete_kaydet_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recete_kaydet_buttonActionPerformed

        ReceteKaydet rk = new ReceteKaydet();
        rk.kaydet(recete_baslik.getText(), toplam_karb.getText(), toplam_pro.getText(), toplam_yag.getText(), alerjenler_field.getText(), kalori_field.getText());


    }//GEN-LAST:event_recete_kaydet_buttonActionPerformed

    private void tum_gidalar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tum_gidalar_buttonActionPerformed
        tumGidalar tg = null;
        try {
            tg = new tumGidalar();
        } catch (IOException ex) {
            Logger.getLogger(anaEkran.class.getName()).log(Level.SEVERE, null, ex);
        }
        tg.show();
    }//GEN-LAST:event_tum_gidalar_buttonActionPerformed

    private void populer_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_populer_buttonActionPerformed
        populerTarifler pt = null;
        try {
            pt = new populerTarifler();
        } catch (IOException ex) {
            Logger.getLogger(anaEkran.class.getName()).log(Level.SEVERE, null, ex);
        }
        pt.show();
    }//GEN-LAST:event_populer_buttonActionPerformed

    private void sik_kullanilanlar_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sik_kullanilanlar_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sik_kullanilanlar_comboboxActionPerformed

    private void sik_ekle_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sik_ekle_buttonActionPerformed

        dm.addElement(sik_kullanilanlar_combobox.getSelectedItem().toString());
        jList1.setModel(dm);


    }//GEN-LAST:event_sik_ekle_buttonActionPerformed

    private void admin_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_buttonActionPerformed

        if (om.getKad().equals("evected")) {
            adminFrame af = new adminFrame();
            af.show();
        }


    }//GEN-LAST:event_admin_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(anaEkran.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(anaEkran.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(anaEkran.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(anaEkran.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new anaEkran().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(anaEkran.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdSoyadLabel;
    private javax.swing.JLabel HedefKiloLabel;
    private javax.swing.JLabel KiloLabel;
    private javax.swing.JLabel TavsiyeLabel;
    private javax.swing.JLabel YasLabel;
    private javax.swing.JTextField ad_field;
    private javax.swing.JButton admin_button;
    private javax.swing.JTextField alerjenler_field;
    private javax.swing.JTextField boy_field;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel egzersiz1_label;
    private javax.swing.JLabel egzersiz2_label;
    private javax.swing.JLabel egzersiz3_label;
    private javax.swing.JLabel egzersiz_label;
    private javax.swing.JButton ekle_button;
    private javax.swing.JRadioButton erkek_radio;
    private javax.swing.JTextArea g_mtn_area;
    private javax.swing.JComboBox<String> gida_combobox;
    private javax.swing.JButton guncelle_buton;
    private javax.swing.JComboBox<String> gunlukCombo;
    private javax.swing.JComboBox<String> hareket_combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel kac_gram;
    private javax.swing.JComboBox<String> kac_kisilik_combo;
    private javax.swing.JTextField kad_field;
    private javax.swing.JRadioButton kadin_radio;
    private javax.swing.JTextField kalori_field;
    private javax.swing.JTextField kilo_field;
    private javax.swing.JRadioButton kiloalmak_radio;
    private javax.swing.JRadioButton kilokorumak_radio;
    private javax.swing.JRadioButton kilovermek_radio;
    private javax.swing.JTextField ksifre_field;
    private javax.swing.JComboBox<String> miktar_combo;
    private javax.swing.JTextField miktar_field;
    private javax.swing.JButton populer_button;
    private javax.swing.JLabel recete_baslik;
    private javax.swing.JButton recete_button;
    private javax.swing.JButton recete_kaydet_button;
    private javax.swing.JButton sik_ekle_button;
    private javax.swing.JComboBox<String> sik_kullanilanlar_combobox;
    private javax.swing.JButton sil_button;
    private javax.swing.JTextField soyad_field;
    private javax.swing.JLabel su_label;
    private javax.swing.JLabel su_label2;
    private javax.swing.JTextField toplam_karb;
    private javax.swing.JTextField toplam_pro;
    private javax.swing.JTextField toplam_yag;
    private javax.swing.JButton tum_gidalar_button;
    private javax.swing.JLabel vki_label;
    private javax.swing.JTextField yas_field;
    private javax.swing.JTextField yemek_adi;
    private javax.swing.JButton yeni_malzeme_button;
    // End of variables declaration//GEN-END:variables

    private void SuHesaplaYonetici() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
