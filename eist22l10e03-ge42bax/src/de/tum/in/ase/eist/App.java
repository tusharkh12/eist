package de.tum.in.ase.eist;

import java.lang.module.Configuration;
import java.util.logging.Level;

public final class App {

	private App() {
	}

	public static void main(String[] args) {

		Configuration.setRootLevel(Level.INFO);
		// TODO 4: Make sure to use the Configurator to configure the loggers root level

		//This is a workaround for a known issue when starting JavaFX applications 
		UniversityApp.startApp(args);
	}
}
