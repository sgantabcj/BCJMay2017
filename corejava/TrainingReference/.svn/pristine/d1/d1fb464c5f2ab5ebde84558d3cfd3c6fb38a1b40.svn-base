package com.nivtek.training.spring.collections.example2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customer {

	private List<Person> lists;
	private Set<Person> sets;
	private Map<String, Person> maps;
	private Properties pros;

	public List<Person> getLists() {
		return lists;
	}

	public void setLists(List<Person> lists) {
		this.lists = lists;
	}

	public Set<Person> getSets() {
		return sets;
	}

	public void setSets(Set<Person> sets) {
		this.sets = sets;
	}

	public Map<String, Person> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, Person> maps) {
		this.maps = maps;
	}

	public Properties getPros() {
		return pros;
	}

	public void setPros(Properties pros) {
		this.pros = pros;
	}

  @Override
  public String toString() {
    return "Customer [lists=" + Arrays.toString(lists.toArray()) + ", sets=" + Arrays.toString(sets.toArray()) +
        ", maps=" + Arrays.toString(maps.values().toArray()) + ", pros=" + pros + "]";
  }
}