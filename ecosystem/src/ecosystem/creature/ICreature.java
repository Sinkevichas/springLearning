package ecosystem.creature;

import java.util.List;

import ecosystem.creature.kingdom.IFood;

public interface ICreature extends IFood{

	void feed();

	void live();

	List<ICreature> reproduction();

	void metabolism();

	void survive();
	
	public Integer subEnergy(Integer need);
	
	Integer getHungerLevel();

}
