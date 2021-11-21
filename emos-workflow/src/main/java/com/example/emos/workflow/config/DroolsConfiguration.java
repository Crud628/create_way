/*     */ package BOOT-INF.classes.com.example.emos.workflow.config;
/*     */ 
/*     */ import com.example.emos.workflow.db.pojo.TbAmect;
/*     */ import com.example.emos.workflow.db.pojo.TbUser;
/*     */ import java.io.IOException;
/*     */ import java.util.Objects;
/*     */ import org.kie.api.KieBase;
/*     */ import org.kie.api.KieServices;
/*     */ import org.kie.api.builder.KieFileSystem;
/*     */ import org.kie.api.builder.KieRepository;
/*     */ import org.kie.api.runtime.KieContainer;
/*     */ import org.kie.api.runtime.KieSession;
/*     */ import org.kie.internal.io.ResourceFactory;
/*     */ import org.kie.spring.KModuleBeanFactoryPostProcessor;
/*     */ import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
/*     */ import org.springframework.context.annotation.Bean;
/*     */ import org.springframework.context.annotation.Configuration;
/*     */ import org.springframework.core.io.Resource;
/*     */ import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Configuration
/*     */ public class DroolsConfiguration
/*     */ {
/*     */   private static final String RULES_PATH = "rules/";
/*     */   
/*     */   @Bean
/*     */   @ConditionalOnMissingBean({KModuleBeanFactoryPostProcessor.class})
/*     */   public KModuleBeanFactoryPostProcessor kiePostProcessor() {
/* 117 */     return new KModuleBeanFactoryPostProcessor(); } @Bean @ConditionalOnMissingBean({KieBase.class})
/* 118 */   public KieBase kieBase() throws IOException { return kieContainer().getKieBase(); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Bean
/*     */   @ConditionalOnMissingBean({KieSession.class})
/*     */   public KieSession kieSession() throws IOException {
/* 202 */     return kieContainer().newKieSession();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Bean
/*     */   @ConditionalOnMissingBean({KieContainer.class})
/*     */   public KieContainer kieContainer() throws IOException {
/*     */     KieRepository kieRepository;
/* 211 */     Objects.requireNonNull(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 217 */         kieRepository = getKieServices().getRepository()); (kieRepository = getKieServices().getRepository()).addKieModule(kieRepository = getKieServices().getRepository()::getDefaultReleaseId);
/*     */     getKieServices().newKieBuilder(kieFileSystem()).buildAll();
/*     */     return getKieServices().newKieContainer(kieRepository.getDefaultReleaseId());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Bean
/*     */   @ConditionalOnMissingBean({KieFileSystem.class})
/*     */   public KieFileSystem kieFileSystem() throws IOException {
/* 227 */     KieFileSystem kieFileSystem = getKieServices().newKieFileSystem();
/*     */     Resource[] arrayOfResource;
/*     */     int i = (arrayOfResource = getRuleFiles()).length;
/*     */     byte b;
/*     */     if ((b = 0) < i) {
/*     */       Resource resource = arrayOfResource[b];
/*     */       super();
/*     */       b++;
/*     */       (new StringBuilder()).write(ResourceFactory.newClassPathResource(kieFileSystem.append("rules/").append(resource.getFilename()).toString(), TbUser.ALLATORIxDEMO("jAy8\007")));
/*     */     } 
/*     */     return kieFileSystem;
/*     */   }
/*     */ }


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\config\DroolsConfiguration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */