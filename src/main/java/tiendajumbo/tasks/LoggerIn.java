package tiendajumbo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static tiendajumbo.userinterfaces.HomeLog.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;
import static tiendajumbo.userinterfaces.HomeLog.BOTON_CONFIRMAR;

public class LoggerIn implements Task{
    public static LoggerIn jumbolog() {
        return Tasks.instrumented(LoggerIn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(METODO_ENTREGA),
                Click.on(TIENDA),
                Click.on(MENU_DEPARTAMENTO),
                Click.on(DEPARTAMENTO_ANTIOQUIA),
                Click.on(MENU_CIUDAD),
                Click.on(CIUDAD_MEDELLIN),
                Click.on(ELEGIR_TIENDA),
                Click.on(TIENDA_LAS_VEGAS),
                Click.on(BOTON_CONFIRMAR), WaitUntil.the(BOTON_CONFIRMAR, isNotPresent()).forNoMoreThan(5).seconds());
    }
}
