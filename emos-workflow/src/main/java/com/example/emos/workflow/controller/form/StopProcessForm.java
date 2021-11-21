/*     */ package BOOT-INF.classes.com.example.emos.workflow.controller.form;
/*     */ 
/*     */ import com.example.emos.workflow.controller.form.SearchProcessUsersForm;
/*     */ import com.example.emos.workflow.db.pojo.TbLeave;
/*     */ import javax.validation.constraints.NotBlank;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class StopProcessForm
/*     */ {
/*     */   @NotBlank(message = "code不能为空")
/*     */   private String code;
/*     */   @NotBlank(message = "instanceId不能为空")
/*     */   private String instanceId;
/*     */   
/*     */   public String getInstanceId() {
/*  60 */     return this.instanceId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInstanceId(String str) {
/*  66 */     this.instanceId = str; } protected boolean canEqual(Object object) { return object instanceof com.example.emos.workflow.controller.form.StopProcessForm; } public boolean equals(Object object) { if (object == this) return true;  if (!(object instanceof com.example.emos.workflow.controller.form.StopProcessForm)) return false;  if (!(object = object).canEqual(this)) return false;  String str1 = getInstanceId(), str2 = object.getInstanceId(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getCode(); object = object.getCode(); return !((str1 == null) ? (object != null) : !str1.equals(object)); } public int hashCode() { int i = 59; i = 1; String str = getInstanceId(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getCode(); return i = i * 59 + ((str == null) ? 43 : str.hashCode()); } public void setCode(String str) { this.code = str; } public String toString() { return (new StringBuilder()).insert(0, TbLeave.ALLATORIxDEMO("?V\003R<P\003A\tQ\037d\003P\001\n\005L\037V\rL\017G%FQ")).append(getInstanceId()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\027C\020II")).append(getCode()).append(TbLeave.ALLATORIxDEMO("E")).toString(); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCode() {
/* 128 */     return this.code;
/*     */   }
/*     */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\controller\form\StopProcessForm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */