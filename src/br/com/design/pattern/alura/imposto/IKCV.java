package br.com.design.pattern.alura.imposto;

import br.com.design.pattern.alura.Item;
import br.com.design.pattern.alura.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional{

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQue100Reais(orcamento);
    }

    private boolean temItemMaiorQue100Reais(Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if (item.getValor() > 100) return true;
        }
        return false;
    }
}
