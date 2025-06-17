package DevDojo.Iniciando;

public class Aula04OperadoresLogicos {
    public static void main(String[] args) {
        // && (AND) || (OR) !
        int age = 35;
        float salary = 3500F;
        boolean isLegalGreater = age > 30 && salary >= 4612;
        boolean isLegalMinor = age < 30 && salary >= 3381;
        System.out.println(isLegalGreater);
        System.out.println(isLegalMinor);
    }
}
