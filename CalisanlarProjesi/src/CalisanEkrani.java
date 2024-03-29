
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
/**
 *
 * @author yunuspektas
 */
public class CalisanEkrani extends javax.swing.JDialog {

    DefaultTableModel model;//Tablo üzerinde işlem yapmak için defaultablemodel şeklinde model ekliyoruz
    CalisanIslemleri islemler = new CalisanIslemleri(); //Veritabanı işlemleri için veritabanını bağladık constructorla

    /**
     * Creates new form CalisanEkrani
     */
    public CalisanEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        model = (DefaultTableModel) calisan_tablosu.getModel();// tablomu modele atamış oldum

        calisanGoruntule(); //eğer cosntructorun içinde yazarsak ekran açıldığında constructor çalışır tablo dolar

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        calisan_tablosu = new javax.swing.JTable();
        arama_cubugu = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ad_alani = new javax.swing.JTextField();
        soyad_alani = new javax.swing.JTextField();
        dept_alani = new javax.swing.JTextField();
        maas_alani = new javax.swing.JTextField();
        mesaj_yazisi = new javax.swing.JLabel();
        calisanekle = new javax.swing.JButton();
        guncelle = new javax.swing.JButton();
        sil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        calisan_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "ad", "soyad", "departman", "maaş"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        calisan_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calisan_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(calisan_tablosu);
        if (calisan_tablosu.getColumnModel().getColumnCount() > 0) {
            calisan_tablosu.getColumnModel().getColumn(0).setResizable(false);
            calisan_tablosu.getColumnModel().getColumn(1).setResizable(false);
            calisan_tablosu.getColumnModel().getColumn(2).setResizable(false);
            calisan_tablosu.getColumnModel().getColumn(3).setResizable(false);
            calisan_tablosu.getColumnModel().getColumn(4).setResizable(false);
        }

        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        jLabel1.setText("Ad:");

        jLabel2.setText("Soyad:");

        jLabel3.setText("Departman:");

        jLabel4.setText("Maaş:");

        mesaj_yazisi.setForeground(new java.awt.Color(204, 0, 0));

        calisanekle.setText("Yeni Çalışan Ekle");
        calisanekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calisanekleActionPerformed(evt);
            }
        });

        guncelle.setText("Çalışan Güncelle");
        guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleActionPerformed(evt);
            }
        });

        sil.setText("Çalışan Sil");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dept_alani)
                                        .addComponent(soyad_alani)
                                        .addComponent(ad_alani)
                                        .addComponent(maas_alani, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(calisanekle, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                        .addComponent(guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calisanekle))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(soyad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(guncelle)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dept_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sil))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(maas_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
   public void dinamikAra(String ara){
       TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
       
       calisan_tablosu.setRowSorter(tr);
       
       tr.setRowFilter(RowFilter.regexFilter(ara));//çalışan tablosu üzerinde
       
       //dinamik arama yapmak için bir kalıp bu TableRowSorter oluşturup içine DefaultTableModeli atayıp
       //kendi JTable imizin modelini atıyourz . tablomuz üzrinde sıralama yapıyoruz
       //dinamik araam kodu budur. tablomuzda 
   }
    
    
    
    
    
    
    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
          String ara = arama_cubugu.getText();
          
          dinamikAra(ara);//klavyeden girişimiz bittiği an metod tetiklenecek
    }//GEN-LAST:event_arama_cubuguKeyReleased

    private void calisanekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calisanekleActionPerformed
     mesaj_yazisi.setText("");
     
     String ad = ad_alani.getText();
     String soyad = soyad_alani.getText();
     String departman = dept_alani.getText();
     String maas = maas_alani.getText();
     
     
     islemler.calisanEkle(ad,soyad,departman,maas);
     
     calisanGoruntule();
     
     mesaj_yazisi.setText("Yeni Çalışan Başarıyla Eklendi.");
     
    }//GEN-LAST:event_calisanekleActionPerformed

    private void calisan_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calisan_tablosuMouseClicked
//mause ile tıklandığı zaman tablo üzerinde işlem yapıyorum

int selectedrow = calisan_tablosu.getSelectedRow();//burada seçilen satırı alıyorum

ad_alani.setText(model.getValueAt(selectedrow, 1).toString()); //Stringe çevirerek al diyor toString metoduyla stringe çevirdik
soyad_alani.setText(model.getValueAt(selectedrow, 2).toString());// o anki satırın 2. kolununu sütununu al diyorum
dept_alani.setText(model.getValueAt(selectedrow, 3).toString());
maas_alani.setText(model.getValueAt(selectedrow, 4).toString());

//id alanını almıyorum öyle bir alanımız yok textfieldda



    }//GEN-LAST:event_calisan_tablosuMouseClicked

    private void guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleActionPerformed
       String ad = ad_alani.getText();
       String soyad = soyad_alani.getText();
       String departman = dept_alani.getText();
       String maas = maas_alani.getText();
       
       int selectedrow = calisan_tablosu.getSelectedRow();
       
        if (selectedrow == -1 ) {// eğer selectedrow -1 dönüyorsa ya tablo boştur yada bir yere tıklanmamıştır
            if (model.getRowCount() == 0) {//getRowCount ile satır sayısını alırız boş u diye bakarız tabloya sıfıra eşitse boştur
                mesaj_yazisi.setText("Çaalışanlar Tablosu Şu Anda Boş ");
                
            }
            else{// tablom boş değildir ama bir yere tıklanmamıştır
                mesaj_yazisi.setText("Lütfen Güncellenecek Bir Çalışan Seçiniz.");
                
            }
        }
        else{
            //id miz autoincrement = otomatik arttırma yani otomatik arttırmada tek bir id si olabilir
            //id ye göre güncelleme yapacağım
            
            int id = (int)model.getValueAt(selectedrow, 0); //seçtiğim satırın 0. column unda kolununda id i vardır
            //tablodan obje tipli geldiği için int e çevirdik daha demin de toString ile stringe çevirmiştik
            
            islemler.calisanGuncelle(id,ad,soyad,departman,maas);
            
            calisanGoruntule();//veritabanındaki tablom güncellenmiş demektir 
            //çalışangörüntüleyle şuan ki tablomu gösteriyorum
            
            mesaj_yazisi.setText("Çalışan Başarıyla Güncellendi.");
            
            
        }
       
    }//GEN-LAST:event_guncelleActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
       mesaj_yazisi.setText("");
       
       int selectedrow = calisan_tablosu.getSelectedRow(); //seçtiğimiz satırı verir
       
        if (selectedrow == -1) { //selectedrow -1 ise ya tablomuz boştur yada bir alan seçilmemiştir
            
       
        if (model.getRowCount() == 0) {//getRowCount metodu tablodaki değerlerimizin sayısını verir sıfıra eşitse boş demektir
           mesaj_yazisi.setText("Çalışan Tablosu Şu Anda Boş.");
        }
        else{
            mesaj_yazisi.setText("Lütfen Silenecek Bir Çalışan Seçiniz.");
        }
        }
        else{
            int id = (int)model.getValueAt(selectedrow, 0);// 0. id ye denk geliyor
            //JTablosu object olarak değer tuttuğu için inte çevirmeliyiz
            //ide ye göre silicem seçilen satırın id sini alıyorum
            
            islemler.calisanSil(id);
            
            calisanGoruntule(); // tablomuz tekrar güncellensin diye
            
            mesaj_yazisi.setText("Çalışan Başarıyla Silindi.");
            
            
        }
        
    }//GEN-LAST:event_silActionPerformed

    /**
     * @param args the command line arguments
     */
    public void calisanGoruntule() {
        model.setRowCount(0); //setRowCount(0) metoduyla tablomuzu boşalttık her çalıştığında
        // güncellendiğinde hata vermesin diye

        ArrayList<Calisan> calisanlar = new ArrayList<Calisan>();

        calisanlar = islemler.calisanlariGetir();

        if (calisanlar != null) {
            for (Calisan calisan : calisanlar) {
                Object[] eklenecek = {calisan.getId(), calisan.getAd(), calisan.getSoyad(), calisan.getDepartman(), calisan.getMaas()};
                //JTabloya eklediğim veriler model üzerinden Object[] arrayi olmalı o yüzdne ilk önce değerleri ibject arrayine atadık

                model.addRow(eklenecek);// model.addRow ile tabloya veri ekliyoruz
                
                

            }

        }

    }

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
            java.util.logging.Logger.getLogger(CalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CalisanEkrani dialog = new CalisanEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad_alani;
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JTable calisan_tablosu;
    private javax.swing.JButton calisanekle;
    private javax.swing.JTextField dept_alani;
    private javax.swing.JButton guncelle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField maas_alani;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JButton sil;
    private javax.swing.JTextField soyad_alani;
    // End of variables declaration//GEN-END:variables
}
