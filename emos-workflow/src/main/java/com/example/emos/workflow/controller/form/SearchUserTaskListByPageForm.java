/*     */ package BOOT-INF.classes.com.example.emos.workflow.controller.form;
/*     */ 
/*     */ import com.example.emos.workflow.controller.form.DeleteProcessByIdForm;
/*     */ import com.example.emos.workflow.db.pojo.TbLeave;
/*     */ import javax.validation.constraints.Min;
/*     */ import javax.validation.constraints.NotBlank;
/*     */ import javax.validation.constraints.NotNull;
/*     */ import javax.validation.constraints.Pattern;
/*     */ import org.hibernate.validator.constraints.Range;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SearchUserTaskListByPageForm
/*     */ {
/*     */   @NotNull(message = "userId不能为空")
/*     */   @Min(value = 1L, message = "userId不能小于1")
/*     */   private Integer userId;
/*     */   @NotBlank(message = "type不能为空")
/*     */   private String type;
/*     */   @NotBlank(message = "code不能为空")
/*     */   private String code;
/*     */   @NotNull(message = "page不能为空")
/*     */   @Min(value = 1L, message = "page不能小于1")
/*     */   private Integer page;
/*     */   @NotNull(message = "length不能为空")
/*     */   @Range(min = 1L, max = 60L, message = "length必须在1~60之间")
/*     */   private Integer length;
/*     */   @NotBlank(message = "tcode不能为空")
/*     */   @Pattern(regexp = "^[0-9]{6}$", message = "tcode必须是6位数字")
/*     */   private String tcode;
/*     */   
/*     */   public void setPage(Integer integer) {
/*  43 */     this.page = integer; } public void setLength(Integer integer) { this.length = integer; } public String toString() { return (new StringBuilder()).insert(0, TbLeave.ALLATORIxDEMO("q\tC\036A\004w\037G\036v\rQ\007n\005Q\030`\025r\rE\td\003P\001\n\031Q\tP%FQ")).append(getUserId()).append(DeleteProcessByIdForm.ALLATORIxDEMO("]F\005\037\001\003L")).append(getType()).append(TbLeave.ALLATORIxDEMO("@\002\034C\013GQ")).append(getPage()).append(DeleteProcessByIdForm.ALLATORIxDEMO("]F\035\003\037\001\005\016L")).append(getLength()).append(TbLeave.ALLATORIxDEMO("@\002\017M\bGQ")).append(getCode()).append(DeleteProcessByIdForm.ALLATORIxDEMO("JQ\022\022\t\025\003L")).append(getTcode()).append(TbLeave.ALLATORIxDEMO("E")).toString(); } public void setType(String str) { this.type = str; } public void setTcode(String str) { this.tcode = str; } public boolean equals(Object object) { if (object == this) return true;  if (!(object instanceof com.example.emos.workflow.controller.form.SearchUserTaskListByPageForm)) return false;  if (!(object = object).canEqual(this)) return false;  Integer integer1 = getUserId(), integer2 = object.getUserId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  integer1 = getPage(); integer2 = object.getPage(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  integer1 = getLength(); integer2 = object.getLength(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  String str1 = getType(), str2 = object.getType(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getCode(); str2 = object.getCode(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getTcode(); object = object.getTcode(); return !((str1 == null) ? (object != null) : !str1.equals(object)); } public void setUserId(Integer integer) { this.userId = integer; } public void setCode(String str) { this.code = str; } public int hashCode() { int i = 59; i = 1; Integer integer = getUserId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); integer = getPage(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); integer = getLength(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); String str = getType(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getCode(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getTcode(); return i = i * 59 + ((str == null) ? 43 : str.hashCode()); } protected boolean canEqual(Object object) { return object instanceof com.example.emos.workflow.controller.form.SearchUserTaskListByPageForm; }
/*     */   
/*     */   public String getType() {
/*  46 */     return this.type;
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
/*     */   public String getTcode() {
/*  71 */     return this.tcode;
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
/*     */   public Integer getPage() {
/*  99 */     return this.page;
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
/*     */   public String getCode() {
/* 139 */     return this.code;
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
/*     */   public Integer getUserId() {
/* 187 */     return this.userId;
/*     */   }
/*     */   
/*     */   public Integer getLength() {
/*     */     return this.length;
/*     */   }
/*     */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\controller\form\SearchUserTaskListByPageForm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */