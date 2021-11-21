/*    */ package BOOT-INF.classes.com.example.emos.workflow.task;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.beans.factory.annotation.Value;
/*    */ import org.springframework.mail.SimpleMailMessage;
/*    */ import org.springframework.mail.javamail.JavaMailSender;
/*    */ import org.springframework.scheduling.annotation.Async;
/*    */ import org.springframework.stereotype.Component;
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
/*    */ @Component
/*    */ public class EmailTask
/*    */   implements Serializable
/*    */ {
/*    */   @Autowired
/*    */   private JavaMailSender javaMailSender;
/*    */   @Value("${spring.mail.username}")
/*    */   private String mailbox;
/*    */   
/*    */   @Async
/*    */   public void sendAsync(SimpleMailMessage simpleMailMessage) {
/* 99 */     simpleMailMessage.setFrom(this.mailbox); this.javaMailSender.send(simpleMailMessage);
/*    */   }
/*    */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\task\EmailTask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */