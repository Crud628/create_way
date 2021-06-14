/**
* 基础js
*/
/**
* 操作表
*/
$('#newTask').click(function(){
var buttons1 = [
        {
          text: '请选择',
          label: true
        },
        {
          text: '重要且紧急',
          bold: true,
          color: 'danger',
          onClick: function() {
            
          }
        },
        {
          text: '重要但不紧急',
          color:'waring',
          onClick: function() {
            
          }
        },
        {
          text: '不重要但紧急',
          onClick: function() {
            
          }
        },
        {
          text: '不重要且不紧急',
          bold: true,
          color:'success',
          onClick: function() {
            
          }
        }
      ];
      var buttons2 = [
        {
          text: '取消',
          bg: 'danger'
        }
      ];
      var groups = [buttons1, buttons2];
      $.actions(groups);
});