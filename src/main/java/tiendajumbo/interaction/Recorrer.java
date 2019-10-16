package tiendajumbo.interaction;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.interactions.Actions;
import tiendajumbo.questions.Subtotal;
import tiendajumbo.tasks.Buy;
import tiendajumbo.userinterfaces.BuyPage;

import java.util.List;

import static tiendajumbo.userinterfaces.BuyPage.SUBTOTAL;

public class Recorrer implements Interaction {
    private Target Lista;
    private Integer stotal;


    public Recorrer(Target Lista){
        this.Lista=Lista;    }

    public static Recorrer desde(Target Lista){
        return new Recorrer(Lista);    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listObject = Lista.resolveAllFor(actor);
        for (int i=0; i<listObject.size() ; i++){
            listObject.get(i).click();
            Integer tope = 2000;
/*            String total= Text.of(SUBTOTAL).viewedBy(actor).asString();
            String subtotal = total.replaceAll("[^a-zA-Z0-9]", "");
            stotal = Integer.parseInt(subtotal);
            System.out.println(subtotal);
            if (stotal < tope) {
                listObject.get(i).click();
                break;
            }*/
        }
    }
}


