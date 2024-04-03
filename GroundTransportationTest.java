

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GroundTransportation.
 *
 * @author  POO
 * @version 03/2024
 */
public class GroundTransportationTest {
    
    private GroundTransportation groundTransport;

    @BeforeEach
    public void setUp() {
        groundTransport = new GroundTransportation("ABC123");
    }

    @Test
    public void testLicensePlate() {
        assertEquals("ABC123", groundTransport.getLicensePlate());
    }

    @Test
    public void testSetLicensePlate() {
        groundTransport.setLicensePlate("XYZ789");
        assertEquals("XYZ789", groundTransport.getLicensePlate());
    }

    @Test
    public void testTransportType() {
        assertEquals("Transporte Terrestre", groundTransport.getTransportType());
    }

    @Test
    public void testToString() {
        String expected = "\nTipo Transporte: Transporte Terrestre\n" +
                          "             ID: " + groundTransport.getId() + "\n" +
                          "         Origem: \n" +
                          "        Destino: \n" +
                          "          Preço:  0.00€\n" +
                          "     Honorarios: 3.00%\n" +
                          "    Preço Final: 0.00€\n" +
                          "      Matricula: ABC123\n";
        assertEquals(expected, groundTransport.toString());
    }

    @Test
    public void testGetPriceWithFees() {
        groundTransport.setPrice(100.0);
        assertEquals(103.0, groundTransport.getPriceWithFees(), 0.001);
    }
}