
import fatec.poo.model.Retangulo;


/**
 *
 * @author Nicolas
 */
public class Aplic {

  
    public static void main(String[] args) {
        Retangulo objRet;//definicação de ponteiro
        
        objRet = new Retangulo(); //Instanciação do objeto
                                  //da classe Retangulo
                                  
        //passagem de mensagens
        objRet.setAltura(4.0);
        objRet.setBase(3.0);
        
        System.out.println("Medida da altura: " + objRet.getAltura());
        System.out.println("Medida da base: " + objRet.getBase());
        System.out.println("Medida da área do retângulo: " +
                    objRet.calcArea() );
        System.out.println("Medida do comprimento do retângulo " +
                    objRet.calcPerimetro());
        System.out.println("Medida da diagonal: " + objRet.calcDiagonal());
    }
    
}
