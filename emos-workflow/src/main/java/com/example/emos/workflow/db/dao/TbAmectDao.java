package BOOT-INF.classes.com.example.emos.workflow.db.dao;

import com.example.emos.workflow.db.pojo.TbAmect;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbAmectDao {
  int insert(TbAmect paramTbAmect);
}


/* Location:              D:\Course\SpringBoot+Vue3 项目实战，打造企业级在线办公系统\资料\resource-master\resource\项目\初始化项目\emos-workflow.jar!\BOOT-INF\classes\com\example\emos\workflow\db\dao\TbAmectDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */