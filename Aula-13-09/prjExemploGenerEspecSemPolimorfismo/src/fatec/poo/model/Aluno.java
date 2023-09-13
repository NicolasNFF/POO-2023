
package fatec.poo.model;

/**
 *
 * @author Nicolas Ferrari
 */
public class Aluno extends Pessoa {
    private int regEscolar;
    private double mensalidade;

    public Aluno(int regEscolar, String nome, String dataNascimento) {
        super(nome, dataNascimento); //chamada do método construtor da super 
        this.regEscolar = regEscolar;
    }
 
   public int getRegEscolar() {
        return regEscolar;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
    
    
}
