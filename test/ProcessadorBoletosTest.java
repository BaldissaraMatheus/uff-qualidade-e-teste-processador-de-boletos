import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class ProcessadorBoletosTest {

	private ProcessadorBoletos processador;
	
	@BeforeEach()
	public void init() {
		ProcessadorBoletos processador = new ProcessadorBoletos();
	}
	
	@Test
	@DisplayName("Testa se boletos cuja soma de valores pagos é igual ao valor da fatura resulta em fatura paga")
	void TestaFaturaPagaParaValoresIguais() {
		Fatura fatura = new Fatura(new Date(), 3000, "Eduardo Lara");
		Boleto boletoA = new Boleto(new Date(), 2000);
		Boleto boletoB = new Boleto(new Date(), 1000);
		List<Boleto> boletos = new ArrayList<Boleto>();
		Pagamento pagamento = processador.geraPagamento(boletos);
		fatura.pagaFatura(pagamento);
		Assertions.assertEquals(fatura.getStatus(), FaturaStatus.PAGO);
	}
	
	@Test
	@DisplayName("Testa se boletos cuja soma de valores pagos é maior que valor da fatura resulta em fatura paga")
	void TestaFaturaPagaParaValoresMaiores() {
		Assertions.fail();
	}
	
	@Test
	@DisplayName("Testa se boletos cuja soma de valores pagos é menor que o valor da fatura resulta em fatura paga")
	void TestaFaturaPagaParaValoresMenores() {
		Assertions.fail();
	}
	
	@Test
	@DisplayName("Testa se fatura possui o tipo correto de pagamento")
	void TestaTipoDePagamento() {
		Assertions.fail();
	}

}
