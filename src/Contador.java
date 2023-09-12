public class Contador {

    public static void contar(int inicio, int fim){
        if (inicio >= fim) {
            throw new ParametrosInvalidosException(inicio, fim);
        }
        for(int i =inicio;i<=fim;i++){
            System.out.printf("\nImprimindo número %d",i);
        }
    }

}
