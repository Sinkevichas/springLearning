package ecosystem.creature.kingdom.animal;

import java.util.ArrayList;
import java.util.List;

import ecosystem.creature.ICreature;
import ecosystem.creature.kingdom.Creature;
import ecosystem.creature.kingdom.plant.Plant;

public abstract class Animal extends Creature {

	
	@Override
	public List<ICreature> reproduction(){
		List<ICreature> list = new ArrayList<ICreature>();
		try {
			list.add((Plant)clone());
			list.add((Plant)clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
