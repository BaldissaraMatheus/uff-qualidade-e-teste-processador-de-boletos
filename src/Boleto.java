import java.util.Date;

public class Boleto {

	private long valorPago;
	
	public Boleto(Date data, long valorPago) {
		this.valorPago = valorPago;
	}
	
	public long getValorPago() {
		return this.valorPago;
	}

}
