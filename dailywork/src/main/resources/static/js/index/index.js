/**
 * 日历程序
 */
var year_reg = /^\d{1,4}$/;
var month_reg = /^1[0-2]$|[1-9]/;

function fun(){
    var year = document.getElementById("year").value;
    var month = document.getElementById("month").value;
    if (year_reg.test(year)&&month_reg.test(month)) {
        document.getElementById("date2").innerText = year+"年"+month+"月";
        var thisDate =  parseInt(new Date(year,month,0).getDate());
        var lastDate = parseInt(month==1?31:new Date(year,month-1,0).getDate());
        var day = document.getElementById("month2");
        var thisDate_one =  parseInt(new Date(year,month-1,1).getDay());
        var str = "<table id = 'day' border ='1' cellpadding='0' cellspacing='0'>";
        for(let i = 1;i<=6;i++){
            str+="<tr>";
            for(let j = 1;j<=7;j++){
                if(i==1){
                    str+=j<thisDate_one+1?"<td>"+(lastDate-thisDate_one+j)+"</td>":"<td class='t'>"+(j-thisDate_one)+"</td>";
                }else if(i>=5){
                    str+=(j-thisDate_one+(i-1)*7)>thisDate?"<td>"+(j-thisDate_one+(i-1)*7)%thisDate+"</td>":"<td class='t'>"+(j-thisDate_one+(i-1)*7)+"</td>";
                }else{
                    str+="<td class='t'>"+(j-thisDate_one+(i-1)*7)+"</td>";
                }
            }
            str+="</tr>";
        }
        str+="</table>";
        day.innerHTML = str;
        return;
    }
    alert("输入不合法");
    return;
}