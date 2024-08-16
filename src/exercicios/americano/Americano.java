package exercicios.americano;
import java.util.List;

public class Americano {
	
	public static int posicaoJogador(List<Integer> numeroDosJogadores) {
		Integer numerosTotal = numeroDosJogadores.stream().reduce(0, Integer::sum);
		Integer posicao = -1;
		Integer j = 0;
		
		for (int i = 0; i < numerosTotal; i++) {
			posicao = j;
			j++;
			
			if(j >= numeroDosJogadores.size()) {
				j = 0;
			}
		}
		return posicao + 1;
	}
	
}
