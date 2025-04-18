package exception;
public class FormatandoCepExemplo {
    public static void main(String[] args) throws CepInvalidoException {
        try {
        String cepFormatado = formatarCep("83604581");

        System.out.println(cepFormatado); 
        } catch (CepInvalidoException e) {
            System.out.println("\nO cep nao correspoonde as regras de negocio!");
        }
    }

    static String  formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8)
        throw new CepInvalidoException();

        //simulando um cep formatado 
        return "83-604-581";

    }
}
