package 专项练习.设计模式.抽象工厂;

public class MysqlFactory implements IFactory{
 
    public IUser createUser() {
        return new MysqlUser();
    }
 
    public ILogin createLogin() {
        return new MysqlLogin();
    }
}