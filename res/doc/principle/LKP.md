# 迪米特法则

#### 定义1

>又称最少知道原则，即一个类对自己依赖的类知道得越少越好。也就是说，对于被依赖的类不管怎么复杂，都尽量将逻辑封装在类的内部。对外除了提供public方法外，不对外泄露任何信息。

#### 定义2

>直接朋友：每个对象都会与其它对象有耦合关系，只要两个对象之间有耦合关系，我们就说这两个对象之间是朋友关系。耦合的方式有很多，我们称出现成员变量、方法参数和方法返回值中的类为直接朋友。而出现在方法中的局部变量中的类不是直接的朋友。

>例子：

```java
class Example{
    
    Emloyee emloyee;
    
    public void print(Employee employee){
        
    }
    
    public Employee getEmployee(){
        return new Employee();
    }
    
}
```

>上面例子中Example类依赖Employee类，但是Employee类只出现在成员变量、方法参数和方法返回值，所以Employee是Example的直接朋友

>迪米特法则的第二个定义就是只与直接朋友通信

#### 例子

```java
/**
 * 学校总部员工
 * */
class Employee{

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

/**
 * 学院员工
 * */
class CollegeEmployee{

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

/**
 * 管理学院员工的管理类
 * */
class CollegeManger{

    /**
     * 返回学院所有员工
     * */
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<>();
        //增加10个员工
        for (int i = 0;i<10;i++){
            CollegeEmployee employee = new CollegeEmployee();
            employee.setId("学院员工id="+i);
            list.add(employee);
        }
        return list;
    }

}

/**
 * 学校总部的管理类
 * 直接朋友：Employee,CollegeManger
 * 非直接朋友：CollegeEmployee
 * */
class SchoolManger{

    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<>();
        //增加5个员工
        for (int i = 0;i<5;i++){
            Employee employee = new Employee();
            employee.setId("学校总部员工id="+i);
            list.add(employee);
        }
        return list;
    }

    /**
     * 输出学校所有员工信息
     * */
    public void printAllEmployee(CollegeManger manger){
        List<CollegeEmployee> list1 = manger.getAllEmployee();
        System.out.println("-------------学院员工-------------");
        for (CollegeEmployee employee:list1
             ) {
            System.out.println(employee.getId());
        }
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("-------------学校总部员工-------------");
        for (Employee employee:list2
             ) {
            System.out.println(employee.getId());
        }
    }

}
```

>上面的例子中SchoolManger类依赖Employee、CollegeManger和CollegeEmployee类，但是它的直接朋友只有Employee类和CollegeManger类，CollegeEmployer类是它的非直接朋友，因为它出现在printAllEmployee方法中，是局部变量

#### 代码

###### [违背迪米特原则](../../../src/main/java/org/fade/principle/lkp/LKP.java)

###### [遵循迪米特原则](../../../src/main/java/org/fade/principle/lkp/LKP1.java)
