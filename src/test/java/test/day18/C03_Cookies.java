package test.day18;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.Set;

public class C03_Cookies extends TestBase {
//todo
// Yeni bir class olusturun : cookiesAutomation
// Amazon anasayfaya gidin
// tum cookie’leri listeleyin
// Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
//  ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
// ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie
// olusturun ve sayfaya ekleyin
// eklediginiz cookie’nin sayfaya eklendigini test edin
// ismi skin olan cookie’yi silin ve silindigini test edin
// tum cookie’leri silin ve silindigini test edin
    @Test
    public void cookiesAutomation(){
        //* // Amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        //*// tum cookie’leri listeleyin
      Set<Cookie> cook= driver.manage().getCookies();
int sayac=1;
        for (Cookie each:cook) {

            System.out.println((sayac++)+" each = " + each);
        }
    }

}
