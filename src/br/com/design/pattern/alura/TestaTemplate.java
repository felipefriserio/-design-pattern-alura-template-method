package br.com.design.pattern.alura;

import br.com.design.pattern.alura.imposto.ICPP;
import br.com.design.pattern.alura.imposto.IKCV;
import br.com.design.pattern.alura.imposto.Imposto;

public class TestaTemplate {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(1000);
        orcamento.adicionaItem(new Item("CANETA", 500));
        orcamento.adicionaItem(new Item("LAPIS", 500));

        Imposto icpp = new ICPP();
        double valorIcpp = icpp.calcula(orcamento);
        System.out.println(valorIcpp);

        Imposto ikcv = new IKCV();
        double valorIkcv = ikcv.calcula(orcamento);
        System.out.println(valorIkcv);
    }
}
