import java.util.Date;
import java.util.List;

public class ProcessadorBoletos {

	public Pagamento geraPagamento(List<Boleto> boletos) {
		long total = boletos
			.stream()
			.mapToLong(boleto -> boleto.getValorPago())
			.reduce(0, (subtotal, valor) -> subtotal + valor);
		return new Pagamento(total, new Date(), FormaPagamento.BOLETO);
	}

}
