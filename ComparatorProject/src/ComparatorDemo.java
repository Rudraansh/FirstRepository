import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * ComparatorDemo
 * @author RUDRAANSH
 *
 */
class Student {
	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

}

class NameCcomparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		return s1.name.compareTo(s2.name);
	}

}

class AgeComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		if (s1.age > s2.age)
			return 1;
		else if (s1.age < s2.age)
			return -1;
		else
			return 0;
	}
}

class RollNumComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		if (s1.rollno > s2.rollno)
			return 1;
		else if (s1.rollno < s2.rollno)
			return -1;
		else
			return 0;
	}

}

public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));
		System.out.println("Sorting by Name.....");

		Collections.sort(al, new NameCcomparator());
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println("Roll Number :" + st.rollno + " Name :"
					+ st.name + " Age :" + st.age);
		}

		System.out.println("      ");
		System.out.println("Sorting by Age....");
		Collections.sort(al, new AgeComparator());
		Iterator itr1 = al.iterator();
		while (itr1.hasNext()) {
			Student st1 = (Student) itr1.next();
			System.out.println("Roll Number :" + st1.rollno + " Name :"
					+ st1.name + " Age :" + st1.age);
		}

		System.out.println("       ");
		System.out.println("Sorting by Roll Number...");
		Collections.sort(al, new RollNumComparator());
		Iterator itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student st = (Student) itr2.next();
			System.out.println("Roll Number :" + st.rollno + " Name :"
					+ st.name + " Age :" + st.age);
		}

	}
}
