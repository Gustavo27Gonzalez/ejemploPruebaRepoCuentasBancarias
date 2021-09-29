package interfaz;

import dominio.Banco;
import dominio.CajaDeAhorro;
import dominio.Cliente;
import dominio.Cuenta;
import dominio.CuentaCorriente;
import dominio.CuentaSueldo;

public class App {

	public static void main(String[] args) {
		
		Banco bancoPB2 = new Banco();
		Cliente clientePB2 = new Cliente("Aureliano", "Buendía", 22333444);
		Cliente clientePB2A = new Cliente("José Arcadio", "Buendía", 33222444);
		Cuenta cuentaPB2 = new CuentaCorriente(01234567, 110.0);
		Cuenta cuentaPB1 = new CajaDeAhorro(11223344, 100.0);
		Cuenta cuentaPB3 = new CuentaSueldo(12123445, 120.0);
		bancoPB2.agregarCliente(clientePB2);
		bancoPB2.agregarCliente(clientePB2A);
		bancoPB2.agregarCuenta(cuentaPB3);
		bancoPB2.agregarCuenta(cuentaPB2);
		bancoPB2.agregarCuenta(cuentaPB1);
		bancoPB2.mostrarListaClientes();
		bancoPB2.mostrarListaCuentas();
		
		cuentaPB1.depositarDinerto(300.0);
		System.out.println("Ver saldo: " + cuentaPB1.getSaldo());
		cuentaPB1.extraerDinero(450.0);
		System.out.println("Ver saldo: " + cuentaPB1.getSaldo());
		cuentaPB1.extraerDinero(350.0);
		System.out.println("Ver saldo: " + cuentaPB1.getSaldo());
		
		cuentaPB2.depositarDinerto(300.0);
		System.out.println("Ver saldo: " + cuentaPB2.getSaldo());
		cuentaPB2.extraerDinero(450.0);
		System.out.println("Ver saldo: " + cuentaPB2.getSaldo());
		cuentaPB2.extraerDinero(350.0);
		System.out.println("Ver saldo: " + cuentaPB2.getSaldo());
		
		cuentaPB3.depositarDinerto(300.0);
		System.out.println("Ver saldo: " + cuentaPB3.getSaldo());
		cuentaPB3.extraerDinero(450.0);
		System.out.println("Ver saldo: " + cuentaPB3.getSaldo());
		cuentaPB3.extraerDinero(350.0);
		System.out.println("Ver saldo: " + cuentaPB3.getSaldo());
	}

}
