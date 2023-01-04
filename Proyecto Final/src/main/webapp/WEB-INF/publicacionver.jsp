<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Publicacion</title>
</head>
<body>
    <div class="container-sm">
        <h1>Nueva Publicacion</h1>
        <a href="/home" class="col-auto">Volver a inicio</a>
        <br>
        <form:form action="/Publicacion" method="post" modelAttribute="publicacion">
                <p>
                    <form:label path="titulo"><Title></Title></form:label>
                    <form:errors path="titulo"/>
                    <form:input path="titulo"  class="form-control"/>
            </p>
            <p>
                    <form:label path="descripcion">descripcion</form:label>
                    <form:errors path="descripcion"/>
                    <form:input path="descripcion" class="form-control"/>
            </p>
            <!-- <p>
                    <form:label path="nombre_mascota">Nombre mascota</form:label>
                    <form:errors path="nombre_mascota"/>
                    <form:input path="nombre_mascota" class="form-control"/>
            </p>
            <p>
                <form:label path="edad">Edad</form:label>
                <form:errors path="edad"/>
                <form:input path="edad" class="form-control"/>
            </p>
            <p>
                <form:label path="personalidad">Personalidad</form:label>
                <form:errors path="personalidad"/>
                <form:input path="personalidad" class="form-control"/>
            </p>
            <p>
                <form:label path="tipoDeAnimal">Tipo mascota</form:label>
                <form:errors path="tipoDeAnimal"/>
                <form:input path="tipoDeAnimal" class="form-control"/>
            </p>
            <p>
                <form:label path="tamaño_mascota">Tamaño/talla</form:label>
                <form:errors path="tamaño_mascota"/>
                <form:input path="tamaño_mascota" class="form-control"/>
            </p>
            <p>
                <form:label path="vacunas">Vacunas</form:label>
                <form:errors path="vacunas"/>
                <form:input path="vacunas" class="form-control"/>
            </p> -->
            <input type="submit" value="submit" class="btn btn-primary"/>
        </form:form>
        <a href="/home" class="btn btn-primary">cancel</a>
    </div>
</body>
</html>