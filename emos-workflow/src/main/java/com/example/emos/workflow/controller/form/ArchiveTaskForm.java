/*     */ package BOOT-INF.classes.com.example.emos.workflow.controller.form;
/*     */ 
/*     */ import com.example.emos.workflow.controller.form.SearchProcessUsersForm;
/*     */ import com.example.emos.workflow.db.pojo.TbUser;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ArchiveTaskForm
/*     */ {
/*     */   @NotBlank(message = "tcode不能为空")
/*     */   @Pattern(regexp = "^[0-9]{6}$", message = "tcode必须是6位数字")
/*     */   private String tcode;
/*     */   @NotBlank(message = "code不能为空")
/*     */   private String code;
/*     */   @NotNull(message = "userId不能为空")
/*     */   @Min(value = 1L, message = "userId不能小于1")
/*     */   private Integer userId;
/*     */   @NotBlank(message = "taskId不能为空")
/*     */   private String taskId;
/*     */   @NotBlank(message = "files不能为空")
/*     */   private String files;
/*     */   
/*     */   public void setTaskId(String str) {
/*  60 */     this.taskId = str; } public void setUserId(Integer integer) { this.userId = integer; } public int hashCode() { int i = 59; i = 1; Integer integer = getUserId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); String str = getCode(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getTaskId(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getFiles(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getTcode(); return i = i * 59 + ((str == null) ? 43 : str.hashCode()); } public String toString() { return (new StringBuilder()).insert(0, SearchProcessUsersForm.ALLATORIxDEMO("5^\027D\035Z\021x\025_\037j\033^\031\004\027C\020II")).append(getCode()).append(TbUser.ALLATORIxDEMO("\0235KtL~vq\002")).append(getTaskId()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\001_\021^=HI")).append(getUserId()).append(TbUser.ALLATORIxDEMO("9\037sVyZf\002")).append(getFiles()).append(SearchProcessUsersForm.ALLATORIxDEMO("\000TX\027C\020II")).append(getTcode()).append(TbUser.ALLATORIxDEMO("\026")).toString(); } public void setFiles(String str) { this.files = str; } protected boolean canEqual(Object object) { return object instanceof com.example.emos.workflow.controller.form.ArchiveTaskForm; } public void setTcode(String str) { this.tcode = str; } public void setCode(String str) { this.code = str; } public boolean equals(Object object) { if (object == this) return true;  if (!(object instanceof com.example.emos.workflow.controller.form.ArchiveTaskForm)) return false;  if (!(object = object).canEqual(this)) return false;  Integer integer1 = getUserId(), integer2 = object.getUserId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  String str1 = getCode(), str2 = object.getCode(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getTaskId(); str2 = object.getTaskId(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getFiles(); str2 = object.getFiles(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getTcode(); object = object.getTcode(); return !((str1 == null) ? (object != null) : !str1.equals(object)); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  75 */     return this.userId;
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
/*     */   public String getFiles() {
/*  99 */     return this.files;
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
/*     */   public String getCode() {
/* 128 */     return this.code;
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
/*     */   public String getTaskId() {
/* 187 */     return this.taskId;
/*     */   }
/*     */   
/*     */   public String getTcode() {
/*     */     return this.tcode;
/*     */   }
/*     */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\controller\form\ArchiveTaskForm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */