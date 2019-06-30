package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Leo el archivo con los tramites y creo automaticamente objetos clase tramites vehiculares?

        String fileNameDefined ="tramitesVehiculares.csv";
        File file=new File(fileNameDefined);

        try {
            //leer el archivo con Scanner
            Scanner inputInfo = new Scanner(new File("\\Users\\clara\\Desktop\\Java\\FinaBrottierCoutadaGraham\\tramitesVehiculares.csv"));
            inputInfo.useDelimiter(";");
            //comando hashNext() para leer el archivo linea por linea
            while (inputInfo.hasNext()) {
                //lee de a una linea, lo tengo que pasar a variables, dsp veo como lo paso a un objeto
                String data = inputInfo.next();
                System.out.println(data);
            }
            //cierro el scanner
            inputInfo.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();

            }
        }

}

