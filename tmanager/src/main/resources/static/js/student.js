/**
 * 
 */
 function studentSearch(){
 	var sid = $('#stuId');
 	$.ajax({
 		type:'get',
 		url:'/student/'+sid.val(),
 		success:function(data){
 			if(data.success){
 				$('#studentid').val(data.data.id);
 				$('#sname').val(data.data.name);
 				$('#sex').val(data.data.sex);
 				$('#qid').val(data.data.qinshiid);
 				$('#lid').val(data.data.longno);
 				$('#nid').val(data.data.shortno);
 				$('#address').val(data.data.address);
 				$('#father').val(data.data.fname);
 				$('#mother').val(data.data.mname);
 				$('#birthday').val(data.data.birthday);
 			}else{
 				console.log(data);
 				alert(data.message)
 			}	
 		}
 	});
 }

 function submit1(){
 	var data = {
 			//id:$('#stuId').val(),
			name:$('#sname').val(),
			sex:$('#sex').val(),
			qinshi:$('#qid').val(),
			longno:$('#lid').val(),
			shortno:$('#nid').val(),
			address:$('#address').val(),
			fname:$('#father').val(),
			mname:$('#mother').val(),
			birthday:$('#birthday').val()
 		}; 
 	$.ajax({
 		type:'put',
 		dataType:'json',
 		contentType:'application/json;charset=UTF-8',
 		url:'/student/'+$('#stuId').val(),
 		data:JSON.stringify(data),
 		success:function(data){
 			if(data.success){
 				alert("操作成功");
 			}else{
 				alert("操作失败");
 			}	
 		}
 	});
 }