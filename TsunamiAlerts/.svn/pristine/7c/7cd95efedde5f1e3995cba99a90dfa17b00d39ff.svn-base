package com.crmindz.model;

import java.util.HashMap;

/*
 * Stores all the inserted alerts in a has-hmap
 */
public class AlertMessages {
	private static HashMap<String, String> alertMap = new HashMap<String, String>();

//	add the message to the hashmap
	public static void addMessage(String key, String value) {
		alertMap.put(key, value);
	}

//	checks whether a message is present already for a particular country
	public static void isMessagePresent(String key) {
		alertMap.containsKey(key);
	}

//	returns the hashmap
	public static HashMap<String, String> getMap() {
		return alertMap;
	}

}
