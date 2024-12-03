package miPrincipal;
//cree una clase paciente que herede de persona e implemente el metofo de la interfase Identificable
public class Paciente  {
    private String idPaciente;

    //coloque el contructor

   //coloque los getter y setter

   //sobre escriba el metodo getId

   

    

    @Override
    public String toString() {
        return "nombre: "+super.getNombre()+" edad: "+super.getEdad()+"id: "+ idPaciente;
    }

    /*
     * El método verificarEdad en la clase miPrincipal.Paciente
     *  verifica si la edad del paciente esta dentro de un 
     * rango valido (entre 0 y 120 anios).
     *  Si la edad es menor que 0 o mayor que 120, 
     * lanza una excepcion de tipo miPrincipal.RangoException 
     * con un mensaje indicando que la edad no es valida. Si la edad esta dentro del
     *  rango permitido, imprime un mensaje indicando que la edad esta dentro del rango permitido.
     */

     //sobre escriba el metodo verificarEdad
     //que es un metodo abstracto de la clase Persona

    


    
}
