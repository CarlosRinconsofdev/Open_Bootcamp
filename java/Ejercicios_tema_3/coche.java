public class coche
{
    // atributos
    private int puertas;
    // constructor
    public coche (int N_puertas)
    {
        puertas = N_puertas; // saber el numero de puertas
    }
    // añadir mas puertas al coche
    public int Sumar_Puertas (int  ad_puerta)
    {
        puertas = puertas + ad_puerta;
        return puertas;
    }

    public static void main(String[] args) {
        //creacion del objeto miCoche
        coche miCoche = new coche(3);
        System.out.println("Mi coche tiene: " + miCoche.Sumar_Puertas(1) + " puertas");

    }
}
