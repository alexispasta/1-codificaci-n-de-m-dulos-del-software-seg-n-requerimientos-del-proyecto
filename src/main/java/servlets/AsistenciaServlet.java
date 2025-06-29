package servlets;

import java.io.IOException;

import dao.AsistenciaDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Asistencia;

public class AsistenciaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int idAutor = Integer.parseInt(request.getParameter("id_autor"));
        int idPersona = Integer.parseInt(request.getParameter("id_persona"));
        String nombrePersona = request.getParameter("nombre_persona");
        String documentoIdentidad = request.getParameter("documento_identidad");
        int diasFaltados = Integer.parseInt(request.getParameter("dias_faltados"));

        Asistencia asistencia = new Asistencia();
        asistencia.setIdAutor(idAutor);
        asistencia.setIdPersona(idPersona);
        asistencia.setNombrePersona(nombrePersona);
        asistencia.setDocumentoIdentidad(documentoIdentidad);
        asistencia.setDiasFaltados(diasFaltados);

        AsistenciaDAO dao = new AsistenciaDAO();
        dao.insertarAsistencia(asistencia);

        response.sendRedirect("asistencia_exito.jsp");
    }
}
