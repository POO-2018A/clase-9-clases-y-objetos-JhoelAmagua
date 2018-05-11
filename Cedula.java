package Cedula;
import java.util.*;

public class Cedula {

    private String cedula;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
        cedulavalida(cedula);
    }
    
    private boolean cedulavalida (String cedula){
        
        int a= Integer.parseInt(cedula.charAt(0)+"");
        int b= Integer.parseInt(cedula.charAt(1)+""); 
        int suma;
        int n=0;
        int u;
        int m;
        
            if((a>2) || (a==2 && b>4) || (a==0 && b==0)){
                System.out.println("Primer o segundo digitos invalidos");
                return false;
            }
            
            if(Integer.parseInt(cedula.charAt(2)+"")>5 || Integer.parseInt(cedula.charAt(2)+"")<0){
                System.out.println("Tercer digito invalido");
                return false;
            }
            
            for(int i=0; i<9 ; i++ ){
            if(i%2 ==0){
                suma = Integer.parseInt(cedula.charAt(i)+"")*2;
            }else {
                suma = Integer.parseInt(cedula.charAt(i)+"")*1;
            }
            if(suma>9){
                suma=suma-9;
            }
            n=suma+n;
        }
            System.out.println("La suma es: "+n);
            u=n;
            
            while(u%10 !=0){
                u++;
            }
            
            m=u-n;
            System.out.println("El ultimo digito deberia ser es: "+m);
            
            if(Integer.parseInt(cedula.charAt(9)+"")==m){
                System.out.println("CEDULA VALIDA ");
                return true;
            }else{
                System.out.println("Cedula invalida ");
                return false;
            }
    }
    
    public static void main(String[] args) {
        Scanner lector= new Scanner (System.in);
        
        Cedula c= new Cedula();
        System.out.println("Ingrese su numero de cedula: ");
        c.cedula = lector.nextLine();
        
        System.out.println("El numero de cedula es: "+c.cedula);
        c.setCedula(c.cedula);
        
    }
    
}
