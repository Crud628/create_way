package BOOT-INF.classes.com.example.emos.workflow.db.dao;

import java.util.HashMap;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbReimDao {
  int updateReimStatus(HashMap paramHashMap);
  
  HashMap searchReimByInstanceId(String paramString);
}


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\db\dao\TbReimDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */