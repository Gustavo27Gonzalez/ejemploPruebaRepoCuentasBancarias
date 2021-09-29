package dominio;

public abstract class Cuenta {
	
	private Integer cbu;
	private Double saldo;
	private TipoDeCuenta tipoCuenta;
	
	public Cuenta(Integer cbu, Double saldo) {
		this.cbu = cbu;
		this.saldo = saldo;
	}

	public Integer getCbu() {
		return cbu;
	}

	public void setCbu(Integer cbu) {
		this.cbu = cbu;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public TipoDeCuenta getTipoCuenta() {
		return this.tipoCuenta;
	}

	public void setTipoCuenta(TipoDeCuenta tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	
	public abstract Boolean extraerDinero(Double monto);
	
	public Boolean depositarDinerto(Double monto) {
		Boolean sePudoDepositar = false;
		if(monto > 0) {
			this.saldo += monto;
			sePudoDepositar = true;
		}
		return sePudoDepositar;	
	}

	@Override
	public String toString() {
		return "Cuenta [cbu=" + cbu + ", saldo=" + saldo + ", tipoCuenta=" + tipoCuenta + "]";
	};
	
	

}
