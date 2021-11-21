/*     */ package BOOT-INF.classes.com.example.emos.workflow.config.quartz;
/*     */ 
/*     */ import com.example.emos.workflow.db.pojo.TbAmect;
/*     */ import com.example.emos.workflow.db.pojo.TbLeave;
/*     */ import com.example.emos.workflow.service.MeetingService;
/*     */ import com.example.emos.workflow.service.WorkflowService;
/*     */ import java.util.HashMap;
/*     */ import org.activiti.engine.HistoryService;
/*     */ import org.activiti.engine.RuntimeService;
/*     */ import org.activiti.engine.runtime.ProcessInstance;
/*     */ import org.quartz.JobDataMap;
/*     */ import org.quartz.JobExecutionContext;
/*     */ import org.quartz.JobExecutionException;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.scheduling.quartz.QuartzJobBean;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ public class MeetingWorkflowJob
/*     */   extends QuartzJobBean
/*     */ {
/*     */   @Autowired
/*     */   private HistoryService historyService;
/*     */   @Autowired
/*     */   private MeetingService meetingService;
/*     */   
/*     */   protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
/*     */     JobDataMap<?, V> jobDataMap;
/* 217 */     String str1 = (jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap()).get(TbAmect.ALLATORIxDEMO("zOf^")).toString();
/*     */     String str2 = (jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap()).get(TbLeave.ALLATORIxDEMO("K\002Q\030C\002A\tk\b")).toString();
/*     */     if ((ProcessInstance)this.runtimeService.createProcessInstanceQuery().processInstanceId(str2).singleResult() != null) {
/*     */       HashMap<Object, Object> hashMap;
/*     */       this.workflowService.deleteProcessById(str1, str2, TbAmect.ALLATORIxDEMO("伕讔"), TbLeave.ALLATORIxDEMO("伸诂迥杳"));
/*     */       this.meetingService.updateMeetingStatus(hashMap);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static final Logger log = LoggerFactory.getLogger(com.example.emos.workflow.config.quartz.MeetingWorkflowJob.class);
/*     */   @Autowired
/*     */   private RuntimeService runtimeService;
/*     */   @Autowired
/*     */   private WorkflowService workflowService;
/*     */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\config\quartz\MeetingWorkflowJob.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */