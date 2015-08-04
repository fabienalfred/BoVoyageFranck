<header>
	<div><img src="images/bandeau1.jpg"/></div>
	<nav id="menu">
		<ul>
			<li><a href="controller?cde=accueil">Promotions</a></li>
			<li><a href="controller?cde=accueil">Destinations</a></li>
			<li><a href="quisommesnous.html">Qui sommes nous?</a></li>
			<li id="identifier"><a href="#">S'identifier</a></li>
		</ul>
		<div id="authentification">
			<form method="get" action="http://192.168.1.16:8080/echo/EchoServlet" target="_blank">
				<label for="user">Identifiant </label>
				<input type="text" id="user" name="user"/><br/>
				<label for="pswd">Mot de passe </label>
				<input type="password" id="pswd" name="pswd"/><br/>
				<div id="formButtons">
					<button id="authentificationButton">Se connecter</button>
					<button type="button" id="insriptionButton">Créer un compte</button>
				</div>
			</form>
		</div>
		<div id="inscription">
			<form method="get" action="http://192.168.1.16:8080/echo/EchoServlet" target="_blank">
				<label for="user">Votre email </label>
				<input type="text" id="email" name="email"/><br/>
				<label for="pswd">Mot de passe </label>
				<input type="password" id="pswd" name="pswd"/><br/>
				<label for="pswd">Ressaisir le mot de passe</label>
				<input type="password" id="pswd" name="pswd"/><br/>
				<button type="button" id="creerCompteButton">S'inscrire</button>
			</form>
		</div>
	</nav>
</header>