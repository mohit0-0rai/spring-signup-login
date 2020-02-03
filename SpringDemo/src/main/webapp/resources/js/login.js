$(document).ready(function() {
	var pattern = /^\b[A-Z0-9._%-]+@[A-Z0-9.-]+\.[A-Z]{2,4}\b$/i;
	var status = false;
	$("#submit").bind('click', function(){
		console.log("clicked")
		if(!pattern.test($("#login_email").val())) {
			$("#validation_message p").text("* Email not valid");
			$("#validation_message").show();
			return status;
		}
		else if($("#login_pass").val().length < 8) {
			$("#validation_message p").text("* Password must be minimum eight characters");
			$("#validation_message").show();
			return status;
		}
		else {
			return true;
		}
	});
});