package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

import com.MSSMethodImpl.mapObject;

public class TesterClass {
	private Map<String, String> mapString;
	
	public void run(){
		
		mapString = new HashMap<String, String>();
		MSSMethodInterface mss = new MSSMethodImpl();
		
		mapString.put("Bardak", "Çardak");
		mapString.put("Tahta", "Taraba");

		mss.execute(mapString);
		
		System.out.println("after execute-->" + mapString);
		
	}
	
	public void run2(){
		MSSMethodInterface mss = new MSSMethodImpl();
		
		Map<String, String> neo = new HashMap<String, String>();
		Map<String, String> old = new HashMap<String, String>();
		
		old.put("Bardak", "Çardak");
		old.put("Tahta", "Taraba");
		
		
		neo.put("Bardak", "Çardak");
		neo.put("Tahta", "Taraba");
		//neo.put("MW_TID", "MAMAMMAMAMAMAM");
		//neo.put("MW_MOCK", "ERIWKDNVSDFKSLDJFJ");
		ArrayList<mapObject> result = mss.substractHashMap(neo, old);
		
		for (mapObject maa : result.toArray(new mapObject[result.size()])){
			System.out.println(maa.name + " - " + maa.value);
		}
	}

}
