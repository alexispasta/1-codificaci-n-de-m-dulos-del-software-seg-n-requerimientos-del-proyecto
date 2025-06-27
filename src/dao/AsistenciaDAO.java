package dao;

import java.sql.*;
import modelo.Asistencia;
import conexion.ConexionBD;

public class AsistenciaDAO {

    public boolean insertarAsistencia(Asistencia asistencia) {
        String sql = "INSERT INTO asistencia(id_autor, id_persona, nombre_persona, documento_identidad, dias_faltados) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = ConexionBD.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, asistencia.getIdAutor());
            ps.setInt(2, asistencia.getIdPersona());
            ps.setString(3, asistencia.getNombrePersona());
            ps.setString(4, asistencia.getDocumentoIdentidad());
            ps.setInt(5, asistencia.getDiasFaltados());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al insertar asistencia: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizarAsistencia(Asistencia asistencia) {
        String sql = "UPDATE asistencia SET nombre_persona = ?, documento_identidad = ?, dias_faltados = ? WHERE id = ?";
        try (Connection con = ConexionBD.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, asistencia.getNombrePersona());
            ps.setString(2, asistencia.getDocumentoIdentidad());
            ps.setInt(3, asistencia.getDiasFaltados());
            ps.setInt(4, asistencia.getId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al actualizar asistencia: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminarAsistencia(int id) {
        String sql = "DELETE FROM asistencia WHERE id = ?";
        try (Connection con = ConexionBD.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al eliminar asistencia: " + e.getMessage());
            return false;
        }
    }
}
