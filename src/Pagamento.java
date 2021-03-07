import java.util.Date;

public class Pagamento {

	private Date date;
	private long valorTotal;
	private FormaPagamento formaPagamento;

	public Pagamento(long total, Date date, FormaPagamento formaPagamento) {
		this.valorTotal = total;
		this.date = date;
		this.formaPagamento = formaPagamento;
	}
	
	public long getValorTotal() {
		return this.valorTotal;
	}

	public FormaPagamento getFormaPagamento() {
		return this.formaPagamento;
	}

}
