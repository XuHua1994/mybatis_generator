1.配置mysql数据库信息--application.yml&jdbc.properties
2.删除原有的实体类,dao,mapper.xml文件夹
3.配置generatorConfig.xml,配置实体类(<javaModelGenerator>标签),dao(<javaClientGenerator>标签),
    mapper.xml(<sqlMapGenerator>标签)文件夹名称及文件夹路径
4.配置generatorConfig.xml,所需要自动生成的表<table>标签
5.运行:MavenProjects->Plugins->mybatis-generator