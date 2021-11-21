/*     */ package BOOT-INF.classes.com.example.emos.workflow.db.pojo;
/*     */ 
/*     */ public class TbMeeting implements Serializable {
/*     */   private String date;
/*     */   private String place;
/*     */   private Date createTime;
/*     */   private String title;
/*     */   
/*     */   public String getMembers() {
/*  10 */     return this.members;
/*     */   }
/*     */   private String start; private Short status; private Long id; private String uuid; private String present; private Short type; private String unpresent; private static final long serialVersionUID = 1L;
/*     */   private String desc;
/*     */   private String end;
/*     */   private Long creatorId;
/*     */   private String members;
/*     */   private String instanceId;
/*     */   
/*     */   public String getPresent() {
/*  20 */     return this.present;
/*     */   }
/*     */   
/*     */   public String getUnpresent() {
/*  24 */     return this.unpresent;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getCreateTime() {
/*  33 */     return this.createTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Long getId() {
/*  40 */     return this.id;
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
/*     */   public String getStart() {
/*  64 */     return this.start;
/*  65 */   } public String getUuid() { return this.uuid; }
/*  66 */   public void setId(Long long_) { this.id = long_; } public void setCreateTime(Date date) { this.createTime = date; } public void setDate(String str) { this.date = str; } public void setPresent(String str) { this.present = str; } public void setMembers(String str) { this.members = str; } public void setTitle(String str) { this.title = str; } public void setInstanceId(String str) { this.instanceId = str; } public String toString() { return (new StringBuilder()).insert(0, TbLeave.ALLATORIxDEMO("8@!G\tV\005L\013\n\005FQ")).append(getId()).append(EmosWorkflowApplication.ALLATORIxDEMO("gz>/\">v")).append(getUuid()).append(TbLeave.ALLATORIxDEMO("\016LV\005V\000GQ")).append(getTitle()).append(EmosWorkflowApplication.ALLATORIxDEMO("vk99?*.$(\002>v")).append(getCreatorId()).append(TbLeave.ALLATORIxDEMO("@\002\bC\030GQ")).append(getDate()).append(EmosWorkflowApplication.ALLATORIxDEMO("vk*';(?v")).append(getPlace()).append(TbLeave.ALLATORIxDEMO("\016LQ\030C\036VQ")).append(getStart()).append(EmosWorkflowApplication.ALLATORIxDEMO("vk?%>v")).append(getEnd()).append(TbLeave.ALLATORIxDEMO("@\002\030[\034GQ")).append(getType()).append(EmosWorkflowApplication.ALLATORIxDEMO("vk7.7)?9)v")).append(getMembers()).append(TbLeave.ALLATORIxDEMO("@\002\bG\037AQ")).append(getDesc()).append(EmosWorkflowApplication.ALLATORIxDEMO("gz\"48.*4(?\002>v")).append(getInstanceId()).append(TbLeave.ALLATORIxDEMO("\016LR\036G\037G\002VQ")).append(getPresent()).append(EmosWorkflowApplication.ALLATORIxDEMO("vk/%*9?8?%.v")).append(getUnpresent()).append(TbLeave.ALLATORIxDEMO("@\002\037V\rV\031QQ")).append(getStatus()).append(EmosWorkflowApplication.ALLATORIxDEMO("gz((.;??\0373&?v")).append(getCreateTime()).append(TbLeave.ALLATORIxDEMO("E")).toString(); } public int hashCode() { int i = 59; i = 1; Long long_ = getId(); i = i * 59 + ((long_ == null) ? 43 : long_.hashCode()); long_ = getCreatorId(); i = i * 59 + ((long_ == null) ? 43 : long_.hashCode()); Short short_ = getType(); i = i * 59 + ((short_ == null) ? 43 : short_.hashCode()); short_ = getStatus(); i = i * 59 + ((short_ == null) ? 43 : short_.hashCode()); String str = getUuid(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getTitle(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getDate(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getPlace(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getStart(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getEnd(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getMembers(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getDesc(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getInstanceId(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getPresent(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getUnpresent(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); Date date = getCreateTime(); return i = i * 59 + ((date == null) ? 43 : date.hashCode()); } public void setUnpresent(String str) { this.unpresent = str; } protected boolean canEqual(Object object) { return object instanceof com.example.emos.workflow.db.pojo.TbMeeting; } public void setCreatorId(Long long_) { this.creatorId = long_; } public boolean equals(Object object) { if (object == this) return true;  if (!(object instanceof com.example.emos.workflow.db.pojo.TbMeeting)) return false;  if (!(object = object).canEqual(this)) return false;  Long long_1 = getId(), long_2 = object.getId(); if ((long_1 == null) ? (long_2 != null) : !long_1.equals(long_2)) return false;  long_1 = getCreatorId(); long_2 = object.getCreatorId(); if ((long_1 == null) ? (long_2 != null) : !long_1.equals(long_2)) return false;  Short short_1 = getType(), short_2 = object.getType(); if ((short_1 == null) ? (short_2 != null) : !short_1.equals(short_2)) return false;  short_1 = getStatus(); short_2 = object.getStatus(); if ((short_1 == null) ? (short_2 != null) : !short_1.equals(short_2)) return false;  String str1 = getUuid(), str2 = object.getUuid(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getTitle(); str2 = object.getTitle(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getDate(); str2 = object.getDate(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getPlace(); str2 = object.getPlace(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getStart(); str2 = object.getStart(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getEnd(); str2 = object.getEnd(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getMembers(); str2 = object.getMembers(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getDesc(); str2 = object.getDesc(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getInstanceId(); str2 = object.getInstanceId(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getPresent(); str2 = object.getPresent(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getUnpresent(); str2 = object.getUnpresent(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  Date date = getCreateTime(); object = object.getCreateTime(); return !((date == null) ? (object != null) : !date.equals(object)); } public void setUuid(String str) { this.uuid = str; } public void setEnd(String str) { this.end = str; } public void setType(Short short_) { this.type = short_; } public void setStatus(Short short_) { this.status = short_; } public void setPlace(String str) { this.place = str; } public void setDesc(String str) { this.desc = str; } public void setStart(String str) { this.start = str; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 101 */     return this.instanceId;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPlace() {
/* 106 */     return this.place;
/*     */   }
/*     */ 
/*     */   
/*     */   public Short getType() {
/* 111 */     return this.type;
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
/*     */   public String getDesc() {
/* 194 */     return this.desc;
/*     */   }
/*     */   
/*     */   public String getDate() {
/* 198 */     return this.date;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Short getStatus() {
/* 206 */     return this.status;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getEnd() {
/* 211 */     return this.end;
/*     */   } public String getTitle() {
/* 213 */     return this.title;
/*     */   }
/*     */   
/*     */   public Long getCreatorId() {
/*     */     return this.creatorId;
/*     */   }
/*     */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\db\pojo\TbMeeting.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */