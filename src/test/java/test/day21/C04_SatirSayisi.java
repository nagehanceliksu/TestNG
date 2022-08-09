package test.day21;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_SatirSayisi {
    @Test
    public void test01() throws IOException {
        //todo
        // ulkeler excelindeki Sayfa1 ve Sayfa2 deki satir sayilari
        // ve kullanılan satir sayilarini bulun

        String path="src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fis);

        int satirsayisi=workbook.getSheet("Sayfa1").getLastRowNum(); //*burası index ile çalışır
        int sayfadakiFizikselSatirNo=workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();//* index ile değil sayma sayısı ile çalışır

        System.out.println("satirsayisi = " + satirsayisi);
        System.out.println("sayfadakiFizikselSatirNo = " + sayfadakiFizikselSatirNo);

        int satirsayisi2=workbook.getSheet("Sayfa2").getLastRowNum(); //*burası index ile çalışır
        int sayfadakiFizikselSatirNo2=workbook.getSheet("Sayfa2").getPhysicalNumberOfRows();//* index ile değil sayma sayısı ile çalışır
        System.out.println("satirsayisi2 = " + satirsayisi2);
        System.out.println("sayfadakiFizikselSatirNo2 = " + sayfadakiFizikselSatirNo2);
    }
}
