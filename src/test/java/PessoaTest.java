import com.github.josiasdev.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa pessoa = new Pessoa("Jéssica", LocalDate.of(2003, 9,25));
        Assertions.assertEquals(21, pessoa.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa pessoa = new Pessoa("Jéssica", LocalDate.of(2003, 9,25));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João", LocalDate.of(2025, 1,1));
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}
