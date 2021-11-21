package BOOT-INF.classes.com.example.emos.workflow.bpmn;

import com.example.emos.workflow.db.dao.TbLeaveDao;
import com.example.emos.workflow.db.dao.TbUserDao;
import com.example.emos.workflow.task.EmailTask;
import org.activiti.engine.HistoryService;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotifyLeaveService implements JavaDelegate {
  @Autowired
  private HistoryService historyService;
  
  @Autowired
  private EmailTask emailTask;
  
  @Autowired
  private TbUserDao userDao;
  
  @Autowired
  private TbLeaveDao leaveDao;
  
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
    //   79: ldc 'gZfJyK'
    //   81: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   84: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   89: invokevirtual toString : ()Ljava/lang/String;
    //   92: astore_2
    //   93: ldc 'sVyV{X'
    //   95: aload_1
    //   96: dup_x1
    //   97: dup_x2
    //   98: ldc 'gZfJyK'
    //   100: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   103: aload_2
    //   104: invokeinterface setVariable : (Ljava/lang/String;Ljava/lang/Object;)V
    //   109: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   112: iconst_1
    //   113: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   116: invokeinterface setVariable : (Ljava/lang/String;Ljava/lang/Object;)V
    //   121: invokeinterface getProcessInstanceId : ()Ljava/lang/String;
    //   126: astore_3
    //   127: new com/example/emos/workflow/bpmn/NotifyLeaveService$1
    //   130: dup
    //   131: aload_0
    //   132: aload_2
    //   133: aload_3
    //   134: invokespecial <init> : (Lcom/example/emos/workflow/bpmn/NotifyLeaveService;Ljava/lang/String;Ljava/lang/String;)V
    //   137: astore_2
    //   138: aload_0
    //   139: getfield leaveDao : Lcom/example/emos/workflow/db/dao/TbLeaveDao;
    //   142: aload_2
    //   143: invokeinterface updateLeaveStatus : (Ljava/util/HashMap;)I
    //   148: iconst_1
    //   149: if_icmpeq -> 165
    //   152: new com/example/emos/workflow/exception/EmosException
    //   155: dup
    //   156: ldc '曡斏询偸讥彪犣怾夤贚'
    //   158: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   161: invokespecial <init> : (Ljava/lang/String;)V
    //   164: athrow
    //   165: aload_1
    //   166: ldc '\gZtKzM\['
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
    //   206: ldc 'RtQtXpM\['
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
    //   262: ldc ']m'
    //   264: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   267: aastore
    //   268: invokeinterface searchEmailByRoles : ([Ljava/lang/String;)Ljava/util/ArrayList;
    //   273: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   276: new org/springframework/mail/SimpleMailMessage
    //   279: dup
    //   280: invokespecial <init> : ()V
    //   283: astore #5
    //   285: pop
    //   286: aload_1
    //   287: ldc 'K|KyZ'
    //   289: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   292: ldc java/lang/String
    //   294: invokeinterface getVariable : (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   299: checkcast java/lang/String
    //   302: astore #6
    //   304: aload_1
    //   305: ldc '\gZtKzM[^xZ'
    //   307: new java/lang/StringBuilder
    //   310: aload #5
    //   312: dup_x1
    //   313: dup
    //   314: pop2
    //   315: dup
    //   316: invokespecial <init> : ()V
    //   319: aload #6
    //   321: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   324: ldc '巍绚袔扬凹'
    //   326: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   329: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   332: invokevirtual toString : ()Ljava/lang/String;
    //   335: invokevirtual setSubject : (Ljava/lang/String;)V
    //   338: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   341: ldc java/lang/String
    //   343: invokeinterface getVariable : (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   348: checkcast java/lang/String
    //   351: astore_1
    //   352: aload_0
    //   353: getfield leaveDao : Lcom/example/emos/workflow/db/dao/TbLeaveDao;
    //   356: aload_3
    //   357: invokeinterface searchLeaveByInstanceId : (Ljava/lang/String;)Ljava/util/HashMap;
    //   362: dup
    //   363: ldc 'La^gK'
    //   365: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   368: invokestatic getStr : (Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/String;
    //   371: astore_3
    //   372: ldc 'Z{['
    //   374: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   377: invokestatic getStr : (Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/String;
    //   380: astore #6
    //   382: aload_2
    //   383: dup
    //   384: aload #5
    //   386: dup_x2
    //   387: new java/lang/StringBuilder
    //   390: dup
    //   391: invokespecial <init> : ()V
    //   394: iconst_0
    //   395: ldc '呍巚'
    //   397: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   400: invokevirtual insert : (ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   403: aload_1
    //   404: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   407: ldc '９亱'
    //   409: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   412: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   415: aload_3
    //   416: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   419: ldc '臌'
    //   421: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   424: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   427: aload #6
    //   429: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   432: ldc '皻询偸甦诈巧绰袾扆凓Ｓ询叵旣抵询偸區筁孂些绌wG彭桶＾'
    //   434: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   437: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   440: invokevirtual toString : ()Ljava/lang/String;
    //   443: invokevirtual setText : (Ljava/lang/String;)V
    //   446: invokeinterface size : ()I
    //   451: anewarray java/lang/String
    //   454: iconst_1
    //   455: dup
    //   456: pop2
    //   457: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   462: checkcast [Ljava/lang/String;
    //   465: invokevirtual setTo : ([Ljava/lang/String;)V
    //   468: aload #5
    //   470: aload #4
    //   472: dup
    //   473: invokevirtual size : ()I
    //   476: anewarray java/lang/String
    //   479: iconst_1
    //   480: dup
    //   481: pop2
    //   482: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   485: checkcast [Ljava/lang/String;
    //   488: invokevirtual setCc : ([Ljava/lang/String;)V
    //   491: aload_0
    //   492: getfield emailTask : Lcom/example/emos/workflow/task/EmailTask;
    //   495: aload #5
    //   497: invokevirtual sendAsync : (Lorg/springframework/mail/SimpleMailMessage;)V
    //   500: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #106	-> 0
    //   #231	-> 17
    //   #50	-> 39
    //   #205	-> 74
    //   #64	-> 93
    //   #158	-> 109
    //   #216	-> 121
    //   #217	-> 127
    //   #84	-> 138
    //   #111	-> 148
    //   #236	-> 152
    //   #67	-> 165
    //   #10	-> 185
    //   #30	-> 205
    //   #118	-> 226
    //   #201	-> 249
    //   #102	-> 276
    //   #235	-> 286
    //   #47	-> 307
    //   #202	-> 338
    //   #101	-> 352
    //   #83	-> 362
    //   #20	-> 372
    //   #25	-> 382
    //   #24	-> 446
    //   #39	-> 468
    //   #117	-> 491
    //   #138	-> 500
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	501	0	a	Lcom/example/emos/workflow/bpmn/NotifyLeaveService;
    //   0	501	1	a	Lorg/activiti/engine/delegate/DelegateExecution;
  }
}


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\bpmn\NotifyLeaveService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */