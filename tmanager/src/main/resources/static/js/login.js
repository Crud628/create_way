/**
 *   登陆页面脚本
 */
 /* id */
function idChange(id){
	if(id=='1'){
		$('#stu').attr('class','active');
		$('#tea').attr('class','');
	}else{
		$('#stu').attr('class','');
		$('#tea').attr('class','active');
	}
}