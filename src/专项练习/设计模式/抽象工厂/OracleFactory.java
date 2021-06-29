package 专项练习.设计模式.抽象工厂;

public class OracleFactory implements IFactory{
 
    public IUser createUser() {
        return new OracleUser();
    }
 
    public ILogin createLogin() {
        return new OracleLogin();
    }
}