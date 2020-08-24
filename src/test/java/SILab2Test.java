import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SILab2Test {

    @Test
    void EveryStatementAndBranchTest() {
        RuntimeException ex;

        ex = assertThrows(RuntimeException.class, () -> SILab2.checkPrime(-1));
        assertTrue(ex.getMessage().contains("Number should not be negative"));

        assertEquals(false,SILab2.checkPrime(1));

        assertEquals(true,SILab2.checkPrime(4));

        assertEquals(false,SILab2.checkPrime(5));



    }
}