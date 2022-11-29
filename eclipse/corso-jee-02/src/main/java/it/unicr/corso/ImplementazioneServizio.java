package it.unicr.corso;

import javax.jws.WebService;

import org.example.servizio.SalutoRequest;
import org.example.servizio.SalutoResponse;
import org.example.servizio.Servizio;

/**
 * 
 */
@WebService(endpointInterface = "org.example.servizio.Servizio")
public class ImplementazioneServizio implements Servizio {

	/* (non-Javadoc)
	 * @see org.example.servizio.Servizio#saluto(org.example.servizio.SalutoRequest)
	 */

	@Override
	public SalutoResponse saluto(SalutoRequest parameters) {
		SalutoResponse resp = new SalutoResponse();
		resp.setFormulaSaluto("Buongiorno, " + parameters.getNome());
		return resp;
	}

}
