/**
 * 日历程序
 */
$(function(){
var flag=false;
$("#today").calendar({
	dateFormat:'yyyy-mm'
});
$('#date').calendar({
	dateFormat:'yyyy-mm'
});
$('div[data-date="2021-5-14"]').html("<span>14</span><div   style='background:skyblue;'>A\nB</div>")
$('div[data-date="2021-5-15"]').html("<span>15</span><div   style='background:skyblue;'>A\nB</div>")
$('div[data-date="2021-5-16"]').html("<span>15</span><div   style='background:orange;'>C</div>")
/*$($('.picker-calendar-month-current').children()[0]).each(function(){
	let item = $(this).children()[0];
	let txt = item.innerText;
	
	if("1" == txt && flag == true){
		flag = false;
		return false;
	}
	if("1" == txt && flag == false){
		flag = true;
	}
	console.log(txt+"----");
	console.log('1');
});*/
});


