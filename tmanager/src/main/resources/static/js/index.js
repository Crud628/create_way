/**
 * 
 */
 function logout(){
 	var l = window.localStorage;
 	if(l.length==0){
 		alert('未登录');
 	}else{
 		alert('已经退出');
 		$.get("/login/logout",{logId:l.logid},'json');
 		l.clear();
 	}
 	location.href="/login";
 }