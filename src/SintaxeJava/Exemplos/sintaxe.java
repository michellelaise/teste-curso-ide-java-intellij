package SintaxeJava.Exemplos;

public class sintaxe {
    public static void main(String[] args) {
        String primeiroNome = "Michelle";
        String segundoNome = "Gomes";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
