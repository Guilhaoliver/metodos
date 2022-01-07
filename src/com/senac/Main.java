package com.senac;

public class Main {

    public static void main(String[] args) {

        int idade = 20;
        String nome1 = "Roberto";
        boolean temPlanoDeSaude = true;

        if ( idade >= 18 && !temPlanoDeSaude){
            System.out.println("Convidar");
        }

        if (idade >= 18){
            if(!temPlanoDeSaude){
                System.out.println("Convidar");
            }
        }

        if (idade >= 18){
            System.out.println("É maior de idade");
        }

        if (idade < 18){
            System.out.println("Não é maior de idade");
        }

        if (!temPlanoDeSaude){
            System.out.println("Não tem plano de saude");
        }
    }
}
