===继承与接口===
    
    继承的好处:让共同部分,可以复用.避免重复编程.
    继承的不好:耦合性高.一旦超类添加一个新方法,子类都继承,拥有此方法,若子类相当部分不实现此方法,则要进行大批量修改.继承时,子类就不可继承其它类了.
    接口的好处:解决了继承耦合性高的问题.且可让实现类,继承或实现其它类或接口.
    接口的不好:不能真正实现代码的复用.

===策略模式===

    使用继承来复用代码。
    经常变动的地方，使用接口对象作为成员变量，接口的实例化写在接口的子类。运用多态性。
    注意：   每一个成员变量都要进行实例化