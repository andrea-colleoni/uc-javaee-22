package it.unicr.corso.rest;

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class RestApplication extends Application {

//	@Override
//	public Set<Class<?>> getClasses() {
//		Set<Class<?>> classes = super.getClasses();
//		classes.add(PersoneResource.class);
//		return classes;
//	}
}
