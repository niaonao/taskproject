# taskproject
&nbsp;&nbsp;&nbsp;&nbsp;Spring + executor 定时任务
# 开发环境
&nbsp;&nbsp;&nbsp;&nbsp;IDEA2018 + JDK1.8 + Tomcat8.0
# 技术实现
  &nbsp;&nbsp;&nbsp;&nbsp;一般项目业务复杂或模块较多时会采用多模块创建项目，便于业务管理与开发。此处采用多模块形式（为了方便可以不用多模块），创建Maven 父项目taskproject，创建Maven 子模块task-service 作为普通模块，创建Maven 子模块task-web 作为web 模块。<br>
  &nbsp;&nbsp;&nbsp;&nbsp;task-web 模块做web 处理，创建task-web/src/main/webapp/WEB-INF/web.xml。在task-web/src/main/resources 下新建Spring 配置文件。配置spring-context.xml 到web.xml。<br>
&nbsp;&nbsp;&nbsp;&nbsp;  task-service 模块下创建业务类，即要定时执行的任务。task-web 模块引入task-service 模块的依赖，创建定时任务类，通过调用一个或多个业务类去定时执行具体的业务。
&nbsp;&nbsp;&nbsp;&nbsp;    博客链接: https://blog.csdn.net/niaonao/article/details/82811735
# 项目结构图和定时任务测试图
项目结构图：
<center>
  
![这是一张图片](https://github.com/niaonao/ImageIcon/blob/master/IDEAProject/TaskProject/20140814091840958maven-taskproject2.jpg)

</center>
定时任务测试图：
<center>
  
![](https://github.com/niaonao/ImageIcon/blob/master/IDEAProject/TaskProject/20140814091840958web-task-run.jpg)

</center>
