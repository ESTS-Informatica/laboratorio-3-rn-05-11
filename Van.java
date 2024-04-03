
/**
 * Write a description of class Van here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Van extends GroundTransportation
{

    private int packages;
    
    public Van(int packages, String licensePlate)
    {
        super(licensePlate);
        setPackages(packages);
    }
    
    public void setPackages(int packages){
        if(packages < 0){
            this.packages = 0;
        }else{
            this.packages = packages;
        }
    }
    
    public int getPackages(){
        return this.packages;
    }
    
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        
        sb.append(String.format("\n%15s: %s\n", "Matrícula:", getLicensePlate()));  
        sb.append(String.format("\n%15s: %s\n", "Número de pacotes:", getPackages()));
     
        return sb.toString(); 
    }
    
}
