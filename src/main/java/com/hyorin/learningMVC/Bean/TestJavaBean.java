package com.hyorin.learningMVC.Bean;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

class Person {
    private String name;
    private String sex;

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

public class TestJavaBean {

    public static void main(String[] args) throws IntrospectionException {
        /**
         * 使用java核心库提供的Introspector类
         * 枚举person类的所有属性
         * */
        BeanInfo info = Introspector.getBeanInfo(Person.class);
        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            System.out.println(pd.getReadMethod());
            System.out.println(pd.getWriteMethod());
            System.out.println("Person属性：" + pd.getName());
            System.out.println("Person属性类型"+ pd.getPropertyType());
            System.out.println("----------------------------------------------");
        }
    }
}
