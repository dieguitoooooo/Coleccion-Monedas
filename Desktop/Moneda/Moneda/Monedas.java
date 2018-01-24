import java.util.ArrayList;

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

    /**
     * Constructor for objects of class Monedas
     */
    public Monedas()
    {
        // inicializacion de mi nuevo objecto
        coleccionMonedas = new ArrayList<Moneda>();
    }

    /**
     * Metodo para añadir monedas a nuestra coleccion.
     */
    public void addMoneda(String nombre, int cantidad, int anno)
    {
        // Aqui añado mis monedas
        coleccionMonedas.add(new Moneda(nombre, cantidad, anno));
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

}

