<html>
<head>
<title> Admin Page </title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
</head>
<body style="background-color: #f0f1f2;">

<!-- create navigation bar ( header) -->
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/">Semicolon Microservices Admin login </a>
			</div>
		</div>
	</nav>
	<br>
	<br>
<h2> Admin Page </h2>
 <form   action ="/uploadusecase"  method="post" enctype = "multipart/form-data">

<br /> <br />
         Please select a file to upload : 
         <input type = "file" name = "file" value = "Browse File" /> <br /> <br />
         Press here to upload the file :
         <input type = "submit" value = "upload" /> <br /> <br /> 
</form>      


 <form   action ="/createteam"  method="post">

         <input type = "submit" value = "Create Team" /> <br /> <br /> 
</form>      



<div class="form-group">
<div class="row">	
<div class="col-sm-4">
<form action="/logout" method="post">
   <input type="submit" name="logout-submit" id="logout-submit"
   class="form-control btn btn-primary" value="Logout" />
 </form>   
 </div>
 </div>
 </div>

</body>
</html>