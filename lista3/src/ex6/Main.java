package ex6;

public class Main {
    public static void main(String[] args) {
        Funcionario michael = new Funcionario("michael Scott", "regional manager", 123, 30, null, 1000);
        Funcionario michael2 = new Funcionario("michael Scott", "regional manager", 122, 30, null, 1000);
        Funcionario jim = new Funcionario("Jim Helpert", "salesman", 456, 30, michael2, 1000);

        Funcionario dwight = new Funcionario("Dwight Schrut", "assistent to the regional manager", 789, 30, michael, 1000);

        System.out.println(jim.mesmaChefia(dwight));
    }
}
