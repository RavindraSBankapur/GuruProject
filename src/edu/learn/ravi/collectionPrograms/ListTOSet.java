package edu.learn.ravi.collectionPrograms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
public class ListTOSet {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Ratna");
		list.add("Namrata");
		list.add("Missi");
		list.add("Shri");
		list.add("Sheetal");
		list.add("Namrata");
		System.out.println("elements of list are-->");
		ListIterator listIt=list.listIterator();
		while(listIt.hasNext())
		{
			System.out.print(listIt.next()+",");
		}
		System.out.println();
		System.out.println("--------------------------");
		//adding list object to set object
		Set hashSet=new HashSet();
		hashSet.add(list);
		System.out.println("elements of Set are-->");
		Iterator setIt=hashSet.iterator();
		while(setIt.hasNext())
		{
			System.out.println(setIt.next());
		}
	}
}
