@RestController
public class UserController {
    @Resource
    private UserService userService;
    //JDBC事务管理器
    @Resource
    private DataSourceTransactionManager dataSourceTransactionManager;
    // 定义事务属性
    @Resource
    private TransactionDefinition transactionDefinition;
    @RequestMapping("/save")
    public Object save(User user) {
        // 开启事务
        TransactionStatus transactionStatus = dataSourceTransactionManager.getTransaction(transactionDefinition);
        // 插入数据库
        int result = userService.save(user);
        // 提交事务
        dataSourceTransactionManager.commit(transactionStatus);
        // 回滚事务
        dataSourceTransactionManager.rollback(transactionStatus);
        return result;
    }
}
