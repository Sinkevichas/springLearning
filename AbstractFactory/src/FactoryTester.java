import org.junit.Test;
import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;

import factory.impl.RussianFactory;
import factory.impl.USAFactory;
import factory.interfaces.TransportFactory;

public class FactoryTester {

	
	@Test
	public void testUsaFactory()
	{
		MutablePicoContainer pico = new DefaultPicoContainer();

		pico.addComponent(RussianFactory.class);
		pico.addComponent(USAFactory.class);
		TransportFactory factory = pico.getComponent(USAFactory.class);
		factory.createAircraft().flight();
		factory.createCar().drive();
	}
	@Test
	public void testRussianFactory()
	{
		MutablePicoContainer pico = new DefaultPicoContainer();

		pico.addComponent(RussianFactory.class);
		TransportFactory factory = pico.getComponent(RussianFactory.class);
		factory.createAircraft().flight();
		factory.createCar().drive();
	}

}
