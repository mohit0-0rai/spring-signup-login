$(document).ready(function() {
	$("#submit").bind('click', function(){
		var pattern = /^\b[A-Z0-9._%-]+@[A-Z0-9.-]+\.[A-Z]{2,4}\b$/i;
		var email = $("#email").val();
		if(!pattern.test(email)) {
			$("#validation_message p").text("* Email not valid");
			$("#validation_message").show();
			return false;
		}
		else if(!checkUniqueness(email)) {
			$("#validation_message p").text("* Email already exists");
			$("#validation_message").show();
			return false;
		}
		else if($("#password").val().length < 8) {
			$("#validation_message p").text("* Password must be minimum eight characters");
			$("#validation_message").show();
			return false;
		}
		else {
			return true;
		}
	});
	function checkUniqueness(email) {
		var returnStatus = false;
		var data = {
				'email': email
		}
		$.ajax({
			url: 'check-email-uniqueness',
			type: 'GET',
			data: data,
			async: false,
			contentType: 'application/json',
			success: function(response){
				if(response.code == '200')
					returnStatus = true;
			},
			error: function(error){
				console.log(error);
			}
		});
		return returnStatus;
	}
});