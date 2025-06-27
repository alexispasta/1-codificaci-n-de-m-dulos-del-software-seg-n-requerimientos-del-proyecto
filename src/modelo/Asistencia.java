package modelo;

public class Asistencia {
    private int id;
    private int idAutor;
    private int idPersona;
    private String nombrePersona;
    private String documentoIdentidad;
    private int diasFaltados;

    public Asistencia() {}

    public Asistencia(int id, int idAutor, int idPersona, String nombrePersona, String documentoIdentidad, int diasFaltados) {
        this.id = id;
        this.idAutor = idAutor;
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
        this.documentoIdentidad = documentoIdentidad;
        this.diasFaltados = diasFaltados;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdAutor() { return idAutor; }
    public void setIdAutor(int idAutor) { this.idAutor = idAutor; }

    public int getIdPersona() { return idPersona; }
    public void setIdPersona(int idPersona) { this.idPersona = idPersona; }

    public String getNombrePersona() { return nombrePersona; }
    public void setNombrePersona(String nombrePersona) { this.nombrePersona = nombrePersona; }

    public String getDocumentoIdentidad() { return documentoIdentidad; }
    public void setDocumentoIdentidad(String documentoIdentidad) { this.documentoIdentidad = documentoIdentidad; }

    public int getDiasFaltados() { return diasFaltados; }
    public void setDiasFaltados(int diasFaltados) { this.diasFaltados = diasFaltados; }
}
