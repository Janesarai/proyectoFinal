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
        <a href="/SecondChance/{id.nombre}/login" class="col-auto">Volver al home</a>
        <br>
        <form:form action="SecondChance/Publicacion" method="post" modelAttribute="publicacion">
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

            <input type="submit" value="submit" class="btn btn-primary"/>
            <a href="/home" class="btn btn-primary">cancel</a>
        </form:form>
        </div>
</body>
</html>