package tema;

import java.util.ArrayList;
import java.util.List;
import dv.Client;



public class TestGit  {
	
    
    public static void main(String[] args) {
    	
    	Client c = new Client (1203, "Petrescu Ion");
    	List<Client> lista = new ArrayList<Client>();
    	
		lista.add(c);

            System.out.println("Hello Git! Denumirea proiectului de licenta este Sistem software pentru managementul relatiilor cu clientii" + lista);
        }
       
}
