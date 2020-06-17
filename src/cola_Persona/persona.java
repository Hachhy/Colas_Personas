
package cola_Persona;


public class persona {
    
    private String codigo;
    private String nombre;
    private double sueldo,tarifa;
    private int horas;
    
    public persona (){
    
    }
    
    public void registrar (String codigo,String nombre,double tarifa,int horas){
    this.codigo=codigo;
    this.nombre=nombre;
    this.tarifa=tarifa;
    this.horas=horas;
    }
    public double getSueldo(){
    double su=tarifa*horas;
    return su;
    }
    public void linea(){
    System.out.println("****************************************************************************");
    }
    public void encabezado(){
        linea();
        System.out.println("\tDatos de Personas");
        linea();
        System.out.println("Codigo"+"\tNombre"+"\t\tTarifa"+"\tHoras"+"\tSueldo");
        linea();
    }
    public void mostrar(){
        
        System.out.println(codigo+"\t"+nombre+"\t\t"+tarifa+"\t"+horas+"\t"+getSueldo());
    }
    
}
