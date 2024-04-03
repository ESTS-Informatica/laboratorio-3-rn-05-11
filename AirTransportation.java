
/**
 * Write a description of class AirTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AirTransportation extends Transport
{
    private String name;
    private int numberOfContainers;
    private static final double FEES = 0.04;
    
    public AirTransportation()
    {
        setFees(FEES);
    }
    
    public AirTransportation(String name, int numberOfContainers){
        setName(name);
        setNumberOfContainers(numberOfContainers);
        setFees(0.04);
    }
    
    public void setName(String name){
        if(name == null){
            this.name = "";
        }else{
            this.name = name;
        }
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setNumberOfContainers(int numberOfContainers){
        if(numberOfContainers < 0){
            this.numberOfContainers = 0;
        }else{
            this.numberOfContainers = numberOfContainers;
        }
    }
    
    public int getNumberOfContainers(){
        return this.numberOfContainers;
    }
    
    public double getPriceWithFees(){
        return getPrice() * (1.0 + FEES);
    }
    
    public String getTransportType(){
        return "Transporte aério";
    }
    
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Nome:", getName()));  
        sb.append(String.format("%15s: %s\n", "Número de contentores", getNumberOfContainers()));
        sb.append(String.format("%15s: %s\n", "Preço com honorário:", getPriceWithFees(), "€"));
     
        return sb.toString();    
    }

}
