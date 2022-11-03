public class suma
{
    static int Suma (int n1, int n2, int n3){
        int total; // crea una variable para el resultado
        total = n1 + n2 + n3; // suma los valores y asigna los el resultado a total
        return total; // retorna los valores en variable tipo int
    }
    public static void main(String[] args) {
        //declarar variables
        int x = 20, y = 15, z = 30; // Asignar valores

        System.out.println("El total de la suma es:" + Suma(x,y,z));
    }
}

