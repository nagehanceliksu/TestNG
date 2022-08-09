package test.day21;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class C03_ReusableMethodsExcel {
    public static  Cell hucreGetir(String path,String sayfaismi,int satirIndex,int hucreIndex ){
       Cell cell=null;
       try {
           FileInputStream fis=new FileInputStream(path);
           Workbook  workbook= WorkbookFactory.create(fis);
           cell=workbook.getSheet(sayfaismi).getRow(satirIndex).getCell(hucreIndex);
       }catch (IOException e){
    }
    return cell;
}
public static Map<String,String> mapOlustur(String path,String sayfaAdi){
        Map<String ,String> excelMap=new TreeMap<>();
        Workbook workbook=null;

        //* ilk adım excelden istenen sayfaya ulaşmak
    try {
        FileInputStream fis=new FileInputStream(path);
        workbook=WorkbookFactory.create(fis);
       } catch (IOException e) {
        e.printStackTrace();
    }
    int satirSayisi=workbook.getSheet(sayfaAdi).getLastRowNum();
    String key="";
    String value="";

    for (int i=0; i<=satirSayisi; i++){
        //* ikinci adım da tablodaki hücreleri Map'e uygun hale getirelim.
        key=workbook.getSheet(sayfaAdi).getRow(i).getCell(0).toString();
        value=workbook.getSheet(sayfaAdi).getRow(i).getCell(1).toString()+" "+
                workbook.getSheet(sayfaAdi).getRow(i).getCell(2).toString()+" "+
                workbook.getSheet(sayfaAdi).getRow(i).getCell(3).toString();
        excelMap.put(key,value);
    }

    return excelMap;
}

}
