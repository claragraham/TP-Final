package com.company;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.utility.exceltoobjectmapping.ExcelToObjectMapper;
import com.utility.exceltoobjectmapping.exception.InvalidExcelFileException;

import java.io.FileNotFoundException;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        //apache.poi--->paso el excel con los datos a objetos
        //no funciona ver que pasa
     /*  try{
            FileInputStream file=new FileInputStream (new File("C:\\Users\\clara\\Desktop\\Java\\FinaBrottierCoutadaGraham\tramitesVehiculares2.xlsx"));
            //creo una instancia de workbook
            XSSFWorkbook sheet = new XSSFWorkbook (file);
            //le indico la solapa
            XSSFSheet sheet=workbook.getSheetAt(0);
            ArrayList<TramiteVehicular>listaTramites=new ArrayList<>();
            TramiteVehicular t=new TramiteVehicular();
            Row ro=sheet.getRow(i);
            //tengo que ignorar los titulos de las columnas para pasar directo a los tramites
            for(int j=sheet.getFirstCellNum();j<=ro.getLastCellNum();j++){
                Cell ce=ro.getCell(j);
                if(j==0) {
                    t.setNrotramite(ce.getNumericCellValue());
                }
                if(j==1){
                    t.setCodigoEmpleado(ce.getNumericCellValue());
                }
                if(j==2){
                    t.setDni(ce.getNumericCellValue());
                }
                if(j==3){
                    t.setTipoVehiculo(ce.getStringCellValue);
                }
                if(j==4){
                    t.setNotaTeorico(ce.getNumericCellValue());
                }
                if(j==5){
                    t.setNotaPractico((ce.getNumericCellValue());
                }
            }
            listaTramites.add(t);
            for(TramiteVeicular tra: listaTramites){
                System.out.println("nro"+tra.getNrotramite());
            }
            file.close();
            catch (Exception t){
                t.printStackTrace();
            }

        }*/

      //Pruebo maping un excel file con ExcelToObjetctMapper
    String file="\\Users\\clara\\Desktop\\Java\\FinaBrottierCoutadaGraham\\tramitesVehiculares.csv"
    try{
        ExcelToObjectMapper mapper=new ExceltoObjectMapper (file);
        List<TramiteVehicular>tramires=mapper.map(TramiteVehicular.class);
        for(TramiteVehicular tramite: tramite){
            String res= "Nro Tramite: "+tramite.getNroTramite()+", codigo: "+tramite.getCodigoEmpleado();
            System.out.println(res);
        }
        catch(InvalidExcelException e){
            System.out.println("Invelid excel file");
        }catch (FileNotFoundException e){
            System.out.println("File not found.");
        }catch(Exception e){
            System.out.println("Error. UNable to execute Mapping");
            e.printStacakTrace();
        }
    }


    }
}

