package Annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Categories.class)
@interface Category{
    String name();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Categories{
    Category[] value();
}

@Category(name = "Bird")
@Category(name = "LivingThing")
class Bird {
    boolean canFly;
}
public class RepeatableAnnotation {
    public static void main(String[] args){
        Class birdClass = Bird.class;
        System.out.println("Annotable " + birdClass.getAnnotation(Categories.class));

        Category[] categoryList = Bird.class.getAnnotationsByType(Category.class);
        for(Category category : categoryList){
            System.out.println("Category name " + category.name());
        }
    }
}
