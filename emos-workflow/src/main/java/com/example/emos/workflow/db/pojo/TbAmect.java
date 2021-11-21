/*     */ package BOOT-INF.classes.com.example.emos.workflow.db.pojo;
/*     */ 
/*     */ import com.example.emos.workflow.controller.form.DeleteProcessByIdForm;
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
/*     */ 
/*     */ 
/*     */ public class TbAmect
/*     */ {
/*     */   private String reason;
/*     */   private BigDecimal amount;
/*     */   private String uuid;
/*     */   private Date createTime;
/*     */   private Integer userId;
/*     */   private Integer id;
/*     */   private Byte status;
/*     */   private Integer typeId;
/*     */   private String prepayId;
/*     */   
/*     */   public Integer getTypeId() {
/*  37 */     return this.typeId;
/*     */   }
/*     */   public Integer getUserId() {
/*  40 */     return this.userId;
/*     */   }
/*     */   public String getUuid() {
/*  43 */     return this.uuid;
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
/*     */   public String getReason() {
/* 152 */     return this.reason;
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
/*     */   public String getPrepayId() {
/* 187 */     return this.prepayId;
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
/*     */   public int hashCode() {
/* 212 */     int i = 59; i = 1; Integer integer = getId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); integer = getUserId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); integer = getTypeId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); Byte byte_ = getStatus(); i = i * 59 + ((byte_ == null) ? 43 : byte_.hashCode()); String str2 = getUuid(); i = i * 59 + ((str2 == null) ? 43 : str2.hashCode()); BigDecimal bigDecimal = getAmount(); i = i * 59 + ((bigDecimal == null) ? 43 : bigDecimal.hashCode()); String str1 = getReason(); i = i * 59 + ((str1 == null) ? 43 : str1.hashCode()); str1 = getPrepayId(); i = i * 59 + ((str1 == null) ? 43 : str1.hashCode()); Date date = getCreateTime(); return i = i * 59 + ((date == null) ? 43 : date.hashCode()); } public void setReason(String str) { this.reason = str; } public void setId(Integer integer) { this.id = integer; } public void setCreateTime(Date date) { this.createTime = date; } protected boolean canEqual(Object object) { return object instanceof com.example.emos.workflow.db.pojo.TbAmect; } public void setUserId(Integer integer) { this.userId = integer; } public void setStatus(Byte byte_) { this.status = byte_; } public String toString() { return (new StringBuilder()).insert(0, DeleteProcessByIdForm.ALLATORIxDEMO("%\0040\013\024\005\005N\030\002L")).append(getId()).append(ALLATORIxDEMO("\026/OzSk\007")).append(getUuid()).append(DeleteProcessByIdForm.ALLATORIxDEMO("]F\004\025\024\0248\002L")).append(getUserId()).append(ALLATORIxDEMO("\026/[bUzT{\007")).append(getAmount()).append(DeleteProcessByIdForm.ALLATORIxDEMO("]F\005\037\001\0038\002L")).append(getTypeId()).append(ALLATORIxDEMO("\026/Hj[|Ua\007")).append(getReason()).append(DeleteProcessByIdForm.ALLATORIxDEMO("]F\001\024\024\026\020\0378\002L")).append(getPrepayId()).append(ALLATORIxDEMO("\026/I{[{O|\007")).append(getStatus()).append(DeleteProcessByIdForm.ALLATORIxDEMO("]F\022\024\024\007\005\003%\017\034\003L")).append(getCreateTime()).append(ALLATORIxDEMO("\023")).toString(); } public void setTypeId(Integer integer) { this.typeId = integer; } public void setAmount(BigDecimal bigDecimal) { this.amount = bigDecimal; } public boolean equals(Object object) { if (object == this) return true;  if (!(object instanceof com.example.emos.workflow.db.pojo.TbAmect)) return false;  if (!(object = object).canEqual(this)) return false;  Integer integer1 = getId(), integer2 = object.getId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  integer1 = getUserId(); integer2 = object.getUserId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  integer1 = getTypeId(); integer2 = object.getTypeId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  Byte byte_1 = getStatus(), byte_2 = object.getStatus(); if ((byte_1 == null) ? (byte_2 != null) : !byte_1.equals(byte_2)) return false;  String str2 = getUuid(), str4 = object.getUuid(); if ((str2 == null) ? (str4 != null) : !str2.equals(str4)) return false;  BigDecimal bigDecimal1 = getAmount(), bigDecimal2 = object.getAmount(); if ((bigDecimal1 == null) ? (bigDecimal2 != null) : !bigDecimal1.equals(bigDecimal2)) return false;  String str1 = getReason(), str3 = object.getReason(); if ((str1 == null) ? (str3 != null) : !str1.equals(str3)) return false;  str1 = getPrepayId(); str3 = object.getPrepayId(); if ((str1 == null) ? (str3 != null) : !str1.equals(str3)) return false;  Date date = getCreateTime(); object = object.getCreateTime(); return !((date == null) ? (object != null) : !date.equals(object)); } public void setUuid(String str) { this.uuid = str; } public void setPrepayId(String str) { this.prepayId = str; }
/*     */ 
/*     */   
/*     */   public static String ALLATORIxDEMO(String a) {
/*     */     // Byte code:
/*     */     //   0: iconst_2
/*     */     //   1: iconst_5
/*     */     //   2: ixor
/*     */     //   3: iconst_3
/*     */     //   4: ishl
/*     */     //   5: iconst_2
/*     */     //   6: ixor
/*     */     //   7: iconst_2
/*     */     //   8: iconst_5
/*     */     //   9: ixor
/*     */     //   10: iconst_4
/*     */     //   11: ishl
/*     */     //   12: iconst_1
/*     */     //   13: ixor
/*     */     //   14: iconst_1
/*     */     //   15: iconst_3
/*     */     //   16: ishl
/*     */     //   17: iconst_2
/*     */     //   18: iconst_5
/*     */     //   19: ixor
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


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\db\pojo\TbAmect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */