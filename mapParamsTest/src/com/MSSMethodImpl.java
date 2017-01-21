package com;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class MSSMethodImpl implements MSSMethodInterface {

	@Override
	public Object execute(Map<String, String> p0) {
		// TODO Auto-generated method stub
		
		System.out.println("Before execute--> "+ p0);
		
		p0.put("Mama","Said");
		//System.out.println(p0);
		return null;
	}
	
	public ArrayList<mapObject> substractHashMap(Map<String, String> neo,Map<String, String> old){
		
		Map<String, String> difference = new HashMap<String, String>();
		ArrayList<mapObject> mo = new ArrayList<mapObject>(); 
				
		System.out.println("neo --> " + neo);
		System.out.println("old --> " + old);
		
		difference.putAll(neo);
	    difference.putAll(old);
	    
	    difference.entrySet().removeAll(old.entrySet());
	    
	    
	    for (String s : difference.keySet()){
	    	mapObject mapObj = new mapObject();
	    	mapObj.name = s;
	    	mapObj.value = difference.get(s);
	    	
	    	mo.add(mapObj);
	    	
	    }
	    
	    System.out.println("Diff --> "+ difference);

		
		return mo;
		
	}
	
	private static final List<String> NAMES = new ArrayList<String>() {{
		add("John");
		System.out.println(NAMES);
	}};
	
	public static List<Integer> filterUnderThreshold(final List<Integer> values, final int threshold) {
		List<Integer> returnValues = new ArrayList<>(values);
		for (int i = 0; i < returnValues.size(); i++) {
			if (returnValues.get(i) >= threshold) {
				returnValues.remove(i);
			}
		}
		return returnValues;
	}
	
	public static <T> List<T> getFlattenedList(final List<List<T>> lists) {
		List<T> flattenedList = new ArrayList<>();
		for (List<T> list : lists) {
			for (T element : list) {
				flattenedList.add(element);
			}
		}
		return flattenedList;
	}
	
	class mapObject{
		String name;
		String value;
	}

}
