package test.day21;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_ReusableRunner {
    //todo
    // // ulkeler excel'indeki Sayfa1'de
    //        // 11.index'deki satirin, 2.index'deki hucresinin Azerbaycan oldugunu test edin
   @Test
    public void test01(){

       String path="src/test/java/resources/ulkeler.xlsx";
       String expected="Azerbaycan";
       String actual=C03_ReusableMethodsExcel.hucreGetir(path ,"Sayfa1",11,2).getStringCellValue();
       Assert.assertEquals(actual,expected,"test failed");
   }
}

