import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "josias")
    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    @EnabledOnJre(JRE.JAVA_24)
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_24)
    @EnabledOnOs(OS.LINUX)
    @DisabledOnOs(OS.WINDOWS)
    void validarAlgoSomenteNoUsuario(){
        Assertions.assertEquals(10, 5 + 5);
    }
}
