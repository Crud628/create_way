/*     */ package BOOT-INF.classes.com.example.emos.workflow.controller.form;
/*     */ 
/*     */ import com.example.emos.workflow.EmosWorkflowApplication;
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
/*     */ public class StartLeaveProcessForm
/*     */ {
/*     */   @NotBlank(message = "url不能为空")
/*     */   private String url;
/*     */   @NotNull(message = "days不能为空")
/*     */   private Double days;
/*     */   @NotNull(message = "gmId不能为空")
/*     */   @Min(value = 1L, message = "gmId不能小于1")
/*     */   private Integer gmId;
/*     */   @NotNull(message = "creatorId不能为空")
/*     */   @Min(value = 1L, message = "creatorId不能小于1")
/*     */   private Integer creatorId;
/*     */   @NotNull(message = "managerId不能为空")
/*     */   @Min(value = 1L, message = "managerId不能小于1")
/*     */   private Integer managerId;
/*     */   @NotBlank(message = "tcode不能为空")
/*     */   @Pattern(regexp = "^[0-9]{6}$", message = "tcode必须是6位数字")
/*     */   private String tcode;
/*     */   @NotBlank(message = "creatorName不能为空")
/*     */   @Pattern(regexp = "^[\\u4e00-\\u9fa5]{2,15}$", message = "creatorName内容不正确")
/*     */   private String creatorName;
/*     */   @NotBlank(message = "title不能为空")
/*     */   @Pattern(regexp = "^[a-zA-Z0-9\\u4e00-\\u9fa5]{2,30}$", message = "title内容不正确")
/*     */   private String title;
/*     */   @NotBlank(message = "code不能为空")
/*     */   private String code;
/*     */   
/*     */   public void setTcode(String str) {
/*  43 */     this.tcode = str; } public void setCode(String str) { this.code = str; } public void setUrl(String str) { this.url = str; } public void setTitle(String str) { this.title = str; } public void setGmId(Integer integer) { this.gmId = integer; } public void setManagerId(Integer integer) { this.managerId = integer; } protected boolean canEqual(Object object) { return object instanceof com.example.emos.workflow.controller.form.StartLeaveProcessForm; } public void setCreatorName(String str) { this.creatorName = str; } public String toString() { return (new StringBuilder()).insert(0, EmosWorkflowApplication.ALLATORIxDEMO("\t?;9.\007?*,.\n95(?8)\r597c99?*.$(\002>v")).append(getCreatorId()).append(TbUser.ALLATORIxDEMO("9\037vMp^aPgqtRp\002")).append(getCreatorName()).append(EmosWorkflowApplication.ALLATORIxDEMO("vk.\".'?v")).append(getTitle()).append(TbUser.ALLATORIxDEMO("\0235Xxvq\002")).append(getGmId()).append(EmosWorkflowApplication.ALLATORIxDEMO("vk7*4*=.(\002>v")).append(getManagerId()).append(TbUser.ALLATORIxDEMO("\0235[tFf\002")).append(getDays()).append(EmosWorkflowApplication.ALLATORIxDEMO("vk/96v")).append(getUrl()).append(TbUser.ALLATORIxDEMO("\0235\\z[p\002")).append(getCode()).append(EmosWorkflowApplication.ALLATORIxDEMO("vk.(5/?v")).append(getTcode()).append(TbUser.ALLATORIxDEMO("\026")).toString(); } public int hashCode() { int i = 59; i = 1; Integer integer = getCreatorId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); integer = getGmId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); integer = getManagerId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); Double double_ = getDays(); i = i * 59 + ((double_ == null) ? 43 : double_.hashCode()); String str = getCreatorName(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getTitle(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getUrl(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getCode(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getTcode(); return i = i * 59 + ((str == null) ? 43 : str.hashCode()); } public boolean equals(Object object) { if (object == this) return true;  if (!(object instanceof com.example.emos.workflow.controller.form.StartLeaveProcessForm)) return false;  if (!(object = object).canEqual(this)) return false;  Integer integer1 = getCreatorId(), integer2 = object.getCreatorId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  integer1 = getGmId(); integer2 = object.getGmId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  integer1 = getManagerId(); integer2 = object.getManagerId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  Double double_1 = getDays(), double_2 = object.getDays(); if ((double_1 == null) ? (double_2 != null) : !double_1.equals(double_2)) return false;  String str1 = getCreatorName(), str2 = object.getCreatorName(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getTitle(); str2 = object.getTitle(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getUrl(); str2 = object.getUrl(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getCode(); str2 = object.getCode(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getTcode(); object = object.getTcode(); return !((str1 == null) ? (object != null) : !str1.equals(object)); } public void setDays(Double double_) { this.days = double_; } public void setCreatorId(Integer integer) { this.creatorId = integer; }
/*     */   
/*     */   public String getCreatorName() {
/*  46 */     return this.creatorName;
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
/*     */   public Double getDays() {
/*  71 */     return this.days;
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
/*     */   public String getTitle() {
/*  99 */     return this.title;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUrl() {
/* 106 */     return this.url;
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
/*     */   public Integer getCreatorId() {
/* 152 */     return this.creatorId;
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
/*     */   public String getCode() {
/* 182 */     return this.code;
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
/*     */   public String getTcode() {
/* 216 */     return this.tcode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getManagerId() {
/* 227 */     return this.managerId;
/*     */   }
/*     */   
/*     */   public Integer getGmId() {
/*     */     return this.gmId;
/*     */   }
/*     */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\controller\form\StartLeaveProcessForm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */