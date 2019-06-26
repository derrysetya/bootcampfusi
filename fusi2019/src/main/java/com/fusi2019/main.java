package com.fusi2019;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.event.ListSelectionEvent;;
public class main {

	public static void main(String[] args) {
		
		//List
		List<String> list = null;
		List.add("muhamad");
		List.add("derry");
		List.get(0);
		
		//Array List
		ArrayList<String> al = new ArrayList<>();
		
		//List with araylist
		List<String> l = new Array<>();
		
		//map
		Map<String, String> map= new HashMap<String, String>();
		map.put("nama", "muhamad dery");
		map.get("nama");
		
		//set
		Set<String> set = new HashSet<>();
		Set.add("dery");
		
		//collection
		Collection<String> collection = null;
		
		System.out.println(list.toString());
		
		
		
	}

}
