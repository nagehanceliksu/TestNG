package test.day21;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_ReadExcel {
    @Test
    public void C02_ReadExcelTest() throws IOException {

    //*   // ulkeler excel'inin 3.satirini yazdirin

    String path="src/test/java/resources/ulkeler.xlsx";
    FileInputStream fis=new FileInputStream(path);

        Workbook workbook= WorkbookFactory.create(fis);
for (int i=0; i<4;i++){
    System.out.println("3.satirini yazdir = " + workbook.getSheet("Sayfa1").getRow(3).getCell(i));
}
        System.out.println("**************************************");
        //* ilk 20 ulkenin baskentlerinin turkce isimlerini yazdirin
        for (int i=1; i<21;i++){
            System.out.println("ilk 20 ulkenin = " + workbook.getSheet("Sayfa1").getRow(i).getCell(3));

}}}
