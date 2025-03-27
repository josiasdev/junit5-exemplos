import com.github.josiasdev.Pessoa;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
    @Test
    void validarLancamento(){
        int[] primeiroLancamento = {10, 20, 30,40 ,50};
        int[] segundoLancamento = {-1, 5, 2, 3, 10};

        assertNotEquals(primeiroLancamento, segundoLancamento);
        //fail("error no teste");

        //assertEquals(5, 3+3);
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDate.of(2000,1,1));
        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes(){
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }
}