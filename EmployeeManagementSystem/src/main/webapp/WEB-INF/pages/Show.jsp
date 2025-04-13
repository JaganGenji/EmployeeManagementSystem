<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table style="border-collapse: collapse; width: 50%; text-align: center" border="1">
  <thead>
    <tr>
      <th style="border: 1px solid black; padding: 10px;">Eid</th>
      <th style="border: 1px solid black; padding: 10px;">Name</th>
      <th style="border: 1px solid black; padding: 10px;">Email</th>
       <th style="border: 1px solid black; padding: 10px;">Mobile</th>
      <th style="border: 1px solid black; padding: 10px;">Password</th>
    </tr>
  </thead>
  <tbody style="">
 <c:forEach var="e" items="${res}">
  <tr>
  <td style="border: 1px solid black; padding: 10px;">${e.EId}</td>
  <td style="border: 1px solid black; padding: 10px;">${e.EName}</td>
  <td style="border: 1px solid black; padding: 10px;">${e.email}</td>
  <td style="border: 1px solid black; padding: 10px;">${e.mobile}</td>
  <td style="border: 1px solid black; padding: 10px;">${e.password}</td>
  
  
  </tr>
  </c:forEach>
  <tr>
      <td colspan="5" style="text-align: center;border: 1px solid black; padding: 10px;">
        <a href="./" style="text-decoration: none;">
      <button style="border: none; background-color: transparent;color:blue; cursor: pointer; font-size: inherit; width:100%;height:100%">
        Home
      </button>
    </a>
      </td>
    </tr>
  </tbody>
</table>
</body>
</html>