/*     */ package BOOT-INF.classes.com.example.emos.workflow.controller.form;
/*     */ 
/*     */ import com.example.emos.workflow.controller.form.SearchProcessUsersForm;
/*     */ import com.example.emos.workflow.db.pojo.TbLeave;
/*     */ import java.util.Arrays;
/*     */ import javax.validation.constraints.Min;
/*     */ import javax.validation.constraints.NotBlank;
/*     */ import javax.validation.constraints.NotEmpty;
/*     */ import javax.validation.constraints.NotNull;
/*     */ import javax.validation.constraints.Pattern;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SearchApprovalContentForm
/*     */ {
/*     */   @NotNull(message = "userId不能为空")
/*     */   @Min(value = 1L, message = "userId不能小于1")
/*     */   private Integer userId;
/*     */   @NotBlank(message = "type不能为空")
/*     */   @Pattern(regexp = "^员工请假$|^会议申请$|^报销申请$", message = "type内容不正确")
/*     */   private String type;
/*     */   @NotBlank(message = "status不能为空")
/*     */   @Pattern(regexp = "^待审批$|^已审批$|^已结束$", message = "status内容不正确")
/*     */   private String status;
/*     */   
/*     */   public String getCode() {
/*  27 */     return this.code;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotEmpty(message = "role不能为空")
/*     */   private String[] role;
/*     */   @NotBlank(message = "code不能为空")
/*     */   private String code;
/*     */   @NotBlank(message = "tcode不能为空")
/*     */   @Pattern(regexp = "^[0-9]{6}$", message = "tcode必须是6位数字")
/*     */   private String tcode;
/*     */   @NotBlank(message = "instanceId不能为空")
/*     */   @Pattern(regexp = "^[0-9A-Za-z\\-]{36}$", message = "instanceId内容不正确")
/*     */   private String instanceId;
/*     */   
/*     */   public String getInstanceId() {
/*  43 */     return this.instanceId;
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
/*     */   public void setStatus(String str)
/*     */   {
/*  66 */     this.status = str; } protected boolean canEqual(Object object) { return object instanceof com.example.emos.workflow.controller.form.SearchApprovalContentForm; } public int hashCode() { int i = 59; i = 1; Integer integer = getUserId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); String str = getInstanceId(); i = (i = i * 59 + ((str == null) ? 43 : str.hashCode())) * 59 + Arrays.deepHashCode((Object[])getRole()); str = getType(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getStatus(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getCode(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getTcode(); return i = i * 59 + ((str == null) ? 43 : str.hashCode()); } public void setInstanceId(String str) { this.instanceId = str; } public void setCode(String str) { this.code = str; } public void setUserId(Integer integer) { this.userId = integer; } public void setRole(String[] arrayOfString) { this.role = arrayOfString; } public void setTcode(String str) { this.tcode = str; } public boolean equals(Object object) { if (object == this) return true;  if (!(object instanceof com.example.emos.workflow.controller.form.SearchApprovalContentForm)) return false;  if (!(object = object).canEqual(this)) return false;  Integer integer1 = getUserId(), integer2 = object.getUserId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  String str1 = getInstanceId(), str2 = object.getInstanceId(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  if (!Arrays.deepEquals((Object[])getRole(), (Object[])object.getRole())) return false;  str1 = getType(); str2 = object.getType(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getStatus(); str2 = object.getStatus(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getCode(); str2 = object.getCode(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getTcode(); object = object.getTcode(); return !((str1 == null) ? (object != null) : !str1.equals(object)); } public String toString() { return (new StringBuilder()).insert(0, SearchProcessUsersForm.ALLATORIxDEMO("'I\025^\027D5\\\004^\033Z\025@7C\032X\021B\000j\033^\031\004\035B\007X\025B\027I=HI")).append(getInstanceId()).append(TbLeave.ALLATORIxDEMO("@\002\031Q\tP%FQ")).append(getUserId()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\006C\030II")).append(Arrays.deepToString((Object[])getRole())).append(TbLeave.ALLATORIxDEMO("@\002\030[\034GQ")).append(getType()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\007X\025X\001_I")).append(getStatus()).append(TbLeave.ALLATORIxDEMO("@\002\017M\bGQ")).append(getCode()).append(SearchProcessUsersForm.ALLATORIxDEMO("\000TX\027C\020II")).append(getTcode()).append(TbLeave.ALLATORIxDEMO("E")).toString(); } public void setType(String str) { this.type = str; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String[] getRole() {
/* 142 */     return this.role;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getUserId() {
/* 152 */     return this.userId;
/*     */   } public String getTcode() {
/* 154 */     return this.tcode;
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
/*     */   public String getStatus() {
/* 191 */     return this.status;
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
/*     */   public String getType() {
/* 213 */     return this.type;
/*     */   }
/*     */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\controller\form\SearchApprovalContentForm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */