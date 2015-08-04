function showAuthenticationForm(event){
	document.getElementById("authentification").style.visibility="visible";
	deleteTimer();
	bovoyage.menu.timer = setTimeout(function(){
										hideAuthenticationForm();
									}, 10000);
}

function hideAuthenticationForm(){
	deleteTimer();
	document.getElementById("authentification").style.visibility="hidden";
}

function deleteTimer(){
	if(bovoyage.menu.timer!=null){
		clearTimeout(bovoyage.menu.timer);
		bovoyage.menu.timer=null;
	}
}

document.addEventListener("DOMContentLoaded", function(){
	document.getElementById("authentificationButton").addEventListener("click", authentification, false);
	document.getElementById("identifier").addEventListener("mouseenter", showAuthenticationForm, false);
	document.getElementById("authentification").addEventListener("mouseleave", hideAuthenticationForm, false);
},false);