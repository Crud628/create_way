/*     */ package BOOT-INF.classes.com.example.emos.workflow.db.pojo;
/*     */ 
/*     */ import com.example.emos.workflow.controller.form.DeleteProcessByIdForm;
/*     */ import com.example.emos.workflow.db.pojo.TbLeave;
/*     */ import java.math.BigDecimal;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TbReim
/*     */ {
/*     */   private Byte typeId;
/*     */   private BigDecimal anleihen;
/*     */   private Integer userId;
/*     */   private Integer id;
/*     */   private String content;
/*     */   private String instanceId;
/*     */   private BigDecimal balance;
/*     */   private BigDecimal amount;
/*     */   private Byte status;
/*     */   private Date createTime;
/*     */   
/*     */   public BigDecimal getAnleihen() {
/*  37 */     return this.anleihen;
/*     */   }
/*     */   public String getContent() {
/*  40 */     return this.content;
/*     */   }
/*     */   public Integer getUserId() {
/*  43 */     return this.userId;
/*     */   }
/*     */   public Date getCreateTime() {
/*  46 */     return this.createTime;
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
/*     */   public Integer getId() {
/*  60 */     return this.id;
/*     */   }
/*     */ 
/*     */   
/*     */   public Byte getStatus() {
/*  65 */     return this.status;
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
/*     */   public BigDecimal getAmount() {
/* 128 */     return this.amount;
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
/*     */   public String getInstanceId() {
/* 142 */     return this.instanceId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getBalance() {
/* 152 */     return this.balance;
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
/*     */   public Byte getTypeId() {
/* 187 */     return this.typeId;
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
/*     */   public void setAnleihen(BigDecimal bigDecimal) {
/* 212 */     this.anleihen = bigDecimal; } public void setInstanceId(String str) { this.instanceId = str; } public void setBalance(BigDecimal bigDecimal) { this.balance = bigDecimal; } public void setUserId(Integer integer) { this.userId = integer; } public String toString() { return (new StringBuilder()).insert(0, TbLeave.ALLATORIxDEMO("v\016p\tK\001\n\005FQ")).append(getId()).append(DeleteProcessByIdForm.ALLATORIxDEMO("]F\004\025\024\0248\002L")).append(getUserId()).append(TbLeave.ALLATORIxDEMO("\016LA\003L\030G\002VQ")).append(getContent()).append(DeleteProcessByIdForm.ALLATORIxDEMO("]F\020\013\036\023\037\022L")).append(getAmount()).append(TbLeave.ALLATORIxDEMO("@\002\rL\000G\005J\tLQ")).append(getAnleihen()).append(DeleteProcessByIdForm.ALLATORIxDEMO("JQ\004\020\n\020\b\022\003L")).append(getBalance()).append(TbLeave.ALLATORIxDEMO("@\002\030[\034G%FQ")).append(getTypeId()).append(DeleteProcessByIdForm.ALLATORIxDEMO("]F\002\022\020\022\004\025L")).append(getStatus()).append(TbLeave.ALLATORIxDEMO("@\002\005L\037V\rL\017G%FQ")).append(getInstanceId()).append(DeleteProcessByIdForm.ALLATORIxDEMO("]F\022\024\024\007\005\003%\017\034\003L")).append(getCreateTime()).append(TbLeave.ALLATORIxDEMO("E")).toString(); } protected boolean canEqual(Object object) { return object instanceof com.example.emos.workflow.db.pojo.TbReim; } public void setStatus(Byte byte_) { this.status = byte_; } public void setContent(String str) { this.content = str; } public void setId(Integer integer) { this.id = integer; } public void setTypeId(Byte byte_) { this.typeId = byte_; } public void setAmount(BigDecimal bigDecimal) { this.amount = bigDecimal; } public int hashCode() { int i = 59; i = 1; Integer integer = getId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); integer = getUserId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); Byte byte_ = getTypeId(); i = i * 59 + ((byte_ == null) ? 43 : byte_.hashCode()); byte_ = getStatus(); i = i * 59 + ((byte_ == null) ? 43 : byte_.hashCode()); String str2 = getContent(); i = i * 59 + ((str2 == null) ? 43 : str2.hashCode()); BigDecimal bigDecimal = getAmount(); i = i * 59 + ((bigDecimal == null) ? 43 : bigDecimal.hashCode()); bigDecimal = getAnleihen(); i = i * 59 + ((bigDecimal == null) ? 43 : bigDecimal.hashCode()); bigDecimal = getBalance(); i = i * 59 + ((bigDecimal == null) ? 43 : bigDecimal.hashCode()); String str1 = getInstanceId(); i = i * 59 + ((str1 == null) ? 43 : str1.hashCode()); Date date = getCreateTime(); return i = i * 59 + ((date == null) ? 43 : date.hashCode()); } public void setCreateTime(Date date) { this.createTime = date; } public boolean equals(Object object) { if (object == this) return true;  if (!(object instanceof com.example.emos.workflow.db.pojo.TbReim)) return false;  if (!(object = object).canEqual(this)) return false;  Integer integer1 = getId(), integer2 = object.getId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  integer1 = getUserId(); integer2 = object.getUserId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  Byte byte_1 = getTypeId(), byte_2 = object.getTypeId(); if ((byte_1 == null) ? (byte_2 != null) : !byte_1.equals(byte_2)) return false;  byte_1 = getStatus(); byte_2 = object.getStatus(); if ((byte_1 == null) ? (byte_2 != null) : !byte_1.equals(byte_2)) return false;  String str2 = getContent(), str4 = object.getContent(); if ((str2 == null) ? (str4 != null) : !str2.equals(str4)) return false;  BigDecimal bigDecimal1 = getAmount(), bigDecimal2 = object.getAmount(); if ((bigDecimal1 == null) ? (bigDecimal2 != null) : !bigDecimal1.equals(bigDecimal2)) return false;  bigDecimal1 = getAnleihen(); bigDecimal2 = object.getAnleihen(); if ((bigDecimal1 == null) ? (bigDecimal2 != null) : !bigDecimal1.equals(bigDecimal2)) return false;  bigDecimal1 = getBalance(); bigDecimal2 = object.getBalance(); if ((bigDecimal1 == null) ? (bigDecimal2 != null) : !bigDecimal1.equals(bigDecimal2)) return false;  String str1 = getInstanceId(), str3 = object.getInstanceId(); if ((str1 == null) ? (str3 != null) : !str1.equals(str3)) return false;  Date date = getCreateTime(); object = object.getCreateTime(); return !((date == null) ? (object != null) : !date.equals(object)); }
/*     */ 
/*     */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\db\pojo\TbReim.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */