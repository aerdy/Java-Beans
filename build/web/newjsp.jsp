<%-- 
    Document   : newjsp
    Created on : Jan 29, 2014, 3:00:24 PM
    Author     : Jarod United
--%>

<%@page language="java" contentType="text/html;charset=UTF-8" %>

<%@page import="dede.HelloBean"%>

<html>

<head>

    <title>Java Code Geeks Snippets - Use a Bean in JSP Page</title>

</head>

<body>

    <jsp:useBean id="sampleBean" class="dede.HelloBean" scope="session">

        <%-- intialize bean properties --%>

        <jsp:setProperty name="sampleBean" property="param1" value="value1" />

    </jsp:useBean>

    Sample Bean: <%= sampleBean %>

    <jsp:getProperty name="sampleBean" property="param1" />

    <jsp:getProperty name="sampleBean" property="param2" />

</body>
</html>
