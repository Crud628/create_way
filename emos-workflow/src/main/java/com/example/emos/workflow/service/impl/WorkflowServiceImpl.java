/*     */ package BOOT-INF.classes.com.example.emos.workflow.service.impl;
/*     */ import cn.hutool.core.date.DateTime;
/*     */ import cn.hutool.core.map.MapUtil;
/*     */ import cn.hutool.json.JSONArray;
/*     */ import com.example.emos.workflow.EmosWorkflowApplication;
/*     */ import com.example.emos.workflow.bo.Approval;
/*     */ import com.example.emos.workflow.db.pojo.TbAmect;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.activiti.engine.history.HistoricTaskInstance;
/*     */ import org.activiti.engine.history.HistoricTaskInstanceQuery;
/*     */ import org.activiti.engine.task.Task;
/*     */ import org.quartz.JobDataMap;
/*     */ import org.quartz.JobDetail;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ 
/*     */ @Service
/*     */ public class WorkflowServiceImpl implements WorkflowService {
/*     */   public ArrayList searchProcessUsers(String str) {
/*  22 */     List list = ((HistoricTaskInstanceQuery)this.historyService.createHistoricTaskInstanceQuery().processInstanceId(str)).finished().list();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 180 */     ArrayList arrayList = new ArrayList();
/*     */     list.forEach(historicTaskInstance -> a.add(historicTaskInstance.getAssignee()));
/*     */     return arrayList;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private TaskService taskService;
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private LeaveService leaveService;
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private MeetingService meetingService;
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private HistoryService historyService;
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private RuntimeService runtimeService;
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private QuartzUtil quartzUtil;
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private KieSession kieSession;
/*     */   
/*     */   @Autowired
/*     */   private ReimService reimService;
/*     */   
/*     */   @Autowired
/*     */   private ProcessEngine processEngine;
/*     */ 
/*     */   
/*     */   public HashMap searchTaskByPage(HashMap hashMap) {
/*     */     // Byte code:
/*     */     //   0: new java/util/ArrayList
/*     */     //   3: dup
/*     */     //   4: invokespecial <init> : ()V
/*     */     //   7: astore_2
/*     */     //   8: aload_1
/*     */     //   9: ldc '/8?9/'
/*     */     //   11: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   14: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   17: checkcast java/lang/Integer
/*     */     //   20: invokevirtual intValue : ()I
/*     */     //   23: istore_3
/*     */     //   24: aload_1
/*     */     //   25: ldc '}Uc_'
/*     */     //   27: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   30: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   33: checkcast cn/hutool/json/JSONArray
/*     */     //   36: astore #4
/*     */     //   38: aload_1
/*     */     //   39: ldc '8.*(?'
/*     */     //   41: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   44: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   47: checkcast java/lang/Integer
/*     */     //   50: invokevirtual intValue : ()I
/*     */     //   53: istore #5
/*     */     //   55: aload_1
/*     */     //   56: ldc 'c_a]{R'
/*     */     //   58: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   61: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   64: checkcast java/lang/Integer
/*     */     //   67: invokevirtual intValue : ()I
/*     */     //   70: istore #6
/*     */     //   72: aload_1
/*     */     //   73: ldc ')?;?/8'
/*     */     //   75: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   78: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   81: checkcast java/lang/String
/*     */     //   84: astore #7
/*     */     //   86: aload_1
/*     */     //   87: dup
/*     */     //   88: dup_x1
/*     */     //   89: ldc 'Y}_nN`HA[b_'
/*     */     //   91: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   94: invokestatic getStr : (Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   97: astore_1
/*     */     //   98: ldc '.2*.'
/*     */     //   100: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   103: invokestatic getStr : (Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   106: astore #8
/*     */     //   108: ldc 'fT|NnTl_F^'
/*     */     //   110: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   113: invokestatic getStr : (Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   116: astore #9
/*     */     //   118: lconst_0
/*     */     //   119: invokestatic valueOf : (J)Ljava/lang/Long;
/*     */     //   122: astore #10
/*     */     //   124: new java/util/ArrayList
/*     */     //   127: dup
/*     */     //   128: invokespecial <init> : ()V
/*     */     //   131: astore #11
/*     */     //   133: aload #4
/*     */     //   135: new java/lang/StringBuilder
/*     */     //   138: aload #11
/*     */     //   140: dup_x1
/*     */     //   141: dup_x2
/*     */     //   142: dup
/*     */     //   143: pop2
/*     */     //   144: dup
/*     */     //   145: invokespecial <init> : ()V
/*     */     //   148: iload_3
/*     */     //   149: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   152: ldc ''
/*     */     //   154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   157: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   160: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   165: pop
/*     */     //   166: <illegal opcode> accept : (Ljava/util/List;)Ljava/util/function/Consumer;
/*     */     //   171: invokevirtual forEach : (Ljava/util/function/Consumer;)V
/*     */     //   174: ldc '忎寻戲'
/*     */     //   176: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   179: aload #7
/*     */     //   181: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   184: ifeq -> 403
/*     */     //   187: aload_0
/*     */     //   188: getfield taskService : Lorg/activiti/engine/TaskService;
/*     */     //   191: invokeinterface createTaskQuery : ()Lorg/activiti/engine/task/TaskQuery;
/*     */     //   196: invokeinterface orderByTaskCreateTime : ()Lorg/activiti/engine/task/TaskInfoQuery;
/*     */     //   201: checkcast org/activiti/engine/task/TaskQuery
/*     */     //   204: invokeinterface desc : ()Lorg/activiti/engine/query/Query;
/*     */     //   209: checkcast org/activiti/engine/task/TaskQuery
/*     */     //   212: invokeinterface includeProcessVariables : ()Lorg/activiti/engine/task/TaskInfoQuery;
/*     */     //   217: checkcast org/activiti/engine/task/TaskQuery
/*     */     //   220: invokeinterface includeTaskLocalVariables : ()Lorg/activiti/engine/task/TaskInfoQuery;
/*     */     //   225: checkcast org/activiti/engine/task/TaskQuery
/*     */     //   228: aload #11
/*     */     //   230: invokeinterface taskAssigneeIds : (Ljava/util/List;)Lorg/activiti/engine/task/TaskInfoQuery;
/*     */     //   235: checkcast org/activiti/engine/task/TaskQuery
/*     */     //   238: astore_3
/*     */     //   239: aload_1
/*     */     //   240: invokestatic isNotBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   243: ifeq -> 259
/*     */     //   246: aload_3
/*     */     //   247: ldc 'Y}_nN`HA[b_'
/*     */     //   249: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   252: aload_1
/*     */     //   253: invokeinterface processVariableValueEquals : (Ljava/lang/String;Ljava/lang/Object;)Lorg/activiti/engine/task/TaskInfoQuery;
/*     */     //   258: pop
/*     */     //   259: aload #8
/*     */     //   261: invokestatic isNotBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   264: ifeq -> 281
/*     */     //   267: aload_3
/*     */     //   268: ldc '.2*.'
/*     */     //   270: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   273: aload #8
/*     */     //   275: invokeinterface processVariableValueEquals : (Ljava/lang/String;Ljava/lang/Object;)Lorg/activiti/engine/task/TaskInfoQuery;
/*     */     //   280: pop
/*     */     //   281: aload #9
/*     */     //   283: invokestatic isNotBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   286: ifeq -> 298
/*     */     //   289: aload_3
/*     */     //   290: aload #9
/*     */     //   292: invokeinterface processInstanceId : (Ljava/lang/String;)Lorg/activiti/engine/task/TaskInfoQuery;
/*     */     //   297: pop
/*     */     //   298: aload_3
/*     */     //   299: dup
/*     */     //   300: invokeinterface count : ()J
/*     */     //   305: invokestatic valueOf : (J)Ljava/lang/Long;
/*     */     //   308: astore #10
/*     */     //   310: iload #5
/*     */     //   312: iload #6
/*     */     //   314: invokeinterface listPage : (II)Ljava/util/List;
/*     */     //   319: dup
/*     */     //   320: astore #4
/*     */     //   322: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   327: dup
/*     */     //   328: astore #12
/*     */     //   330: invokeinterface hasNext : ()Z
/*     */     //   335: ifeq -> 802
/*     */     //   338: aload #12
/*     */     //   340: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   345: checkcast org/activiti/engine/task/Task
/*     */     //   348: dup
/*     */     //   349: astore #13
/*     */     //   351: invokeinterface getProcessVariables : ()Ljava/util/Map;
/*     */     //   356: astore #14
/*     */     //   358: aload_0
/*     */     //   359: aload #13
/*     */     //   361: invokeinterface getProcessInstanceId : ()Ljava/lang/String;
/*     */     //   366: aload #7
/*     */     //   368: aload #14
/*     */     //   370: invokespecial createApproval : (Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/example/emos/workflow/bo/Approval;
/*     */     //   373: astore #15
/*     */     //   375: aload #12
/*     */     //   377: aload_2
/*     */     //   378: aload #15
/*     */     //   380: dup
/*     */     //   381: aload #13
/*     */     //   383: invokeinterface getId : ()Ljava/lang/String;
/*     */     //   388: invokevirtual setTaskId : (Ljava/lang/String;)V
/*     */     //   391: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   394: pop
/*     */     //   395: goto -> 330
/*     */     //   398: nop
/*     */     //   399: nop
/*     */     //   400: nop
/*     */     //   401: nop
/*     */     //   402: athrow
/*     */     //   403: ldc_w '巈宮扃'
/*     */     //   406: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   409: aload #7
/*     */     //   411: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   414: ifeq -> 640
/*     */     //   417: aload_0
/*     */     //   418: getfield historyService : Lorg/activiti/engine/HistoryService;
/*     */     //   421: invokeinterface createHistoricTaskInstanceQuery : ()Lorg/activiti/engine/history/HistoricTaskInstanceQuery;
/*     */     //   426: invokeinterface orderByHistoricTaskInstanceStartTime : ()Lorg/activiti/engine/history/HistoricTaskInstanceQuery;
/*     */     //   431: invokeinterface desc : ()Lorg/activiti/engine/query/Query;
/*     */     //   436: checkcast org/activiti/engine/history/HistoricTaskInstanceQuery
/*     */     //   439: invokeinterface includeTaskLocalVariables : ()Lorg/activiti/engine/task/TaskInfoQuery;
/*     */     //   444: checkcast org/activiti/engine/history/HistoricTaskInstanceQuery
/*     */     //   447: invokeinterface includeProcessVariables : ()Lorg/activiti/engine/task/TaskInfoQuery;
/*     */     //   452: checkcast org/activiti/engine/history/HistoricTaskInstanceQuery
/*     */     //   455: aload #11
/*     */     //   457: invokeinterface taskAssigneeIds : (Ljava/util/List;)Lorg/activiti/engine/task/TaskInfoQuery;
/*     */     //   462: checkcast org/activiti/engine/history/HistoricTaskInstanceQuery
/*     */     //   465: invokeinterface finished : ()Lorg/activiti/engine/history/HistoricTaskInstanceQuery;
/*     */     //   470: invokeinterface processUnfinished : ()Lorg/activiti/engine/history/HistoricTaskInstanceQuery;
/*     */     //   475: astore_3
/*     */     //   476: aload_1
/*     */     //   477: invokestatic isNotBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   480: ifeq -> 497
/*     */     //   483: aload_3
/*     */     //   484: ldc_w '((.;?59*7.'
/*     */     //   487: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   490: aload_1
/*     */     //   491: invokeinterface processVariableValueEquals : (Ljava/lang/String;Ljava/lang/Object;)Lorg/activiti/engine/task/TaskInfoQuery;
/*     */     //   496: pop
/*     */     //   497: aload #8
/*     */     //   499: invokestatic isNotBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   502: ifeq -> 520
/*     */     //   505: aload_3
/*     */     //   506: ldc_w '{C_'
/*     */     //   509: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   512: aload #8
/*     */     //   514: invokeinterface processVariableValueEquals : (Ljava/lang/String;Ljava/lang/Object;)Lorg/activiti/engine/task/TaskInfoQuery;
/*     */     //   519: pop
/*     */     //   520: aload #9
/*     */     //   522: invokestatic isNotBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   525: ifeq -> 537
/*     */     //   528: aload_3
/*     */     //   529: aload #9
/*     */     //   531: invokeinterface processInstanceId : (Ljava/lang/String;)Lorg/activiti/engine/task/TaskInfoQuery;
/*     */     //   536: pop
/*     */     //   537: aload_3
/*     */     //   538: dup
/*     */     //   539: invokeinterface count : ()J
/*     */     //   544: invokestatic valueOf : (J)Ljava/lang/Long;
/*     */     //   547: astore #10
/*     */     //   549: iload #5
/*     */     //   551: iload #6
/*     */     //   553: invokeinterface listPage : (II)Ljava/util/List;
/*     */     //   558: dup
/*     */     //   559: astore #4
/*     */     //   561: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   566: dup
/*     */     //   567: astore #12
/*     */     //   569: invokeinterface hasNext : ()Z
/*     */     //   574: ifeq -> 802
/*     */     //   577: aload #12
/*     */     //   579: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   584: checkcast org/activiti/engine/history/HistoricTaskInstance
/*     */     //   587: dup
/*     */     //   588: astore #13
/*     */     //   590: invokeinterface getProcessVariables : ()Ljava/util/Map;
/*     */     //   595: astore #14
/*     */     //   597: aload_0
/*     */     //   598: aload #13
/*     */     //   600: invokeinterface getProcessInstanceId : ()Ljava/lang/String;
/*     */     //   605: aload #7
/*     */     //   607: aload #14
/*     */     //   609: invokespecial createApproval : (Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/example/emos/workflow/bo/Approval;
/*     */     //   612: astore #15
/*     */     //   614: aload #12
/*     */     //   616: aload_2
/*     */     //   617: aload #15
/*     */     //   619: dup
/*     */     //   620: aload #13
/*     */     //   622: invokeinterface getId : ()Ljava/lang/String;
/*     */     //   627: invokevirtual setTaskId : (Ljava/lang/String;)V
/*     */     //   630: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   633: pop
/*     */     //   634: goto -> 569
/*     */     //   637: nop
/*     */     //   638: nop
/*     */     //   639: athrow
/*     */     //   640: ldc_w '嶹纉朔'
/*     */     //   643: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   646: aload #7
/*     */     //   648: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   651: ifeq -> 802
/*     */     //   654: aload_0
/*     */     //   655: getfield historyService : Lorg/activiti/engine/HistoryService;
/*     */     //   658: invokeinterface createHistoricTaskInstanceQuery : ()Lorg/activiti/engine/history/HistoricTaskInstanceQuery;
/*     */     //   663: invokeinterface orderByHistoricTaskInstanceStartTime : ()Lorg/activiti/engine/history/HistoricTaskInstanceQuery;
/*     */     //   668: invokeinterface desc : ()Lorg/activiti/engine/query/Query;
/*     */     //   673: checkcast org/activiti/engine/history/HistoricTaskInstanceQuery
/*     */     //   676: invokeinterface includeTaskLocalVariables : ()Lorg/activiti/engine/task/TaskInfoQuery;
/*     */     //   681: checkcast org/activiti/engine/history/HistoricTaskInstanceQuery
/*     */     //   684: invokeinterface includeProcessVariables : ()Lorg/activiti/engine/task/TaskInfoQuery;
/*     */     //   689: checkcast org/activiti/engine/history/HistoricTaskInstanceQuery
/*     */     //   692: aload #11
/*     */     //   694: invokeinterface taskAssigneeIds : (Ljava/util/List;)Lorg/activiti/engine/task/TaskInfoQuery;
/*     */     //   699: checkcast org/activiti/engine/history/HistoricTaskInstanceQuery
/*     */     //   702: invokeinterface finished : ()Lorg/activiti/engine/history/HistoricTaskInstanceQuery;
/*     */     //   707: invokeinterface processFinished : ()Lorg/activiti/engine/history/HistoricTaskInstanceQuery;
/*     */     //   712: dup
/*     */     //   713: astore_3
/*     */     //   714: iload #5
/*     */     //   716: iload #6
/*     */     //   718: invokeinterface listPage : (II)Ljava/util/List;
/*     */     //   723: dup
/*     */     //   724: astore #4
/*     */     //   726: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   731: dup
/*     */     //   732: astore #12
/*     */     //   734: invokeinterface hasNext : ()Z
/*     */     //   739: ifeq -> 802
/*     */     //   742: aload #12
/*     */     //   744: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   749: checkcast org/activiti/engine/history/HistoricTaskInstance
/*     */     //   752: dup
/*     */     //   753: astore #13
/*     */     //   755: invokeinterface getProcessVariables : ()Ljava/util/Map;
/*     */     //   760: astore #14
/*     */     //   762: aload_0
/*     */     //   763: aload #13
/*     */     //   765: invokeinterface getProcessInstanceId : ()Ljava/lang/String;
/*     */     //   770: aload #7
/*     */     //   772: aload #14
/*     */     //   774: invokespecial createApproval : (Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/example/emos/workflow/bo/Approval;
/*     */     //   777: astore #15
/*     */     //   779: aload #12
/*     */     //   781: aload_2
/*     */     //   782: aload #15
/*     */     //   784: dup
/*     */     //   785: aload #13
/*     */     //   787: invokeinterface getId : ()Ljava/lang/String;
/*     */     //   792: invokevirtual setTaskId : (Ljava/lang/String;)V
/*     */     //   795: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   798: pop
/*     */     //   799: goto -> 734
/*     */     //   802: new java/util/HashMap
/*     */     //   805: dup
/*     */     //   806: invokespecial <init> : ()V
/*     */     //   809: dup
/*     */     //   810: astore_3
/*     */     //   811: ldc_w 'cS|N'
/*     */     //   814: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   817: aload_2
/*     */     //   818: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   821: aload_3
/*     */     //   822: ldc_w '.$.*6\\b5>4?'
/*     */     //   825: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   828: aload #10
/*     */     //   830: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   833: aload_3
/*     */     //   834: dup_x2
/*     */     //   835: ldc_w 'Jn]jsa^jB'
/*     */     //   838: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   841: iload #5
/*     */     //   843: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   846: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   849: aload_3
/*     */     //   850: ldc_w '**=.\\t" .'
/*     */     //   853: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   856: iload #6
/*     */     //   858: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   861: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   864: pop2
/*     */     //   865: pop2
/*     */     //   866: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #31	-> 0
/*     */     //   #45	-> 8
/*     */     //   #157	-> 24
/*     */     //   #36	-> 38
/*     */     //   #58	-> 55
/*     */     //   #134	-> 72
/*     */     //   #150	-> 86
/*     */     //   #127	-> 98
/*     */     //   #356	-> 108
/*     */     //   #488	-> 118
/*     */     //   #307	-> 124
/*     */     //   #409	-> 135
/*     */     //   #532	-> 166
/*     */     //   #403	-> 174
/*     */     //   #406	-> 187
/*     */     //   #473	-> 212
/*     */     //   #327	-> 239
/*     */     //   #410	-> 246
/*     */     //   #509	-> 259
/*     */     //   #268	-> 267
/*     */     //   #506	-> 281
/*     */     //   #337	-> 289
/*     */     //   #569	-> 298
/*     */     //   #571	-> 310
/*     */     //   #516	-> 322
/*     */     //   #387	-> 351
/*     */     //   #408	-> 358
/*     */     //   #470	-> 391
/*     */     //   #477	-> 395
/*     */     //   #436	-> 399
/*     */     //   #400	-> 403
/*     */     //   #270	-> 417
/*     */     //   #398	-> 426
/*     */     //   #321	-> 439
/*     */     //   #514	-> 457
/*     */     //   #290	-> 476
/*     */     //   #568	-> 483
/*     */     //   #355	-> 497
/*     */     //   #272	-> 505
/*     */     //   #474	-> 520
/*     */     //   #452	-> 528
/*     */     //   #294	-> 537
/*     */     //   #325	-> 549
/*     */     //   #500	-> 561
/*     */     //   #490	-> 590
/*     */     //   #526	-> 597
/*     */     //   #304	-> 630
/*     */     //   #388	-> 634
/*     */     //   #541	-> 637
/*     */     //   #277	-> 640
/*     */     //   #479	-> 654
/*     */     //   #258	-> 663
/*     */     //   #243	-> 676
/*     */     //   #241	-> 694
/*     */     //   #435	-> 714
/*     */     //   #412	-> 726
/*     */     //   #460	-> 755
/*     */     //   #295	-> 762
/*     */     //   #394	-> 795
/*     */     //   #522	-> 799
/*     */     //   #317	-> 802
/*     */     //   #259	-> 811
/*     */     //   #378	-> 811
/*     */     //   #341	-> 821
/*     */     //   #446	-> 833
/*     */     //   #521	-> 849
/*     */     //   #454	-> 866
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	867	0	a	Lcom/example/emos/workflow/service/impl/WorkflowServiceImpl;
/*     */     //   0	867	1	a	Ljava/util/HashMap;
/*     */   }
/*     */ 
/*     */   
/*     */   public String startLeaveProcess(HashMap hashMap) {
/*     */     return this.runtimeService.startProcessInstanceByKey(TbAmect.ALLATORIxDEMO("Vj[y_"), hashMap).getProcessInstanceId();
/*     */   }
/*     */ 
/*     */   
/*     */   public void archiveTask(HashMap hashMap) {
/*     */     String str = MapUtil.getStr(hashMap, EmosWorkflowApplication.ALLATORIxDEMO(".*) \023/"));
/*     */     int i = MapUtil.getInt(hashMap, TbAmect.ALLATORIxDEMO("zIjHF^")).intValue();
/*     */     JSONArray jSONArray = (JSONArray)hashMap.get(EmosWorkflowApplication.ALLATORIxDEMO("-3'?8"));
/*     */     this.taskService.setVariable(str, TbAmect.ALLATORIxDEMO("\\fVjI"), jSONArray);
/*     */     this.taskService.setVariable(str, EmosWorkflowApplication.ALLATORIxDEMO("<\"6\"4,"), Boolean.valueOf(false));
/*     */     super();
/*     */     str.setOwner((String)new StringBuilder(), str.append(i).append("").toString());
/* 239 */     ((com.example.emos.workflow.service.impl.WorkflowServiceImpl)this.taskService).taskService.setAssignee(str, i + "");
/*     */     this.taskService.complete(str);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String startReimProcess(HashMap hashMap) {
/*     */     return this.runtimeService.startProcessInstanceByKey(EmosWorkflowApplication.ALLATORIxDEMO("(.3&"), hashMap).getProcessInstanceId();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void deleteProcessById(String str1, String str2, String str3, String str4) {
/*     */     long l;
/*     */     if ((l = this.runtimeService.createProcessInstanceQuery().processInstanceId(str2).count()) > 0L) {
/*     */       this.runtimeService.deleteProcessInstance(str2, str4);
/*     */     }
/*     */     if ((l = this.historyService.createHistoricProcessInstanceQuery().processInstanceId(str2).count()) > 0L) {
/*     */       this.historyService.deleteHistoricProcessInstance(str2);
/*     */     }
/*     */     if (str3.equals(TbAmect.ALLATORIxDEMO("伕讔甼词"))) {
/*     */       this.quartzUtil.deleteJob(str1, EmosWorkflowApplication.ALLATORIxDEMO("佑说彋妑亰勻纏"));
/*     */       this.quartzUtil.deleteJob(str1, TbAmect.ALLATORIxDEMO("传计绩材仁劮绾"));
/*     */       this.quartzUtil.deleteJob(str1, EmosWorkflowApplication.ALLATORIxDEMO("佀该嶿众洛纏"));
/*     */       this.quartzUtil.deleteJob(str1, TbAmect.ALLATORIxDEMO("刔廀伕讔宫sK仁劮绾"));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean searchProcessStatus(String str) {
/*     */     if ((ProcessInstance)this.runtimeService.createProcessInstanceQuery().processInstanceId(str).singleResult() != null) {
/*     */       return false;
/*     */     }
/*     */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void turnTask(int i, int j) {
/* 288 */     ((TaskQuery)this.taskService.createTaskQuery().taskAssignee(i + "")).list().forEach(task -> {
/*     */           this.taskService.setOwner(task.getId(), i + "");
/*     */           this.taskService.setAssignee(task.getId(), i + "");
/*     */         });
/*     */   }
/*     */   
/*     */   public ArrayList searchUserTaskListByPage(HashMap hashMap) {
/*     */     Integer integer = (Integer)hashMap.get(TbAmect.ALLATORIxDEMO("zIjHF^"));
/*     */     ArrayList arrayList = new ArrayList();
/*     */     int i = ((Integer)hashMap.get(EmosWorkflowApplication.ALLATORIxDEMO("**=."))).intValue();
/*     */     int j = ((Integer)hashMap.get(TbAmect.ALLATORIxDEMO("c_a]{R"))).intValue();
/*     */     i = (i - 1) * j;
/*     */     String str = (String)hashMap.get(EmosWorkflowApplication.ALLATORIxDEMO(".2*."));
/*     */     if (TbAmect.ALLATORIxDEMO("徿宮扃").equals(str));
/*     */     if (EmosWorkflowApplication.ALLATORIxDEMO("嶹寻戲").equals(str)) {
/*     */       List<?> list;
/*     */       (list = ((HistoricTaskInstanceQuery)((HistoricTaskInstanceQuery)((HistoricTaskInstanceQuery)((HistoricTaskInstanceQuery)((HistoricTaskInstanceQuery)this.historyService.createHistoricTaskInstanceQuery().includeTaskLocalVariables()).includeProcessVariables()).taskAssignee(integer.toString())).finished().orderByTaskCreateTime()).desc()).list()).forEach(historicTaskInstance -> {
/*     */             String str1 = historicTaskInstance.getProcessInstanceId();
/*     */             String str2 = historicTaskInstance.getProcessDefinitionId();
/*     */             String str3 = historicTaskInstance.getTaskLocalVariables().get(EmosWorkflowApplication.ALLATORIxDEMO("(.)>6?")).toString();
/*     */             if (str2.contains(TbAmect.ALLATORIxDEMO("Wj_{Sa]"))) {
/*     */               HashMap<String, String> hashMap;
/*     */               hashMap.put(EmosWorkflowApplication.ALLATORIxDEMO("(.)>6?\005z"), str3);
/*     */             } 
/*     */           });
/*     */     } 
/*     */     return arrayList;
/*     */   }
/*     */   
/*     */   public String startMeetingProcess(HashMap hashMap) {
/*     */     JobDetail jobDetail;
/*     */     JobDataMap<String, String> jobDataMap;
/*     */     String str2 = this.runtimeService.startProcessInstanceByKey(EmosWorkflowApplication.ALLATORIxDEMO("&?..\"4,"), hashMap).getProcessInstanceId();
/*     */     String str1 = hashMap.get(TbAmect.ALLATORIxDEMO("zOf^")).toString();
/*     */     String str3 = hashMap.get(EmosWorkflowApplication.ALLATORIxDEMO(">*..")).toString();
/*     */     String str4 = hashMap.get(TbAmect.ALLATORIxDEMO("I{[}N")).toString();
/*     */     DateTime dateTime = DateUtil.parse((new StringBuilder()).insert(0, str3).append(EmosWorkflowApplication.ALLATORIxDEMO("k")).append(str4).toString(), TbAmect.ALLATORIxDEMO("CvCv\027Bw\"^k\032Gr5Wb\000|I"));
/*     */     this.quartzUtil.addJob(jobDetail, str1, EmosWorkflowApplication.ALLATORIxDEMO("佀该嶿众洛纏"), (Date)dateTime);
/*     */     jobDataMap.put(TbAmect.ALLATORIxDEMO("fT|NnTl_F^"), str2);
/*     */     return str2;
/*     */   }
/*     */   
/*     */   public void approvalTask(HashMap hashMap) {
/*     */     String str1 = MapUtil.getStr(hashMap, TbAmect.ALLATORIxDEMO("{[|QF^"));
/*     */     String str2 = MapUtil.getStr(hashMap, EmosWorkflowApplication.ALLATORIxDEMO(";;*95=;'"));
/*     */     this.taskService.setVariableLocal(str1, TbAmect.ALLATORIxDEMO("}_|OcN"), str2);
/*     */     this.taskService.complete(str1);
/*     */   }
/*     */   
/*     */   public HashMap searchApprovalContent(String a, int a, String[] a, String a, String a) {
/*     */     // Byte code:
/*     */     //   0: aconst_null
/*     */     //   1: astore #6
/*     */     //   3: new java/util/ArrayList
/*     */     //   6: dup
/*     */     //   7: invokespecial <init> : ()V
/*     */     //   10: astore #7
/*     */     //   12: new java/lang/StringBuilder
/*     */     //   15: aload #7
/*     */     //   17: dup_x1
/*     */     //   18: dup
/*     */     //   19: pop2
/*     */     //   20: dup
/*     */     //   21: invokespecial <init> : ()V
/*     */     //   24: iload_2
/*     */     //   25: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   28: ldc ''
/*     */     //   30: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   33: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   36: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   41: aload_3
/*     */     //   42: astore_2
/*     */     //   43: pop
/*     */     //   44: aload_2
/*     */     //   45: arraylength
/*     */     //   46: istore_3
/*     */     //   47: iconst_0
/*     */     //   48: dup
/*     */     //   49: istore #8
/*     */     //   51: iload_3
/*     */     //   52: if_icmpge -> 80
/*     */     //   55: aload_2
/*     */     //   56: iload #8
/*     */     //   58: aaload
/*     */     //   59: astore #9
/*     */     //   61: iinc #8, 1
/*     */     //   64: aload #7
/*     */     //   66: aload #9
/*     */     //   68: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   73: pop
/*     */     //   74: iload #8
/*     */     //   76: goto -> 51
/*     */     //   79: athrow
/*     */     //   80: ldc_w '伕讔甼词'
/*     */     //   83: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   86: aload #4
/*     */     //   88: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   91: ifeq -> 110
/*     */     //   94: aload_0
/*     */     //   95: getfield meetingService : Lcom/example/emos/workflow/service/MeetingService;
/*     */     //   98: aload_1
/*     */     //   99: invokeinterface searchMeetingByInstanceId : (Ljava/lang/String;)Ljava/util/HashMap;
/*     */     //   104: astore #6
/*     */     //   106: goto -> 165
/*     */     //   109: athrow
/*     */     //   110: ldc_w '吂嶮训倌'
/*     */     //   113: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   116: aload #4
/*     */     //   118: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   121: ifeq -> 139
/*     */     //   124: aload_0
/*     */     //   125: getfield leaveService : Lcom/example/emos/workflow/service/LeaveService;
/*     */     //   128: aload_1
/*     */     //   129: invokeinterface searchLeaveByInstanceId : (Ljava/lang/String;)Ljava/util/HashMap;
/*     */     //   134: astore #6
/*     */     //   136: goto -> 165
/*     */     //   139: ldc_w '抪锺甼词'
/*     */     //   142: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   145: aload #4
/*     */     //   147: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   150: ifeq -> 165
/*     */     //   153: aload_0
/*     */     //   154: getfield reimService : Lcom/example/emos/workflow/service/ReimService;
/*     */     //   157: aload_1
/*     */     //   158: invokeinterface searchReimByInstanceId : (Ljava/lang/String;)Ljava/util/HashMap;
/*     */     //   163: astore #6
/*     */     //   165: ldc_w '嶹纉朔'
/*     */     //   168: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   171: aload #5
/*     */     //   173: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   176: aload_0
/*     */     //   177: swap
/*     */     //   178: ifne -> 195
/*     */     //   181: getfield runtimeService : Lorg/activiti/engine/RuntimeService;
/*     */     //   184: aload_1
/*     */     //   185: invokeinterface getVariables : (Ljava/lang/String;)Ljava/util/Map;
/*     */     //   190: dup
/*     */     //   191: astore_2
/*     */     //   192: goto -> 266
/*     */     //   195: getfield historyService : Lorg/activiti/engine/HistoryService;
/*     */     //   198: invokeinterface createHistoricTaskInstanceQuery : ()Lorg/activiti/engine/history/HistoricTaskInstanceQuery;
/*     */     //   203: invokeinterface includeTaskLocalVariables : ()Lorg/activiti/engine/task/TaskInfoQuery;
/*     */     //   208: checkcast org/activiti/engine/history/HistoricTaskInstanceQuery
/*     */     //   211: invokeinterface includeProcessVariables : ()Lorg/activiti/engine/task/TaskInfoQuery;
/*     */     //   216: checkcast org/activiti/engine/history/HistoricTaskInstanceQuery
/*     */     //   219: aload_1
/*     */     //   220: invokeinterface processInstanceId : (Ljava/lang/String;)Lorg/activiti/engine/task/TaskInfoQuery;
/*     */     //   225: checkcast org/activiti/engine/history/HistoricTaskInstanceQuery
/*     */     //   228: aload #7
/*     */     //   230: invokeinterface taskAssigneeIds : (Ljava/util/List;)Lorg/activiti/engine/task/TaskInfoQuery;
/*     */     //   235: checkcast org/activiti/engine/history/HistoricTaskInstanceQuery
/*     */     //   238: invokeinterface processFinished : ()Lorg/activiti/engine/history/HistoricTaskInstanceQuery;
/*     */     //   243: invokeinterface list : ()Ljava/util/List;
/*     */     //   248: iconst_0
/*     */     //   249: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   254: checkcast org/activiti/engine/history/HistoricTaskInstance
/*     */     //   257: dup
/*     */     //   258: astore_3
/*     */     //   259: invokeinterface getProcessVariables : ()Ljava/util/Map;
/*     */     //   264: dup
/*     */     //   265: astore_2
/*     */     //   266: ifnull -> 313
/*     */     //   269: aload_2
/*     */     //   270: ldc_w '\fVjI'
/*     */     //   273: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   276: invokeinterface containsKey : (Ljava/lang/Object;)Z
/*     */     //   281: ifeq -> 313
/*     */     //   284: aload_2
/*     */     //   285: ldc_w '-3'?8'
/*     */     //   288: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   291: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   296: checkcast com/fasterxml/jackson/databind/node/ArrayNode
/*     */     //   299: astore_3
/*     */     //   300: aload #6
/*     */     //   302: ldc_w '\fVjI'
/*     */     //   305: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   308: aload_3
/*     */     //   309: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   312: pop
/*     */     //   313: aload_0
/*     */     //   314: getfield runtimeService : Lorg/activiti/engine/RuntimeService;
/*     */     //   317: invokeinterface createProcessInstanceQuery : ()Lorg/activiti/engine/runtime/ProcessInstanceQuery;
/*     */     //   322: aload_1
/*     */     //   323: invokeinterface processInstanceId : (Ljava/lang/String;)Lorg/activiti/engine/runtime/ProcessInstanceQuery;
/*     */     //   328: invokeinterface singleResult : ()Ljava/lang/Object;
/*     */     //   333: checkcast org/activiti/engine/runtime/ProcessInstance
/*     */     //   336: dup
/*     */     //   337: astore_3
/*     */     //   338: aload #6
/*     */     //   340: swap
/*     */     //   341: ifnull -> 359
/*     */     //   344: ldc_w '(.)>6?'
/*     */     //   347: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   350: ldc ''
/*     */     //   352: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   355: pop
/*     */     //   356: aload #6
/*     */     //   358: areturn
/*     */     //   359: ldc_w '}_|OcN'
/*     */     //   362: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   365: aload_2
/*     */     //   366: ldc_w '(.)>6?'
/*     */     //   369: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   372: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   377: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   380: pop
/*     */     //   381: aload #6
/*     */     //   383: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #330	-> 0
/*     */     //   #455	-> 3
/*     */     //   #424	-> 12
/*     */     //   #323	-> 41
/*     */     //   #420	-> 64
/*     */     //   #323	-> 73
/*     */     //   #496	-> 80
/*     */     //   #461	-> 94
/*     */     //   #498	-> 110
/*     */     //   #492	-> 124
/*     */     //   #261	-> 139
/*     */     //   #476	-> 153
/*     */     //   #281	-> 165
/*     */     //   #283	-> 181
/*     */     //   #359	-> 195
/*     */     //   #495	-> 203
/*     */     //   #426	-> 259
/*     */     //   #285	-> 266
/*     */     //   #346	-> 284
/*     */     //   #318	-> 300
/*     */     //   #429	-> 313
/*     */     //   #247	-> 338
/*     */     //   #300	-> 344
/*     */     //   #299	-> 359
/*     */     //   #534	-> 381
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	384	0	a	Lcom/example/emos/workflow/service/impl/WorkflowServiceImpl;
/*     */     //   0	384	1	a	Ljava/lang/String;
/*     */     //   0	384	2	a	I
/*     */     //   0	384	3	a	[Ljava/lang/String;
/*     */     //   0	384	4	a	Ljava/lang/String;
/*     */     //   0	384	5	a	Ljava/lang/String;
/*     */   }
/*     */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\service\impl\WorkflowServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */