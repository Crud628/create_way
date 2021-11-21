/*     */ package BOOT-INF.classes.com.example.emos.workflow.controller.form;
/*     */ 
/*     */ import com.example.emos.workflow.controller.form.SearchProcessUsersForm;
/*     */ import com.example.emos.workflow.db.pojo.TbUser;
/*     */ import java.util.Arrays;
/*     */ import javax.validation.constraints.Min;
/*     */ import javax.validation.constraints.NotBlank;
/*     */ import javax.validation.constraints.NotEmpty;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SearchTaskByPageForm
/*     */ {
/*     */   @Pattern(regexp = "^[\\e4e00-\\u9fa5]{2,20}$", message = "creatorName内容不正确")
/*     */   private String creatorName;
/*     */   @NotEmpty(message = "role不能为空")
/*     */   private String[] role;
/*     */   @NotNull(message = "userId不能为空")
/*     */   @Min(value = 1L, message = "userId不能小于1")
/*     */   private Integer userId;
/*     */   @NotBlank(message = "tcode不能为空")
/*     */   @Pattern(regexp = "^[0-9]{6}$", message = "tcode必须是6位数字")
/*     */   private String tcode;
/*     */   @Pattern(regexp = "^员工请假$|^会议申请$|^报销申请$", message = "type内容不正确")
/*     */   private String type;
/*     */   @NotNull(message = "page不能为空")
/*     */   @Min(value = 1L, message = "page不能小于1")
/*     */   private Integer page;
/*     */   @NotBlank(message = "code不能为空")
/*     */   private String code;
/*     */   @NotBlank(message = "status不能为空")
/*     */   @Pattern(regexp = "^待审批$|^已审批$|^已结束$", message = "status内容不正确")
/*     */   private String status;
/*     */   @NotNull(message = "length不能为空")
/*     */   @Range(min = 10L, max = 100L, message = "length必须在10~100之间")
/*     */   private Integer length;
/*     */   @Pattern(regexp = "^[0-9A-Za-z\\-]{36}$", message = "instanceId内容不正确")
/*     */   private String instanceId;
/*     */   
/*     */   public Integer getLength() {
/*  63 */     return this.length;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCreatorName() {
/*  71 */     return this.creatorName;
/*     */   }
/*     */   
/*     */   public Integer getPage() {
/*  75 */     return this.page;
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
/*     */   public String getInstanceId() {
/* 106 */     return this.instanceId;
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
/*     */   public Integer getUserId() {
/* 128 */     return this.userId;
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
/*     */   public String getCode() {
/* 182 */     return this.code;
/*     */   }
/*     */ 
/*     */   
/*     */   public String[] getRole() {
/* 187 */     return this.role;
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
/*     */   public void setCode(String str) {
/* 212 */     this.code = str; } public void setInstanceId(String str) { this.instanceId = str; } public boolean equals(Object object) { if (object == this) return true;  if (!(object instanceof com.example.emos.workflow.controller.form.SearchTaskByPageForm)) return false;  if (!(object = object).canEqual(this)) return false;  Integer integer1 = getUserId(), integer2 = object.getUserId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  integer1 = getPage(); integer2 = object.getPage(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  integer1 = getLength(); integer2 = object.getLength(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  if (!Arrays.deepEquals((Object[])getRole(), (Object[])object.getRole())) return false;  String str1 = getType(), str2 = object.getType(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getStatus(); str2 = object.getStatus(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getCreatorName(); str2 = object.getCreatorName(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getInstanceId(); str2 = object.getInstanceId(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getCode(); str2 = object.getCode(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getTcode(); object = object.getTcode(); return !((str1 == null) ? (object != null) : !str1.equals(object)); } public void setPage(Integer integer) { this.page = integer; } public int hashCode() { int i = 59; i = 1; Integer integer = getUserId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); integer = getPage(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); integer = getLength(); i = (i = i * 59 + ((integer == null) ? 43 : integer.hashCode())) * 59 + Arrays.deepHashCode((Object[])getRole()); String str = getType(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getStatus(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getCreatorName(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getInstanceId(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getCode(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getTcode(); return i = i * 59 + ((str == null) ? 43 : str.hashCode()); } public void setCreatorName(String str) { this.creatorName = str; } public String toString() { return (new StringBuilder()).insert(0, TbUser.ALLATORIxDEMO("FZtMvWA^fTWFE^rZSPgR=JfZgvq\002")).append(getUserId()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\006C\030II")).append(Arrays.deepToString((Object[])getRole())).append(TbUser.ALLATORIxDEMO("\0235OtXp\002")).append(getPage()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\030I\032K\000DI")).append(getLength()).append(TbUser.ALLATORIxDEMO("\0235KlOp\002")).append(getType()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\007X\025X\001_I")).append(getStatus()).append(TbUser.ALLATORIxDEMO("9\037vMp^aPgqtRp\002")).append(getCreatorName()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\035B\007X\025B\027I=HI")).append(getInstanceId()).append(TbUser.ALLATORIxDEMO("\0235\\z[p\002")).append(getCode()).append(SearchProcessUsersForm.ALLATORIxDEMO("\000TX\027C\020II")).append(getTcode()).append(TbUser.ALLATORIxDEMO("\026")).toString(); } public void setType(String str) { this.type = str; } public void setStatus(String str) { this.status = str; } protected boolean canEqual(Object object) { return object instanceof com.example.emos.workflow.controller.form.SearchTaskByPageForm; } public void setUserId(Integer integer) { this.userId = integer; } public void setLength(Integer integer) { this.length = integer; } public void setRole(String[] arrayOfString) { this.role = arrayOfString; } public void setTcode(String str) { this.tcode = str; }
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
/*     */   public String getStatus() {
/* 227 */     return this.status;
/*     */   }
/*     */   
/*     */   public String getType() {
/*     */     return this.type;
/*     */   }
/*     */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\controller\form\SearchTaskByPageForm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */