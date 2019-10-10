package tiendajumbo.util;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class tiendaHook {
    public class TiendaHook {

        @Before
        public void setUp(){
            OnStage.setTheStage(new OnlineCast());
        }
    }
}
