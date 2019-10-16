package tiendajumbo.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;


public class BuyPage extends PageObject {
    @FindBy(xpath = "product-item__add-to-cart product-add-to-cart btn red add-to-cart")
    static WebElementFacade comprar;

    public static final Target SELECT_ORDENAR = Target.the("ordenar")
            .located(By.xpath("//span[@class='selection']"));
    public static final Target SELECT_MENOR_PRECIO = Target.the("menor precio")
            .located(By.xpath("//option[contains(text(),'Menor precio')]"));
    public static final Target COMPRAR = Target.the("comprar primer producto")
            .located(org.openqa.selenium.By.xpath("(//button[@class='product-item__add-to-cart product-add-to-cart btn red add-to-cart'])[1]"));
    public static final Target SUBTOTAL = Target.the("subtotal")
            .located(By.xpath("/html[1]/body[1]/div[26]/div[1]/div[2]/div[7]/div[5]/div[1]/div[2]/div[4]/div[1]/div[2]"));

}
