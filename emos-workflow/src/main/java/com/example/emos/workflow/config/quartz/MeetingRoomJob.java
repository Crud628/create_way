/*    */ package BOOT-INF.classes.com.example.emos.workflow.config.quartz;
/*    */ 
/*    */ import cn.hutool.core.date.DateTime;
/*    */ import cn.hutool.core.date.DateUtil;
/*    */ import cn.hutool.core.util.RandomUtil;
/*    */ import java.util.Date;
/*    */ import org.quartz.JobDataMap;
/*    */ import org.quartz.JobExecutionContext;
/*    */ import org.quartz.JobExecutionException;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.data.redis.core.RedisTemplate;
/*    */ import org.springframework.scheduling.quartz.QuartzJobBean;
/*    */ 
/*    */ public class MeetingRoomJob
/*    */   extends QuartzJobBean {
/*    */   @Autowired
/*    */   private RedisTemplate redisTemplate;
/*    */   
/*    */   protected void executeInternal(JobExecutionContext ctx) throws JobExecutionException {
/* 20 */     JobDataMap jobDataMap = ctx.getJobDetail().getJobDataMap();
/* 21 */     String uuid = jobDataMap.get("uuid").toString();
/* 22 */     DateTime dateTime = DateUtil.parse(jobDataMap.get("expire").toString(), "yyyy-MM-dd HH:mm:ss");
/*    */ 
/*    */     
/* 25 */     long roomId = RandomUtil.randomLong(1L, 4294967295L);
/* 26 */     while (this.redisTemplate.hasKey("roomId-" + roomId).booleanValue());
/*    */ 
/*    */     
/* 29 */     this.redisTemplate.opsForValue().set("roomId-" + roomId, uuid);
/* 30 */     this.redisTemplate.expireAt("roomId-" + roomId, (Date)dateTime);
/*    */     
/* 32 */     this.redisTemplate.opsForValue().set(uuid, Long.valueOf(roomId));
/* 33 */     this.redisTemplate.expireAt(uuid, (Date)dateTime);
/*    */   }
/*    */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\config\quartz\MeetingRoomJob.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */