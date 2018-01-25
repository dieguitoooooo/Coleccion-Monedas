
/**
 * Write a description of class Moneda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Moneda
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int cantidad;
    private int anno;
    private int id;

    /**
     * Constructor for objects of class Moneda
     */
    public Moneda(String nombre, int cantidad, int anno, int id)
    {
        // initialise instance variables
        setDetalles(nombre, cantidad, anno, id);
    }

    /**
     * Metodo para conseguir los detalles de una moneda.
     */
    public String getDetalles()
    {
        return "Tipo: "+ nombre + ": "+ "Cantidad: "+ cantidad + " " + "Año: " + anno + " " + "Id: #" + id +"#";
    }

    /**
     * Devuelve el tipo de moneda Euros, libra, peso, etc...
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * Devuelve la cantidad de moneda 1cent, 2cent 1€
     */
    public int cantidad()
    {
        return cantidad;
    }

    /**
     * Devuelve el año.
     */
    public int anno()
    {
        return anno;
    }

    /**
     * Identifiacdor de cada moneda.
     */
    public int id()
    {
        return id;
    }

    /**
     *Con este metodo introducimos los detalles de una determinada moneda.
     */
    public void setDetalles(String nombre, int cantidad, int anno, int id)
    {
        // put your code here
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.anno= anno;
        this.id = id;
    }
}
