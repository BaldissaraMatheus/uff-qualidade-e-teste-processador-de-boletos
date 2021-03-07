import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProcessadorBoletosTest {

	@Test
	@DisplayName("Testa se boletos cuja soma de valores pagos é igual ao valor da fatura resulta em fatura paga")
	void TestaFaturaPagaParaValoresIguais() {

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
