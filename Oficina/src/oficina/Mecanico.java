/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oficina;

/**
 *
 * @author 1649081
 */
public class Mecanico {
    private String nome;
    private int CPF;
    private String especialidade;
    private int telefone;
    private Box boxresponsavel;
    
    public Mecanico( String nome, int CPF, String especialidade, int telefone){
        this.nome = nome;
        this.CPF = CPF;
        this.especialidade = especialidade;
        this.telefone = telefone;
        this.boxresponsavel = null;
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
     * @return the CPF
     */
    public int getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the especialidade
     */
    public String getEspecialidade() {
        return especialidade;
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the boxresponsavel
     */
    public Box getBoxresponsavel() {
        return boxresponsavel;
    }

    /**
     * @param boxresponsavel the boxresponsavel to set
     */
    public void setBoxresponsavel(Box boxresponsavel) {
        this.boxresponsavel = boxresponsavel;
    }
    
    public void ExiblirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Telefone: " + telefone);
        if(boxresponsavel != null){
            System.out.println("Box responsavel: " + boxresponsavel.getNumero());
        }else{
            System.out.println("Box responsavel: Nenhum");

        }
    }
}
