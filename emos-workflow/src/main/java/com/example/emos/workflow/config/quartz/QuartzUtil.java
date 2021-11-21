/*     */ package BOOT-INF.classes.com.example.emos.workflow.config.quartz;
/*     */ 
/*     */ import com.example.emos.workflow.EmosWorkflowApplication;
/*     */ import com.example.emos.workflow.db.pojo.TbAmect;
/*     */ import java.util.Date;
/*     */ import javax.annotation.Resource;
/*     */ import org.quartz.JobDetail;
/*     */ import org.quartz.JobKey;
/*     */ import org.quartz.ScheduleBuilder;
/*     */ import org.quartz.Scheduler;
/*     */ import org.quartz.SchedulerException;
/*     */ import org.quartz.SimpleScheduleBuilder;
/*     */ import org.quartz.Trigger;
/*     */ import org.quartz.TriggerBuilder;
/*     */ import org.quartz.TriggerKey;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ import org.springframework.stereotype.Component;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Component
/*     */ public class QuartzUtil
/*     */ {
/*  40 */   private static final Logger log = LoggerFactory.getLogger(com.example.emos.workflow.config.quartz.QuartzUtil.class);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Resource
/*     */   private Scheduler scheduler;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addJob(JobDetail jobDetail, String str1, String str2, Date date) {
/*     */     try {
/* 213 */       Trigger trigger = TriggerBuilder.newTrigger().withIdentity(str1, str2).withSchedule((ScheduleBuilder)SimpleScheduleBuilder.simpleSchedule().withMisfireHandlingInstructionFireNow()).startAt(date).build();
/*     */       this.scheduler.scheduleJob(jobDetail, trigger);
/*     */       log.debug((new StringBuilder()).insert(0, EmosWorkflowApplication.ALLATORIxDEMO("扊勔涡勫")).append(str1).append(TbAmect.ALLATORIxDEMO("宠旹噒")).toString());
/*     */       return;
/*     */     } catch (SchedulerException schedulerException) {
/*     */       log.error(EmosWorkflowApplication.ALLATORIxDEMO("寑斬嘣涡勫奫赮"), (Throwable)schedulerException);
/*     */       return;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void deleteJob(String str1, String str2) {
/* 227 */     TriggerKey triggerKey = TriggerKey.triggerKey(str1, str2); try {
/*     */       this.scheduler.resumeTrigger(triggerKey); this.scheduler.deleteJob(JobKey.jobKey(str1, str2)); log.debug((new StringBuilder()).insert(0, TbAmect.ALLATORIxDEMO("戟劥刯陞")).append(str1).append(EmosWorkflowApplication.ALLATORIxDEMO("寑斬嘣")).toString());
/*     */       return;
/*     */     } catch (SchedulerException schedulerException) {
/* 231 */       log.error(TbAmect.ALLATORIxDEMO("宠旹噒刯陞夾负"), (Throwable)schedulerException);
/*     */       return;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\config\quartz\QuartzUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */