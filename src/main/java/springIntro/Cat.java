package springIntro;

import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void voice() {
        System.out.println("Meow-Meow");
    }
}
