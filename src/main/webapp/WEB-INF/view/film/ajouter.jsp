<%-- 
    Document   : ajouter
    Created on : 29 sept. 2017, 12:13:41
    Author     : IB
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nouveau film</h1>
        <s:form>
            <s:textfield name="film.titre" label="Titre"/>
            <s:textarea cols="25" rows="10" name="film.synopsis" label="Synopsis"/>
            <s:textfield type="number" name="film.anneeprod" label="Année prod"/>
            <s:select name="film.genre.id" list="genres" listKey="id" listValue="nom"/>
            <s:submit label="Enregistrer"/>
        </s:form>
    </body>
</html>
