package dominio;

import java.util.Arrays;

public class Banco {

	private Cliente [] clientes;
	private Cuenta [] cuentas;
	
	public Banco() {
		this.clientes = new Cliente [1000];
		this.cuentas = new Cuenta [5000];
	}
	
	public Boolean agregarCliente(Cliente cliente) {
		for(int i = 0; i < this.clientes.length; i++) {
			if(this.clientes[i]==null) {
				this.clientes[i]=cliente;
				return true;
			}
		}
		return false;
	}
	
	public Boolean agregarCuenta(Cuenta cuenta) {
		for(int i = 0; i < this.cuentas.length; i++) {
			if(this.cuentas[i]==null) {
				this.cuentas[i]=cuenta;
				return true;
			}
		}
		return false;
	}
	
	public void mostrarListaClientes() {
		int i = 0;
		while(this.clientes[i]!=null) {
			System.out.println(this.clientes[i].toString());
			i++;
		}
	}
	
	public void mostrarListaCuentas() {
		int i = 0;
		while(this.cuentas[i]!=null) {
			System.out.println(this.cuentas[i].toString());
			i++;
		}
	}

	
	
	
	
}
