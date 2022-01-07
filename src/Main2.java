public class Main2 {

    public static void main(String[] args) {

        int primeiroNumero = 4;
        int segundoNumero = 3;
        int soma;

        double primeiroNumeroMulticacao = 4.5;
        double segundoNumeroMulticacao = 2.3;
        double multiplicacao;

        double primeiroNumeroDivisao = 45;
        double segundoNumeroDivisao = 8;
        double divisao;

        double subtracao;


        Calculadora calculadora = new Calculadora();

        soma = calculadora.somar(primeiroNumero,segundoNumero);

        multiplicacao = calculadora.multiplicacao(primeiroNumeroMulticacao,segundoNumeroMulticacao);

        divisao = calculadora.dividir(primeiroNumeroDivisao,segundoNumeroDivisao);

        subtracao = calculadora.subtrair(primeiroNumero,segundoNumero);

        System.out.println(soma);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(subtracao);


    }
}
