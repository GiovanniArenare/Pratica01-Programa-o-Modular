/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oficina;

import java.util.ArrayList;

/**
 *
 * @author 1649081
 */
public class Box {

    private int numero;
    private String tipo;
    private int capacidade;
    private String local;
    private Mecanico mecanicoresponsavel;
    private ArrayList<OrdemServico> ordens;
    private int totalOrdensFinalizadas;

    public Box(int numero, String tipo, int capacidade, String local) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.local = local;
        this.mecanicoresponsavel = null;
        this.ordens = new ArrayList<>();
        this.totalOrdensFinalizadas = 0;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the capacidade
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * @param capacidade the capacidade to set
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * @return the mecanicoresponsavel
     */
    public Mecanico getMecanicoresponsavel() {
        return mecanicoresponsavel;
    }

    /**
     * @param mecanicoresponsavel the mecanicoresponsavel to set
     */
    public void setMecanicoresponsavel(Mecanico mecanicoresponsavel) {
        this.mecanicoresponsavel = mecanicoresponsavel;
    }

    /**
     * @return the ordens
     */
    public ArrayList<OrdemServico> getOrdens() {
        return ordens;
    }

    /**
     * @param ordens the ordens to set
     */
    public void setOrdens(ArrayList<OrdemServico> ordens) {
        this.ordens = ordens;
    }

    /**
     * @return the totalOrdensFinalizadas
     */
    public int getTotalOrdensFinalizadas() {
        return totalOrdensFinalizadas;
    }

    /**
     * @param totalOrdensFinalizadas the totalHoras to set
     */
    public void setTotalOrdensFinalizadas(int totalOrdensFinalizadas) {
        this.totalOrdensFinalizadas = totalOrdensFinalizadas;
    }
    
    public boolean PodeReceberOrdem(OrdemServico ordem){
        if(ordens.size() >= capacidade){
            return false;
        }
        if(!tipo.equalsIgnoreCase(ordem.getServico().getCategoria())){
            return false;                
        }
        return true;
    }
    
    public void adicionarOrdem(OrdemServico ordem){
        if(PodeReceberOrdem(ordem)){
            ordens.add(ordem);
            ordem.setBox(this);
        }
    }
    
    public void finalizarOrdem(OrdemServico ordem){
        if(ordens.contains(ordem)){
            ordens.remove(ordem);
            totalOrdensFinalizadas++;
            ordem.setStatus("Finalizada");
        }
    }
    
    public void ExibirDados(){
        System.out.println("Numero: " + numero);
        System.out.println("Tipo de Servico Permitido: " + tipo);
        System.out.println("Capacidade Maxima: " + capacidade);
        System.out.println("Localizacao: " + local);
        if (mecanicoresponsavel != null){
            System.out.println("Mecanico Responsavel: " + mecanicoresponsavel.getNome());
        }else{
            System.out.println("Mecanico Responsavel: nenhum");
        }
    }
    
}
