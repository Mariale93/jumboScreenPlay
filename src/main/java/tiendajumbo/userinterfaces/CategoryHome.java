package tiendajumbo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategoryHome {
    public static final Target CATEGORIAS = Target.the("Categorias tienda")
            .located(By.xpath("//button[@class='button-categories toggleSlide']"));
    public static final Target SUPERMERCADOS = Target.the("Categoría supermercado")
            .located(By.xpath("//li[@class='navigation__item-category food-site special-menu']"));
    public static final Target DESPENSA = Target.the("Elección despensa")
            .located(By.xpath("//li[@class='navigation__item-category food-site special-menu']//li[@class='navigation_box-subcategory']//li[1]"));
    public static final Target DESPENSA_LIST = Target.the("Lista de productos")
            .located(By.xpath("//li[@class='despensa active-menu']//li"));
    public static final Target DESPENSAS = Target.the("producto no visible")
            .located(By.xpath("//li[@class='despensa active-menu']//li[16]"));
}
