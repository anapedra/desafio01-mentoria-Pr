package com.anapedra.calc.servises.impl;

import com.anapedra.calc.servises.Operacoao;

public class OperacaoImpl  implements Operacoao {

    @Override
    public long executaOperacaoSomar(long num1, long num2) {
      return num1+num2;

    }


    @Override
    public long executaOperacaoSubtrair(long num1, long num2) {
        return num1-num2;

    }

    @Override
    public long executaOperacaoMultiplicar(long num1,long num2) {
        return num1*num2;
    }

    @Override
    public double executaOperacaoDividir(double num1, double num2) {
        double result = 0;
        if (!(num1 > 0 && num2 > 0)){
            System.out.println("Divisor ou dividendo devem ser maior que zero");

        }
        return result = num1 / num2;

    }


}
