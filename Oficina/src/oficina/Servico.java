/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oficina;

/**
 *
 * @author 1649081
 */
public class Servico {

    private String nome;
    private int tempo;
    private double valor;
    private String categoria;

    public Servico(String nome, int tempo, double valor, String categoria) {
        this.nome = nome;
        this.tempo = tempo;
        this.valor = valor;
        this.categoria = categoria;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the tempo
     */
    public int getTempo() {
        return tempo;
    }

    /**
     * @param tempo the tempo to set
     */
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void ExibirDados(){
        System.out.println("Nome do Servico: " + nome);
        System.out.println("Tempo Estimado: " + tempo);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Categoria: " + categoria);
        
    }
}
