
/**
 * Write a description of class GroundTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GroundTransportation extends Transport
{
    
    private String licensePlate;
    private static final double FEES = 0.03;
    
    public GroundTransportation()
    {
        setFees(FEES);
    }
    
    public GroundTransportation(String licensePlate){
        if(licensePlate == null){
            this.licensePlate = "";
        }else{
            this.licensePlate = licensePlate;
        }
        setFees(0.03);
    }
    
    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }
    
    public String getLicensePlate(){
        return this.licensePlate;
    }
    
    public double getPriceWithFees(){
        return getPrice() * (1.0 + FEES);
    }
    
    public String getTransportType(){
        return "Transporte Terrestre";
    }
    
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        
        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));  
        sb.append(String.format("%15s: %s\n", "ID", getId()));
        sb.append(String.format("%15s: %s\n", "Origem", getOrigin()));
        sb.append(String.format("%15s: %s\n", "Destino", getDestination()));
        sb.append(String.format("%15s: %5.2f€\n", "Preço", getPrice()));
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", FEES * 100));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
        sb.append(String.format("%15s: %s\n", "Matricula", getLicensePlate()));  
     
        return sb.toString();    
    }
    
}
