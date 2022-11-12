public class App {
    public static void main(String[] args) throws Exception {
        Fatorial fatorial = new Fatorial();

        int numero = 3;

        double resultado = fatorial.calcular(numero);

        System.out.println("O fatorial de " + numero + " é " + resultado);
    }
}