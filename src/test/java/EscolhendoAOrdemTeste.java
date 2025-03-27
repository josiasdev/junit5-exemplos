import org.junit.jupiter.api.*;

// OrderAnnotation Seguir a ordem definida em cada teste.
// MethodName Seguir a ordem alfabética.
// Random Seguir a ordem aleatória.
// DisplayName Definir um DisplayName em cada teste.
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoAOrdemTeste {

// DisplayName Definir um DisplayName em cada teste.
//    @DisplayName("A")
    @Order(4)
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }
}