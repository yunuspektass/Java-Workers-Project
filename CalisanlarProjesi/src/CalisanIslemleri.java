import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class CalisanIslemleri {
    private Connection con = null;
    private  Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public ArrayList<Calisan> calisanlariGetir(){
        ArrayList<Calisan> cikti = new ArrayList<Calisan>();
        
        try {
            statement = con.createStatement(); //veritabanı üzerindeki sorgularımızı
            //statement ile connectiona bağalyarak yaparız
            
            String sorgu = "Select * From calisanlar"; //çalışan tablosundaki bütün bilgileri alır
            
            ResultSet rs = statement.executeQuery(sorgu); //sorgudan dönen değeri resultsete atıycaz
            //statement.executeQuery ile sorgumuzu çalıştırdık
            
            while (rs.next()) {//rs.next metodu bi değeri gösteriyorsa true dönecek bitene kadar bittiğinde false döner
            int id = rs.getInt("id");
            String ad = rs.getString("ad");
            String soyad = rs.getString("soyad");
            String dept = rs.getString("departman");
            String maas = rs.getString("maas");
            
                cikti.add(new Calisan(id,ad,soyad,dept,maas));
                
                
            }
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;//eğer üstte hata olursa arraylist null dönecek
        }
        
     

    }
    
    public void calisanEkle(String ad , String soyad , String departman , String maas){
        
        String sorgu = "Insert Into calisanlar (ad,soyad,departman,maas) VALUES (?,?,?,?)";
        
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            // constructor da aldığım değerleri preparedStatement.setString ile soru işaretleri yerine ekliyorum
            preparedStatement.setString(1, ad);
           preparedStatement.setString(2, soyad);
           preparedStatement.setString(3, departman);
           preparedStatement.setString(4, maas);
           
           preparedStatement.executeUpdate();//Burda insert ekleme işlemi yaptığımız için executeUpdate yapıyoruz
           
           
           
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public void calisanGuncelle(int id , String yeni_ad , String yeni_soyad , String yeni_departman , String yeni_maas ){
        String sorgu = "Update calisanlar set ad = ? , soyad = ? , departman = ? , maas = ? where id = ? ";
        //id ye göre değiştiriyorum where id ile idsi buraya gönderdiğim id olan kısımları değiştir dedim 
        try {
            preparedStatement = con.prepareStatement(sorgu);
            //preparedstatement = hazırlanmışkomut anlamında komutumuzu yapması için yolluyoruz
            
            preparedStatement.setString(1, yeni_ad);
            preparedStatement.setString(2, yeni_soyad);
            preparedStatement.setString(3, yeni_departman);
            preparedStatement.setString(4, yeni_maas);
           preparedStatement.setInt(5, id);
            
           preparedStatement.executeUpdate(); //execute ile çalıştırıoyrum güncellediğim için executeUpdate kullanıyorum
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    
    public void calisanSil(int id){// id ye göre silicek
        String sorgu = "Delete from calisanlar where id = ? ";
        //çalışanlar ... id yi sil demek
        try {
            preparedStatement = con.prepareStatement(sorgu);
            //preparedStatement hazır komut anlamında
            preparedStatement.setInt(1, id);// preparedStatement.setInt ile soru işareti yerine eklemek istediğimiz şeyi bleirttik
            // 1. soru işareti
            preparedStatement.executeUpdate(); //executeUpdate ile gerçekleştiriyoruz güncelleme olduğu için
            //executeUpdate kullanıyoruz
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
        
        
        
        
    }
    
    public boolean girisYap(String kullanici_adi , String parola){
    String sorgu = "Select * From adminler where username = ? and password = ?  ";
    // *  bütün tabloya bak anlamında
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, kullanici_adi); //1. soru işaretinin yerine
            preparedStatement.setString(2, parola); // 2. soru işaretinin yerine gönderiyorum.
            
            ResultSet rs = preparedStatement.executeQuery();
            //eğer değerimiz varsa resultsete değerimiz dönecek eğer değerimiz yoksa resultsete hiçbirşey dönmeyecek
            
     //resultset bir yer gösteriyormu diye baktık eğer kullanıcı adımız parolamız yanlışsa bir yer göstemediği için false döncek 
        
           //kullanıcı adı ve parola var demek
           
           return rs.next();//rs.nextinde içinde değer varsa true boşsa false dönecek
       
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
                return false; // eğer üstte exception olursa alt tarafa return falsse yazdık
        }
    
    }
    
    public CalisanIslemleri(){ //Constructorda bağlanma işlemlerini gerçekleştiricem
        // "jbdc:mysql://localhost:3306/demo" 
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        
        
        try {
            con = DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
            System.out.println("Bağlantı Başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace();
        }
        
         

         }
        
         
}
