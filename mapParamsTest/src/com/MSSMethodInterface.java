package com;

import java.util.ArrayList;
import java.util.Map;

import com.MSSMethodImpl.mapObject;

public interface MSSMethodInterface {
	
	Object execute(Map<String, String> p0 );
	ArrayList<mapObject> substractHashMap(Map<String, String> neo,Map<String, String> old);

}
