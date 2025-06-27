import dao.EmpresaDAO;
import modelo.Empresa;

public class App {
    public static void main(String[] args) {
        EmpresaDAO dao = new EmpresaDAO();

        // Crear empresa
        Empresa empresa = new Empresa();
        empresa.setNombre("Tech Solutions");
        empresa.setTelefono("3201234567");
        empresa.setDireccion("Calle 123 #45-67");
        empresa.setCiudad("Bogotá");
        empresa.setPais("Colombia");

        boolean insertado = dao.insertarEmpresa(empresa);
        if (insertado) {
            System.out.println("Empresa insertada correctamente.");
        } else {
            System.out.println("Error al insertar empresa.");
        }

        // Eliminar empresa
        boolean eliminada = dao.eliminarEmpresa(1); // Usa un ID válido
        if (eliminada) {
            System.out.println("Empresa eliminada correctamente.");
        } else {
            System.out.println("No se pudo eliminar la empresa.");
        }

        // Actualizar empresa
        empresa.setId(2); 
        empresa.setNombre("Tech Solutions Modificada");
        empresa.setTelefono("3217654321");
        empresa.setDireccion("Carrera 45 #10-20");
        empresa.setCiudad("Medellín");
        empresa.setPais("Colombia");

        boolean actualizada = dao.actualizarEmpresa(empresa);
        if (actualizada) {
            System.out.println("Empresa actualizada correctamente.");
        } else {
            System.out.println("No se pudo actualizar la empresa.");
        }
    }
}
