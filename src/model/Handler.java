package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Handler {
	Integer i = 101;

	public void addintern(DataHolder holder) {
		InternDetails details = new InternDetails();
		View view = new View();
		view.addDetails(details);
		Map<Integer, InternDetails> list = holder.getdataholder();
		list.put(i++, details);
	}

	public void showDetails(DataHolder holder) {
		InternDetails details = new InternDetails();
		View view = new View();
		Map<Integer, InternDetails> list = holder.getdataholder();
		for (Map.Entry<Integer, InternDetails> m : list.entrySet()) {
			System.out.println("Intern Id - " + m.getKey());
			view.showDetails(m.getValue());
		}
	}

	public void GetDetails(DataHolder holder, int key) {
		InternDetails details = new InternDetails();
		View view = new View();
		Map<Integer, InternDetails> list = holder.getdataholder();
		view.showDetails(list.get(key));

	}

	public void removeDetails(DataHolder holder, int key) {
		InternDetails details = new InternDetails();
		View view = new View();
		Map<Integer, InternDetails> list = holder.getdataholder();
		view.showDetails(list.remove(key));
		// System.out.println(list.remove(key));

	}
}
