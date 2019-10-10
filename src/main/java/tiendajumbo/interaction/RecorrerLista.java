package tiendajumbo.interaction;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class RecorrerLista implements Interaction {
    private Target lista;
    private String opcion;

    public RecorrerLista(Target lista, String opcion) {
        this.lista = lista;
        this.opcion = opcion;
    }

    public static RecorrerLista inicio(Target lista, String opcion){
        return new RecorrerLista(lista,opcion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listObject = lista.resolveAllFor(actor);
        for (int i=0; i<listObject.size(); i++){
            if (listObject.get(i).getText().trim().equals(opcion)){
                listObject.get(i).click();
                break;
            }
        }
    }
}
