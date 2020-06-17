
package cola_Persona;

import java.util.Scanner;


public class cola_Persona {
        Scanner sc=new Scanner(System.in);
        int tope,max,inicio;
        persona[] cola;
        persona per=new persona();
        
        
    public cola_Persona(int max){
        this.tope =0;
        this.max =max;
        this.inicio=0;
        this.cola =new persona[this.max+1];
        
        for(int i=0;i<this.max+1;i++){
            cola[i]=new persona();
        }
    }
    public cola_Persona(){
        this.tope =0;
        this.max =100;
        this.inicio=0;
        this.cola =new persona[this.max+1];
           
    }
       
    public void insertarCola(int pos,String cod,String nom,double tar,int h) {
        
            this.cola[pos].registrar(cod,nom,tar,h);            
            tope++;              
        
    }
    
    public void eliminarCola() {
        if (this.isColaVacia()) {
            System.out.println("La cola esta vacia");
        } else {
            for (int i = 0; i <= tope - 1; i++) {
                cola[i] = cola[i + 1];
            }
            System.out.println("Elemento eliminado... ");
            tope--;
        }
    }
    
    public void mostrarCola() {
        if (this.isColaVacia()) {
            System.out.println("La cola esta vacia, no hay datos...");
        } else {
            
            per.encabezado();
            for (int i = 0; i < tope; i++) {
                cola[i].mostrar();
            }
        }

    }
    
    public boolean isColaLlena() {
        if (this.tope == this.max) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isColaVacia() {
        if (this.inicio == this.tope) {
            return true;
        } else {
            return false;
        }
    }
}
