import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  Classe para validacao de senha
 *
 * @author Alex Fraga
 */

public class ValidaSenha {

    ValidaSenha(){}

    /**
     *
     * @param pass
     * @return
     */
    public int validarSenha(String pass){
        int retorno = 0;
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+]).{6,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pass);
        if(matcher.matches()){
            retorno = pass.length();
        }else{
            System.out.println("Senha em não conformidade.");
            System.out.println("Construa sua senha com as seguintes caracteristicas:\n"+
                    "Possui no mínimo 6 caracteres. \n"+
                    "Contém no mínimo 1 digito. \n"+
                    "Contém no mínimo 1 letra em minúsculo. \n"+
                    "Contém no mínimo 1 letra em maiúsculo. \n"+
                    "Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+ \n"
            );
        }
        return retorno;
    }

}
