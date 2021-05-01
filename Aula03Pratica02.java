import java.util.List;
import java.util.*;

public class Aula03Pratica02{
	public static void main(String[] args){
		System.out.println("-----------Aula 03 - Prática 02-----------");
		
		List my_list = new ArrayList();
		int i = 0;
		
		my_list.add("test");
		my_list.add((int)1);
		my_list.add((double)1e4d);
		my_list.add((char) 'd');
		my_list.add("test");
		my_list.add((int)1);
		my_list.add((boolean)true);
		my_list.add((char) 89);
		my_list.add((float) 35e3f);
		my_list.add((float) 35e3f);
		
		for (Object x : my_list){
			System.out.println("Na posição " + i++ + ", temos: " + x + "\t do tipo: " + x.getClass().getName());
		}
		
		System.out.println("-------------------Fim-------------------");
	}
}