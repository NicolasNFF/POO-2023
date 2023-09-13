
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;
import java.text.DecimalFormat;
/**
 *
 * @author Nicolas Ferrari
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Aluno objAlu = new Aluno(1010, "Nicolas Ferrari", "01/02/2002");
        
        
        //sout + tab = escreve o system.out.println automatico
        objAlu.setMensalidade(1150);
        System.out.println("Registro Escolar: " + objAlu.getRegEscolar());
        System.out.println("Nome: " + objAlu.getNome());
        System.out.println("Data de Nascimento: " + objAlu.getDataNascimento());
        System.out.println("Mensalidade: " + df.format(objAlu.getMensalidade()));
        
        Professor objProf = new Professor(2020, "Nicolas Tesla", "10/07/1856");
        
        objProf.setSalario(2000);
        System.out.println("\n\nRegistro Funcionario: " + objProf.getRegFuncional());
        System.out.println("Nome: " + objProf.getNome());
        System.out.println("Data de Nascimento: " + objProf.getDataNascimento());
        System.out.println("Salario: " + df.format(objProf.getSalario()));
    }
    
}