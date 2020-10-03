package Buy;

import Pages.BuyPage;
import Pages.DslPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BaseTest {

     WebDriver navegador;
     DslPage dsl;
     public BuyPage page;

    @Before
    public void openbrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("http://www.automationpractice.com/");
        dsl = new DslPage(navegador);
        page = new BuyPage(navegador);
    }

        @After
    public void closebrowser() {
        navegador.quit();
    }
}
