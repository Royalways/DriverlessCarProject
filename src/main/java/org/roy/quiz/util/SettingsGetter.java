package org.roy.quiz.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;

import org.roy.quiz.model.Park;

public class SettingsGetter {

	public static Park getConfPark() throws Exception{
		int parkX = 4;
		int parkY = 4;
    	Properties properties = new Properties();
    	BufferedReader reader = new BufferedReader(new FileReader(".\\src\\settings.conf"));
    	properties.load(reader);

    	Iterator<Entry<Object, Object>> iterator = properties.entrySet().iterator();
    	while (iterator.hasNext()) {
			Entry<Object, Object> entry = iterator.next();
			if (entry.getKey().equals("park.x")) {
				parkX = Integer.parseInt((String)entry.getValue());
			}
			if (entry.getKey().equals("park.y")) {
				parkY = Integer.parseInt((String)entry.getValue());
			}
		}
    	return new Park(parkX, parkY);
	}
}
