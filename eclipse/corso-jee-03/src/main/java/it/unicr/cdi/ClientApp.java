package it.unicr.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import jakarta.inject.Inject;

//@ApplicationScoped
public class ClientApp {
	
	public static void main(String[] args) {
		// ottendo CDI
		Weld weld = new Weld();
		// inizializzo ( => beans.xml)
	    WeldContainer container = weld.initialize();
	    
	    // da qui in poi => ho nel context oggetti utilizzabili
	    

		// new => fuori dal context non funzionerebbe
		// ClientApp app = new ClientApp();
	    // => ottengo la mia app dal context
	    ClientApp app = container.select(ClientApp.class).get();
	    
	    //container.select(IServizio.class).get();
	    
	    // la mia app ora (da dentro il conex) può usare @Inject
		app.run();
	}	
	
	// diversi modi di Inject
	
	// field injector (tramite campo)
	@Inject
	//@Alternativo  // inject di un @Qualifier
	private IServizio servizio;
	
	// constructor injection
	// @Inject
//	public ClientApp(IServizio servizio) {
//		super();
//		this.servizio = servizio;
//	}
	
	// injection tramite metodo (setter)
//	@Inject
//	public void setServizio(IServizio servizio) {
//		this.servizio = servizio;
//	}

	public void run() {
		// da evitare
		//Servizio servizio = new Servizio();

	    //IServizio servizio = container.select(IServizio.class).get();
		System.out.println(servizio.getMessaggio());
	}
}
