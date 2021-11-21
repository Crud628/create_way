package BOOT-INF.classes.com.example.emos.workflow.bpmn;

import com.example.emos.workflow.db.dao.TbReimDao;
import com.example.emos.workflow.db.dao.TbUserDao;
import com.example.emos.workflow.task.EmailTask;
import org.activiti.engine.HistoryService;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("notifyReimService")
public class NotifyReimService implements JavaDelegate {
  @Autowired
  private TbReimDao reimDao;
  
  @Autowired
  private HistoryService historyService;
  
  @Autowired
  private EmailTask emailTask;
  
  @Autowired
  private TbUserDao userDao;
  
  public void execute(DelegateExecution a) {
    // Byte code:
    //   0: aload_0
    //   1: getfield historyService : Lorg/activiti/engine/HistoryService;
    //   4: invokeinterface createHistoricTaskInstanceQuery : ()Lorg/activiti/engine/history/HistoricTaskInstanceQuery;
    //   9: invokeinterface includeProcessVariables : ()Lorg/activiti/engine/task/TaskInfoQuery;
    //   14: checkcast org/activiti/engine/history/HistoricTaskInstanceQuery
    //   17: invokeinterface includeTaskLocalVariables : ()Lorg/activiti/engine/task/TaskInfoQuery;
    //   22: checkcast org/activiti/engine/history/HistoricTaskInstanceQuery
    //   25: aload_1
    //   26: invokeinterface getProcessInstanceId : ()Ljava/lang/String;
    //   31: invokeinterface processInstanceId : (Ljava/lang/String;)Lorg/activiti/engine/task/TaskInfoQuery;
    //   36: checkcast org/activiti/engine/history/HistoricTaskInstanceQuery
    //   39: invokeinterface orderByHistoricTaskInstanceEndTime : ()Lorg/activiti/engine/history/HistoricTaskInstanceQuery;
    //   44: invokeinterface orderByTaskCreateTime : ()Lorg/activiti/engine/task/TaskInfoQuery;
    //   49: checkcast org/activiti/engine/history/HistoricTaskInstanceQuery
    //   52: invokeinterface desc : ()Lorg/activiti/engine/query/Query;
    //   57: checkcast org/activiti/engine/history/HistoricTaskInstanceQuery
    //   60: invokeinterface list : ()Ljava/util/List;
    //   65: iconst_0
    //   66: invokeinterface get : (I)Ljava/lang/Object;
    //   71: checkcast org/activiti/engine/history/HistoricTaskInstance
    //   74: invokeinterface getTaskLocalVariables : ()Ljava/util/Map;
    //   79: ldc '^_@ '
    //   81: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   84: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   89: invokevirtual toString : ()Ljava/lang/String;
    //   92: astore_2
    //   93: ldc 'J@B'
    //   95: aload_1
    //   96: dup_x1
    //   97: dup_x2
    //   98: ldc '(.)>6?'
    //   100: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   103: aload_2
    //   104: invokeinterface setVariable : (Ljava/lang/String;Ljava/lang/Object;)V
    //   109: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   112: iconst_1
    //   113: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   116: invokeinterface setVariable : (Ljava/lang/String;Ljava/lang/Object;)V
    //   121: invokeinterface getProcessInstanceId : ()Ljava/lang/String;
    //   126: astore_3
    //   127: new com/example/emos/workflow/bpmn/NotifyReimService$1
    //   130: dup
    //   131: aload_0
    //   132: aload_2
    //   133: aload_3
    //   134: invokespecial <init> : (Lcom/example/emos/workflow/bpmn/NotifyReimService;Ljava/lang/String;Ljava/lang/String;)V
    //   137: astore_2
    //   138: aload_0
    //   139: getfield reimDao : Lcom/example/emos/workflow/db/dao/TbReimDao;
    //   142: aload_2
    //   143: invokeinterface updateReimStatus : (Ljava/util/HashMap;)I
    //   148: iconst_1
    //   149: if_icmpeq -> 165
    //   152: new com/example/emos/workflow/exception/EmosException
    //   155: dup
    //   156: ldc '暮旻拿镋诪弞独恊奫赮'
    //   158: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   161: invokespecial <init> : (Ljava/lang/String;)V
    //   164: athrow
    //   165: aload_1
    //   166: ldc '^M Ce'
    //   168: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   171: ldc java/lang/Integer
    //   173: invokeinterface getVariable : (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   178: checkcast java/lang/Integer
    //   181: invokevirtual intValue : ()I
    //   184: istore_2
    //   185: aload_0
    //   186: getfield userDao : Lcom/example/emos/workflow/db/dao/TbUserDao;
    //   189: iconst_1
    //   190: newarray int
    //   192: iconst_1
    //   193: dup
    //   194: pop2
    //   195: dup
    //   196: iconst_0
    //   197: iload_2
    //   198: iastore
    //   199: invokeinterface searchEmailByIds : ([I)Ljava/util/ArrayList;
    //   204: astore_2
    //   205: aload_1
    //   206: ldc '&;%;,?9/'
    //   208: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   211: ldc java/lang/Integer
    //   213: invokeinterface getVariable : (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   218: checkcast java/lang/Integer
    //   221: invokevirtual intValue : ()I
    //   224: istore #4
    //   226: aload_0
    //   227: getfield userDao : Lcom/example/emos/workflow/db/dao/TbUserDao;
    //   230: iconst_1
    //   231: newarray int
    //   233: iconst_1
    //   234: dup
    //   235: pop2
    //   236: dup
    //   237: iconst_0
    //   238: iload #4
    //   240: iastore
    //   241: invokeinterface searchEmailByIds : ([I)Ljava/util/ArrayList;
    //   246: dup
    //   247: astore #4
    //   249: aload_0
    //   250: getfield userDao : Lcom/example/emos/workflow/db/dao/TbUserDao;
    //   253: iconst_1
    //   254: anewarray java/lang/String
    //   257: iconst_1
    //   258: dup
    //   259: pop2
    //   260: dup
    //   261: iconst_0
    //   262: ldc '贎動'
    //   264: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   267: aastore
    //   268: invokeinterface searchEmailByRoles : ([Ljava/lang/String;)Ljava/util/ArrayList;
    //   273: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   276: aload_0
    //   277: getfield reimDao : Lcom/example/emos/workflow/db/dao/TbReimDao;
    //   280: aload_3
    //   281: invokeinterface searchReimByInstanceId : (Ljava/lang/String;)Ljava/util/HashMap;
    //   286: ldc ';&5>4?'
    //   288: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   291: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   294: invokevirtual toString : ()Ljava/lang/String;
    //   297: astore_3
    //   298: new org/springframework/mail/SimpleMailMessage
    //   301: dup
    //   302: invokespecial <init> : ()V
    //   305: astore #5
    //   307: pop
    //   308: aload_1
    //   309: ldc ' E @'
    //   311: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   314: ldc java/lang/String
    //   316: invokeinterface getVariable : (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   321: checkcast java/lang/String
    //   324: astore #6
    //   326: aload_1
    //   327: ldc '^M CbA'
    //   329: new java/lang/StringBuilder
    //   332: aload #5
    //   334: dup_x1
    //   335: dup
    //   336: pop2
    //   337: dup
    //   338: invokespecial <init> : ()V
    //   341: aload #6
    //   343: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: ldc '嶹纕裠戣再'
    //   348: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   351: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: invokevirtual toString : ()Ljava/lang/String;
    //   357: invokevirtual setSubject : (Ljava/lang/String;)V
    //   360: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   363: ldc java/lang/String
    //   365: invokeinterface getVariable : (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   370: checkcast java/lang/String
    //   373: astore_1
    //   374: aload_2
    //   375: dup
    //   376: aload #5
    //   378: dup_x2
    //   379: new java/lang/StringBuilder
    //   382: dup
    //   383: invokespecial <init> : ()V
    //   386: iconst_0
    //   387: ldc '吂嶮'
    //   389: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   392: invokevirtual insert : (ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   395: aload_1
    //   396: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   399: ldc '盰'
    //   401: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   404: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   407: aload_3
    //   408: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   411: ldc '儙拮镚畸训嶹纕遑辝寪戣ｇ训厁斬拁拿镋匏仯纃赩勻弙根ｊ'
    //   413: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   416: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   419: invokevirtual toString : ()Ljava/lang/String;
    //   422: invokevirtual setText : (Ljava/lang/String;)V
    //   425: invokeinterface size : ()I
    //   430: anewarray java/lang/String
    //   433: iconst_1
    //   434: dup
    //   435: pop2
    //   436: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   441: checkcast [Ljava/lang/String;
    //   444: invokevirtual setTo : ([Ljava/lang/String;)V
    //   447: aload #5
    //   449: aload #4
    //   451: dup
    //   452: invokevirtual size : ()I
    //   455: anewarray java/lang/String
    //   458: iconst_1
    //   459: dup
    //   460: pop2
    //   461: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   464: checkcast [Ljava/lang/String;
    //   467: invokevirtual setCc : ([Ljava/lang/String;)V
    //   470: aload_0
    //   471: getfield emailTask : Lcom/example/emos/workflow/task/EmailTask;
    //   474: aload #5
    //   476: invokevirtual sendAsync : (Lorg/springframework/mail/SimpleMailMessage;)V
    //   479: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #182	-> 0
    //   #205	-> 17
    //   #64	-> 39
    //   #216	-> 74
    //   #124	-> 93
    //   #217	-> 109
    //   #211	-> 121
    //   #163	-> 127
    //   #193	-> 138
    //   #1	-> 148
    //   #67	-> 152
    //   #30	-> 165
    //   #118	-> 185
    //   #194	-> 205
    //   #102	-> 226
    //   #235	-> 249
    //   #202	-> 276
    //   #101	-> 286
    //   #83	-> 298
    //   #20	-> 308
    //   #25	-> 329
    //   #24	-> 360
    //   #39	-> 374
    //   #117	-> 425
    //   #138	-> 447
    //   #148	-> 470
    //   #206	-> 479
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	480	0	a	Lcom/example/emos/workflow/bpmn/NotifyReimService;
    //   0	480	1	a	Lorg/activiti/engine/delegate/DelegateExecution;
  }
}


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\bpmn\NotifyReimService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */