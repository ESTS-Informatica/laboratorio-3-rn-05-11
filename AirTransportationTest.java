

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AirTransportationTest.
 *
 * @author  POO
 * @version 03/2024
 */

public class AirTransportationTest {

    private AirTransportation airTransport;

    @BeforeEach
    public void setUp() {
        airTransport = new AirTransportation("Boeing 747", 10);
    }

    @Test
    public void testGetName() {
        assertEquals("Boeing 747", airTransport.getName());
    }

    @Test
    public void testSetName() {
        airTransport.setName("Airbus A380");
        assertEquals("Airbus A380", airTransport.getName());

        // Testar se aceita null
        airTransport.setName(null);
        assertNull(airTransport.getName());
    }

    @Test
    public void testGetNumberOfContainers() {
        assertEquals(10, airTransport.getNumberOfContainers());
    }

    @Test
    public void testSetNumberOfContainers() {
        airTransport.setNumberOfContainers(15);
        assertEquals(15, airTransport.getNumberOfContainers());

        // Testar se aceita valor negativo
        airTransport.setNumberOfContainers(-5);
        assertEquals(15, airTransport.getNumberOfContainers());
    }

    @Test
    public void testToString() {
        String expected = "\nTipo Transporte: Transporte Aereo\n" +
                "             ID: " + airTransport.getId() + "\n" +
                "         Origem: \n" +
                "        Destino: \n" +
                "          Preço:  0,00€\n" +
                "     Honorarios: 4,00%\n" +
                "    Preço Final: 0,00€\n" +
                "           Nome: Boeing 747\n" +
                "  NºContentores: 10\n";
        assertEquals(expected, airTransport.toString());
    }

    @Test
    public void testGetTransportType() {
        assertEquals("Transporte Aereo", airTransport.getTransportType());
    }
    
    @Test
    public void testGetPriceWithFees(){
        airTransport.setPrice(600.0);
        assertEquals(624.0,airTransport.getPriceWithFees(), 0.01);
        
    }
}