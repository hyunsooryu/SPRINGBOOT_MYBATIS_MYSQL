<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <title>MemberLogin</title>
</head>
<h1 id = "login_window">hi</h1>
<body class="container">
  <div class="jumbotron">
  </div>
  <form action="/isQualifiedUser" method="get">
    <div class="form-group">
      <label>아이디(이메일)</label>
      <input name = "a" type="email" class="form-control" />
    </div>
    <div class="form-group">
      <label>비밀번호</label>
      <input name = "b" type="password" class="form-control" />
    </div>
    <button type="submit" class="btn btn-primary">로그인</button>
    <a href = "http://10.53.28.242:8080/join">회원가입하기</a>
  </form>
  
  <!-- Optional JavaScript -->
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>