<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="CP1252"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<div id="page">
	<jsp:include page="fragments/header.jsp"></jsp:include>
		<div id="main">
			<div id="grid">
			<table>
			<c:forEach items="${destinations }" var="destination" varStatus="status">
				<c:if test="${status.index%2 eq 0 }">
					<tr>
				</c:if>
				<td>
					<div class="fiche">
						<div class=images>
							<img src="images/${destination.image }" />
<!-- 							<img src="images/promo.png" class="promo"/> -->
						</div>	
							<div class="legend"><a href="controller?cde=details&id=${destination.id}">${destination.region}</a></div>
						</div>
				</td>
			</c:forEach>
			</table>
			</div>
		</div>
		<footer>mentions légales</footer>
	</div>
</body>
</html>