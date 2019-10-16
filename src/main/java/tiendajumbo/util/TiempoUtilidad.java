package tiendajumbo.util;

        import java.util.concurrent.Callable;
public class TiempoUtilidad {
    public static Callable<Boolean> succesfulCondition(){
        return new Callable<Boolean>() {
            public Boolean call() throws Exception{
                Boolean allMessagesProcessed = true;
                return allMessagesProcessed;
            }
        };
    }
}