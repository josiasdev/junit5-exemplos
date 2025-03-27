import com.github.josiasdev.Conta;
import com.github.josiasdev.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {
    @Test
    void validarCenarioDeExcepcaoNaTrasnferencia(){
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("134982", 100);


        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        // Espera a excepção não ser lançada
        // Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));

        // Espera a excepção ser lançada
        Assertions.assertThrows(IllegalArgumentException.class, () ->
        transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
    }
}