package ac.za.cput.Chapter2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Question2Test {

    @Test
    public void sayYourName() {
        Question2 name = new Question2();
        CollectionListSetMap QWE = new CollectionListSetMap();
        Assert.assertEquals(QWE.myCollection().get(2),name.sayYourName());
    }
    @Test
    public void howOldAreYou() {
        Question2 age = new Question2();
        CollectionListSetMap QWE = new CollectionListSetMap();
        QWE.myCollection().indexOf(3);
        Assert.assertEquals(QWE.MySet().size(),age.howOldAreYou());
    }
}