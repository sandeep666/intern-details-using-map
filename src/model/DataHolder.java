package model;

import java.util.HashMap;
import java.util.Map;

public class DataHolder {
	Map<Integer, InternDetails> InternList = new HashMap<Integer, InternDetails>();
	public Map<Integer, InternDetails> getdataholder(){
		return InternList;
	}
}
