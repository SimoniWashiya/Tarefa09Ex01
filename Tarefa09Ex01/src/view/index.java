package view;

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculadora de Impostos Urbanos</title>
</head>
<body>
    <h1>Calculadora de Impostos Urbanos</h1>
    <form action="CalculateTaxServlet" method="post">
        <label for="city">Selecione a cidade:</label>
        <select name="city" id="city">
            <option value="SaoPaulo">S�o Paulo</option>
            <option value="BeloHorizonte">Belo Horizonte</option>
            <option value="PortoAlegre">Porto Alegre</option>
            <option value="Curitiba">Curitiba</option>
        </select><br><br>
        <label for="areaTotal">�rea total:</label>
        <input type="text" name="areaTotal" id="areaTotal"><br><br>
        <!-- Adicione mais campos conforme necess�rio -->
        <input type="submit" value="Calcular Imposto">
    </form>
</body>
</html>
