import java.util.Scanner;

public class PromedioVoltajes {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Pedimos la cantidad de voltajes
      System.out.print("Ingrese la cantidad de voltajes: ");
      int cantidadVoltajes = input.nextInt();

      // Creamos un arreglo para almacenar los voltajes
      double[] voltajes = new double[cantidadVoltajes];

      // Pedimos los voltajes y los almacenamos en el arreglo
      for (int i = 0; i < cantidadVoltajes; i++) {
         System.out.print("Ingrese el voltaje #" + (i+1) + ": ");
         voltajes[i] = input.nextDouble();
      }

      // Calculamos el promedio de los voltajes
      double promedio = 0;
      for (int i = 0; i < cantidadVoltajes; i++) {
         promedio += voltajes[i];
      }
      promedio /= cantidadVoltajes;

      // Encontramos el voltaje mayor y el voltaje menor
      double voltajeMayor = voltajes[0];
      double voltajeMenor = voltajes[0];
      for (int i = 1; i < cantidadVoltajes; i++) {
         if (voltajes[i] > voltajeMayor) {
            voltajeMayor = voltajes[i];
         }
         if (voltajes[i] < voltajeMenor) {
            voltajeMenor = voltajes[i];
         }
      }

      // Mostramos los resultados
      System.out.println("El promedio de los voltajes es: " + promedio);
      System.out.println("El voltaje mayor es: " + voltajeMayor);
      System.out.println("El voltaje menor es: " + voltajeMenor);
   }
}
