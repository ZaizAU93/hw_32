<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 04.01.2024
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order</title>
</head>
<body>
  <form action="/session" method="post">
    <p> Сделай заказ </p>
    <select name="food">
      <option value="pizza">Пицца</option>
      <option value="chaur">Шаурма</option>
    </select>
    <select name="drink">
      <option value="cola">Кола</option>
      <option value="pepsi">Пепси</option>
    </select>
    <br><br>
  <button type="submit"> Заказать </button>
  </form>

  <div>
    <H1> Ваш заказ</H1>
    <p> ${food} </p>
    <p> ${drink} </p>
    <p> Стоимость за все составит ${price} </p>
  </div>
</body>
</html>
