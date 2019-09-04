package start;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;

import factory.impl.RussianFactory;
import factory.impl.USAFactory;
import factory.interfaces.TransportFactory;

public class Start {

	private static TransportFactory factory;

	public static void main(String[] args) {

		MutablePicoContainer pico = new DefaultPicoContainer();

		pico.addComponent(RussianFactory.class);
		pico.addComponent(USAFactory.class);
	
		System.err.println("begin");
		
		if (true) {
			factory = pico.getComponent(USAFactory.class);
		} else {
			factory = pico.getComponent(RussianFactory.class);
		}

		factory.createAircraft().flight();
		factory.createCar().drive();

	}

}
