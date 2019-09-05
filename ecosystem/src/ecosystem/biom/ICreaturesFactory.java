package ecosystem.biom;

import java.util.List;

import ecosystem.creature.ICreature;
import ecosystem.creature.kingdom.animal.Animal;
import ecosystem.creature.kingdom.bacterium.Bacterium;
import ecosystem.creature.kingdom.plant.Plant;

public interface ICreaturesFactory {
	
	Bacterium createBacterium();
	Animal createAnimal();
	Plant createPlant();
	List<ICreature> fillBiomWithCreatures();
}
