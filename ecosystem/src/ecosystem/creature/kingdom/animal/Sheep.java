package ecosystem.creature.kingdom.animal;

import ecosystem.creature.kingdom.IFood;

public class Sheep extends Animal{

	@Override
	public IFood findSomething() {
		return biom.find(Sheep.class);
	}

}

