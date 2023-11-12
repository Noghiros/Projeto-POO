//Nome: Stefano Calheiros Stringhini - RA: 2312123

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entrada {

    public String Leitura(String legenda){

        System.out.printf("%s",legenda);
        InputStreamReader ent_tec= new InputStreamReader(System.in);
        BufferedReader tec = new BufferedReader(ent_tec);
        String s = "";
        try{
            s = tec.readLine();
        }
        catch(IOException e){
            System.out.println("ERRO DE ENTRADA!");
        }

        return s;
    }
}
