<%-- 
    Document   : arithmeitccalculator
    Created on : Jan 17, 2022, 1:55:48 PM
    Author     : Marek PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form action="arithmetic" method="post">
            <label for="num1">First:</label>
            <input type="number" name="num1" id="num1">
            <br>
            <label for="num2">Second:</label>
            <input type="number" name="num2" id="num2">
            <br>
            <button type="submit" name="operator" vaule="add">+</button>
            <button type="submit" name="operator" vaule="sub">-</button>
            <button type="submit" name="operator" vaule="multi">*</button>
            <button type="submit" name="operator" vaule="div">%</button>
        </form>
        
        <p>Result: ${result}</p>
    </body>
</html>
