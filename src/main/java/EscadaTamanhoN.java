/**
 *  Classe para desenhar na tela um elemento com aspecto de
 *  escada estruturado com o caracter '*' representando
 *  uma escada  com o valor de N variavel representando a
 *  quantidade dos degraus.
 *
 *  @author Alex Fraga
 */

public class EscadaTamanhoN {

    public EscadaTamanhoN() {
    }

    /**
     *
     * @param n
     * @return
     */
    public String construirEscada(int n){
        String val1 = "";
        String val2 = "";
        String obj = "";

        //Efetua um ciclo do tamanho de N para gerar as strings
        for(int y=1; y<=n;y++){
            val1 = "";
            val2 = "";
            //Gera a string que representa os espacos ' '
            for (int in=y; in < n; in++){
                val1 = val1 + " ";
            }
            //Gera a string que representa '*'
            for (int in=1; in <=y; in++){
                val2 = val2 + "*";
            }
            // Se for a ultima posicao do ciclo nao é para gera quebra de linha
            //caso contrario gera quebra de linha, apos a concatenacao da string ' '  com '*'
            if(y==n){
                obj = obj + val1 + val2;
            }else{
                obj = obj + val1 + val2 + "\n";
            }
        }
        System.out.println(obj);
        // Retorno a imagem gerada
        return obj ;
    }
}
