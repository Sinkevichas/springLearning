package ecosystem.biom;

import java.util.ArrayList;
import java.util.List;

import ecosystem.creature.ICreature;
import ecosystem.creature.kingdom.IFood;


public abstract class Biom  implements IFood{
	
	protected List<ICreature> floraAndFauna = new ArrayList<ICreature>();
	public void createLife()
	{
		floraAndFauna.addAll(new CreaturesFactorySelector().getCreaturesFactory(getBiomType()).fillBiomWithCreatures());
	}
	
	public void live()
	{
		while (floraAndFauna.size()>0)
		{
			for (ICreature iCreature : floraAndFauna) {
				iCreature.live();
				
			}
		}
	}
	
	public abstract BiomType getBiomType();

	public IFood find(Class class1) {
		
		for (ICreature iCreature : floraAndFauna) {
			if (class1.isInstance(iCreature))
			{
				return iCreature;
			}
		}
		return null;
	}
	
}
