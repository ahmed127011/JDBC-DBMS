package eg.edu.alexu.csd.oop.db.cs53;

import java.util.HashMap;
import java.util.Map;

public interface Parser {
	/* public Map<String,Object> collected = new HashMap<String,Object>(); */
	public Map<String, Object> getMap(String quary);
}
