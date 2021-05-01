import java.util.*;

public class Aula03Pratica04{
	public static void main(String[] args){
		System.out.println("-----------Aula 03 - Prática 04-----------");
		
		ArrayList<String> my_list = new ArrayList<String>();
		Scanner keyboard = new Scanner(System.in);
		int i = 0;
		int chosen_item_idx=-1;
		
		
		my_list.add("Tainá");
		my_list.add("Stellinha");
		my_list.add("Tequillina");
		my_list.add("Pituzinho");
		my_list.add("Lívia");
		
		
		System.out.printf("Qual dos nomes abaixo você deseja excluir da lista?\n");
		try{
			for(String x : my_list){
				System.out.println(i++ + "." + x);
			}
			System.out.printf("Digite apenas o número correspondente à sua escolha\n");
			chosen_item_idx = keyboard.nextInt();			
		}
		catch (Exception e){
			System.out.printf("Digite apenas o número correspondente à sua escolha\n");
		}
		my_list.remove(chosen_item_idx);
		
		
		System.out.println();
		System.out.println("Nova lista");
		Iterator itr = my_list.iterator();
		while ( itr.hasNext() ){
			System.out.println(itr.next());
		}
		
		
		System.out.println("-------------------Fim-------------------");
	}
	
}