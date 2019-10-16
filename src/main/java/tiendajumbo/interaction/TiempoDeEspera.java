package tiendajumbo.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.awaitility.Awaitility;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static tiendajumbo.util.TiempoUtilidad.succesfulCondition;

public class TiempoDeEspera implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
            try {
                Awaitility.await().forever().pollInterval(5000, TimeUnit.MILLISECONDS).until(succesfulCondition());
            }catch (Exception e){
                e.getMessage();
            }
        }
        public static TiempoDeEspera aMoment(){
            return instrumented(TiempoDeEspera.class);
        }
    }

