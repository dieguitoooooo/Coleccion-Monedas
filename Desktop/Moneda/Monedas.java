import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class Monedas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Monedas
{
    //Aqui es donde se almacenaran mis monedas
    private ArrayList<Moneda> coleccionMonedas;
    private int id;

    /**
     * Constructor for objects of class Monedas
     */
    public Monedas()
    {
        // inicializacion de mi nuevo objecto
        coleccionMonedas = new ArrayList<Moneda>();
        id = 1;
    }

    /**
     * Metodo para añadir monedas a nuestra coleccion.
     */
    public void addMoneda(String nombre, int cantidad, int anno)
    {
        // Aqui añado mis monedas
        coleccionMonedas.add(new Moneda(nombre, cantidad, anno, id));
        id++;
    }

    /**
     * Muestra por pantalla todas las monedas que hay en la colección
     */
    public void mostrarColeccion()
    {
        int indice = 0;
        while(coleccionMonedas.size() > indice){
            System.out.println(coleccionMonedas.get(indice).getDetalles());
            indice++;
        }
    }

    /**
     * Metodo que elimina las monedas anteriores pasadas por parametro.
     */
    public void eliminaPorAnno(int annoMinimo)
    {
        Iterator<Moneda> ite = coleccionMonedas.iterator();
        while(ite.hasNext()){
            if(ite.next().getAnno() < annoMinimo) {
                ite.remove();
            }
        }
    }
    
    /**
     * Este metodo lo que hace es cambiar el tipo de moneda donde le indiquemenos en el indice
     */
    public void cambiaElTipoDeMoneda(int indice, String cambiarTipo)
    {
        if(coleccionMonedas.size() > 0){
            coleccionMonedas.get(indice).setNombre(cambiarTipo);
        }
    }

}


