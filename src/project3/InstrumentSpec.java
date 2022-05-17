package project3;

import java.util.HashMap;
import java.util.Map;

public abstract class InstrumentSpec {
	private Map properties;

	public InstrumentSpec(Map properties) {
		if(properties == null) {
			this.properties = new HashMap();
		} else {
			this.properties = new HashMap(properties);
		}
	}
	
	public Object getProperty(String propertyName) {
		return properties.get(propertyName);
	}

	public boolean matches(InstrumentSpec otherSpec) {
		if (builder != otherSpec.builder)
			return false;
		if ((model != null) && (!model.equals("")) && (!model.toLowerCase().equals(otherSpec.model.toLowerCase())))
			return false;
		if (type != otherSpec.type)
			return false;
		if (backWood != otherSpec.backWood)
			return false;
		if (topWood != otherSpec.topWood)
			return false;
		return true;
	}
}
