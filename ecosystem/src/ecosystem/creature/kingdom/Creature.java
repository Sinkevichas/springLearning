package ecosystem.creature.kingdom;

import ecosystem.biom.Biom;
import ecosystem.creature.ICreature;

public abstract class Creature implements ICreature,IFood {
	protected Biom biom;
	boolean alive = true;

	public Integer energy;
	protected Integer energyConsumption;
	protected Integer maxenergy;
	protected Integer hungerEnergy;
	@Override
	public Integer getEnergy() {
		return energy;
	}
	public Integer getHungerLevel()
	{
		return maxenergy-energy;
	}
	
	public void live() {
		while (alive) {
			metabolism();
			survive();
		}

	}
	

	public void metabolism() {
		energy = energy - energyConsumption;
		alive = energy < 0;
	}

	public void survive() {
		if (energy < hungerEnergy) {
			feed();
		}
	}

	public void feed() {
		IFood creature = findSomething();
		eat(creature);
	}

	public Integer subEnergy(Integer need){
		if (energy>need)
		{
			energy= energy-need;
					return need;
		}
		else
		{
			energy=0;
			return energy;
		}
	}

	public void eat(IFood food) {
		food.subEnergy(getHungerLevel());
	}

	public abstract IFood findSomething();

}
