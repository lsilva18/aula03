import java.util.*;

public class Aula03Pratica01{
	public static void main(String[] args) {

        System.out.println("-----------Aula 03 - Prática 01-----------");
		String mes[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30,31, 30, 31};


        for(int i = 0; i< tot.length; i++){
            System.out.println("O mês de  " + mes[i] + " tem " + tot[i] + " dias.");
        }
        System.out.println("-------------------Fim-------------------");
    }
}
