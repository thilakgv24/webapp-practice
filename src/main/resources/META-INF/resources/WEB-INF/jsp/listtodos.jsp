<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
    	<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
        <title>Welcome To ListTodos!</title>
    </head>
    <body>
	    <div class="container">
			<h1>List of Your Todos</h1>
		        <table class="table"`>
		        	<thead>
		        		<tr>
		        		<th>Id</th>
		        		<th>Description</th>
		        		<th>Target Date</th>
		        		<th>Is Done?</th>
		        		</tr>
		        	</thead>
			        <c:forEach items="${todos}" var="todo">
			        	<tr>
			        		<td>${todo.id}</td>
			        		<td>${todo.description}</td>
			        		<td>${todo.targetDate}</td>
			        		<td>${todo.done}</td>
			        	</tr>
			        </c:forEach>  
		        </table> 
		</div>
	    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>