package MetodosParaOrdenar;

public class BubbleSort {
	public static void main(String[] args) {
		
		int[] vetor = new int[10000];
		
		for(int i = 0; i< vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			
			System.out.println(vetor[i]);
		}
		
		long inicio = System.currentTimeMillis();
		
		int aux;
		for(int i = 0; i < vetor.length; i++){
			for(int j = 0; j < vetor.length - 1; j++) {
				if(vetor[i] < vetor[j]){
					aux  = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
				
			}
			
		}
		
		System.out.println("Nosso vetor organizado");
		for( int i = 0; i< vetor.length; i++){
			
			System.out.println(vetor[i]);
			
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo de execucao: " +(fim - inicio) );
		
	}
}
