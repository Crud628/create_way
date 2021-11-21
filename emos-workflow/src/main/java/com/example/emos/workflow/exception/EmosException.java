/*     */ package BOOT-INF.classes.com.example.emos.workflow.exception;
/*     */ 
/*     */ import com.example.emos.workflow.EmosWorkflowApplication;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EmosException
/*     */   extends RuntimeException
/*     */ {
/*     */   private String msg;
/*     */   
/*     */   public EmosException(String str) {
/*  43 */     super(str); this.msg = str;
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
/*     */   public String getMsg() {
/*  66 */     return this.msg;
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
/*     */   public EmosException(String str, int i) {
/* 147 */     super(str); this
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 213 */       .msg = str;
/*     */     this.code = i;
/*     */   }
/*     */   
/*     */   public boolean equals(Object object) {
/*     */     if (object == this)
/*     */       return true; 
/*     */     if (!(object instanceof com.example.emos.workflow.exception.EmosException))
/*     */       return false; 
/*     */     if (!(object = object).canEqual(this))
/*     */       return false; 
/*     */     if (getCode() != object.getCode())
/*     */       return false; 
/*     */     String str = getMsg();
/*     */     object = object.getMsg();
/*     */     return !((str == null) ? (object != null) : !str.equals(object));
/*     */   }
/*     */   
/*     */   public void setCode(int i) {
/*     */     this.code = i;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     int i = 59;
/*     */     i = (i = 1) * 59 + getCode();
/*     */     String str = getMsg();
/*     */     return i = i * 59 + ((str == null) ? 43 : str.hashCode());
/*     */   }
/*     */   
/*     */   protected boolean canEqual(Object object) {
/*     */     return object instanceof com.example.emos.workflow.exception.EmosException;
/*     */   }
/*     */   
/*     */   public void setMsg(String str) {
/*     */     this.msg = str;
/*     */   }
/*     */   
/*     */   public String toString() {
/*     */     return (new StringBuilder()).insert(0, EmosWorkflowApplication.ALLATORIxDEMO("\037&58\03739.*?3$4c78=v")).append(getMsg()).append(EmosWorkflowApplication.ALLATORIxDEMO("gz(5/?v")).append(getCode()).append(EmosWorkflowApplication.ALLATORIxDEMO("b")).toString();
/*     */   }
/*     */   
/*     */   private int code = 500;
/*     */   
/*     */   public EmosException(String str, Throwable throwable) {
/*     */     super(str, throwable);
/*     */     this.msg = str;
/*     */   }
/*     */   
/*     */   public EmosException(String str, int i, Throwable throwable) {
/*     */     super(str, throwable);
/*     */     this.msg = str;
/*     */     this.code = i;
/*     */   }
/*     */   
/*     */   public int getCode() {
/*     */     return this.code;
/*     */   }
/*     */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\exception\EmosException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */