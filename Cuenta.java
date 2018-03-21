package ejercicio1;
/**
 Realizar un programa que permita gestionar el saldo de una cuenta corriente. Una
 vez introducido el saldo inicial, se mostrará un menú que permitirá efectuar las
 siguientes operaciones:
	1. Hacer un reintegro, se pedirá la cantidad a retirar.
	2. Hacer un ingreso, se pedirá la cantidad a ingresar.
	3. Consultar el saldo y el número de reintegros e ingresos realizados.
	4. Finalizar las operaciones. Debe confirmar si realmente desea salir e
       informar del saldo al final de todas las operaciones.

 Debe realizarse una clase Cuenta y la clase Principal.
*/
public class Cuenta extends CuentaCredito {

	

	// Contructores
	
	public Cuenta() {
		saldo = 0;
		contadorIngresos = 0;
		contadorReintegros = 0;
	}

	public Cuenta(double saldo) throws CuentaException {
		if (saldo < 0) {			
			throw new CuentaException("No se puede crear una cuenta con saldo negativo.");
		} 
		else {
			this.saldo = saldo;
			contadorIngresos = 0;
			contadorReintegros = 0;
		}
	}

	// Métodos gets

}