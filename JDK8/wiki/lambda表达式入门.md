# lambda表达式入门





## 一.  基本结构



```java
(param1,param12,param3) ->{
    //method
}
```



## 二.  实例

### ①按钮的事件监听

原来的实现

```java
//匿名内部类  按下按钮触发输出
jButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Pressed");
    }
});
```

JDK8新实现方法

```java
//lambda  按下按钮触发输出 多行函数可以加 {}
jButton.addActionListener(event -> System.out.print("Button Pressed"));
```



### ②List遍历

```java
//原始
for(int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
//JDK 1.5 增强for循环
for (Integer integer : list) {
    System.out.println(integer);
}
//JDK 1.8新增 Consumer<? super T> action
list.forEach(new Consumer<Integer>() {
    @Override
    public void accept(Integer t) {
        // TODO Auto-generated method stub
        System.out.println(t);
    }
});
```

#### Consumer

```java
package java.util.function;
import java.util.Objects;
/**
 * Represents an operation that accepts a single input argument and returns no
 * result. Unlike most other functional interfaces, {@code Consumer} is expected
 * to operate via side-effects.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #accept(Object)}.
 *
 * @param <T> the type of the input to the operation
 *
 * @since 1.8
 */
@FunctionalInterface //函数式接口
public interface Consumer<T> {...}
```

#### @FunctionalInterface

```java
package java.lang;
import java.lang.annotation.*;
/**
 * An informative annotation type used to indicate that an interface
 * type declaration is intended to be a <i>functional interface</i> as
 * defined by the Java Language Specification.
 *  这是一个通知型的注解类型，用于表示某个接口为函数接口，
 *   是Java语言规范
 * Conceptually, a functional interface has exactly one abstract
 * method.  Since {@linkplain java.lang.reflect.Method#isDefault()
 * default methods} have an implementation, they are not abstract.  If
 * an interface declares an abstract method overriding one of the
 * public methods of {@code java.lang.Object}, that also does
 * <em>not</em> count toward the interface's abstract method count
 * since any implementation of the interface will have an
 * implementation from {@code java.lang.Object} or elsewhere.
 *  有且只有一个抽象方法 （从Java8开始出现了默认方法（default））
 *  如果这个抽象方法覆盖了Object的某个方法，也不算抽象方法
 * <p>Note that instances of functional interfaces can be created with
 * lambda expressions, method references, or constructor references.
 *  可以通过lambda表达式、方法引用和构造方法引用来创建
 * <p>If a type is annotated with this annotation type, compilers are
 * required to generate an error message unless:
 * <ul>
 * <li> The type is an interface type and not an annotation type, enum, or class.
 * <li> The annotated type satisfies the requirements of a functional interface.
 * </ul>
 *  如果某一个类型加上了注解，如果不满足函数式接口的要求，会给出错误信息 如上
 * <p>However, the compiler will treat any interface meeting the
 * definition of a functional interface as a functional interface
 * regardless of whether or not a {@code FunctionalInterface}
 * annotation is present on the interface declaration.
 * 然而编译器会将任意满足函数式接口的接口视为函数式接口，
 * 无论是否添加@FunctionalInterface
 * @jls 4.3.2. The Class Object
 * @jls 9.8 Functional Interfaces
 * @jls 9.4.3 Interface Method Body
 * @since 1.8
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FunctionalInterface {}
```



## 三.  函数式接口深入



自己实现整套lambda表达式前置条件

```java
//声明是为了方便在编写时提示以及编译时快捷
@FunctionalInterface
interface MyInterface{
	//唯一抽象方法
	void test();
	
	//Object的原生方法，不被视为抽象
	String toString();
}
/**
 * @author lan
 * 2021年4月25日
 * TODO  
 */
public class FunctionTest {
	public void myTest(MyInterface myInterface) {
		// TODO Auto-generated method stub
		System.out.println(1);
		myInterface.test();
		System.out.println(2);
	}
	public static void main(String[] args) {
		FunctionTest f = new FunctionTest();
		//传统实现
		f.myTest(new MyInterface() {
			@Override
			public void test() {
				// TODO Auto-generated method stub
				System.out.println("mytest");
			}
		});
		//lambda 实现
		f.myTest(()->{
			System.out.println("mytest");
		});
        //lambda 实现2
		MyInterface myInterface = () ->{
			System.out.println("hello");
		};
	}
}
```



