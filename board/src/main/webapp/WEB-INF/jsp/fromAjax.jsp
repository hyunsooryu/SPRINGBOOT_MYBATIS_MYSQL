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
</head>
<script src="/js/jQuery-2.1.4.min.js"></script>
<script>
     jQuery.fn.serializeObject = function() { 
      var obj = null; 
      try { 
          if(this[0].tagName && this[0].tagName.toUpperCase() == "FORM" ) { 
              var arr = this.serializeArray(); 
              if(arr){ obj = {}; 
              jQuery.each(arr, function() { 
                  obj[this.name] = this.value; }); 
              } 
          } 
      }catch(e) { 
          alert(e.message); 
      }finally {} 
      return obj; 
    }
    function to_ajax(){
        const serializedValues2 = $('#send-form').serializeObject()
 	
        $.ajax({
            type : 'post',
            url : '/test.jsp',
            data : JSON.stringify(serializedValues2),
            dataType : 'json',
            error: function(xhr, status, error){
                alert(error);
            }
            success : function(json){
                alert(json)
            },
        });
  
    }
</script>

<body class = "container">d
  <div class = "jumbotron">
    <h1>note</h1>
  </div>
  <form action = "/Board/register" method = "post" id = "send-form">
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
    </div>d
  </form>
  <button onclick = "to_ajax" value = "call"></button>
  <a href = "/Board/listview">리스트 보기</a>
  <!-- Optional JavaScript -->
  <Script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <Script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>