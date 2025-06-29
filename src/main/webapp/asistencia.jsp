<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Registro de Asistencia</title>
</head>
<body>
    <h2>Formulario de Registro de Asistencia</h2>
    <form action="asistencia" method="post">
        <label for="id_autor">ID del Autor:</label><br>
        <input type="number" name="id_autor" id="id_autor" required><br><br>

        <label for="id_persona">ID de la Persona:</label><br>
        <input type="number" name="id_persona" id="id_persona" required><br><br>

        <label for="nombre_persona">Nombre de la Persona:</label><br>
        <input type="text" name="nombre_persona" id="nombre_persona" required><br><br>

        <label for="documento_identidad">Documento de Identidad:</label><br>
        <input type="text" name="documento_identidad" id="documento_identidad" required><br><br>

        <label for="dias_faltados">Días Faltados:</label><br>
        <input type="number" name="dias_faltados" id="dias_faltados" required><br><br>

        <input type="submit" value="Registrar Asistencia">
    </form>
</body>
</html>
