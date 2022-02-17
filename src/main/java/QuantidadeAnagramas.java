import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 *  Classe para efetuar o calculo do numero de anagramas de uma palavra
 *
 *  @author Alex Fraga
 */

public class QuantidadeAnagramas {

    public QuantidadeAnagramas() {
    }

    /**
     *
     * @param palavra
     * @return
     */
    public int getQuantidadeDeAnagramas(String palavra){
        // Tamanho da Palavra
        int num = palavra.length();
        int fat1 = num;
        // efetua a fatoracao sobre a quantidade de letras da palavra
        while (num > 1){
            num --;
            fat1 = fat1 * num;
        }

        // passa toda a palavra letras minusculas e parte a palavra em um conjunto de letras
        char[] w = palavra.toLowerCase(Locale.ROOT).toCharArray();
        Map<Character, Integer> mw = new HashMap<>();

        //Percorre a palavra em busca de todas as letras iguais
        for (int x=0; x< w.length;x++){
            int qtd = 0;
            for (int y=x; y < w.length;y++){
                if( x!= y && w[x] == w[y]){
                    qtd++;
                }
            }
            if(qtd>0){
                mw.put(w[x], (qtd*2));
            }
        }

        num = 0;
        // efetua a soma do total de letras iguais que foram encontrada
        for (Map.Entry<Character,Integer> pair : mw.entrySet()) {
            num = num + pair.getValue();
        }

        int fat2 = num;
        // Efetua a fatoracao sobre o total de letras repetidas encontrada
        while (num > 1){
            num --;
            fat2 = fat2 * num;
        }

        //Caso não existam letras repetidas, a quantidade de anagramas possiveis sera
        //correspondente a fatoracao do total de letras da palavra
        int resultado = fat1;

        //Caso exista alguma letra repetida efetua a
        //divisao do total de letras sobre o total de repeticoes
        // para encontrar  o numero de anagramas possiveis
        if(fat2 > 0) {
            resultado = fat1 / fat2;
        }
        System.out.println(resultado);

        //Retorna a quantidade possiveis de anagramas calculada
        return resultado;
    }
}
