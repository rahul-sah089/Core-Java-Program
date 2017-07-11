package com.program.collection.objectSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortyParty {
	public static void main(String[] args) {
		List<Party> partyList = new ArrayList<Party>();
		Party party1 = new Party(1, "Griffin Phiri", "A12345678", 23, 123, 123.45);
		Party party2 = new Party(2, "Agness Katenza", "B12345678", 25, 908, 1234);
		Party party3 = new Party(3, "John Chamber", "US1234567", 29, 908, 987);
		Party party4 = new Party(4, "John Doe", "US1234568", 29, 121, 123);
		Party party5 = new Party(5, "Edward Smith", "A12345621", 21, 908, 1289);
		partyList.add(party5);
		partyList.add(party1);
		partyList.add(party4);
		partyList.add(party3);
		partyList.add(party2);

		Collections.sort(partyList);
		Collections.sort(partyList, Party.PartyNameComparator);
		Collections.sort(partyList, Party.PartyNationalRefComparator);
		Collections.sort(partyList, Party.AgeComparator);
		Collections.sort(partyList, Party.SalaryComparator);

	}
}
