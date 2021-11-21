/*     */ package BOOT-INF.classes.com.example.emos.workflow.db.pojo;
/*     */ 
/*     */ import com.example.emos.workflow.controller.form.SearchProcessUsersForm;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ public class TbUser
/*     */   implements Serializable
/*     */ {
/*     */   private String tel;
/*     */   private Date createTime;
/*     */   private String name;
/*     */   private String photo;
/*     */   private Object role;
/*     */   private Integer deptId;
/*     */   private String password;
/*     */   private Date hiredate;
/*     */   
/*     */   public Object getRole() {
/*  20 */     return this.role;
/*     */   }
/*     */   private String openId; private String nickname; private static final long serialVersionUID = 1L; private Object sex; private Byte status; private Integer id; private Boolean root;
/*     */   private String username;
/*     */   private String email;
/*     */   
/*     */   public String getOpenId() {
/*  27 */     return this.openId;
/*     */   }
/*     */   public String getEmail() {
/*  30 */     return this.email;
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
/*     */   public String getPhoto() {
/*  50 */     return this.photo;
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
/*     */   public String getPassword() {
/*  63 */     return this.password;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNickname() {
/*  71 */     return this.nickname;
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
/*     */   public Integer getDeptId() {
/*  87 */     return this.deptId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getCreateTime() {
/*  94 */     return this.createTime;
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
/*     */   public Integer getId() {
/* 128 */     return this.id;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean getRoot() {
/* 138 */     return this.root;
/*     */   }
/*     */   
/*     */   public String getUsername() {
/* 142 */     return this.username;
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
/*     */   public Object getSex() {
/* 163 */     return this.sex;
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
/*     */   public String getTel() {
/* 193 */     return this.tel;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Byte getStatus() {
/* 200 */     return this.status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRoot(Boolean bool)
/*     */   {
/* 212 */     this.root = bool; } public void setSex(Object object) { this.sex = object; } public void setEmail(String str) { this.email = str; } public void setTel(String str) { this.tel = str; } public void setUsername(String str) { this.username = str; } public void setHiredate(Date date) { this.hiredate = date; } public void setName(String str) { this.name = str; } public void setPassword(String str) { this.password = str; } public void setPhoto(String str) { this.photo = str; } public void setStatus(Byte byte_) { this.status = byte_; } public void setId(Integer integer) { this.id = integer; } public void setRole(Object object) { this.role = object; } public void setNickname(String str) { this.nickname = str; } public String toString() { return (new StringBuilder()).insert(0, SearchProcessUsersForm.ALLATORIxDEMO("x\026y\007I\006\004\035HI")).append(getId()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\001_\021^\032M\031II")).append(getUsername()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\004M\007_\003C\006HI")).append(getPassword()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\033\\\021B=HI")).append(getOpenId()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\032E\027G\032M\031II")).append(getNickname()).append(SearchProcessUsersForm.ALLATORIxDEMO("\000T\\\034C\000CI")).append(getPhoto()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\032M\031II")).append(getName()).append(SearchProcessUsersForm.ALLATORIxDEMO("\000T_\021TI")).append(getSex()).append(SearchProcessUsersForm.ALLATORIxDEMO("\000TX\021@I")).append(getTel()).append(SearchProcessUsersForm.ALLATORIxDEMO("\000TI\031M\035@I")).append(getEmail()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\034E\006I\020M\000II")).append(getHiredate()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\006C\030II")).append(getRole()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\006C\033XI")).append(getRoot()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\020I\004X=HI")).append(getDeptId()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\007X\025X\001_I")).append(getStatus()).append(SearchProcessUsersForm.ALLATORIxDEMO("X\f\027^\021M\000I E\031II")).append(getCreateTime()).append(SearchProcessUsersForm.ALLATORIxDEMO("]")).toString(); } public void setCreateTime(Date date) { this.createTime = date; } public boolean equals(Object object) { if (object == this) return true;  if (!(object instanceof com.example.emos.workflow.db.pojo.TbUser)) return false;  if (!(object = object).canEqual(this)) return false;  Integer integer2 = getId(), integer4 = object.getId(); if ((integer2 == null) ? (integer4 != null) : !integer2.equals(integer4)) return false;  Boolean bool1 = getRoot(), bool2 = object.getRoot(); if ((bool1 == null) ? (bool2 != null) : !bool1.equals(bool2)) return false;  Integer integer1 = getDeptId(), integer3 = object.getDeptId(); if ((integer1 == null) ? (integer3 != null) : !integer1.equals(integer3)) return false;  Byte byte_1 = getStatus(), byte_2 = object.getStatus(); if ((byte_1 == null) ? (byte_2 != null) : !byte_1.equals(byte_2)) return false;  String str1 = getUsername(), str2 = object.getUsername(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getPassword(); str2 = object.getPassword(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getOpenId(); str2 = object.getOpenId(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getNickname(); str2 = object.getNickname(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getPhoto(); str2 = object.getPhoto(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  str1 = getName(); str2 = object.getName(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  Object object1 = getSex(), object2 = object.getSex(); if ((object1 == null) ? (object2 != null) : !object1.equals(object2)) return false;  object1 = getTel(); object2 = object.getTel(); if ((object1 == null) ? (object2 != null) : !object1.equals(object2)) return false;  object1 = getEmail(); object2 = object.getEmail(); if ((object1 == null) ? (object2 != null) : !object1.equals(object2)) return false;  object1 = getHiredate(); object2 = object.getHiredate(); if ((object1 == null) ? (object2 != null) : !object1.equals(object2)) return false;  object1 = getRole(); object2 = object.getRole(); if ((object1 == null) ? (object2 != null) : !object1.equals(object2)) return false;  object1 = getCreateTime(); object = object.getCreateTime(); return !((object1 == null) ? (object != null) : !object1.equals(object)); } public int hashCode() { int i = 59; i = 1; Integer integer2 = getId(); i = i * 59 + ((integer2 == null) ? 43 : integer2.hashCode()); Boolean bool = getRoot(); i = i * 59 + ((bool == null) ? 43 : bool.hashCode()); Integer integer1 = getDeptId(); i = i * 59 + ((integer1 == null) ? 43 : integer1.hashCode()); Byte byte_ = getStatus(); i = i * 59 + ((byte_ == null) ? 43 : byte_.hashCode()); String str = getUsername(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getPassword(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getOpenId(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getNickname(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getPhoto(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); str = getName(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); Object object = getSex(); i = i * 59 + ((object == null) ? 43 : object.hashCode()); object = getTel(); i = i * 59 + ((object == null) ? 43 : object.hashCode()); object = getEmail(); i = i * 59 + ((object == null) ? 43 : object.hashCode()); object = getHiredate(); i = i * 59 + ((object == null) ? 43 : object.hashCode()); object = getRole(); i = i * 59 + ((object == null) ? 43 : object.hashCode()); object = getCreateTime(); return i = i * 59 + ((object == null) ? 43 : object.hashCode()); } public void setOpenId(String str) { this.openId = str; } public void setDeptId(Integer integer) { this.deptId = integer; } protected boolean canEqual(Object object) { return object instanceof com.example.emos.workflow.db.pojo.TbUser; }
/*     */ 
/*     */   
/*     */   public String getName() {
/* 216 */     return this.name;
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
/*     */   public Date getHiredate() {
/* 235 */     return this.hiredate;
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
/*     */     //   6: iconst_2
/*     */     //   7: ishl
/*     */     //   8: iconst_3
/*     */     //   9: ixor
/*     */     //   10: ixor
/*     */     //   11: iconst_2
/*     */     //   12: iconst_5
/*     */     //   13: ixor
/*     */     //   14: iconst_3
/*     */     //   15: ishl
/*     */     //   16: iconst_2
/*     */     //   17: iconst_5
/*     */     //   18: ixor
/*     */     //   19: ixor
/*     */     //   20: iconst_2
/*     */     //   21: iconst_3
/*     */     //   22: ishl
/*     */     //   23: iconst_5
/*     */     //   24: ixor
/*     */     //   25: aload_0
/*     */     //   26: checkcast java/lang/String
/*     */     //   29: dup
/*     */     //   30: astore_0
/*     */     //   31: invokevirtual length : ()I
/*     */     //   34: dup
/*     */     //   35: newarray char
/*     */     //   37: iconst_1
/*     */     //   38: dup
/*     */     //   39: pop2
/*     */     //   40: swap
/*     */     //   41: iconst_1
/*     */     //   42: isub
/*     */     //   43: dup_x2
/*     */     //   44: istore_3
/*     */     //   45: astore_1
/*     */     //   46: istore #4
/*     */     //   48: dup_x2
/*     */     //   49: pop
/*     */     //   50: istore_2
/*     */     //   51: pop
/*     */     //   52: iflt -> 92
/*     */     //   55: aload_1
/*     */     //   56: aload_0
/*     */     //   57: iload_3
/*     */     //   58: dup_x1
/*     */     //   59: invokevirtual charAt : (I)C
/*     */     //   62: iinc #3, -1
/*     */     //   65: iload_2
/*     */     //   66: ixor
/*     */     //   67: i2c
/*     */     //   68: castore
/*     */     //   69: iload_3
/*     */     //   70: iflt -> 92
/*     */     //   73: aload_1
/*     */     //   74: aload_0
/*     */     //   75: iload_3
/*     */     //   76: iinc #3, -1
/*     */     //   79: dup_x1
/*     */     //   80: invokevirtual charAt : (I)C
/*     */     //   83: iload #4
/*     */     //   85: ixor
/*     */     //   86: i2c
/*     */     //   87: castore
/*     */     //   88: iload_3
/*     */     //   89: goto -> 52
/*     */     //   92: new java/lang/String
/*     */     //   95: dup
/*     */     //   96: aload_1
/*     */     //   97: invokespecial <init> : ([C)V
/*     */     //   100: areturn
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	101	0	a	Ljava/lang/String;
/*     */   }
/*     */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\db\pojo\TbUser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */