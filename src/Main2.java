public class Main2 {

    public static void main(String[] args) {

        int primeiroNumero = 4;
        int segundoNumero = 3;
        int soma;
        double multiplicacao;
        double divisao;
        double subtracao;


        Calculadora calculadora = new Calculadora();

        soma = calculadora.somar(primeiroNumero,segundoNumero);

        multiplicacao = calculadora.multiplicacao(primeiroNumero,segundoNumero);

        divisao = calculadora.dividir(primeiroNumero,segundoNumero);

        subtracao = calculadora.subtrair(primeiroNumero,segundoNumero);

        System.out.println(soma);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(subtracao);


    }
}
