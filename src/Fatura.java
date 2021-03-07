import java.util.Date;

public class Fatura {

	private FaturaStatus status;
	private Date data;
	private long valor;
	private String cliente;

	public Fatura(Date data, long valor, String cliente) {
		this.data = data;
		this.valor = valor;
		this.cliente = cliente;
	}
	
	public long getValor() {
		return this.valor;
	}
	
	public FaturaStatus getStatus() {
		return this.status;
	}

	public void pagaFatura(Pagamento pagamento) {
		this.status = FaturaStatus.PAGO;
	}

}
