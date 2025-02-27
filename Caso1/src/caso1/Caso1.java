/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso1;
import javax.swing.JOptionPane;
/**
 *
 * @author Pochilito
 */
public class Caso1 {
    
    public static void main(String[] args) {
        
        //Datos Esenciales
        String nombrevend="";
        String bonoext="";
        String vehiprop="";
        String sucursal="";
        int ceduvend=0;
        int codigfact=0;
        int montfact=0;
        
        //Parametros usados para calculos de bonos
        double montbon=0;
        double montot=0;
        double montcomp=0;
        int factcant=0;
        double bono=0;
        
        //Parametros de Indicador de Mes
        int nummes=0;
        String mes="";
        
        //Cantidad de productos segun tipo y el total
        int elecvend=0;
        int autovend=0;
        int constvend=0; 
        
        //Indicadores de Producto Presente
        int elecind=0;
        int autoind=0;
        int consind=0;
        
        //Puntos de Vendedor
        int puntos=0;
        
        //Checkeo de si se tienen productos de los 3 tipos
        if (elecind >=1 && autoind >=1 && consind >=1){
            bono=montfact*0.1;
            montbon=montbon+bono;
            puntos=puntos+3;
        }
        //Bonos separados en caso de que no se tengan los 3 tipos
        else{
            if (elecvend >=3){
            bono=montfact*0.04;
            montbon=montbon+bono;
            puntos=puntos+1;
            }
            else{
            bono=montfact*0.02;
            montbon=montbon+bono;
            }
        
            if (autovend >=4){
            bono=montfact*0.04;
            montbon=montbon+bono;
            puntos=puntos+1;
            }
            else{
            bono=montfact*0.02;
            montbon=montbon+bono;
            }
        
            if (constvend >=1){
            bono=montfact*0.08;
            montbon=montbon+bono;
            puntos=puntos+2;
            }
            else{
            montot=montot;
            }
        }
        
        //Bono por mas de 50000 que sirve con o sin los 3 tipos
        
        if (montfact > 50000){
            bono=montfact*0.05;
            montbon=montbon+bono;
            puntos=puntos+1;
        }
        else{
            montot=montot;
        }
        
        //Monto total con bonos incluidos
        montot= montfact+montbon;
        
        //Checkeo de ventas o facturas
        if (factcant > 3 || montcomp > 300000){
            montcomp=montcomp+20000;
            bonoext="SI";
        }
        else{
            bonoext="NO";
        }
        
        //Indicador de mes
        
        switch (nummes){
            case 1:
                mes="Enero";
                break;
            case 2:
                mes="Febrero";
                break;
            case 3:
                mes="Marzo";
                break;
            case 4:
                mes="Abril";
                break;
            case 5:
                mes="Mayo";
                break;
            case 6:
                mes="Junio";
                break;
            case 7:
                mes="Julio";
                break;
            case 8:
                mes="Agosto";
                break;
            case 9:
                mes="Setiembre";
                break;
            case 10:
                mes="Octubre";
                break;
            case 11:
                mes="Noviembre";
                break;
            case 12:
                mes="Diciembre";
                break;    
            default:
                JOptionPane.showMessageDialog(null, "Dato no valido ");
        
        }
    
        JOptionPane.showMessageDialog(null, "El Agente Vendedor " + nombrevend + " codigo: " + codigfact + " en el mes de " + mes + "\n"+
                                                "Vendio un total de "+ montcomp + " en facturas \n" +
                                                "Obtuvo un total de "+ montbon + " en comisiones \n" +
                                                "El agente vendedor "+ bonoext + " logro el objetivo de llegar al BONO EXTRA \n" +
                                                "Puntos obtenidos por el vendedor " + puntos + "\n" +
                                                "El Agente Vendedor " + vehiprop + " cuenta con vehiculo propio \n" +
                                                "Sucursal: " + sucursal );
    
    }
}
