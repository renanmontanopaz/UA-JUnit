package org.ua;

/**
 * Criar uma classe PESSOA e adicionar os seguintes atributos para ela
 * - Nome
 * - Idade
 * - Endereço
 * - Gênero
 * - Telefone
 * - Tempo de trabalho
 *
 * Essa classe deve ter um contrutor publico para instanciar todos os atributos listados acima
 *
 * Os métodos são:
 * -> getNome> Retorna o nome
 * -> getIdade> Retorna a idade
 * -> getEndereço> Retorna o endereço
 * -> getDadosCompletos> Retorna concatenado NOME, IDADE, GENERO, TELEFONE e TEMPO DE TRABALHO
 * -> getNomeETelefone> Retorna nome e telefone.
 * -> getTempoDeTrabalho> Retorna o tempo de trabalho.
 * -> getTempoParaSeAposentar> Assuma que a idade de aposentadoria é 60 anos feminino, 65 masculino.
 * -> getTelefone> Retorna o telefone.
 *
 * Em seguida crie uma classe de teste para PESSOA e cubra as funcionalidades
 * com testes unitários para validar o correto funcionamento da mesma.
 *
 *
 * ENTREGA
 *
 * A partir da branch aula-02 (upstram), deve ser criada uma branch com o seguinte padrão: ua-nome-sobrenome
 * e nela realizar o desenvolvimento da atividade. Após concluída, a ativade, gerar um PR (pull request) apontando para a branch
 * entrega-02 lá do repositório do professor.
 */

public class Pessoa {

    private String nome;
    private int idade;
    private String endereco;
    private String genero;
    private int telefone;
    private int tempoTrabalho;
    private int tempoAposentar;

    public Pessoa(String nome, int idade, String endereco, String genero, int telefone, int tempoTrabalho) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.genero = genero;
        this.telefone = telefone;
        this.tempoTrabalho = tempoTrabalho;
    }

    public Pessoa() {

    }

    public int getIdade() {
        return idade;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getTempoTrabalho() {
        return tempoTrabalho;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setTempoTrabalho(int tempoTrabalho) {
        this.tempoTrabalho = tempoTrabalho;
    }

    public void setTempoAposentar(int tempoAposentar) {
        this.tempoAposentar = tempoAposentar;
    }

    public String getNomeETelefone(){
        return nome + telefone;
    }

    public void getTempoParaSeAposentar(String genero, int idade){
        if(this.genero == "F" && this.idade >= 60){
            this.tempoAposentar += 60 - idade;
        } else if (this.genero == "M" && this.idade >= 65) {
            this.tempoAposentar += 65 - idade;
        } else {
            throw new RuntimeException("Erro");
        }
    }
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", endereco='" + endereco + '\'' +
                ", genero='" + genero + '\'' +
                ", telefone=" + telefone +
                ", tempoTrabalho=" + tempoTrabalho +
                '}';
    }


}
