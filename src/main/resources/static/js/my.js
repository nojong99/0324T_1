$(document).ready(function(){
	const id = $.cookie("id");
	if(id)
	{
		$("#loginSpan").html(id+"<button id ='logoutBtn'>logout</button>");
	}
	
	$("#loginBtn").click(function(){
		const id =$("#id").val();
		const pw =$("#pw").val();
		 $.post('login',{id, pw}, function(data){
			data=JSON.parse(data);
			if(data.id){
				$.cookie("id",id);
				$("#loginSpan").html(data.id+"<button id ='logoutBtn'>logout</button>");
				
			}
		});
	});
	
	
	$(document).on('click','#logoutBtn',function(){
		$.post('logout',{},function(data){
			data=JSON.parse(data);
			if(data.msg=="ok"){
			
			$.removeCookie("id");
			location.reload();	
			}else{
				alert(data.msg);	
			}
			
		});
	});
	
	
});