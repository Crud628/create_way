/*     */ package BOOT-INF.classes.com.example.emos.workflow.controller.form;
/*     */ 
/*     */ import com.example.emos.workflow.EmosWorkflowApplication;
/*     */ import com.example.emos.workflow.db.pojo.TbUser;
/*     */ import javax.validation.constraints.NotBlank;
/*     */ import javax.validation.constraints.Pattern;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SearchProcessUsersForm
/*     */ {
/*     */   @NotBlank(message = "instanceId不能为空")
/*     */   private String instanceId;
/*     */   @NotBlank(message = "code不能为空")
/*     */   private String code;
/*     */   @NotBlank(message = "tcode不能为空")
/*     */   @Pattern(regexp = "^[0-9]{6}$", message = "tcode必须是6位数字")
/*     */   private String tcode;
/*     */   
/*     */   public String getCode() {
/*  37 */     return this.code;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getInstanceId() {
/*  43 */     return this.instanceId;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 142 */     return this.tcode;
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
/*     */   public String toString() {
/* 212 */     return (new StringBuilder()).insert(0, EmosWorkflowApplication.ALLATORIxDEMO("\t.;99#\n95(?8)\036).(8\034$(&r\"48.*4(?\002>v")).append(getInstanceId()).append(TbUser.ALLATORIxDEMO("\0235\\z[p\002")).append(getCode()).append(EmosWorkflowApplication.ALLATORIxDEMO("vk.(5/?v")).append(getTcode()).append(TbUser.ALLATORIxDEMO("\026")).toString(); } protected boolean canEqual(Object object) { return object instanceof com.example.emos.workflow.controller.form.SearchProcessUsersForm; } public void setTcode(String str) { this.tcode = str; } public int hashCode() { int i = 59; i = 1; String str = getInstanceId(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getCode(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getTcode(); return i = i * 59 + ((str == null) ? 43 : str.hashCode()); } public void setInstanceId(String str) { this.instanceId = str; } public boolean equals(Object object) { if (object == this) return true;  if (!(object instanceof com.example.emos.workflow.controller.form.SearchProcessUsersForm)) return false;  if (!(object = object).canEqual(this)) return false;  String str1 = getInstanceId(), str2 = object.getInstanceId(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getCode(); str2 = object.getCode(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getTcode(); object = object.getTcode(); return !((str1 == null) ? (object != null) : !str1.equals(object)); } public void setCode(String str) { this.code = str; }
/*     */ 
/*     */   
/*     */   public static String ALLATORIxDEMO(String a) {
/*     */     // Byte code:
/*     */     //   0: iconst_2
/*     */     //   1: iconst_5
/*     */     //   2: ixor
/*     */     //   3: iconst_4
/*     */     //   4: ishl
/*     */     //   5: iconst_2
/*     */     //   6: iconst_1
/*     */     //   7: ishl
/*     */     //   8: ixor
/*     */     //   9: iconst_2
/*     */     //   10: iconst_5
/*     */     //   11: ixor
/*     */     //   12: iconst_4
/*     */     //   13: ishl
/*     */     //   14: iconst_2
/*     */     //   15: iconst_5
/*     */     //   16: ixor
/*     */     //   17: ixor
/*     */     //   18: iconst_5
/*     */     //   19: iconst_3
/*     */     //   20: ishl
/*     */     //   21: iconst_4
/*     */     //   22: ixor
/*     */     //   23: aload_0
/*     */     //   24: checkcast java/lang/String
/*     */     //   27: dup
/*     */     //   28: astore_0
/*     */     //   29: invokevirtual length : ()I
/*     */     //   32: dup
/*     */     //   33: newarray char
/*     */     //   35: iconst_1
/*     */     //   36: dup
/*     */     //   37: pop2
/*     */     //   38: swap
/*     */     //   39: iconst_1
/*     */     //   40: isub
/*     */     //   41: dup_x2
/*     */     //   42: istore_3
/*     */     //   43: astore_1
/*     */     //   44: istore #4
/*     */     //   46: dup_x2
/*     */     //   47: pop2
/*     */     //   48: istore_2
/*     */     //   49: iflt -> 89
/*     */     //   52: aload_1
/*     */     //   53: aload_0
/*     */     //   54: iload_3
/*     */     //   55: dup_x1
/*     */     //   56: invokevirtual charAt : (I)C
/*     */     //   59: iinc #3, -1
/*     */     //   62: iload_2
/*     */     //   63: ixor
/*     */     //   64: i2c
/*     */     //   65: castore
/*     */     //   66: iload_3
/*     */     //   67: iflt -> 89
/*     */     //   70: aload_1
/*     */     //   71: aload_0
/*     */     //   72: iload_3
/*     */     //   73: iinc #3, -1
/*     */     //   76: dup_x1
/*     */     //   77: invokevirtual charAt : (I)C
/*     */     //   80: iload #4
/*     */     //   82: ixor
/*     */     //   83: i2c
/*     */     //   84: castore
/*     */     //   85: iload_3
/*     */     //   86: goto -> 49
/*     */     //   89: new java/lang/String
/*     */     //   92: dup
/*     */     //   93: aload_1
/*     */     //   94: invokespecial <init> : ([C)V
/*     */     //   97: areturn
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	98	0	a	Ljava/lang/String;
/*     */   }
/*     */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\controller\form\SearchProcessUsersForm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */