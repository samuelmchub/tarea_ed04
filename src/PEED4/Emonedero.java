package PEED4;

public class Emonedero {
    /*Propiedades de la Clase Emonedero*/

    private String nombre;

    private double saldo;

    private String cliente;

  

    /* Constructor sin argumentos */

    public Emonedero ()

    {

    }

    /*Constructor con par�metros*/

    public Emonedero (String titular, double saldillo, String cli)

    {

        nombre =titular;

        saldo=saldillo;

        cliente=cli;

    }

   /*M�todo para asignar el titular del monedero*/

    public void fijartitular(String titular)

    {

        nombre=titular;

    }

    /* M�todo que indica el nombre del titular del monedero*/

    public String Titular()

    {

        return nombre;

    }

 

    /*M�todo que devuelve la cantidad de dinero de mi monedero electr�nico*/

     public double efectivo ()

    {

        return saldo;

    }

 

    /* M�todo para recargar el monedero */

    public void recargar (double cantidad) throws Exception

    {

        if (cantidad<0)

            throw new Exception("No se puede recargar el monedero");

        saldo = saldo + cantidad;

    }

 

    /* M�todo para pagar*/

    public void pagar (double cantidad) throws Exception

    {

        if (cantidad <= 0)

            throw new Exception ("No se puede pagar una cantidad negativa");

        if (efectivo()< cantidad)

            throw new Exception ("Su saldo es insuficiente para realizar el pago");

        saldo = saldo - cantidad;

    }

 

    /*M�todo que me devuelve el n�mero de cliente (identificador del tipo ED980SWS)*/

    public String numerocliente ()

    {

        return cliente;

    }

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private String getCliente() {
		return cliente;
	}

	private void setCliente(String cliente) {
		this.cliente = cliente;
	}

}