package ecosystem.creature.kingdom.bacterium;

import java.util.ArrayList;
import java.util.List;

import ecosystem.creature.ICreature;
import ecosystem.creature.kingdom.Creature;

public abstract class Bacterium extends Creature implements Cloneable {

	
	
	@Override
	public List<ICreature> reproduction(){
		List<ICreature> list = new ArrayList<ICreature>();
		try {
			list.add((Bacterium)clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	
}
