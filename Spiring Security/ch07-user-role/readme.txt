ch07-user-role: 使用用户和角色，认证用户

实现步骤：
1.新建maven项目
2.加入gav坐标
   1）spring-boot : 2.0.6
   2）spring-security
   3）spring-web
   4）spring和mybatis相关的依赖
   5）mysql驱动
3.编写application.properties
   连接数据库，创建连接池

4.创建自己的user类，代替UserDetatils

5.创建自定义的UserDetatilsService实现类
  在重写方法中，查询数据库获取用户信息， 获取角色数据。
  构建UserDetatils实现类对象。

6.创建类继承WebSecurityConfigurerAdapter
  自定义安全的配置

7.自定义登录
  1）传统form登录
  2）ajax登录

8.创建Controller

