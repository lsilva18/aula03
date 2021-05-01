import java.util.*;

public class Aula03Pratica05{
	public static void main(String[] args){
		System.out.println("-----------Aula 03 - Prática 05-----------");
		
		ArrayList<Integer> my_list = new ArrayList<Integer>();
		Random rand = new Random();
		int MAX_VALUE = 100, MIN_VALUE = 10, N_VALUES = 10;
		int random;
		
		for(int i=0; i<N_VALUES; i++){
			random = MIN_VALUE + rand.nextInt(MAX_VALUE - MIN_VALUE);
			my_list.add(random);
		}
		
		
		System.out.printf("Minha lista: ");
		for(Integer x : my_list){
			System.out.printf(x + " ");
		}
		System.out.printf("\nValor máximo: " + Collections.max(my_list) + "\n");
		
		System.out.println("-------------------Fim-------------------");
	}
	
}