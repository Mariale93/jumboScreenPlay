package tiendajumbo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import tiendajumbo.userinterfaces.JumboHome;

public class OpenThe implements Task {

    private JumboHome jumboHome;

    public static OpenThe jumboHome() {
        return Tasks.instrumented(OpenThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(jumboHome));
    }
}
