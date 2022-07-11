public class Generator {
    public static void main(String[] args) {
        AutoGenerator autoGenerator = new AutoGenerator();
        DataSourceConfig dataSource = new DataSourceConfig();
        dataSource.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/mycnblog?characterEncoding=utf-8");
        dataSource.setUsername("root");
        dataSource.setPassword("Bao1417165487");
        autoGenerator.setDataSource(dataSource);
        //执行生成操作
        autoGenerator.execute();
    }
}
