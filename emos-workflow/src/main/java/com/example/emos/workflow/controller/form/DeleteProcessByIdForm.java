/*     */ package BOOT-INF.classes.com.example.emos.workflow.controller.form;
/*     */ public class DeleteProcessByIdForm { private String uuid; @NotBlank(message = "reason不能为空")
/*     */   private String reason; @NotBlank(message = "tcode不能为空")
/*     */   @Pattern(regexp = "^[0-9]{6}$", message = "tcode必须是6位数字")
/*     */   private String tcode;
/*   6 */   public void setCode(String str) { this.code = str; } @NotBlank(message = "type不能为空") private String type; @NotBlank(message = "code不能为空") private String code; @NotBlank(message = "instanceId不能为空") private String instanceId; public void setType(String str) { this.type = str; } public void setInstanceId(String str) { this.instanceId = str; } public boolean equals(Object object) { if (object == this) return true;  if (!(object instanceof com.example.emos.workflow.controller.form.DeleteProcessByIdForm)) return false;  if (!(object = object).canEqual(this)) return false;  String str1 = getInstanceId(), str2 = object.getInstanceId(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getType(); str2 = object.getType(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getReason(); str2 = object.getReason(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getCode(); str2 = object.getCode(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getUuid(); str2 = object.getUuid(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getTcode(); object = object.getTcode(); return !((str1 == null) ? (object != null) : !str1.equals(object)); } public String toString() { return (new StringBuilder()).insert(0, TbUser.ALLATORIxDEMO("{pSpKpogPvZfLWF\\[SPgR=V{La^{\\pvq\002")).append(getInstanceId()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\000U\004II")).append(getType()).append(TbUser.ALLATORIxDEMO("\0235Mp^fP{\002")).append(getReason()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\027C\020II")).append(getCode()).append(TbUser.ALLATORIxDEMO("\0235J`Vq\002")).append(getUuid()).append(SearchProcessUsersForm.ALLATORIxDEMO("\000TX\027C\020II")).append(getTcode()).append(TbUser.ALLATORIxDEMO("\026")).toString(); } public int hashCode() { int i = 59; i = 1; String str = getInstanceId(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getType(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getReason(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getCode(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getUuid(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getTcode(); return i = i * 59 + ((str == null) ? 43 : str.hashCode()); } public void setUuid(String str) { this.uuid = str; } public void setTcode(String str) { this.tcode = str; } public void setReason(String str) { this.reason = str; } protected boolean canEqual(Object object) { return object instanceof com.example.emos.workflow.controller.form.DeleteProcessByIdForm; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  40 */     return this.instanceId;
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
/*     */   public String getUuid() {
/*  99 */     return this.uuid;
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
/*     */   public String getReason() {
/* 142 */     return this.reason;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCode() {
/* 147 */     return this.code;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getType() {
/* 152 */     return this.type;
/*     */   }
/*     */   
/*     */   public String getTcode() {
/*     */     return this.tcode;
/*     */   }
/*     */   
/*     */   public static String ALLATORIxDEMO(String a) {
/*     */     // Byte code:
/*     */     //   0: iconst_2
/*     */     //   1: iconst_5
/*     */     //   2: ixor
/*     */     //   3: iconst_4
/*     */     //   4: ishl
/*     */     //   5: iconst_1
/*     */     //   6: ixor
/*     */     //   7: iconst_4
/*     */     //   8: iconst_3
/*     */     //   9: ishl
/*     */     //   10: iconst_5
/*     */     //   11: ixor
/*     */     //   12: iconst_3
/*     */     //   13: iconst_5
/*     */     //   14: ixor
/*     */     //   15: iconst_4
/*     */     //   16: ishl
/*     */     //   17: iconst_3
/*     */     //   18: iconst_1
/*     */     //   19: ishl
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
/*     */   } }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\controller\form\DeleteProcessByIdForm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */