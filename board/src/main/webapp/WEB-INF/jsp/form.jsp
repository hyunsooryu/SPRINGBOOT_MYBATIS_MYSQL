<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <title>Hello JSP</title>
  <style>
   #button_container{
   	text-align: center;
   }
  </style>
  <script>
  </script>
</head>
<body class = "container">
  <div class = "jumbotron">
    <h1>note</h1>
  </div>
  <form action = "/Board/register" method = "post">
    <div class = "form-group">
      <label>제목</label>
      <input name="title" type="text" class = "form-control"/>
    </div>
    <div class = "form-group">
      <label>글쓴이</label>
      <input name="writer" type="text" class = "form-control"/>
    </div>
      <div class = "form-group">
      <label>내용</label>
      <textarea name="text" class = "form-control"></textarea>
    </div>
    <div id = "button_container">
    <button type = "submit">등록하기</button>
    <a href = "/Board/listview">리스트 보기</a>
    </div>
  </form>
  <!-- Optional JavaScript -->
  <Script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <Script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>