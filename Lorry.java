
/**
 * Write a description of class Lorry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lorry extends GroundTransportation
{
    
    private int numberOfPallets;
    private int trailers;
    
    public Lorry(String licensePlate, int numberOfPallets, int trailers)
    {
        super(licensePlate);
        setNumberOfPallets(numberOfPallets);
        setTrailers(trailers);
    }
    
    public void setNumberOfPallets(int numberOfPallets){
        if(numberOfPallets < 0){
            this.numberOfPallets = 0;
        }else{
            this.numberOfPallets = numberOfPallets;
        }
    }
    
    public int getNumberOfPallets(){
        return this.numberOfPallets;
    }
    
    public void setTrailers(int trailers){
        if(trailers < 0){
            this.trailers = 0;
        }else{
            this.trailers = trailers;
        }
    }
    
    public int getTrailers(){
        return this.trailers;
    }
    
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Matrícula", getLicensePlate()));
        sb.append(String.format("\n%15s: %s\n", "Número de paletes:", getNumberOfPallets()));
        sb.append(String.format("%15s: %s\n", "Número de atrelados:", getTrailers()));
     
        return sb.toString(); 
    }
    
}
