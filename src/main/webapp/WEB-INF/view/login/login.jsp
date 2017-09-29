<%-- 
    Document   : login
    Created on : 28 sept. 2017, 17:15:40
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
        <h1>Identification</h1>
        <s:form>
            <s:textfield name="util.login" label="Identifiant"/>
            <s:password name="util.mdp" label="M-d-p"/>
            <s:submit value="OK"/>
        </s:form>
    </body>
</html>
