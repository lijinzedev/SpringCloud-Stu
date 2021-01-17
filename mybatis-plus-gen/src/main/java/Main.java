//import com.baomidou.mybatisplus.annotation.DbType;
//import com.baomidou.mybatisplus.annotation.IdType;
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
//import com.baomidou.mybatisplus.generator.config.GlobalConfig;
//import com.baomidou.mybatisplus.generator.config.PackageConfig;
//import com.baomidou.mybatisplus.generator.config.StrategyConfig;
//import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
//
///**
// * @author: Curiosity
// * @Date: 2021/1/17 23:12
// * @Description:
// */
//public class Main {
//
//
//
//
//    /**
//     * 生成代码输出路径，<strong>路径必须是绝对路径，不需要包含包名</strong>
//     */
//    private static final String OUTPUT_DIR = ".\\src\\main\\resources\\genertor";
//    /**
//     * 生成代码输出的包名
//     * <p>
//     * 总包名，后续生成的 Mapper，Service 等将在该包下生成子包
//     * </p>
//     */
//    private static final String PACKAGE = "com.creaway";
//    /**
//     * JDBC URL 说明: url地址前需要加上@,否则会报错
//     */
//
//    private static final String JDBC_URL = "jdbc:mysql://42.193.118.181:3306/meas_pro_tab?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
//    /**
//     * 数据库账户
//     */
//    private static final String DB_USERNAME = "root";
//    /**
//     * 数据库账户密码
//     */
//    private static final String DB_PASSWORD = "123456";
//
//    /**
//     * 执行即可生成代码 需要添加 freemarker 依赖 <dependency> <groupId>org.freemarker</groupId>
//     * <artifactId>freemarker</artifactId> <version>2.3.29</version> </dependency>
//     */
//    // 不要在src/main/java里面使用main方法,否则springboot项目某人为main方法的类就是启动类
////	public static void main(String[] args) {
////		autoGenerator().execute();
////	}
//
//    public static AutoGenerator autoGenerator() {
//        AutoGenerator autoGenerator = new AutoGenerator();
//        autoGenerator.setGlobalConfig(globalConfig());
//        autoGenerator.setDataSource(oracleDataSourceConfig());
//        autoGenerator.setStrategy(strategyConfig());
//        autoGenerator.setPackageInfo(packageConfig());
//        autoGenerator.setTemplateEngine(new FreemarkerTemplateEngine());
//        return autoGenerator;
//    }
//
//    /**
//     * 全局配置
//     *
//     * @return {@link GlobalConfig}
//     */
//    private static GlobalConfig globalConfig() {
//        GlobalConfig globalConfig = new GlobalConfig();
//        globalConfig.setAuthor("lijinze");
//        // 设置代码输出位置，需要绝对路径
//        globalConfig.setOutputDir(OUTPUT_DIR);
//        // 覆盖已有的代码
//        globalConfig.setFileOverride(false);
//        // 基本表的 ResultMap
//        globalConfig.setBaseResultMap(true);
//        // 基本表字段片段
//        globalConfig.setBaseColumnList(true);
//        // 开启基于 Model 操作数据库
//        globalConfig.setActiveRecord(true);
//        // 设置 ID 类型
//        globalConfig.setIdType(IdType.NONE);
//        // 生成基本 Swagger2 文档
//        globalConfig.setSwagger2(true);
//        // 开启二级缓存
//        globalConfig.setEnableCache(true);
//        // 设置生成的对象名称规则，%s 表示当前的 Entity
//        // 数据库表映射对象名称规则
//        globalConfig.setEntityName("%s");
//        // 也可以使用下面这种就是末尾会以DO结尾
////		globalConfig.setEntityName("%sDO");
//        // Mapper 接口名称规则
//        globalConfig.setMapperName("%sDao");
//        // Mapper XML 文件名称规则
//        globalConfig.setXmlName("%sMapper");
//        // Controller 生成规则
//        globalConfig.setControllerName("%sController");
//        // Service 接口生成名称规则
//        globalConfig.setServiceName("%sService");
//
//        // Service 实现类生成名称规则
//        globalConfig.setServiceImplName("%sServiceImpl");
//        return globalConfig;
//    }
//
//    /**
//     * 生成策略配置
//     *
//     * @return StrategyConfig
//     */
//    private static StrategyConfig strategyConfig() {
//        StrategyConfig strategyConfig = new StrategyConfig();
//        strategyConfig.setCapitalMode(false);
//        strategyConfig.setEntityLombokModel(true);
//        strategyConfig.setRestControllerStyle(true);
//        strategyConfig.setEntityBuilderModel(true);
//        /*强制生成TableName,TableId,TableFiled 注解*/
//        strategyConfig.setEntityTableFieldAnnotationEnable(true);
//
//        // 数据库表映射到实体的命名策略，下划线转驼峰命名
//        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
//        // 数据库表映射到实体的命名策略，下划线转驼峰命名
//        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
////        strategyConfig.setInclude(new String[]{
////
////
////        })
//        // TODO 填写表前缀、表字段前缀，生成代码时去除字段前缀
////        strategyConfig.setTablePrefix("tb_");
////        strategyConfig.setFieldPrefix("a_", "c_", "e_", "f_", "p_", "r_", "t_", "tf_");
//        strategyConfig.setTablePrefix("a_", "b_", "c_", "d_", "e_", "f_", "g_", "h_","p_","f_","l_","p_","q_","r_");
//        return strategyConfig;
//    }
//
//    /**
//     * MySQL 数据源配置
//     *
//     * @return DataSourceConfig
//     */
//    private static DataSourceConfig oracleDataSourceConfig() {
//        DataSourceConfig dataSourceConfig = new DataSourceConfig();
//        dataSourceConfig.setDbType(DbType.ORACLE);
//        dataSourceConfig.setTypeConvert(new MySqlTypeConvert());
//        dataSourceConfig.setDriverName("org.gjt.mm.mysql.Driver");
//        dataSourceConfig.setDbType(DbType.MYSQL);
//        dataSourceConfig.setUrl(JDBC_URL);
//        dataSourceConfig.setUsername(DB_USERNAME);
//        dataSourceConfig.setPassword(DB_PASSWORD);
//        return dataSourceConfig;
//    }
//
//    /**
//     * 包相关配置信息
//     * <p>
//     * 配置生成代码的包信息，如生成的 Mapper 包，Service 包等
//     * </p>
//     */
//    private static PackageConfig packageConfig() {
//        PackageConfig packageConfig = new PackageConfig();
//        // 设置父包
//        packageConfig.setParent(PACKAGE);
//        // TODO 设置生成代码的包
//        // Controller 包
//        packageConfig.setController("controller");
//        // 数据库表映射对象包
//        packageConfig.setEntity("model");
//        // Mapper 接口包，含 XML 文件
//        packageConfig.setMapper("mapper");
//        // Service 接口包
//        packageConfig.setService("service");
//        // Service 接口实现类包
//        packageConfig.setServiceImpl("service.impl");
//        return packageConfig;
//    }
//}
