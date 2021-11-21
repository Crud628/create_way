package BOOT-INF.classes.com.example.emos.workflow.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface MeetingService {
  void updateMeetingStatus(HashMap paramHashMap);
  
  List<String> searchUserMeetingInMonth(HashMap paramHashMap);
  
  int updateMeetingUnpresent(HashMap paramHashMap);
  
  Long searchRoomIdByUUID(String paramString);
  
  HashMap searchMeetingByInstanceId(String paramString);
  
  HashMap searchMeetingByUUID(String paramString);
  
  ArrayList<Integer> searchMeetingUnpresent(String paramString);
}


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\service\MeetingService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */