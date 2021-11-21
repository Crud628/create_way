/*     */ package BOOT-INF.classes.com.example.emos.workflow.controller.form;
/*     */ 
/*     */ import com.example.emos.workflow.controller.form.DeleteProcessByIdForm;
/*     */ import com.example.emos.workflow.controller.form.SearchProcessUsersForm;
/*     */ import javax.validation.constraints.Min;
/*     */ import javax.validation.constraints.NotBlank;
/*     */ import javax.validation.constraints.NotNull;
/*     */ import javax.validation.constraints.Pattern;
/*     */ 
/*     */ 
/*     */ public class StartReimProcessForm
/*     */ {
/*     */   @NotNull(message = "creatorId不能为空")
/*     */   @Min(value = 1L, message = "creatorId不能小于1")
/*     */   private Integer creatorId;
/*     */   @NotNull(message = "managerId不能为空")
/*     */   @Min(value = 1L, message = "managerId不能小于1")
/*     */   private Integer managerId;
/*     */   @NotBlank(message = "code不能为空")
/*     */   private String code;
/*     */   @NotBlank(message = "url不能为空")
/*     */   private String url;
/*     */   @NotBlank(message = "title不能为空")
/*     */   @Pattern(regexp = "^[a-zA-Z0-9\\u4e00-\\u9fa5]{2,30}$", message = "title内容不正确")
/*     */   private String title;
/*     */   @NotNull(message = "gmId不能为空")
/*     */   @Min(value = 1L, message = "gmId不能小于1")
/*     */   private Integer gmId;
/*     */   @NotBlank(message = "tcode不能为空")
/*     */   @Pattern(regexp = "^[0-9]{6}$", message = "tcode必须是6位数字")
/*     */   private String tcode;
/*     */   @NotBlank(message = "creatorName不能为空")
/*     */   @Pattern(regexp = "^[\\u4e00-\\u9fa5]{2,15}$", message = "creatorName内容不正确")
/*     */   private String creatorName;
/*     */   
/*     */   public Integer getCreatorId() {
/*  37 */     return this.creatorId;
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
/*     */   public int hashCode() {
/*  60 */     int i = 59; i = 1; Integer integer = getCreatorId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); integer = getGmId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); integer = getManagerId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); String str = getCreatorName(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getTitle(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getUrl(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getCode(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getTcode(); return i = i * 59 + ((str == null) ? 43 : str.hashCode()); } public void setCreatorName(String str) { this.creatorName = str; } public void setTitle(String str) { this.title = str; } public void setTcode(String str) { this.tcode = str; } public String toString() { return (new StringBuilder()).insert(0, DeleteProcessByIdForm.ALLATORIxDEMO("\"\022\020\024\0054\024\017\0346\003\t\022\003\002\0257\t\003\013Y\005\003\003\020\022\036\0248\002L")).append(getCreatorId()).append(SearchProcessUsersForm.ALLATORIxDEMO("\000TO\006I\025X\033^:M\031II")).append(getCreatorName()).append(DeleteProcessByIdForm.ALLATORIxDEMO("JQ\022\030\022\035\003L")).append(getTitle()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\023A=HI")).append(getGmId()).append(DeleteProcessByIdForm.ALLATORIxDEMO("JQ\013\020\b\020\001\024\0248\002L")).append(getManagerId()).append(SearchProcessUsersForm.ALLATORIxDEMO("\000TY\006@I")).append(getUrl()).append(DeleteProcessByIdForm.ALLATORIxDEMO("]F\022\t\025\003L")).append(getCode()).append(SearchProcessUsersForm.ALLATORIxDEMO("\000TX\027C\020II")).append(getTcode()).append(DeleteProcessByIdForm.ALLATORIxDEMO("X")).toString(); } protected boolean canEqual(Object object) { return object instanceof com.example.emos.workflow.controller.form.StartReimProcessForm; } public boolean equals(Object object) { if (object == this) return true;  if (!(object instanceof com.example.emos.workflow.controller.form.StartReimProcessForm)) return false;  if (!(object = object).canEqual(this)) return false;  Integer integer1 = getCreatorId(), integer2 = object.getCreatorId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  integer1 = getGmId(); integer2 = object.getGmId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  integer1 = getManagerId(); integer2 = object.getManagerId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  String str1 = getCreatorName(), str2 = object.getCreatorName(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getTitle(); str2 = object.getTitle(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getUrl(); str2 = object.getUrl(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getCode(); str2 = object.getCode(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getTcode(); object = object.getTcode(); return !((str1 == null) ? (object != null) : !str1.equals(object)); } public void setManagerId(Integer integer) { this.managerId = integer; } public void setCode(String str) { this.code = str; } public void setGmId(Integer integer) { this.gmId = integer; } public void setCreatorId(Integer integer) { this.creatorId = integer; } public void setUrl(String str) { this.url = str; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  98 */     return this.code;
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
/*     */   public Integer getManagerId() {
/* 139 */     return this.managerId;
/*     */   }
/*     */   public String getCreatorName() {
/* 142 */     return this.creatorName;
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
/*     */   public String getUrl() {
/* 154 */     return this.url;
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
/*     */   public String getTcode() {
/* 182 */     return this.tcode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getGmId() {
/* 191 */     return this.gmId;
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
/*     */   public String getTitle() {
/* 213 */     return this.title;
/*     */   }
/*     */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\controller\form\StartReimProcessForm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */