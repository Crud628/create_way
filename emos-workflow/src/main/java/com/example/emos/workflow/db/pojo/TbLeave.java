/*     */ package BOOT-INF.classes.com.example.emos.workflow.db.pojo;
/*     */ import java.util.Date;
/*     */ 
/*     */ public class TbLeave {
/*     */   public Integer getId() {
/*   6 */     return this.id;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Byte type;
/*     */ 
/*     */   
/*     */   private String start;
/*     */ 
/*     */   
/*     */   private Byte status;
/*     */ 
/*     */   
/*     */   private String days;
/*     */ 
/*     */   
/*     */   private String instanceId;
/*     */   
/*     */   private Integer userId;
/*     */   
/*     */   private Integer id;
/*     */   
/*     */   private String reason;
/*     */   
/*     */   private String end;
/*     */   
/*     */   private Date createTime;
/*     */ 
/*     */   
/*     */   public String getDays() {
/*  37 */     return this.days;
/*     */   }
/*     */   public String getStart() {
/*  40 */     return this.start;
/*     */   }
/*     */   public String getReason() {
/*  43 */     return this.reason;
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
/*     */   public Integer getUserId() {
/*  60 */     return this.userId;
/*     */   }
/*     */   
/*     */   public String getInstanceId()
/*     */   {
/*  65 */     return this.instanceId;
/*  66 */   } public void setType(Byte byte_) { this.type = byte_; } public void setId(Integer integer) { this.id = integer; } public void setInstanceId(String str) { this.instanceId = str; } public void setEnd(String str) { this.end = str; } public void setCreateTime(Date date) { this.createTime = date; } public void setDays(String str) { this.days = str; } public boolean equals(Object object) { if (object == this) return true;  if (!(object instanceof com.example.emos.workflow.db.pojo.TbLeave)) return false;  if (!(object = object).canEqual(this)) return false;  Integer integer1 = getId(), integer2 = object.getId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  integer1 = getUserId(); integer2 = object.getUserId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  Byte byte_1 = getType(), byte_2 = object.getType(); if ((byte_1 == null) ? (byte_2 != null) : !byte_1.equals(byte_2)) return false;  byte_1 = getStatus(); byte_2 = object.getStatus(); if ((byte_1 == null) ? (byte_2 != null) : !byte_1.equals(byte_2)) return false;  String str1 = getReason(), str2 = object.getReason(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getStart(); str2 = object.getStart(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getEnd(); str2 = object.getEnd(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getDays(); str2 = object.getDays(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getInstanceId(); str2 = object.getInstanceId(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  Date date = getCreateTime(); object = object.getCreateTime(); return !((date == null) ? (object != null) : !date.equals(object)); } public int hashCode() { int i = 59; i = 1; Integer integer = getId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); integer = getUserId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); Byte byte_ = getType(); i = i * 59 + ((byte_ == null) ? 43 : byte_.hashCode()); byte_ = getStatus(); i = i * 59 + ((byte_ == null) ? 43 : byte_.hashCode()); String str = getReason(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getStart(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getEnd(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getDays(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getInstanceId(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); Date date = getCreateTime(); return i = i * 59 + ((date == null) ? 43 : date.hashCode()); } public void setReason(String str) { this.reason = str; } public void setStart(String str) { this.start = str; } public String toString() { return (new StringBuilder()).insert(0, TbUser.ALLATORIxDEMO("kwsp^cZ=Vq\002")).append(getId()).append(ALLATORIxDEMO("@\002\031Q\tP%FQ")).append(getUserId()).append(TbUser.ALLATORIxDEMO("\0235Mp^fP{\002")).append(getReason()).append(ALLATORIxDEMO("\016LQ\030C\036VQ")).append(getStart()).append(TbUser.ALLATORIxDEMO("9\037pQq\002")).append(getEnd()).append(ALLATORIxDEMO("@\002\bC\025QQ")).append(getDays()).append(TbUser.ALLATORIxDEMO("\0235KlOp\002")).append(getType()).append(ALLATORIxDEMO("@\002\037V\rV\031QQ")).append(getStatus()).append(TbUser.ALLATORIxDEMO("\0235V{La^{\\pvq\002")).append(getInstanceId()).append(ALLATORIxDEMO("@\002\017P\tC\030G8K\001GQ")).append(getCreateTime()).append(TbUser.ALLATORIxDEMO("\026")).toString(); } public void setUserId(Integer integer) { this.userId = integer; } public void setStatus(Byte byte_) { this.status = byte_; } protected boolean canEqual(Object object) { return object instanceof com.example.emos.workflow.db.pojo.TbLeave; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getEnd() {
/* 128 */     return this.end;
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
/*     */   public Date getCreateTime() {
/* 142 */     return this.createTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Byte getType() {
/* 152 */     return this.type;
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
/*     */   public Byte getStatus() {
/* 187 */     return this.status;
/*     */   }
/*     */   
/*     */   public static String ALLATORIxDEMO(String a) {
/*     */     // Byte code:
/*     */     //   0: iconst_3
/*     */     //   1: iconst_5
/*     */     //   2: ixor
/*     */     //   3: iconst_4
/*     */     //   4: ishl
/*     */     //   5: iconst_3
/*     */     //   6: iconst_5
/*     */     //   7: ixor
/*     */     //   8: iconst_1
/*     */     //   9: ishl
/*     */     //   10: ixor
/*     */     //   11: iconst_4
/*     */     //   12: iconst_3
/*     */     //   13: ishl
/*     */     //   14: iconst_4
/*     */     //   15: ixor
/*     */     //   16: iconst_4
/*     */     //   17: iconst_3
/*     */     //   18: ishl
/*     */     //   19: iconst_2
/*     */     //   20: ixor
/*     */     //   21: aload_0
/*     */     //   22: checkcast java/lang/String
/*     */     //   25: dup
/*     */     //   26: astore_0
/*     */     //   27: invokevirtual length : ()I
/*     */     //   30: dup
/*     */     //   31: newarray char
/*     */     //   33: iconst_1
/*     */     //   34: dup
/*     */     //   35: pop2
/*     */     //   36: swap
/*     */     //   37: iconst_1
/*     */     //   38: isub
/*     */     //   39: dup_x2
/*     */     //   40: istore_3
/*     */     //   41: astore_1
/*     */     //   42: istore #4
/*     */     //   44: dup_x2
/*     */     //   45: pop2
/*     */     //   46: istore_2
/*     */     //   47: iflt -> 87
/*     */     //   50: aload_1
/*     */     //   51: aload_0
/*     */     //   52: iload_3
/*     */     //   53: dup_x1
/*     */     //   54: invokevirtual charAt : (I)C
/*     */     //   57: iinc #3, -1
/*     */     //   60: iload_2
/*     */     //   61: ixor
/*     */     //   62: i2c
/*     */     //   63: castore
/*     */     //   64: iload_3
/*     */     //   65: iflt -> 87
/*     */     //   68: aload_1
/*     */     //   69: aload_0
/*     */     //   70: iload_3
/*     */     //   71: iinc #3, -1
/*     */     //   74: dup_x1
/*     */     //   75: invokevirtual charAt : (I)C
/*     */     //   78: iload #4
/*     */     //   80: ixor
/*     */     //   81: i2c
/*     */     //   82: castore
/*     */     //   83: iload_3
/*     */     //   84: goto -> 47
/*     */     //   87: new java/lang/String
/*     */     //   90: dup
/*     */     //   91: aload_1
/*     */     //   92: invokespecial <init> : ([C)V
/*     */     //   95: areturn
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	96	0	a	Ljava/lang/String;
/*     */   }
/*     */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\db\pojo\TbLeave.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */