package tiendajumbo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import tiendajumbo.userinterfaces.BuyPage;

public class Subtotal implements Question<Boolean> {
    private String preciototal;
    private Integer precio;
    private Integer stotal;
    private Integer tope=2000;

    public Subtotal(Integer precio) {
        this.precio = precio;
    }

    public static Subtotal carrito(Integer precio){
        return new Subtotal(precio);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String total= Text.of(BuyPage.SUBTOTAL).viewedBy(actor).asString();
        String subtotal = total.replaceAll("[^a-zA-Z0-9]", "");
        stotal = Integer.parseInt(subtotal);
        //System.out.println(subtotal);
        if (stotal < tope){
            resultado = true;
        }else resultado = false;
        //System.out.println(resultado);
        return resultado;
    }

}
