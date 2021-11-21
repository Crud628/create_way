/*     */ package BOOT-INF.classes.com.example.emos.workflow.controller.form;
/*     */ 
/*     */ import com.example.emos.workflow.db.pojo.TbAmect;
/*     */ import com.example.emos.workflow.db.pojo.TbLeave;
/*     */ import javax.validation.constraints.NotBlank;
/*     */ import javax.validation.constraints.Pattern;
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
/*     */ public class ApprovalTaskForm
/*     */ {
/*     */   @NotBlank(message = "code不能为空")
/*     */   private String code;
/*     */   @NotBlank(message = "approval不能为空")
/*     */   @Pattern(regexp = "^同意$|^不同意$", message = "approval内容不正确")
/*     */   private String approval;
/*     */   @NotBlank(message = "tcode不能为空")
/*     */   @Pattern(regexp = "^[0-9]{6}$", message = "tcode必须是6位数字")
/*     */   private String tcode;
/*     */   @NotBlank(message = "taskId不能为空")
/*     */   private String taskId;
/*     */   
/*     */   public String getTaskId() {
/*  40 */     return this.taskId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCode() {
/*  46 */     return this.code;
/*     */   }
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
/*     */   public String getTcode() {
/*  99 */     return this.tcode;
/*     */   }
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
/*     */   public String getApproval() {
/* 187 */     return this.approval;
/*     */   }
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
/*     */   public int hashCode() {
/* 212 */     int i = 59; i = 1; String str = getTaskId(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getApproval(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getCode(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getTcode(); return i = i * 59 + ((str == null) ? 43 : str.hashCode()); } public boolean equals(Object object) { if (object == this) return true;  if (!(object instanceof com.example.emos.workflow.controller.form.ApprovalTaskForm)) return false;  if (!(object = object).canEqual(this)) return false;  String str1 = getTaskId(), str2 = object.getTaskId(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getApproval(); str2 = object.getApproval(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getCode(); str2 = object.getCode(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getTcode(); object = object.getTcode(); return !((str1 == null) ? (object != null) : !str1.equals(object)); } protected boolean canEqual(Object object) { return object instanceof com.example.emos.workflow.controller.form.ApprovalTaskForm; } public void setCode(String str) { this.code = str; } public void setApproval(String str) { this.approval = str; } public void setTcode(String str) { this.tcode = str; } public String toString() { return (new StringBuilder()).insert(0, TbAmect.ALLATORIxDEMO("NJH`LnV[[|QIU}W'NnIdsk\007")).append(getTaskId()).append(TbLeave.ALLATORIxDEMO("@\002\rR\034P\003T\rNQ")).append(getApproval()).append(TbAmect.ALLATORIxDEMO("\026/Y`^j\007")).append(getCode()).append(TbLeave.ALLATORIxDEMO("\016LV\017M\bGQ")).append(getTcode()).append(TbAmect.ALLATORIxDEMO("\023")).toString(); } public void setTaskId(String str) { this.taskId = str; }
/*     */ 
/*     */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\controller\form\ApprovalTaskForm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */