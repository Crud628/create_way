/*     */ package BOOT-INF.classes.com.example.emos.workflow.util;
/*     */ 
/*     */ import com.example.emos.workflow.controller.form.SearchProcessUsersForm;
/*     */ import com.example.emos.workflow.db.pojo.TbLeave;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class R
/*     */   extends HashMap<String, Object>
/*     */ {
/*     */   public R() {
/*  43 */     put(TbLeave.ALLATORIxDEMO("\001Q\013"), SearchProcessUsersForm.ALLATORIxDEMO("\007Y\027O\021_\007"));
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
/*     */   public com.example.emos.workflow.util.R put(String str, Object object) {
/*     */     super.put(str, object);
/*     */     return this;
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
/*     */   public static com.example.emos.workflow.util.R ok() {
/* 142 */     return new com.example.emos.workflow.util.R();
/*     */   }
/*     */ 
/*     */   
/*     */   public static com.example.emos.workflow.util.R ok(String a) {
/* 147 */     (new com.example.emos.workflow.util.R())
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 213 */       .put(TbLeave.ALLATORIxDEMO("\001Q\013"), a);
/*     */     return new com.example.emos.workflow.util.R();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static com.example.emos.workflow.util.R ok(Map a) {
/*     */     (new com.example.emos.workflow.util.R()).putAll(a);
/*     */     return new com.example.emos.workflow.util.R();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static com.example.emos.workflow.util.R error(String a) {
/* 231 */     return error(500, a);
/*     */   }
/*     */   
/*     */   public static com.example.emos.workflow.util.R error(int a, String str) {
/*     */     r.put(TbLeave.ALLATORIxDEMO("\001Q\013"), str);
/*     */     com.example.emos.workflow.util.R r;
/*     */     return (r = new com.example.emos.workflow.util.R()).put(SearchProcessUsersForm.ALLATORIxDEMO("O\033H\021"), Integer.valueOf(a));
/*     */   }
/*     */   
/*     */   public static com.example.emos.workflow.util.R error() {
/*     */     return error(500, SearchProcessUsersForm.ALLATORIxDEMO("杞矉彶帔ｸ诛耠糗篕琪听"));
/*     */   }
/*     */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflo\\util\R.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */