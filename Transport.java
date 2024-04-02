
/**
 * Um meio de transporte genérico
 *
 * @author POO
 */

public class Transport {

    private static int auto = 0; 

    private final String id;
    private String origin;
    private String destination;
    private double price;
    private double fees;
    private boolean available;

    public Transport() {
        this.id = "T-" + String.format("%03d", ++auto);
        this.origin = "";
        this.destination = "";
        this.price = 0.0;
        this.fees = 0.0;
        this.available = true;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(String origin) {
        if (origin != null) {
            this.origin = origin;
        }
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        if (destination != null) {
            this.destination = destination;
        }
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price >= 0.0) {
            this.price = price;
        }
    }

    public double getFees() {
        return this.fees;
    }

    public final void setFees(double fees) {
        if (fees >= 0.0) {
            this.fees = fees;
        }
    }

    public String getId() {
        return this.id;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
 
    // Nível 5
    public void resetValues(){
        setOrigin("");
        setDestination("");
        setAvailable(true);
        setPrice(0.0);
    }
    
    // Nível 5
    public void setValues(String origin, String destination, double price) {
        setOrigin(origin);
        setDestination(destination);
        setAvailable(false);
        setPrice(price);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));  
        sb.append(String.format("%15s: %s\n", "ID", this.id));
        sb.append(String.format("%15s: %s\n", "Origem", this.origin));
        sb.append(String.format("%15s: %s\n", "Destino", this.destination));
        sb.append(String.format("%15s: %5.2f€\n", "Preço", this.price));
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", this.fees));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
     
        return sb.toString();
    }

    /**
     * Retorna o preço final do produto
     * 
     * @return o preço final com a inclusão dos honorários
     */
    public double getPriceWithFees() {     
        return this.price * (1.0 + (this.fees * 0.01));
    }

    
    public String getTransportType() {
        return "Transporte genérico";
    }

}
