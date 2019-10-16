package tiendajumbo.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tiendajumbo.questions.Subtotal;
import tiendajumbo.tasks.Buy;
import tiendajumbo.tasks.LoggerIn;
import tiendajumbo.tasks.OpenThe;
import tiendajumbo.tasks.SelectCategory;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class TiendaStepDefinition {

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }

    @Given("^that (.*) needs to login on jumbo's page$")
    public void thatJuanNeedsToLoginOnJumboSPage(String maleja) {
        theActorCalled(maleja).wasAbleTo(OpenThe.jumboHome());
    }

    @When("^she makes the registration entry in the application, select from menu despensa and choose products$")
    public void sheMakesTheRegistrationEntryInTheApplicationSelectFromMenuDespensaAndChooseProducts(List<String> data) {
        theActorInTheSpotlight().attemptsTo(
                LoggerIn.jumbolog(),
                SelectCategory.Despensa(data),
                Buy.products()
        );
    }

    @Then("^she visualizes the shoping car and verify that don't be major than (.*) pesos$")
    public void sheVisualizesTheShopingCarAndVerifyThatDonTBeMajorThanTweentyThousandPesos(Integer precio)  {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Subtotal.carrito(precio)));
    }
}

