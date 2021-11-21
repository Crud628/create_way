/*     */ package BOOT-INF.classes.com.example.emos.workflow.service.impl;
/*     */ 
/*     */ import cn.hutool.core.date.DateTime;
/*     */ import cn.hutool.core.date.DateUnit;
/*     */ import cn.hutool.core.date.DateUtil;
/*     */ import com.example.emos.workflow.controller.form.DeleteProcessByIdForm;
/*     */ import com.example.emos.workflow.db.dao.TbMeetingDao;
/*     */ import com.example.emos.workflow.db.pojo.TbLeave;
/*     */ import com.example.emos.workflow.exception.EmosException;
/*     */ import com.example.emos.workflow.service.MeetingService;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.beans.factory.annotation.Qualifier;
/*     */ import org.springframework.data.redis.core.RedisTemplate;
/*     */ import org.springframework.stereotype.Service;
/*     */ 
/*     */ @Service
/*     */ public class MeetingServiceImpl
/*     */   implements MeetingService {
/*     */   public ArrayList<Integer> searchMeetingUnpresent(String str) {
/*  24 */     return 
/*  25 */       this.meetingDao.searchMeetingUnpresent(str);
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
/*     */   @Autowired
/*     */   @Qualifier("redisTemplate")
/*     */   private RedisTemplate redisTemplate;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private TbMeetingDao meetingDao;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public HashMap searchMeetingByInstanceId(String str) {
/* 139 */     str = this.meetingDao.searchMeetingByInstanceId(str).get(DeleteProcessByIdForm.ALLATORIxDEMO("\002\020\022\024")).toString();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 227 */     String str1 = this.meetingDao.searchMeetingByInstanceId(str).get(TbLeave.ALLATORIxDEMO("\037V\rP\030")).toString();
/*     */     DateTime dateTime = DateUtil.parse((new StringBuilder()).insert(0, str).append(DeleteProcessByIdForm.ALLATORIxDEMO("Q")).append(str1).toString(), TbLeave.ALLATORIxDEMO("[\025[\025\017!oAF\b\002$jVO\001"));
/*     */     String str2 = this.meetingDao.searchMeetingByInstanceId(str).get(DeleteProcessByIdForm.ALLATORIxDEMO("\024\b\025")).toString();
/*     */     long l = DateUtil.between((Date)DateUtil.parse((new StringBuilder()).insert(0, str).append(TbLeave.ALLATORIxDEMO("L")).append(str2).toString(), DeleteProcessByIdForm.ALLATORIxDEMO("\037\b\037\bK<+\\\002\025F9.K\013\034")), (Date)dateTime, DateUnit.HOUR, true);
/*     */     this.meetingDao.searchMeetingByInstanceId(str).put(TbLeave.ALLATORIxDEMO("\004M\031P\037"), Long.valueOf(l));
/*     */     return this.meetingDao.searchMeetingByInstanceId(str);
/*     */   } public void updateMeetingStatus(HashMap hashMap) {
/*     */     if (this.meetingDao.updateMeetingStatus(hashMap) != 1)
/* 235 */       throw new EmosException(DeleteProcessByIdForm.ALLATORIxDEMO("佼诟狐恰暒旁套赔")); 
/*     */   }
/*     */   
/*     */   public HashMap searchMeetingByUUID(String str) {
/*     */     return this.meetingDao.searchMeetingByUUID(str);
/*     */   }
/*     */   
/*     */   public List<String> searchUserMeetingInMonth(HashMap hashMap) {
/*     */     return this.meetingDao.searchUserMeetingInMonth(hashMap);
/*     */   }
/*     */   
/*     */   public Long searchRoomIdByUUID(String str) {
/*     */     return Long.valueOf(Long.parseLong(this.redisTemplate.opsForValue().get(str).toString()));
/*     */   }
/*     */   
/*     */   public int updateMeetingUnpresent(HashMap hashMap) {
/*     */     return this.meetingDao.updateMeetingUnpresent(hashMap);
/*     */   }
/*     */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\service\impl\MeetingServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */