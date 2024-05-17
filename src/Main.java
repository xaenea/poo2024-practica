import com.uned.controller.ControladorEmpleados;
import com.uned.interfaz.MenuPrincipal;
import com.uned.modelo.ContenedorDatos;

public class Main {
    public static void main(String[] args) {

        //Inicializaciones
        ContenedorDatos contenedorDatos = new ContenedorDatos();
        ControladorEmpleados controladorEmpleados = new ControladorEmpleados();


        // Realizar carga previa de datos aquí
        // Por ejemplo, cargar empleados, pacientes, estudiantes, etc.


        // Mostrar el menú principal
        MenuPrincipal menuPrincipal = new MenuPrincipal(controladorEmpleados);
        menuPrincipal.mostrarMenu();
    }
}