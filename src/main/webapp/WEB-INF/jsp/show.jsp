<%@ page import="com.libo.entity.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: aaronberg
  Date: 2021/10/18
  Time: 6:02 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>年龄</td>
    </tr>
    <%
        List<Student> stus = (List<Student>)request.getAttribute("stus");
        for(Student s : stus){
    %>
    <tr>
        <td><%=s.getSno()%></td>
        <td><%=s.getName()%></td>
        <td><%=s.getAge()%></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
