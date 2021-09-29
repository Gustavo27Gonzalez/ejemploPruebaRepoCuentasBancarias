package dominio;

public class CuentaCorriente extends Cuenta {
	
	private final Double DESCUBIERTO_MAXIMO;
	
	public CuentaCorriente(Integer cbu, Double saldo) {
		super(cbu, saldo);
		setTipoCuenta(TipoDeCuenta.CUENTA_CORRIENTE);
		this.DESCUBIERTO_MAXIMO = 150.0;
	}

	@Override
	public Boolean extraerDinero(Double monto) {
		Boolean sePudoExtraer = false;
		Double montoMaximoAextraer = getSaldo() + this.DESCUBIERTO_MAXIMO;
		if(monto <= getSaldo()) {
			setSaldo(getSaldo() - monto);
			sePudoExtraer = true;
		}else {
			if(monto <= montoMaximoAextraer) {
				Double montoDescubierto = montoMaximoAextraer - monto;
				Double comision = montoDescubierto * 0.05;
				setSaldo(getSaldo() - monto - comision);
				sePudoExtraer = true;
			}
		}
		return sePudoExtraer;
	}

	

}
