/*   1 */ package BOOT-INF.classes.com.example.emos.workflow.controller.form;public class StartMeetingProcessForm { @NotBlank(message = "title不能为空") @Pattern(regexp = "^[a-zA-Z0-9\\u4e00-\\u9fa5]{2,30}$", message = "title内容不正确") private String title; @NotBlank(message = "uuid不能为空") private String uuid; @NotBlank(message = "url不能为空") private String url; public String getTcode() { return this.tcode; } @NotNull(message = "date不能为空") @Pattern(regexp = "^((((1[6-9]|[2-9]\\d)\\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-))$", message = "date内容不正确") private String date; private Boolean sameDept; @NotBlank(message = "creatorName不能为空") @Pattern(regexp = "^[\\u4e00-\\u9fa5]{2,15}$", message = "creatorName内容不正确") private String creatorName; @NotNull(message = "creatorId不能为空") @Min(value = 1L, message = "creatorId不能小于1") private Integer creatorId; @Min(value = 1L, message = "managerId不能小于1") private Integer managerId; @Min(value = 1L, message = "gmId不能小于1") private Integer gmId; @NotBlank(message = "meetingType不能为空")
/*     */   @Pattern(regexp = "^线上会议$|^线下会议$", message = "meetingType内容不正确")
/*     */   private String meetingType; @NotBlank(message = "code不能为空")
/*     */   private String code; @NotNull(message = "start不能为空")
/*     */   @Pattern(regexp = "^([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$", message = "start内容不正确")
/*     */   private String start; @NotBlank(message = "tcode不能为空")
/*     */   @Pattern(regexp = "^[0-9]{6}$", message = "tcode必须是6位数字")
/*   8 */   private String tcode; public Integer getGmId() { return this.gmId; }
/*     */   
/*     */   public String getTitle() {
/*  11 */     return this.title;
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
/*  50 */     return this.code;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCode(String str)
/*     */   {
/*  60 */     this.code = str; } public void setGmId(Integer integer) { this.gmId = integer; } public void setTitle(String str) { this.title = str; } public void setSameDept(Boolean bool) { this.sameDept = bool; } public void setUuid(String str) { this.uuid = str; } public boolean equals(Object object) { if (object == this) return true;  if (!(object instanceof com.example.emos.workflow.controller.form.StartMeetingProcessForm)) return false;  if (!(object = object).canEqual(this)) return false;  Integer integer1 = getCreatorId(), integer2 = object.getCreatorId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  integer1 = getGmId(); integer2 = object.getGmId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  integer1 = getManagerId(); integer2 = object.getManagerId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  Boolean bool1 = getSameDept(), bool2 = object.getSameDept(); if ((bool1 == null) ? (bool2 != null) : !bool1.equals(bool2)) return false;  String str1 = getUuid(), str2 = object.getUuid(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getCreatorName(); str2 = object.getCreatorName(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getTitle(); str2 = object.getTitle(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getUrl(); str2 = object.getUrl(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getCode(); str2 = object.getCode(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getDate(); str2 = object.getDate(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getStart(); str2 = object.getStart(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getMeetingType(); str2 = object.getMeetingType(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getTcode(); object = object.getTcode(); return !((str1 == null) ? (object != null) : !str1.equals(object)); } public void setDate(String str) { this.date = str; } public void setUrl(String str) { this.url = str; } public void setCreatorId(Integer integer) { this.creatorId = integer; } protected boolean canEqual(Object object) { return object instanceof com.example.emos.workflow.controller.form.StartMeetingProcessForm; } public void setManagerId(Integer integer) { this.managerId = integer; } public void setCreatorName(String str) { this.creatorName = str; } public void setMeetingType(String str) { this.meetingType = str; } public int hashCode() { int i = 59; i = 1; Integer integer = getCreatorId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); integer = getGmId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); integer = getManagerId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); Boolean bool = getSameDept(); i = i * 59 + ((bool == null) ? 43 : bool.hashCode()); String str = getUuid(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getCreatorName(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getTitle(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getUrl(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getCode(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getDate(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getStart(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getMeetingType(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getTcode(); return i = i * 59 + ((str == null) ? 43 : str.hashCode()); } public String toString() { return (new StringBuilder()).insert(0, TbAmect.ALLATORIxDEMO("i{[}NB_jNfThj}Ul_|IIU}W'OzSk\007")).append(getUuid()).append(SearchProcessUsersForm.ALLATORIxDEMO("\000TO\006I\025X\033^=HI")).append(getCreatorId()).append(TbAmect.ALLATORIxDEMO("#\032lHj[{U}tnWj\007")).append(getCreatorName()).append(SearchProcessUsersForm.ALLATORIxDEMO("\000TX\035X\030II")).append(getTitle()).append(TbAmect.ALLATORIxDEMO("\026/]bsk\007")).append(getGmId()).append(SearchProcessUsersForm.ALLATORIxDEMO("\000TA\025B\025K\021^=HI")).append(getManagerId()).append(TbAmect.ALLATORIxDEMO("#\032zHc\007")).append(getUrl()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\007M\031I0I\004XI")).append(getSameDept()).append(TbAmect.ALLATORIxDEMO("\026/Y`^j\007")).append(getCode()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\020M\000II")).append(getDate()).append(TbAmect.ALLATORIxDEMO("#\032|NnH{\007")).append(getStart()).append(SearchProcessUsersForm.ALLATORIxDEMO("\000TA\021I\000E\032K U\004II")).append(getMeetingType()).append(TbAmect.ALLATORIxDEMO("#\032{Y`^j\007")).append(getTcode()).append(SearchProcessUsersForm.ALLATORIxDEMO("]")).toString(); } public void setStart(String str) { this.start = str; } public void setTcode(String str) { this.tcode = str; }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCreatorId() {
/*  65 */     return this.creatorId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUrl() {
/*  71 */     return this.url;
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
/*     */   public String getMeetingType() {
/*  84 */     return this.meetingType;
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
/*     */   public Boolean getSameDept() {
/*  98 */     return this.sameDept;
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
/*     */   public String getUuid() {
/* 128 */     return this.uuid;
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
/*     */   public String getCreatorName() {
/* 147 */     return this.creatorName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDate() {
/* 158 */     return this.date;
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
/*     */   public String getStart() {
/* 211 */     return this.start;
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
/*     */   public Integer getManagerId() {
/* 227 */     return this.managerId;
/*     */   } }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\controller\form\StartMeetingProcessForm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */