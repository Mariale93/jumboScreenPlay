package tiendajumbo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import tiendajumbo.interaction.Recorrer;
import tiendajumbo.model.entity.DatosEntity;

import java.util.List;

import static tiendajumbo.userinterfaces.CategoryHome.*;

public class SelectCategory implements Task {
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

        actor.attemptsTo(Click.on(CATEGORIAS),
                MoveMouse.to(SUPERMERCADOS),
                MoveMouse.to(DESPENSA),
                Scroll.to(DESPENSAS),
                Recorrer.desde(DESPENSA_LIST)
        );
    }
}
