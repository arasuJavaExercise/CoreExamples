package com.collectionpack;

import java.util.*;

class Sample {
	private int id;
	private String name;

	public Sample(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return this.id + " => " + name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Sample) {
			Sample sam = (Sample) obj;
			return (this.getId() == sam.getId() && this.getName().equals(sam.getName()));
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.getId() + this.getName().hashCode();
	}
}

class SampleComparator implements Comparator<Sample> {
	@Override
	public int compare(Sample o1, Sample o2) {
		int sam1 = o1.getId() - o2.getId();
		if (sam1 == 0) {
			return o1.getName().compareTo(o2.getName());
		}
		return sam1;
	}

}

public class SetOperationsDemo {

	public static void main(String[] args) {

		Set<Sample> sample = new TreeSet<>(new SampleComparator());
		sample.add(new Sample(1, "Arasu"));
		sample.add(new Sample(2, "Kumar"));
		sample.add(new Sample(3, "Gowda"));
		sample.add(new Sample(1, "SV"));

		System.out.println(sample);

		// Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 7, 9));
		// Set<Integer> s2 = new HashSet<>(Arrays.asList(2, 4, 6, 8));
		//
		// System.out.println(s1);
		// System.out.println(s2);
		//
		// System.out.println("SubSet Operations:\n" + s1.containsAll(s2));
		// // s1.addAll(s2);
		// // System.out.println("Union Operations:\n"+s1);
		// // s1.retainAll(s2);
		// // System.out.println("Intersection Operations:\n"+s1);
		// s1.removeAll(s2);
		// System.out.println("Set Difference Operations :\n" + s1);
		
		
		

	}

}
