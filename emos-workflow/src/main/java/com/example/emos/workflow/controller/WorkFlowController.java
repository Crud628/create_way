/*     */ package BOOT-INF.classes.com.example.emos.workflow.controller;@RestController
/*     */ @RequestMapping({"/workflow"})
/*     */ public class WorkFlowController { @Autowired
/*     */   private HistoryService historyService; @Autowired
/*     */   private ProcessEngine processEngine; @Autowired
/*     */   private RepositoryService repositoryService;
/*     */   @Autowired
/*     */   private WorkflowService workflowService;
/*     */   @Autowired
/*     */   private RuntimeService runtimeService;
/*     */   @Autowired
/*     */   private TaskService taskService;
/*     */   
/*     */   @PostMapping({"/startReimProcess"})
/*     */   public R startReimProcess(@Valid @RequestBody StartReimProcessForm a) {
/*     */     HashMap<String, String> hashMap;
/*     */     String str2;
/*  18 */     if ((str2 = checkCode(a.getCode())) != null)
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 177 */       return R.error(str2);
/*     */     }
/*     */     if (!checkTcode(a.getTcode())) {
/*     */       throw new EmosException(TbLeave.ALLATORIxDEMO("V\017M\bG乡歁砂"));
/*     */     }
/*     */     String str1 = this.workflowService.startReimProcess(hashMap);
/*     */     hashMap.remove(TbLeave.ALLATORIxDEMO("A\003F\t"));
/*     */     hashMap.put(TbLeave.ALLATORIxDEMO("A\036G\rV\tf\rV\t"), DateUtil.today());
/*     */     return R.ok().put(TbLeave.ALLATORIxDEMO("K\002Q\030C\002A\tk\b"), str1);
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
/*     */   @PostMapping({"/startMeetingProcess"})
/*     */   public R startMeetingProcess(@Valid @RequestBody StartMeetingProcessForm a) {
/*     */     String str2;
/*     */     if ((str2 = checkCode(a.getCode())) != null) {
/*     */       return R.error(str2);
/*     */     }
/* 202 */     if (!checkTcode(a.getTcode())) {
/*     */       throw new EmosException(TbLeave.ALLATORIxDEMO("V\017M\bG乡歁砂"));
/*     */     }
/*     */     
/*     */     HashMap<String, String> hashMap = (HashMap)JSONUtil.parse(a).toBean(HashMap.class);
/*     */     
/*     */     hashMap.remove(TbLeave.ALLATORIxDEMO("A\003F\t"));
/*     */     hashMap.put(TbLeave.ALLATORIxDEMO("A\036G\rV\tf\rV\t"), DateUtil.today());
/*     */     if (hashMap.put(TbLeave.ALLATORIxDEMO("V\025R\t"), TbLeave.ALLATORIxDEMO("伸诂甑讛")).getGmId() == null) {
/*     */       hashMap.put(TbLeave.ALLATORIxDEMO("P\tQ\031N\030"), TbLeave.ALLATORIxDEMO("吮慣"));
/*     */     }
/*     */     hashMap.put(TbLeave.ALLATORIxDEMO("K\bG\002V\005V\025"), TbLeave.ALLATORIxDEMO("呺嶉"));
/*     */     String str1 = this.workflowService.startMeetingProcess(hashMap);
/* 215 */     return R.ok().put(TbLeave.ALLATORIxDEMO("K\002Q\030C\002A\tk\b"), str1);
/*     */   } @PostMapping({"/approvalTask"}) public R approvalTask(@Valid @RequestBody ApprovalTaskForm a) { HashMap<Object, Object> hashMap; String str; if ((str = checkCode(a.getCode())) != null) return R.error(str);  if (!checkTcode(a.getTcode()))
/*     */       throw new EmosException(TbLeave.ALLATORIxDEMO("V\017M\bG乡歁砂"));  this.workflowService.approvalTask(hashMap); hashMap.put(TbLeave.ALLATORIxDEMO("C\034R\036M\032C\000"), a.getApproval()); return R.ok(); } @PostMapping({"/searchProcessStatus"}) public R searchProcessStatus(@Valid @RequestBody SearchProcessStatusForm a) { String str; if ((str = checkCode(a.getCode())) != null)
/* 218 */       return R.error(str);  if (!checkTcode(a.getTcode()))
/*     */       throw new EmosException(TbLeave.ALLATORIxDEMO("V\017M\bG乡歁砂"));  if (!this.workflowService.searchProcessStatus(a.getInstanceId()))
/* 220 */       return R.ok().put(TbLeave.ALLATORIxDEMO("P\tQ\031N\030"), TbLeave.ALLATORIxDEMO("杆绱朳"));  return R.ok().put(TbLeave.ALLATORIxDEMO("P\tQ\031N\030"), TbLeave.ALLATORIxDEMO("嶞绱朳")); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @PostMapping({"/searchUserTaskListByPage"})
/*     */   public R searchUserTaskListByPage(@Valid @RequestBody SearchUserTaskListByPageForm a) {
/*     */     String str;
/*     */     if ((str = checkCode(a.getCode())) != null) {
/* 238 */       return R.error(str);
/*     */     }
/*     */     if (!checkTcode(a.getTcode())) {
/*     */       throw new EmosException(TbLeave.ALLATORIxDEMO("V\017M\bG乡歁砂"));
/*     */     }
/*     */     ArrayList arrayList = this.workflowService.searchUserTaskListByPage(hashMap);
/*     */     HashMap<?, ?> hashMap;
/*     */     (hashMap = (HashMap<?, ?>)JSONUtil.parse(a).toBean(HashMap.class)).remove(TbLeave.ALLATORIxDEMO("A\003F\t"));
/*     */     return R.ok().put(TbLeave.ALLATORIxDEMO("P\tQ\031N\030"), arrayList);
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
/*     */   @PostMapping({"/searchProcessUsers"})
/*     */   public R searchProcessUsers(@Valid @RequestBody SearchProcessUsersForm a) {
/*     */     String str;
/*     */     if ((str = checkCode(a.getCode())) != null) {
/*     */       return R.error(str);
/*     */     }
/*     */     if (!checkTcode(a.getTcode())) {
/*     */       throw new EmosException(TbLeave.ALLATORIxDEMO("V\017M\bG乡歁砂"));
/*     */     }
/*     */     ArrayList arrayList = this.workflowService.searchProcessUsers(a.getInstanceId());
/*     */     return R.ok().put(TbLeave.ALLATORIxDEMO("P\tQ\031N\030"), arrayList);
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
/*     */   @PostMapping({"/archiveTask"})
/*     */   public R archiveTask(@Valid @RequestBody ArchiveTaskForm a) {
/*     */     if (!JSONUtil.isJsonArray(a.getFiles())) {
/*     */       return R.error(TbLeave.ALLATORIxDEMO("\nK\000G\037丯晃h?m\"敒纨"));
/*     */     }
/*     */     if (!checkTcode(a.getTcode())) {
/*     */       throw new EmosException(TbLeave.ALLATORIxDEMO("V\017M\bG乡歁砂"));
/*     */     }
/*     */     String str;
/*     */     if ((str = checkCode(a.getCode())) != null) {
/*     */       return R.error(str);
/*     */     }
/*     */     Object object = new Object(this, a);
/*     */     this.workflowService.archiveTask((HashMap)object);
/*     */     return R.ok();
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
/*     */   @PostMapping({"/deleteProcessById"})
/*     */   public R deleteProcessById(@Valid @RequestBody DeleteProcessByIdForm a) {
/*     */     String str;
/*     */     if ((str = checkCode(a.getCode())) != null) {
/*     */       return R.error(str);
/*     */     }
/*     */     if (!checkTcode(a.getTcode())) {
/*     */       throw new EmosException(TbLeave.ALLATORIxDEMO("V\017M\bG乡歁砂"));
/*     */     }
/*     */     this.workflowService.deleteProcessById(a.getUuid(), a.getInstanceId(), a.getType(), a.getReason());
/*     */     return R.ok();
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
/*     */   @PostMapping({"/startLeaveProcess"})
/*     */   public R startLeaveProcess(@Valid @RequestBody StartLeaveProcessForm a) {
/*     */     HashMap<String, String> hashMap;
/*     */     String str2;
/*     */     if ((str2 = checkCode(a.getCode())) != null) {
/*     */       return R.error(str2);
/*     */     }
/*     */     if (!checkTcode(a.getTcode())) {
/*     */       throw new EmosException(TbLeave.ALLATORIxDEMO("V\017M\bG乡歁砂"));
/*     */     }
/*     */     String str1 = this.workflowService.startLeaveProcess(hashMap);
/*     */     hashMap.remove(TbLeave.ALLATORIxDEMO("A\003F\t"));
/*     */     hashMap.put(TbLeave.ALLATORIxDEMO("A\036G\rV\tf\rV\t"), DateUtil.today());
/*     */     return R.ok().put(TbLeave.ALLATORIxDEMO("K\002Q\030C\002A\tk\b"), str1);
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
/*     */   @PostMapping({"/turnTask"})
/*     */   public R turnTask(@Valid @RequestBody TuneTaskForm a) {
/*     */     String str;
/* 362 */     if ((str = checkCode(a.getCode())) != null) {
/*     */       throw new EmosException(str);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 520 */     if (!checkTcode(a.getTcode())) {
/*     */       throw new EmosException(TbLeave.ALLATORIxDEMO("V\017M\bG乡歁砂"));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 550 */     this.workflowService.turnTask(a.getUserId().intValue(), a.getAssigneeId().intValue()); return R.ok(); } @PostMapping({"/searchTaskByPage"}) public R searchTaskByPage(@Valid @RequestBody SearchTaskByPageForm a) { HashMap<String, Integer> hashMap1; String str; if ((str = checkCode(a.getCode())) != null) return R.error(str);  if (!checkTcode(a.getTcode()))
/* 551 */       throw new EmosException(TbLeave.ALLATORIxDEMO("V\017M\bG乡歁砂"));  int i = a.getPage().intValue(); int j = a.getLength().intValue(); i = (i - 1) * j; HashMap hashMap = this.workflowService.searchTaskByPage(hashMap1); hashMap1.put(TbLeave.ALLATORIxDEMO("\037V\rP\030"), Integer.valueOf(i));
/*     */     return R.ok().put(TbLeave.ALLATORIxDEMO("R\rE\t"), hashMap); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @PostMapping({"/searchApprovalBpmn"})
/*     */   public void searchApprovalBpmn(@Valid @RequestBody SearchApprovalBpmnForm form, HttpServletResponse a) {
/*     */     String str;
/*     */     if ((str = checkCode(form.getCode())) != null)
/* 568 */       throw new EmosException(str);  if (!checkTcode(form.getTcode()))
/* 569 */       throw new EmosException(TbLeave.ALLATORIxDEMO("V\017M\bG乡歁砂"));  a.setContentType(TbLeave.ALLATORIxDEMO("\005O\rE\t\r\006R\013")); Task task; if ((task = (Task)((TaskQuery)this.processEngine.getTaskService().createTaskQuery().processInstanceId(form.getInstanceId())).singleResult()) != null) { BpmnModel bpmnModel1 = this.repositoryService.getBpmnModel(task.getProcessDefinitionId()); List list = this.runtimeService.getActiveActivityIds(task.getExecutionId()); }  HistoricTaskInstance historicTaskInstance = ((HistoricTaskInstanceQuery)this.historyService.createHistoricTaskInstanceQuery().processInstanceId(form.getInstanceId())).list().get(0); BpmnModel bpmnModel = this.repositoryService.getBpmnModel(historicTaskInstance.getProcessDefinitionId()); ArrayList arrayList = new ArrayList(); Map map = bpmnModel.getItemDefinitions(); DefaultProcessDiagramGenerator defaultProcessDiagramGenerator = new DefaultProcessDiagramGenerator(); try { InputStream inputStream = defaultProcessDiagramGenerator.generateDiagram(bpmnModel, TbLeave.ALLATORIxDEMO("\006R\013"), arrayList, arrayList, TbLeave.ALLATORIxDEMO("宩伿"), TbLeave.ALLATORIxDEMO("宩伿"), TbLeave.ALLATORIxDEMO("宩伿"), this.processEngine.getProcessEngineConfiguration().getProcessEngineConfiguration().getClassLoader(), 1.0D); try { BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream); try { ServletOutputStream servletOutputStream = a.getOutputStream(); try { BufferedOutputStream bufferedOutputStream = new BufferedOutputStream((OutputStream)servletOutputStream); try { IOUtils.copy(bufferedInputStream, bufferedOutputStream); bufferedOutputStream.close(); } catch (Throwable throwable) { try { bufferedOutputStream.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }  servletOutputStream.close(); } catch (Throwable throwable) { if (servletOutputStream != null) { try { servletOutputStream.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }  }  throwable.close(); } catch (Throwable throwable) { try { bufferedInputStream.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }  if (throwable != null) { inputStream.close(); return; }  } catch (Throwable throwable) { if (inputStream != null) { try { inputStream.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }  }  } catch (Exception exception) { exception.printStackTrace(); }  } @PostMapping({"/searchApprovalContent"}) public R searchApprovalContent(@Valid @RequestBody SearchApprovalContentForm a) { String str; if ((str = checkCode(a.getCode())) != null)
/*     */       return R.error(str); 
/*     */     if (!checkTcode(a.getTcode()))
/*     */       throw new EmosException(TbLeave.ALLATORIxDEMO("V\017M\bG乡歁砂")); 
/*     */     HashMap hashMap = this.workflowService.searchApprovalContent(a.getInstanceId(), a.getUserId().intValue(), a.getRole(), a.getType(), a.getStatus());
/*     */     return R.ok().put(TbLeave.ALLATORIxDEMO("\017M\002V\tL\030"), hashMap); }
/*     */    }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\controller\WorkFlowController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */