package ecosystem.biom.ground;

import ecosystem.biom.Biom;
import ecosystem.biom.BiomType;

public class Ground extends Biom {
	Integer energy = 500;

	@Override
	public BiomType getBiomType() {
		return BiomType.GROUND;
	}

	@Override
	public Integer getEnergy() {
		return energy;
	}

	@Override
	public Integer subEnergy(Integer need) {
		if (energy > need) {
			energy = energy - need;
			return need;
		} else {
			energy = 0;
			return energy;
		}
	}

}
