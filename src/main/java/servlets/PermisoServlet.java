package servlets;

import java.io.IOException;
import java.sql.Date;

import dao.PermisoDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Permiso;

public class PermisoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int idAutor = Integer.parseInt(request.getParameter("id_autor"));
        int idPersona = Integer.parseInt(request.getParameter("id_persona"));
        String nombrePersona = request.getParameter("nombre_persona");
        String documentoIdentidad = request.getParameter("documento_identidad");
        String razon = request.getParameter("razon");
        Date fechaSolicitud = Date.valueOf(request.getParameter("fecha_solicitud"));
        Date fechaAplicacion = Date.valueOf(request.getParameter("fecha_aplicacion"));

        Permiso permiso = new Permiso();
        permiso.setIdAutor(idAutor);
        permiso.setIdPersona(idPersona);
        permiso.setNombrePersona(nombrePersona);
        permiso.setDocumentoIdentidad(documentoIdentidad);
        permiso.setRazon(razon);
        permiso.setFechaSolicitud(fechaSolicitud);
        permiso.setFechaAplicacion(fechaAplicacion);

        PermisoDAO dao = new PermisoDAO();
        dao.insertarPermiso(permiso);

        response.sendRedirect("permiso_exito.jsp");
    }
}
