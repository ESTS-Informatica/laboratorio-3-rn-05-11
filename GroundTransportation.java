
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
        return getPrice() * (1.0 + (FEES * 0.01));
    }
    
    public String getTransportType(){
        return "Transporte terreno";
    }
    
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Matrícula:", getLicensePlate()));  
        sb.append(String.format("%15s: %s\n", "Preço com honorário:", getPriceWithFees(), "€"));
     
        return sb.toString();    
    }
    
}
