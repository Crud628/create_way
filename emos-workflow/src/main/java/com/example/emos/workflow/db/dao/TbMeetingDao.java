package BOOT-INF.classes.com.example.emos.workflow.db.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbMeetingDao {
  HashMap searchMeetingByInstanceId(String paramString);
  
  ArrayList<Integer> searchMeetingUnpresent(String paramString);
  
  List<String> searchUserMeetingInMonth(HashMap paramHashMap);
  
  boolean searchMeetingMembersInSameDept(String paramString);
  
  HashMap searchMeetingByUUID(String paramString);
  
  int updateMeetingUnpresent(HashMap paramHashMap);
  
  int updateMeetingStatus(HashMap paramHashMap);
}


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\db\dao\TbMeetingDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */