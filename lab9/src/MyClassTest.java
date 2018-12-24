import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.Assert;
public class MyClassTest extends Object {

   @BeforeClass
   public static void setup(){

   }
   @AfterClass
   public static void testCleanup(){
   }

    @Test
    public void testMultiply1() {
        MyClass tester = new MyClass();
        Assert.assertEquals("5*5=25",25,tester.multiply(5,5));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testMultiply2(){
    MyClass tester = new MyClass();
    Assert.assertEquals("1000*10=10000",10000,tester.multiply(1000,10));
    }

}