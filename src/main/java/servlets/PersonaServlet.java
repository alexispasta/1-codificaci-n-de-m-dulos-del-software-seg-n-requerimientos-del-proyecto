package servlets;

import java.io.IOException;
import java.sql.Date;

import dao.PersonaDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Persona;

public class PersonaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Recoger datos del formulario
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");
        String direccion = request.getParameter("direccion");
        String documento = request.getParameter("documento_identidad");
        String fechaNacimiento = request.getParameter("fecha_nacimiento");
        String fechaContratacion = request.getParameter("fecha_contratacion");
        String tipoContrato = request.getParameter("tipo_contrato");
        String rol = request.getParameter("rol");
        String contrasena = request.getParameter("contrasena");
        int idEmpresa = Integer.parseInt(request.getParameter("id_empresa"));

        // Crear objeto Persona
        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setCorreo(correo);
        persona.setTelefono(telefono);
        persona.setDireccion(direccion);
        persona.setDocumentoIdentidad(documento);
        persona.setFechaNacimiento(Date.valueOf(fechaNacimiento));
        persona.setFechaContratacion(Date.valueOf(fechaContratacion));
        persona.setTipoContrato(tipoContrato);
        persona.setRol(rol);
        persona.setContrasena(contrasena);
        persona.setIdEmpresa(idEmpresa);

        // Insertar en BD
        PersonaDAO dao = new PersonaDAO();
        dao.insertarPersona(persona);

        // Redirigir o mostrar mensaje
        response.sendRedirect("personaForm.html");
    }
}
