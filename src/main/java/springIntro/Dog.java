package springIntro;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Dog implements Pet {
    private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void voice() {
        System.out.println("Bow-Wow");
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("Class Dog: Init");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("Class Dog: Destroy");
//    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
