/*    */ package BOOT-INF.classes.com.example.emos.workflow.service.impl;
/*    */ 
/*    */ import com.example.emos.workflow.db.dao.TbLeaveDao;
/*    */ import com.example.emos.workflow.service.LeaveService;
/*    */ import java.util.HashMap;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class LeaveServiceImpl
/*    */   implements LeaveService
/*    */ {
/*    */   @Autowired
/*    */   private TbLeaveDao leaveDao;
/*    */   
/*    */   public HashMap searchLeaveByInstanceId(String str) {
/* 65 */     return this.leaveDao.searchLeaveByInstanceId(str);
/*    */   }
/*    */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\service\impl\LeaveServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */