<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="register" align="center">
    <table>
        <tr>
            <td>
                Name:<input type="text" name="EName" required>
            </td>
        </tr>
        <tr>
            <td>
                Email:<input type="email" name="email" required>
            </td>
        </tr>
        <tr>
            <td>
                Password:<input type="text" name="password" required>
            </td>
        </tr>
         <tr>
            <td>
                Mobile:<input type="number" name="mobile" required>
            </td>
        </tr>
        <tr>
            <td>
                Address:<input type="text" name="address" required>
            </td>
        </tr>
        <tr>
            <td>
               <button type="submit">Submit</button>
            </td>
        </tr>
        
    </table>
    
</form>
 <p style="color: red;">
        ${register}
    </p>

</body>
</html>