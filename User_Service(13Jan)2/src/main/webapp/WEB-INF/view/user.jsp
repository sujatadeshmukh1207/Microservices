<html>
<head>
<title> User Page </title>
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
				<a class="navbar-brand" href="/">Semicolon Microservices User login </a>
			</div>
		</div>
	</nav>
	<br>
	<br>

<h2> User Page </h2>

<h4> Kindly send request mail to get added in Team </h4>

<h3> <a href="/sendRequest"> Send Request </a> </h3>
<br>
<br>
<div class="form-group">
<div class="row">	
<div class="col-sm-2">
<form action="/logout" method="post">
   <input type="submit" name="logout-submit" id="logout-submit"
   class="form-control btn btn-primary" value="Logout" />
 </form>   
 </div>
 </div>
 </div> 
</body>
</html>