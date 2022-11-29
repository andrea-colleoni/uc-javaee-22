package it.unicr.corso;

import javax.xml.ws.Endpoint;

public class WebServiceApp {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9090/servizio", new ImplementazioneServizio());
	}

}
