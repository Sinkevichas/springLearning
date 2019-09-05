package ecosystem.biom.factoryRegistry;

import java.util.HashMap;
import java.util.Map;

public class CreatureFactoryRegistry {
	private static CreatureFactoryRegistry instance;
	private final Map registry = new HashMap();

	public static synchronized CreatureFactoryRegistry getInstance() {
		if (instance == null) {
			instance = new CreatureFactoryRegistry();
		}
		return instance;
	}

	public synchronized Reference getReference(final String name) {
		final Reference result;
		if (isRegistered(name)) {
			result = (Reference) registry.get(name);
		} else {
			result = new Reference(name);
			registry.put(name, result);
		}
		return result;
	}

	private boolean isRegistered(final String name) {
		return registry.containsKey(name);
	}

	public synchronized void register(final PlanningObject object) {
		final Reference reference = getReference(object.getName());
		if (!reference.hasObject() || reference.getObject() != object) {
			reference.setObject(object);
		}
	}

	public synchronized void unregister(final PlanningObject object) {
		if (isRegistered(object.getName())) {
			final Reference reference = getReference(object.getName());
			if (reference.hasObject()) {
				reference.setObject(null);
			}
		}
	}

}
