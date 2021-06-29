package 专项练习.设计模式.抽象工厂;

public interface IFactory {
 
    public IUser createUser();
    public ILogin createLogin();
}