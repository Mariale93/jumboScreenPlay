package tiendajumbo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Wait;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class HomeLog extends PageObject {

    public static final Target METODO_ENTREGA = Target.the("Método de entrega")
            .located(By.xpath("//div[@class='delivery-header-wrapper']//div[@class='setup-delivery-container']"));
    public static final Target TIENDA = Target.the("Recoge en tienda")
            .located(By.xpath("//a[@class='select-recoge-en-tienda']//*[@class='delivery__option--svg']"));
    public static final Target MENU_DEPARTAMENTO = Target.the("Menú departamento")
            .located(By.xpath("/html[1]/body[1]/div[9]/div[1]/div[1]/div[1]/div[3]/div[1]/span[1]/span[1]/span[1]/span[1]"));
    public static final Target DEPARTAMENTO_ANTIOQUIA = Target.the("Departamento entrega")
            .located(By.xpath("/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[4]"));
    public static final Target MENU_CIUDAD = Target.the("Menú ciudad")
            .located(By.xpath("/html[1]/body[1]/div[9]/div[1]/div[1]/div[1]/div[3]/div[2]/span[1]/span[1]/span[1]/span[1]"));
    public static final Target CIUDAD_MEDELLIN = Target.the("Ciudad entrega")
            .located(By.xpath("/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[1]"));
    public static final Target ELEGIR_TIENDA = Target.the("Tienda")
            .located(By.xpath("/html[1]/body[1]/div[9]/div[1]/div[1]/div[1]/div[3]/div[3]/span[1]/span[1]/span[1]/span[1]"));
    public static final Target TIENDA_LAS_VEGAS = Target.the("las vegas")
            .located(By.xpath("/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[1]"));
    public static final Target BOTON_CONFIRMAR = Target.the("Botón confirmar")
            .located(By.xpath("/html[1]/body[1]/div[9]/div[1]/div[1]/div[1]/div[3]/div[4]"));
}
