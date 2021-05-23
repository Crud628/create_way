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

/** 登录 */
function login(){
	var isStu = $('#stu').attr('class') == 'active';
	if(isStu){
		$.post("/login/student",
			{id:$('#username').val(),
			password:$('#password').val()},
			function(data){
				if(data.success){
					window.localStorage.storage.logid = data.logid;
					location.href="index?id="+data.logid;
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
					window.localStorage.logid = data.logid;
					location.href="index?id="+data.logid;
				}else{
					alert(data.errMsg);
				}
			},'json');
	}
}


function logout(){
 	var l = window.localStorage;
 	if(l.length==0){
 		alert('未登录');
 		location.href="/login";
 	}
 	$.get("/login/logout",{logId:l.logid},'json');
 }