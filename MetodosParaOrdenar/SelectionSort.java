package MetodosParaOrdenar;

public class SelectionSort {
	public static void main(String[] args) {
		
		int[] vetor = new int[10000];
		
		for(int i = 0; i< vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			
			System.out.println(vetor[i]);
		}
		
		long inicio = System.currentTimeMillis();
		
		int menor_posicao, aux;
		for(int i = 0; i< vetor.length; i++){
			menor_posicao = i;
			for(int j = i + 1; j < vetor.length;j++) {
				if(vetor[j] < vetor[menor_posicao]) {
					menor_posicao = j;
				}
			}
			aux = vetor[menor_posicao];
			vetor[menor_posicao] = vetor[i];
			vetor[i] = aux;
		}
		
		System.out.println("Nosso vetor organizado");
		for( int i = 0; i< vetor.length; i++){
			
			System.out.println(vetor[i]);
			
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo de execucao: " +(fim - inicio) );
		
	}
}
