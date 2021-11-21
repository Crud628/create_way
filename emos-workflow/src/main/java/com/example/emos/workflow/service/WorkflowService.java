package BOOT-INF.classes.com.example.emos.workflow.service;

import java.util.ArrayList;
import java.util.HashMap;

public interface WorkflowService {
  boolean searchProcessStatus(String paramString);
  
  ArrayList searchProcessUsers(String paramString);
  
  void approvalTask(HashMap paramHashMap);
  
  ArrayList searchUserTaskListByPage(HashMap paramHashMap);
  
  String startReimProcess(HashMap paramHashMap);
  
  HashMap searchTaskByPage(HashMap paramHashMap);
  
  HashMap searchApprovalContent(String paramString1, int paramInt, String[] paramArrayOfString, String paramString2, String paramString3);
  
  void turnTask(int paramInt1, int paramInt2);
  
  String startLeaveProcess(HashMap paramHashMap);
  
  String startMeetingProcess(HashMap paramHashMap);
  
  void deleteProcessById(String paramString1, String paramString2, String paramString3, String paramString4);
  
  void archiveTask(HashMap paramHashMap);
}


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\service\WorkflowService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */