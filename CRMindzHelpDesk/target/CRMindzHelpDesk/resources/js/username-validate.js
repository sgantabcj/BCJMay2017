/**
 * This script file is to validate username with the ones present in the DB
 */

$("#username").focus(function(){
	$("#username-validationo-msg").hide();
});

$("#username").blur(function(){
	
	if($("#username").val() != ""){
		$.ajax({
			url			: "validateUsername",
			method		: "POST",
			data		: $(this).val(),
			contentType	: "text/plain",
			dataType	: "text",
			success		: function(response){
							if(response != "unique"){
								$("#username-validationo-msg").text(response);
								$("#username-validationo-msg").show();
							}
						}
		});
	}else{
		$("#username-validationo-msg").text("Username can't be empty");
		$("#username-validationo-msg").show();
	}
	
});

