<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="CP1252"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="CP1252">
<meta http-equiv="Content-Type" content="text/html; charset=CP1252">
<title>BoVoyage</title>
<link rel="stylesheet" href="css/site.css">
<link rel="stylesheet" href="css/menus.css">
<link rel="stylesheet" href="css/authentification.css">
<link rel="stylesheet" href="css/inscription.css">
<link rel="stylesheet" href="css/fiches.css">
<script type="text/javascript" src="js/jquery-2.1.4.js"></script>
<script type="text/javascript" src="js/bovoyage.js"></script>
<script type="text/javascript" src="js/authenticate.js"></script>
</head>
<body>
<fmt:setLocale value="fr_FR" />
	<div id="page">
	<jsp:include page="fragments/header.jsp"></jsp:include>
		<div id="main">
			<h2>Votre panier</h2>
			<table border='1'>
		<tr><th>Destination</th><th>Départ</th><th>Retour</th><th>Nb personnes</th><th>Prix</th></tr>
		<c:forEach items="${caddy.voyages }" var="voyage" varStatus="status">
    	<form action="controller?cde=chgt&voy=${status.index }" method="post">
		<tr><td>${voyage.region }</td>
			<td><fmt:formatDate value="${voyage.datesVoyage.dateDepart }" dateStyle="full" /></td>
			<td><fmt:formatDate value="${voyage.datesVoyage.dateRetour }" dateStyle="full"  /></td>
			<td align="center">
				<select name="nb" onChange="this.form.submit();">
					<c:forEach var="i" begin="1" end="10">
						<c:if test="${i == voyage.nbVoyageurs }" > 
							<c:set var="selected" value="selected='selected'"/>
						</c:if>
						<c:if test="${i != voyage.nbVoyageurs }" >
							<c:set var="selected" value=""/>
						</c:if>
						<option value="${i }" ${selected }>${i }</option>
					</c:forEach>
				</select>
			</td>
			<td><fmt:formatNumber value="${voyage.prixHT }" type="currency" currencySymbol="&euro;" /></td>
			<td><a href="controller?cde=del&voy=${status.index }">supprimer</a></td>
		</tr>
		</form>
		</c:forEach>
    	</table>
		</div>
		<footer>mentions légales</footer>
	</div>
</body>
</html>