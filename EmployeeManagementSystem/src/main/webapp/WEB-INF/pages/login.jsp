<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="login" method="post" border="2px">
<table>
<tr>
<td>
        <label>Email:</label>
        </td>
        <td>
        <input type="email" name="username" required /><br/><br/>
        </td>
</tr>
<tr>
<td>
        <label>Password:</label>
        </td>
        <td>
        <input type="password" name="password" required /><br/><br/>
        </td>
        </tr>
        <tr>
        <td>
        <input type="submit" value="Login" />
        </td>
        
        </tr>
        
        
        </table>
    </form>
     <p style="color: red;">
        ${error}
    </p>

</body>
</html>