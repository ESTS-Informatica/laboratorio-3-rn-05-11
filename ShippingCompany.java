import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class ShippingCompany here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShippingCompany extends HashSet<Transport>
{

    private String name;
    private ArrayList<Transport> inService;

    public ShippingCompany(String name)
    {
        if(name == null){
            this.name = "";
        }else{
            this.name = name;
        }
        this.inService = new ArrayList<Transport>();
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        for(Transport transport : inService){
            sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", transport.getTransportType()));  
            sb.append(String.format("%15s: %s\n", "ID", transport.getId()));
            sb.append(String.format("%15s: %s\n", "Origem", transport.getOrigin()));
            sb.append(String.format("%15s: %s\n", "Destino", transport.getDestination()));
            sb.append(String.format("%15s: %5.2f€\n", "Preço", transport.getPrice()));
            sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", transport.getFees()));
            sb.append(String.format("%15s: %4.2f€\n", "Preço Final", transport.getPriceWithFees()));
        }
        return sb.toString();
    }
    
    public void makeTransportation(String id, String origin, String destination, int price){
        for(Transport transport : inService){
            if(transport.getId().equals(id) && transport.isAvailable()){
                transport.setOrigin(origin);
                transport.setDestination(destination);
                transport.setPrice(price);
                transport.setAvailable(false);
                inService.add(transport);
                super.remove(transport);
            }
        }
    }

}
