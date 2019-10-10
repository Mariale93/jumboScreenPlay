package tiendajumbo.model.entity;

import tiendajumbo.model.Datos;

import java.util.List;

public class DatosEntity {

    public static Datos info = new Datos();

    public static Datos getDatos(){
        return info;    }

    public static void setDatos(List<String> Datos){
        info.setArroz_granos(Datos.get(0));
        info.setAceite(Datos.get(1));
        info.setCafé(Datos.get(2));
        info.setBebida_achocolatada_en_polvo(Datos.get(3));
        info.setCereales(Datos.get(4));
        info.setHarinas_y_mezclas(Datos.get(5));
        info.setPastas(Datos.get(6));
        info.setEnlatados_y_conservas(Datos.get(7));
        info.setEncurtidos_y_otros(Datos.get(8));
        info.setAzúcar_Endulzantes_y_Panelas(Datos.get(9));
        info.setChocolate_de_mesa(Datos.get(10));
        info.setAvenas_y_salvado(Datos.get(11));
        info.setCondimentos_caldos_y_sal(Datos.get(12));
        info.setBases_cremas_y_sopas(Datos.get(13));
        info.setSalsas_y_vinagres(Datos.get(14));
        info.setTé_infusiones_e_instantaneos(Datos.get(15));
    }
}
