package tiendajumbo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;
import tiendajumbo.interaction.TiempoDeEspera;
import tiendajumbo.questions.Subtotal;
import tiendajumbo.userinterfaces.BuyPage;

import static tiendajumbo.userinterfaces.BuyPage.COMPRAR;
import static tiendajumbo.userinterfaces.BuyPage.SELECT_MENOR_PRECIO;
import static tiendajumbo.userinterfaces.BuyPage.SUBTOTAL;

public class Buy implements Task {
    private Integer precio;
    private Integer stotal;

    public static Buy products() {
        return Tasks.instrumented(Buy.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                TiempoDeEspera.aMoment(),
                Click.on(SELECT_MENOR_PRECIO),
                TiempoDeEspera.aMoment(),
                Scroll.to(COMPRAR),
                JavaScriptClick.on(COMPRAR),
                TiempoDeEspera.aMoment()
        );

        //Subtotal.carrito(precio);
/*
        WebElement driver = Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("(//button[@class='product-item__add-to-cart product-add-to-cart btn red add-to-cart'])[1]"));
        if (driver != null && driver.isDisplayed()){
            System.out.println("SI EXISTE EL FUCKING ELEMENTO");
        }*/

        System.out.println("---------------------");

    }
}
