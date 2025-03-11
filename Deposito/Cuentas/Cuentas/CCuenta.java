package Cuentas;

/**Clase CCuenta
 * 
 * Contiene informacion sobre la operativa de las cuentas de los clientes
 * 
 * @author Héctor Monroy Fuertes
 * @version 1.0
 * @since 1.0
*/

public class CCuenta {

	
/**
 * Nombre del cliente
 */
    private String nombre;
    
/**
 * Numero de cuenta del cliente
 */
    private String cuenta;
    
/**
 * Saldo cuenta cliente
 */
    private double saldo;

/**
 * Tipo de interes aplicado
 */
    private double tipoInterés;

    double getTipoInterés() {
		return tipoInterés;
	}

	void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	double getSaldo() {
		return saldo;
	}

	void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	String getCuenta() {
		return cuenta;
	}

	void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

/**
 * Constructor por defecto
 */
	public CCuenta()
    {
    }
/**
 * Constructor con 4 parametros
 * @param nom Nombre del cliente
 * @param cue Numero de cuenta
 * @param sal Saldo cuenta
 * @param tipo Tipo de interes aplicado
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

/**
 * Metodo que almacena el saldo de una cuenta
 * @return Devuelve el saldo de la cuenta
 */
    public double estado()
    {
        return getSaldo();
    }

    /**<ul>
     * <li>Este metodo comprueba si la cantidad a ingresar es menor a 0.</li>
     * <li>En caso de ser mayor que 0 actualiza el saldo de la cuenta.</li>
     * </ul>
     * @param cantidad Cantidad de dinero que el cliente desea ingresar en su cuenta.
     * @throws Exception Lanza mensaje de advertenca en caso de cantidades menores a 0
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

/**<ul>
 * <li>Este metodo comprueba si la cantidad a retirar es igual o menor que 0.</li>
 * <li>Si la cantidad es mayor que 0 comprueba que la cantidad sea menor al saldo de la cuenta.</li>
 * <li>Si la cantidad es menor al saldo lo actualiza.</li>
 * </ul>
 * @param cantidad Cantidad de dinero que el cliente desea sacar de su cuenta.
 * @throws Exception Lanza mensaje de advertenca en caso de cantidades menores a 0 o superiores al saldo de la cuenta.
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
