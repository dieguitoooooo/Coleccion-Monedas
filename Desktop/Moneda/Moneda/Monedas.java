import java.util.ArrayList;

/**
 * Write a description of class Monedas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Monedas
{
    //aqui es donde se almacenaran mis monedas
    private ArrayList<Moneda> coleccionMonedas;

    /**
     * Constructor for objects of class Monedas
     */
    public Monedas()
    {
        // inicializacion de mi nuevo objecto
        coleccionMonedas = new ArrayList<Moneda>();
    }
    
    public void addMoneda(String nombre, int cantidad, int anno)
    {
        // put your code here
        coleccionMonedas.add(new Moneda(nombre, cantidad, anno));
    }
}

