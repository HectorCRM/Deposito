package Cuentas;

/**<ul>
 * <li>En este metodo hemos hecho lo siguente:</li>
 * <li>Renombrar la variable miCuenta>>Cuenta1</li>
 * <li>Hemos extraido el metodo de las sentencias que trabajan con la variable cuenta1 y lo hemos llamado operativa_cuenta</li>
 * <li>Hemos añadido un nuevo parametro a operativa_cuenta, lo hemos llamado cantidad y es de tipo float</li>
 * </ul>
 * @author Héctor Monroy Fuertes
 * @version 1.1
 * @since 1.1
*/


public class Main {

    public static void main(String[] args) {
        operativa_cuenta();
    }

	private static void operativa_cuenta() {
		CCuenta Cuenta1;
        double saldoActual;
        float cantidad;

        Cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = Cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            Cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            Cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
