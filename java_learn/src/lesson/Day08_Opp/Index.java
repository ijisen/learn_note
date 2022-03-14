package lesson.Day08_Opp;

/**
 * 面向对象分析【OOA】【Procedure-Oriented Analysis】
 * 面向对象设计【OOD】【Procedure-Oriented Design】
 * 面向对象编程【OOP】【Procedure-Oriented Programming】
 * 面向过程【Procedure-Oriented Programming】 POP
 * ---> 优点：性能比面向对象好，因为类调用时需要实例化，开销比较大，比较消耗资源。
 * ---> 缺点：不易维护、不易复用、不易扩展.
 * 面向对象【Object Oriented Programming】 Index
 * ---> 优点：易维护、易复用、易扩展，由于面向对象有封装、继承、多态性的特性，可以设计出低耦合的系统，使系统 更加灵活、更加易于维护 .
 * ---> 缺点：性能比面向过程差
 * 面项对象的关注点是： 实现的给
 * ---> 一、【面向对象三大特性】：
 * ------> 1、封装： 隐藏对象的属性和实现细节，仅对外提供公共访问方式，将变化隔离，便于使用，提高复用性
 * ------> 2、继承： 提高代码复用性；继承是多态的前提。
 * ------> 3、多态：父类或接口定义的引用变量可以指向子类或具体实现类的实例对象。提高了程序的拓展性。
 * ---> 二、【五大基本原则】：
 * ------> 1、单一职责原则SRP(Single Responsibility Principle)： 类的功能要单一，不能包罗万象，跟杂货铺似的。
 * ------> 2、开放封闭原则OCP【Open－Close Principle】:
 * ---------> 一个模块对于拓展是开放的，对于修改是封闭的，想要增加功能热烈欢迎，想要修改，哼，一万个不乐意。
 * ------> 3、里式替换原则LSP【the Liskov Substitution Principle LSP】
 * ---------> 子类可以替换父类出现在父类能够出现的任何地方。比如你能代表你爸去你姥姥家干活。哈哈~~
 * ------> 4、依赖倒置原则DIP【the Dependency Inversion Principle DIP】
 * ---------> 高层次的模块不应该依赖于低层次的模块，他们都应该依赖于抽象。抽象不应该依赖于具体实现，具体实现应该依赖于抽象。就是你出国要说你是中国人，而不能说你是哪个村子的。比如说中国人是抽象的，下面有具体的xx省，xx市，xx县。你要依赖的是抽象的中国人，而不是你是xx村的。
 * ------> 5、接口分离原则ISP【the Interface Segregation Principle ISP】
 * ---------> 设计时采用多个与特定客户类有关的接口比采用一个通用的接口要好。就比如一个手机拥有打电话，看视频，玩游戏等功能，把这几个功能拆分成不同的接口，比在一个接口里要好的多。
 * 对象【实例】
 */
public class Index {
    public static void main(String[] args) {

    }
}
