package ecosystem.biom.factoryRegistry;

public class PlanningObjectImpl implements PlanningObject {
	private String name = "";

	public PlanningObjectImpl(final String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public final void setName(final String name) {
		if (!this.name.equals(name)) {
			CreatureFactoryRegistry.getInstance().unregister(this);
			this.name = name;
			CreatureFactoryRegistry.getInstance().register(this);
		}
	}
}
