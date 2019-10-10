package tiendajumbo.tasks;

import cucumber.api.java.bs.A;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import tiendajumbo.userinterfaces.HomeLog;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static tiendajumbo.userinterfaces.HomeLog.BOTON_CONFIRMAR;

public class LoggerIn implements Task{
    HomeLog homeLog;
    public static LoggerIn jumbolog() {
        return Tasks.instrumented(LoggerIn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(homeLog.METODO_ENTREGA),
                Click.on(homeLog.TIENDA),
                Click.on(homeLog.MENU_DEPARTAMENTO),
                Click.on(homeLog.DEPARTAMENTO_ANTIOQUIA),
                Click.on(homeLog.MENU_CIUDAD),
                Click.on(homeLog.CIUDAD_MEDELLIN),
                Click.on(homeLog.ELEGIR_TIENDA),
                Click.on(homeLog.TIENDA_LAS_VEGAS),
                Click.on(BOTON_CONFIRMAR), WaitUntil.the(BOTON_CONFIRMAR, isNotPresent()).forNoMoreThan(5).seconds());

    }
}
