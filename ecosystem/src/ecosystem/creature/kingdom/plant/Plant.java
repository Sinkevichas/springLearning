package ecosystem.creature.kingdom.plant;

import java.util.ArrayList;
import java.util.List;

import ecosystem.creature.ICreature;
import ecosystem.creature.kingdom.Creature;

public abstract class Plant extends Creature {
	
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
