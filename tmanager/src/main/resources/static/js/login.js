/**
 *   登陆页面脚本
 */
 /* id 身份选择 */
 var logid;
function idChange(id){
	if(id=='1'){
		$('#stu').attr('class','active');
		$('#tea').attr('class','');
	}else{
		$('#stu').attr('class','');
		$('#tea').attr('class','active');
	}
}

function login(){
	var isStu = $('#stu').attr('class') == 'active';
	if(isStu){
		$.post("/login/student",
			{id:$('#username').val(),
			password:$('#password').val()},
			function(data){
				if(data.success){
					location.href="index/"+data.logid;
				}else{
					alert(data.errMsg);
				}
			},'json');
	}else{
		$.post("/login/teacher",
			{id:$('#username').val(),
			password:$('#password').val()},
			function(data){
				if(data.success){
				alert(data.logid);
					location.href="index/"+data.logid;
				}else{
					alert(data.errMsg);
				}
			},'json');
	}
}