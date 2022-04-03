import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClienteTest {
    @Test
    void testarClienteVazio(){
        Cliente ClienteTest = new Cliente();
        ClienteTest.setNome("ClienteTest");
        Assertions.assertNotNull(ClienteTest.getNome());
    }
}
