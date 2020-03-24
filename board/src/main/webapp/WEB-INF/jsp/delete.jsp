<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<style>
	div#footer{
		text-align:center;
	}
	div#footer > a{
		text-decoration:none;
	}
</style>
<script src="/js/jQuery-2.1.4.min.js"></script>
<script>
</script>
<title>Delete</title>
<body>
<div class = "container">
    <h2>Delete</h2>
    <table class = "table table-bordered">
        <thead>
            <tr>
                <th>no</th>
                <th>title</th>
                <th>contents</th>
                <th>writer</th>
                <th>RegisterDate</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var = "board" items = "${boardList}">
                <tr class = "tr_famliy">                	
                    <td>${board.boardNo}</td>
                    <td>${board.title}</td>
                    <td>${board.text}</td>
                    <td>${board.writer}</td>
                    <td>${board.regDate}</td>
                    <td><label><input type = "checkbox" name = "checked" value = ""></label></td>            
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
</body> 
<button onclick = "send"></button>
<div id = "footer">
</div>
<button onclick = "javascript:history.back()">뒤로가기</button>
</html>
