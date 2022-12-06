package it.unicr.cdi;

import jakarta.enterprise.context.Dependent;

// se non specifico alcun Naming @Qualifier => @Default

//annotazine creata allo scopo di discriminare le diverse implementazioni della
// stessa interfaccia
@Alternativo 

// funziona in web http => lega la vita dell'istanza alla vita della request
//@RequestScoped
// funziona in web http => lega la vita dell'istanza alla vita della sessione utente
//@SessionScoped
// funziona anche in web http => lega la vita dell'istanza alla vita dell'applicazione
// si comporta come un singleton (ma solo dentro al context)
//@ApplicationScoped


// - se viene chiesto da due "client", i due otterranno due istanze diverse
// - il suo ciclo di vita è legato al ciclo di vita dell'oggetto in cui @Inject
@Dependent
public class ServizioAlternativo implements IServizio {

	public String getMessaggio() {
		return "messaggio alternativo";
	}

}
