/*     */ package BOOT-INF.classes.com.example.emos.workflow.controller.form;
/*     */ 
/*     */ import com.example.emos.workflow.EmosWorkflowApplication;
/*     */ import com.example.emos.workflow.controller.form.SearchProcessUsersForm;
/*     */ import javax.validation.constraints.Min;
/*     */ import javax.validation.constraints.NotBlank;
/*     */ import javax.validation.constraints.NotNull;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TuneTaskForm
/*     */ {
/*     */   @NotBlank(message = "tcode不能为空")
/*     */   @Pattern(regexp = "^[0-9]{6}$", message = "tcode必须是6位数字")
/*     */   private String tcode;
/*     */   @NotNull(message = "userId不能为空")
/*     */   @Min(value = 1L, message = "userId不能小于1")
/*     */   private Integer userId;
/*     */   @NotNull(message = "assigneeId不能为空")
/*     */   @Min(value = 1L, message = "assigneeId不能小于1")
/*     */   private Integer assigneeId;
/*     */   @NotBlank(message = "code不能为空")
/*     */   private String code;
/*     */   
/*     */   public Integer getAssigneeId() {
/*  46 */     return this.assigneeId;
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
/*     */   public void setTcode(String str) {
/*  60 */     this.tcode = str; } public String toString() { return (new StringBuilder()).insert(0, EmosWorkflowApplication.ALLATORIxDEMO("\016>4.\016*) \034$(&r>).(\002>v")).append(getUserId()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\025_\007E\023B\021I=HI")).append(getAssigneeId()).append(EmosWorkflowApplication.ALLATORIxDEMO("vk.(5/?v")).append(getTcode()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\027C\020II")).append(getCode()).append(EmosWorkflowApplication.ALLATORIxDEMO("b")).toString(); } public void setUserId(Integer integer) { this.userId = integer; } public int hashCode() { int i = 59; i = 1; Integer integer = getUserId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); integer = getAssigneeId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); String str = getTcode(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getCode(); return i = i * 59 + ((str == null) ? 43 : str.hashCode()); } public void setCode(String str) { this.code = str; } protected boolean canEqual(Object object) { return object instanceof com.example.emos.workflow.controller.form.TuneTaskForm; } public void setAssigneeId(Integer integer) { this.assigneeId = integer; } public boolean equals(Object object) { if (object == this) return true;  if (!(object instanceof com.example.emos.workflow.controller.form.TuneTaskForm)) return false;  if (!(object = object).canEqual(this)) return false;  Integer integer1 = getUserId(), integer2 = object.getUserId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  integer1 = getAssigneeId(); integer2 = object.getAssigneeId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  String str1 = getTcode(), str2 = object.getTcode(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getCode(); object = object.getCode(); return !((str1 == null) ? (object != null) : !str1.equals(object)); }
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
/*     */   public Integer getUserId() {
/* 152 */     return this.userId;
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
/*     */   public String getCode() {
/* 191 */     return this.code;
/*     */   }
/*     */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\controller\form\TuneTaskForm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */