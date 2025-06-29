package servlets;

import java.io.IOException;

import dao.DetalleNominaDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.DetalleNomina;

public class DetalleNominaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        DetalleNomina detalle = new DetalleNomina();
        detalle.setIdPersona(Integer.parseInt(request.getParameter("id_persona")));
        detalle.setCuentaBancaria(request.getParameter("cuenta_bancaria"));
        detalle.setSalarioBase(Double.parseDouble(request.getParameter("salario_base")));
        detalle.setAuxilioTransporte(Double.parseDouble(request.getParameter("auxilio_transporte")));
        detalle.setHorasExtra(Integer.parseInt(request.getParameter("horas_extra")));
        detalle.setBonificacion(Double.parseDouble(request.getParameter("bonificacion")));
        detalle.setComisiones(Double.parseDouble(request.getParameter("comisiones")));
        detalle.setViaticos(Double.parseDouble(request.getParameter("viaticos")));
        detalle.setDescuentos(Double.parseDouble(request.getParameter("descuentos")));
        detalle.setRetencionFuente(Double.parseDouble(request.getParameter("retencion_fuente")));
        detalle.setPrestamosEmpresa(Double.parseDouble(request.getParameter("prestamos_empresa")));
        detalle.setEmbargosJudiciales(Double.parseDouble(request.getParameter("embargos_judiciales")));
        detalle.setIncapacidadesDias(Integer.parseInt(request.getParameter("incapacidades_dias")));
        detalle.setVacacionesDias(Integer.parseInt(request.getParameter("vacaciones_dias")));
        detalle.setCesantias(Double.parseDouble(request.getParameter("cesantias")));
        detalle.setInteresesCesantias(Double.parseDouble(request.getParameter("intereses_cesantias")));
        detalle.setPrimaServicios(Double.parseDouble(request.getParameter("prima_servicios")));
        detalle.setTotalPagar(Double.parseDouble(request.getParameter("total_pagar")));

        DetalleNominaDAO dao = new DetalleNominaDAO();
        dao.insertarDetalle(detalle);

        response.sendRedirect("detalle_nomina_exito.jsp");
    }
}
