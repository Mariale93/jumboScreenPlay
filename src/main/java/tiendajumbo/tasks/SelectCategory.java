package tiendajumbo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import tiendajumbo.interaction.RecorrerLista;
import tiendajumbo.model.entity.DatosEntity;
import tiendajumbo.userinterfaces.CategoryHome;

import java.util.List;


public class SelectCategory implements Task {
    CategoryHome categoryHome;
    private List<String> data;

    public SelectCategory(List<String> data) {
        this.data = data;
    }

    public static SelectCategory Despensa(List<String> data) {
        return new SelectCategory(data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        DatosEntity.setDatos(data);
        System.out.println(DatosEntity.getDatos().getArroz_granos());

 actor.attemptsTo(Click.on(categoryHome .CATEGORIAS),
                MoveMouse.to(categoryHome.SUPERMERCADOS),
                MoveMouse.to(categoryHome.DESPENSA),
               //Scroll.to(categoryHome.DESPENSAS),
         Scroll
                RecorrerLista.inicio(categoryHome.DESPENSA_LIST,DatosEntity.getDatos().getBases_cremas_y_sopas())

        );

    }
}
