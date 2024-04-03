
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
    
}
