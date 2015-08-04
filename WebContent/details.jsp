<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="CP1252"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
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
<f:setLocale value="fr_FR" />
	<div id="page">
	<jsp:include page="fragments/header.jsp"></jsp:include>
		<div id="main">
			<h2>Nos dates de voyages pour ${destination.region}</h2>
			<table class="images">
				<tr>
					<c:forEach items="${destination.images }" var="image">
						<td><img src="images/${image }" class="vignette"/>
					</c:forEach>
				</tr>
			</table>
			<div style="description">${destination.description }</div>
							<table border='1'>
					<tr>
						<th>Départ</th>
						<th>Retour</th>
						<th>Prix TTC</th>
						<th></th>
					</tr>
					<c:forEach items="${destination.datesVoyages }" var="date">
						<tr>
							<td><f:formatDate value="${date.dateDepart}"
								pattern="dd/MM/yyyy" /></td>
							<td><f:formatDate value="${date.dateRetour}"
								pattern="dd/MM/yyyy" /></td>
							<td><f:formatNumber type="currency" value="${date.prixHT}" /></td>
							<td><a href="controller?cde=cde&id=${date.id }">Commander</a></td>
						</tr>
					</c:forEach>
				</table>
		</div>
		<footer>mentions légales</footer>
	</div>
</body>
</html>