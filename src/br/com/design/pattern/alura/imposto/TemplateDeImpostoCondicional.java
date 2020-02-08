package br.com.design.pattern.alura.imposto;

import br.com.design.pattern.alura.Orcamento;

public abstract class TemplateDeImpostoCondicional implements Imposto {

    public double calcula(Orcamento orcamento){
        if (deveUsarMaximaTaxacao(orcamento))
            return maximaTaxacao(orcamento);
        else
            return minimaTaxacao(orcamento);
    }

    protected abstract double minimaTaxacao(Orcamento orcamento);

    protected abstract double maximaTaxacao(Orcamento orcamento);

    protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
}
