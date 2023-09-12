public class ParametrosInvalidosException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ParametrosInvalidosException(int inicio,int fim){
        super(String.format("Parâmetros inválidos: o valor inicial (%d) deve ser menor que o valor final (%d)",inicio,fim));
    }




}
