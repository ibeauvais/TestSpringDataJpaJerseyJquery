

function enterAddEstab(){
	$("#backgroundPopup").css({  
		"opacity": "0.7"  
		});  
	$("#backgroundPopup").fadeIn("slow");  
	$("#estabCreation").fadeIn("slow");  
	
	}


function closeAddEstab(){
	$("#backgroundPopup").fadeOut("slow");  
	$("#estabCreation").fadeOut("slow");  
	
	}
(function( $ ){
	$.fn.serializeJSON=function() {
	var json = {};
	jQuery.map($(this).serializeArray(), function(n, i){
	json[n['name']] = n['value'];
	});
	return json;
	};
	})( jQuery );


function creationEstab(){
	var data=JSON.stringify($('#formEstabCreation').serializeJSON());
	
	$.ajax(	{
		url :'../../resource/etablissement',
		dataType :'json',
		 contentType: "application/json",
		type:'POST',
		data :data ,
		
		success	:function(data){
			closeAddEstab();
			refreshListEstab();
	}
	});
	}

$(document).ready(function(){  
	
	  
$("#estabCreationClose").click(function(){  
	closeAddEstab();
	});  


$("#backgroundPopup").click(function(){  
	closeAddEstab();
	});  


$("#buttonCreerEstab").click(function(){  
	creationEstab();
	});  

 

});


function refreshListEstab(){
	var estabs=new Array();
	
	$("#buttonCreerEstab table tr").each( function (){
		estabs[value.id]=value;
		
	})
	
	
	$.getJSON("../../resource/etablissement", function (data){
		$.each(data,function(index,value){
			
			
			
		});
		console.
		
		
	});

	
	}