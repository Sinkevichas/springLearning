package ecosystem.biom;

import ecosystem.biom.ground.GroundCreaturesFactory;

// fctory method exanple
public class CreaturesFactorySelector {
    
    // Factory method
    public  ICreaturesFactory getCreaturesFactory(BiomType biomType) {
    	 ICreaturesFactory creaturesFactory = null;
        switch (biomType) {
            case GROUND:
            	creaturesFactory = new GroundCreaturesFactory();
                break;
            
        }

        return creaturesFactory;
    }
}
