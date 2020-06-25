/*
 * Examen_1.
 */
package libro_fisicaapp;

/**
 *
 * @author Aguaiza Quimbita Jonathan Fabricio
 */
class Libro_Fisica {
    
    /*Atributos*/
    private int codigo;
    private String titulo;
    private String autor;
    private int anioEdicion;
    
    /*Constructor*/
    
    public Libro_Fisica(int pCodigo, String pTitulo, String pAutor, int pAnioEdicion){
            codigo=pCodigo;
            titulo=pTitulo;
            autor=pAutor;
            anioEdicion=pAnioEdicion;
    }
    
    /*Metodos*/
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo; /*this, puntero que invoca al atributo private cogigo*/
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public int getAnioEdicion(){
        return anioEdicion;
    }
    
    public void setAnioEdicion(int anioEdicion){
        this.anioEdicion = anioEdicion;
    }
    

        @Override
    public String toString(){
        return "El siguiente codigo es: "+codigo+" con el nombre de: Libro "+titulo+" --"
                + " Realizado por el siguiente Autor: "+autor
                + " con un año de Edicion del: "+anioEdicion+" de este libro.";
    }
}  
public class Libro_FisicaApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        // Creamos los objetos
        Libro_Fisica objeto1=new Libro_Fisica(970267787,
                "Fisica para bachillerato DINAMICA", "Antonio Lara-Barragán", 2006);
        
        Libro_Fisica objeto2=new Libro_Fisica(674813574,
                "Fisica Para ciencias e ingeniera", "Raymond A. Serway", 2007);
        
        Libro_Fisica objeto3=new Libro_Fisica(978842944,
                "Fisica para la ciencia y la tegnologia", "Paul A. Tipler", 2003);
            //Mostrar el estado de cada objeto manual1 & manual2
            System.out.println(objeto1.toString());
            System.out.println(objeto2.toString());
            System.out.println(objeto3.toString());
            
    }
    
}