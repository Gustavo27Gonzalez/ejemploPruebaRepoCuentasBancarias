package dominio;

public class CajaDeAhorro extends Cuenta {

	private Integer contadorExtracciones;
	
	public CajaDeAhorro(Integer cbu, Double saldo) {
		super(cbu, saldo);
		setTipoCuenta(TipoDeCuenta.CAJA_AHORRO);
		this.contadorExtracciones = 0;
	}

	@Override
	public Boolean extraerDinero(Double monto) {
		Boolean sePudoExtraer = false;
		Double maximoMontoAextraer = getSaldo();
		if(monto <= maximoMontoAextraer) {
			if(contadorExtracciones<=4) {
				setSaldo(getSaldo()-monto);
				sePudoExtraer = true;
			}else {
				if( monto <= ( maximoMontoAextraer - 6.0 ) ) {
					setSaldo(getSaldo()-monto-6.0);
					sePudoExtraer = true;
				}
			}
		}
		return sePudoExtraer;
	}

	
	
	

}
