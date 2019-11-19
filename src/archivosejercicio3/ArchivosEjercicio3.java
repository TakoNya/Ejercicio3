package archivosejercicio3;
import java.io.FileWriter;

public class ArchivosEjercicio3 {

        public static void main(String[] args) {
            String[] lineas={"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "..."};
            FileWriter archivo = null;
            try {
                archivo = new FileWriter ("archivo3.txt");
                for(String linea : lineas){
                    archivo.write(linea + "\r\n");
                }
                archivo.close();            
        } catch (Exception ex){
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
       
    }
    
}
