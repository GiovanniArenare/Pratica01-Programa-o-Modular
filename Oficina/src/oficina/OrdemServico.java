/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oficina;

import java.time.LocalDate;

/**
 *
 * @author 1649081
 */
public class OrdemServico {

    private int codigo;
    private String nomeCliente;
    private String modeloVeicolo;
    private String placaVeicolo;
    private LocalDate data;
    private String status;
    private double valorEstimado;
    private Servico servico;
    private Box box;

    public OrdemServico(int codigo,
            String nomeCliente,
            String modeloVeicolo,
            String placaVeicolo,
            LocalDate data,
            String status,
            double valorEstimado,
            Servico servico) {
        this.nomeCliente = nomeCliente;
        this.modeloVeicolo = modeloVeicolo;
        this.placaVeicolo = placaVeicolo;
        this.data = data;
        this.status= status;
        this.valorEstimado= valorEstimado;
        this.servico= servico;
        this.box = null;

    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the modeloVeicolo
     */
    public String getModeloVeicolo() {
        return modeloVeicolo;
    }

    /**
     * @param modeloVeicolo the modeloVeicolo to set
     */
    public void setModeloVeicolo(String modeloVeicolo) {
        this.modeloVeicolo = modeloVeicolo;
    }

    /**
     * @return the placaVeicolo
     */
    public String getPlacaVeicolo() {
        return placaVeicolo;
    }

    /**
     * @param placaVeicolo the placaVeicolo to set
     */
    public void setPlacaVeicolo(String placaVeicolo) {
        this.placaVeicolo = placaVeicolo;
    }

    /**
     * @return the data
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the valorEstimado
     */
    public double getValorEstimado() {
        return valorEstimado;
    }

    /**
     * @param valorEstimado the valorEstimado to set
     */
    public void setValorEstimado(double valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    /**
     * @return the box
     */
    public Box getBox() {
        return box;
    }

    /**
     * @param box the box to set
     */
    public void setBox(Box box) {
        this.box = box;
    }

    /**
     * @return the servico
     */
    public Servico getServico() {
        return servico;
    }

    /**
     * @param servico the servico to set
     */
    public void setServico(Servico servico) {
        this.servico = servico;
    }
    
    public void ExibirDados(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Modelo: " + modeloVeicolo);
        System.out.println("Placa: " + placaVeicolo);
        System.out.println("Data: " + data);
        System.out.println("Status: " + status);
        System.out.println("Valor Estimado: R$ " + valorEstimado);
        System.out.println("-------Servico--------");
        servico.ExibirDados();
        System.out.println("-------BOX--------");
        if(box != null){
            System.out.println("Numero da Box: " + box.getNumero());
            if(box.getMecanicoresponsavel() != null){
                System.out.println("Mecanico responsavel: " + box.getMecanicoresponsavel().getNome());
            }
        }else{
            System.out.println("Nenhum Box atribuido.");
        }
    }

}
