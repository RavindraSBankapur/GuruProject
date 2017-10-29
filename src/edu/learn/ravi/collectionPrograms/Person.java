package edu.learn.ravi.collectionPrograms;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class Person implements Comparable{
	int age;
	String name;
	public Person() {
	}
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int hashCode()
	{
		return age;
	}
	public boolean equals(Object obj)
	{
		Person p=(Person) obj;
		return this.hashCode()==p.hashCode();
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object object) {
		Person p=(Person) object;
		return (p.age-this.age);
	}
	public static void main(String[] args) {
		Person p=new Person(25,"Ravi");
		Person p1=new Person(35,"Raj");
		Person p2=new Person(75,"Arvind");
		Person p3=new Person(22,"Sharan");
		Person p4=new Person(19,"Ningraj");
		Person p6=new Person(57,"Rajesh");
		Person p7=new Person(23,"Yuva");
		
		Set<Person> set=new TreeSet<Person>();
		set.add(p);
		set.add(p6);
		set.add(p2);
		set.add(p3);
		set.add(p1);
		set.add(p4);
		set.add(p7);
		set.add(p6);
		Iterator<Person> i=set.iterator();
		while(i.hasNext())
		{
			System.err.println(i.next());
		}
	}
}
