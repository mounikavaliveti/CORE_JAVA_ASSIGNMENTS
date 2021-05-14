import java.util.TreeSet;

import java.util.*;

public class PersonDetails implements comparable {
	int Weight;
	int Height;
	String name;

	PersonDetails(int Weight, int Height, String name) {
		this.Height = Height;
		this.Weight = Weight;
		this.name = name;

	}

	@Override
	public String toString() {
		return "Person [Weight=" + Weight + ", Height=" + Height + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		int Weight1 = this.Weight;
		int Height1 = this.Height;
		PersonDetails person = (PersonDetails) o;
		int Weight2 = person.Weight;
		int Height2 = person.Height;
		if (Weight1 < Weight2) {
			return -1;
		} else if (Weight1 > Weight2) {
			return +1;
		} else {
			if (Height1 < Height2) {

				return -1;
			} else if (Height1 > Height2) {
				return 1;
			}

		}
		return Height2;

	}
}
public class sorting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDetails person1 = new PersonDetails(59, 5, "Honey");
		PersonDetails person2 = new PersonDetails(66, 7, "Spider");
		PersonDetails person3 = new PersonDetails(45, 8, "Tinder");
		PersonDetails person4 = new PersonDetails(45, 6, "Tom");
		PersonDetails person5 = new PersonDetails(45, 4, "Josh");

		TreeSet<PersonDetails> n = new TreeSet<>();
		n.add(person1);
		n.add(person2);
		n.add(person3);
		n.add(person4);
		n.add(person5);
		System.out.println(n);
	}

}
