import java.util.*;

public class Aula03Pratica03{
	public static void main(String[] args){
		System.out.println("-----------Aula 03 - Prática 03-----------");
		ArrayList<String> my_list = new ArrayList<String>();
		
		my_list.add("A1");
		my_list.add("A2");
		my_list.add("A3");
		my_list.add("A4");
		my_list.add("A5");
		
		
		/*
		for(String x : my_list){
			System.out.println(x);
		}
		*/
		
		Collections.reverse(my_list);
		
		Iterator itr = my_list.iterator();
		while ( itr.hasNext() ){
			System.out.println(itr.next());
		}
		
		
		System.out.println("-------------------Fim-------------------");
	}
	
}