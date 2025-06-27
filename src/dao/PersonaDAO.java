package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexion.ConexionBD;
import modelo.Persona;

public class PersonaDAO {

    public boolean insertarPersona(Persona p) {
        String sql = "INSERT INTO persona(nombre, apellido, correo, telefono, direccion, documento_identidad, fecha_nacimiento, fecha_contratacion, tipo_contrato, rol, activo, contrasena, id_empresa) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = ConexionBD.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, p.getNombre());
            ps.setString(2, p.getApellido());
            ps.setString(3, p.getCorreo());
            ps.setString(4, p.getTelefono());
            ps.setString(5, p.getDireccion());
            ps.setString(6, p.getDocumentoIdentidad());
            ps.setDate(7, p.getFechaNacimiento());
            ps.setDate(8, p.getFechaContratacion());
            ps.setString(9, p.getTipoContrato());
            ps.setString(10, p.getRol());
            ps.setBoolean(11, p.isActivo());
            ps.setString(12, p.getContrasena());
            ps.setInt(13, p.getIdEmpresa());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al insertar persona: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizarPersona(Persona p) {
        String sql = "UPDATE persona SET nombre=?, apellido=?, correo=?, telefono=?, direccion=?, documento_identidad=?, fecha_nacimiento=?, fecha_contratacion=?, tipo_contrato=?, rol=?, activo=?, contrasena=?, id_empresa=? WHERE id=?";

        try (Connection con = ConexionBD.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, p.getNombre());
            ps.setString(2, p.getApellido());
            ps.setString(3, p.getCorreo());
            ps.setString(4, p.getTelefono());
            ps.setString(5, p.getDireccion());
            ps.setString(6, p.getDocumentoIdentidad());
            ps.setDate(7, p.getFechaNacimiento());
            ps.setDate(8, p.getFechaContratacion());
            ps.setString(9, p.getTipoContrato());
            ps.setString(10, p.getRol());
            ps.setBoolean(11, p.isActivo());
            ps.setString(12, p.getContrasena());
            ps.setInt(13, p.getIdEmpresa());
            ps.setInt(14, p.getId());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar persona: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminarPersona(int id) {
        String sql = "DELETE FROM persona WHERE id = ?";
        try (Connection con = ConexionBD.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al eliminar persona: " + e.getMessage());
            return false;
        }
    }
}

