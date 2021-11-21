/*     */ package BOOT-INF.classes.com.example.emos.workflow.config.quartz;
/*     */ 
/*     */ import cn.hutool.core.map.MapUtil;
/*     */ import cn.hutool.core.util.IdUtil;
/*     */ import cn.hutool.json.JSONArray;
/*     */ import com.example.emos.workflow.controller.form.SearchProcessUsersForm;
/*     */ import com.example.emos.workflow.db.pojo.TbAmect;
/*     */ import com.example.emos.workflow.service.AmectService;
/*     */ import com.example.emos.workflow.service.AmectTypeService;
/*     */ import com.example.emos.workflow.service.MeetingService;
/*     */ import java.math.BigDecimal;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import org.quartz.JobDataMap;
/*     */ import org.quartz.JobExecutionContext;
/*     */ import org.quartz.JobExecutionException;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.scheduling.quartz.QuartzJobBean;
/*     */ import org.springframework.stereotype.Component;
/*     */ import org.springframework.transaction.annotation.Transactional;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ public class MeetingStatusJob
/*     */   extends QuartzJobBean
/*     */ {
/*     */   @Autowired
/*     */   private AmectTypeService amectTypeService;
/*     */   
/*     */   @Transactional
/*     */   protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
/*     */     JobDataMap jobDataMap;
/* 182 */     String str1 = MapUtil.getStr((Map)(jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap()), TbAmect.ALLATORIxDEMO("zOf^"));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 205 */     Integer integer = MapUtil.getInt((Map)(jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap()), SearchProcessUsersForm.ALLATORIxDEMO("_\000M\000Y\007"));
/*     */ 
/*     */ 
/*     */     
/*     */     String str2 = MapUtil.getStr((Map)(jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap()), TbAmect.ALLATORIxDEMO("NfNc_"));
/*     */ 
/*     */ 
/*     */     
/*     */     String str3 = MapUtil.getStr((Map)(jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap()), SearchProcessUsersForm.ALLATORIxDEMO("H\025X\021"));
/*     */ 
/*     */     
/* 216 */     String str4 = MapUtil.getStr((Map)(jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap()), TbAmect.ALLATORIxDEMO("I{[}N")); String str5 = MapUtil.getStr((Map)(jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap()), SearchProcessUsersForm.ALLATORIxDEMO("\021B\020"));
/* 217 */     String str6 = MapUtil.getStr((Map)(jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap()), TbAmect.ALLATORIxDEMO("iVn]"));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     HashMap<Object, Object> hashMap = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     this.meetingService.updateMeetingStatus(hashMap);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 236 */     log.debug(SearchProcessUsersForm.ALLATORIxDEMO("伶诚犚恵曘旄戼勫"));
/*     */     hashMap.put(TbAmect.ALLATORIxDEMO("zOf^"), str1);
/*     */     if (TbAmect.ALLATORIxDEMO((String)hashMap.put(SearchProcessUsersForm.ALLATORIxDEMO("_\000M\000Y\007"), integer)).equals(str6)) {
/*     */       ArrayList arrayList;
/*     */       if ((arrayList = this.meetingService.searchMeetingUnpresent(str1)) != null && arrayList.size() > 0) {
/*     */         JSONArray jSONArray = new JSONArray();
/*     */         arrayList.forEach(integer -> a.put(integer));
/*     */         Object object = new Object(this, str1, jSONArray);
/*     */         HashMap hashMap1 = this.amectTypeService.searchByType(SearchProcessUsersForm.ALLATORIxDEMO("编幙伶诚"));
/*     */         this.meetingService.updateMeetingUnpresent((HashMap)object);
/*     */         BigDecimal bigDecimal = (BigDecimal)hashMap1.get(TbAmect.ALLATORIxDEMO("W`TjC"));
/*     */         Integer integer1 = (Integer)hashMap1.get(SearchProcessUsersForm.ALLATORIxDEMO("E\020"));
/*     */         TbAmect tbAmect = new TbAmect();
/*     */         tbAmect.setAmount(bigDecimal);
/*     */         tbAmect.setTypeId(integer1);
/*     */         super();
/*     */         (new StringBuilder()).setReason(tbAmect.append(TbAmect.ALLATORIxDEMO("缵帗")).append(str3).append(SearchProcessUsersForm.ALLATORIxDEMO("T")).append(str4).append(TbAmect.ALLATORIxDEMO("D")).append(str5).append(SearchProcessUsersForm.ALLATORIxDEMO("盰")).append(str2).toString());
/*     */         forEach(integer -> {
/*     */               tbAmect.setUuid(IdUtil.simpleUUID());
/*     */               tbAmect.setUserId(integer);
/*     */               this.amectService.insert(tbAmect);
/*     */             });
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static final Logger log = LoggerFactory.getLogger(com.example.emos.workflow.config.quartz.MeetingStatusJob.class);
/*     */   @Autowired
/*     */   private MeetingService meetingService;
/*     */   @Autowired
/*     */   private AmectService amectService;
/*     */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\config\quartz\MeetingStatusJob.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */