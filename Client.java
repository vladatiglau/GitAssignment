package tema;

public class Client {

	private int codClient;
	private String numeClient;
	
	
	public Client(int codClient, String numeClient) {
		super();
		this.codClient = codClient;
		this.numeClient = numeClient;
	}


	public int getCodClient() {
		return codClient;
	}

	public String getNumeClient() {
		return numeClient;
	}

	public void setCodClient(int codClient) {
		this.codClient = codClient;
	}

	public void setNumeClient(String numeClient) {
		this.numeClient = numeClient;
	}

	@Override
	public String toString() {
		return "Cod Client= " + codClient + ", Nume Client= " + numeClient;
	}
	
	
}
