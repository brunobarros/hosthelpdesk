<%@ taglib uri="/struts-tags" prefix="s" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Host HelpDesk</title>
</head>
<body>
	<h3>Login</h3>
	
	<s:form action="entrar.action" method="post">
		<s:textfield name="usuario" label="Usu�rio" />
		<s:password name="senha" label="Senha" />
		<s:submit value="Entrar" />
	</s:form>
</body>
</html>