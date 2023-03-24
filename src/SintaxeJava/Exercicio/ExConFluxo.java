package SintaxeJava.Exercicio;

public class ExConFluxo {
    public static void main(String[] args) {

        String mes = "julho";
        if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
            System.out.println("Férias");
        }
            else {
            System.out.println("Estude!");
        }
    }

//    public static void main(String[] args) {
//
//        String mes = "julho";
//        switch (mes) {
//            case "dezembro":
//            case "janeiro":
//            case "julho":
//                System.out.println("Férias");
//                break;
//            default:
//                System.out.println("Estude!");
//                break;
//        }
//    }
}
