/*    */ package BOOT-INF.classes.com.example.emos.workflow.db.pojo;
/*    */ import java.math.BigDecimal;
/*    */ 
/*    */ public class TbAmectType {
/*    */   public Integer getId() {
/*  6 */     return this.id;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private BigDecimal money;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private Boolean systemic;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private String type;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private Integer id;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Boolean getSystemic() {
/* 40 */     return this.systemic;
/*    */   }
/*    */   public BigDecimal getMoney() {
/* 43 */     return this.money;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getType() {
/* 60 */     return this.type;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setId(Integer integer)
/*    */   {
/* 66 */     this.id = integer; } public String toString() { return (new StringBuilder()).insert(0, TbLeave.ALLATORIxDEMO("8@-O\tA\030v\025R\t\n\005FQ")).append(getId()).append(TbAmect.ALLATORIxDEMO("\026/NvJj\007")).append(getType()).append(TbLeave.ALLATORIxDEMO("\016LO\003L\t[Q")).append(getMoney()).append(TbAmect.ALLATORIxDEMO("\026/IvI{_bSl\007")).append(getSystemic()).append(TbLeave.ALLATORIxDEMO("E")).toString(); } public void setType(String str) { this.type = str; } public void setSystemic(Boolean bool) { this.systemic = bool; } protected boolean canEqual(Object object) { return object instanceof com.example.emos.workflow.db.pojo.TbAmectType; } public void setMoney(BigDecimal bigDecimal) { this.money = bigDecimal; } public boolean equals(Object object) { if (object == this) return true;  if (!(object instanceof com.example.emos.workflow.db.pojo.TbAmectType)) return false;  if (!(object = object).canEqual(this)) return false;  Integer integer1 = getId(), integer2 = object.getId(); if ((integer1 == null) ? (integer2 != null) : !integer1.equals(integer2)) return false;  Boolean bool1 = getSystemic(), bool2 = object.getSystemic(); if ((bool1 == null) ? (bool2 != null) : !bool1.equals(bool2)) return false;  String str1 = getType(), str2 = object.getType(); if ((str1 == null) ? (str2 != null) : !str1.equals(str2)) return false;  BigDecimal bigDecimal = getMoney(); object = object.getMoney(); return !((bigDecimal == null) ? (object != null) : !bigDecimal.equals(object)); } public int hashCode() { int i = 59; i = 1; Integer integer = getId(); i = i * 59 + ((integer == null) ? 43 : integer.hashCode()); Boolean bool = getSystemic(); i = i * 59 + ((bool == null) ? 43 : bool.hashCode()); String str = getType(); i = i * 59 + ((str == null) ? 43 : str.hashCode()); BigDecimal bigDecimal = getMoney(); return i = i * 59 + ((bigDecimal == null) ? 43 : bigDecimal.hashCode()); }
/*    */ 
/*    */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\db\pojo\TbAmectType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */