package tiendajumbo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/tienda.feature",
        tags = "@Regression",
        glue = {"tiendajumbo.stepdefinitions","tiendajumbo.util"},
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
