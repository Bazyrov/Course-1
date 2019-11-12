import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {
        int a = this.getLocalNumber();

        if (a == 14) {
            System.out.println("Верное значение");
        } else {
            System.out.println("Неверное значение");
        }


    }

    @Test
    public void testGetClassNumber() {

        int b = this.getClassNumber();

        if (b > 45) {
            System.out.println("Число больше 45");
        } else {
            System.out.println("Число меньше 45");
        }


    }

    @Test
    public void testGetClassString() {
        String zxc = getClassString();
        boolean z = false;
        if (zxc.contains("Hello") || zxc.contains("hello")) {

            System.out.println("Тест успешен");
        }
            else {

            Assert.fail("Текст не соответствует Hello или hello, было введено: " + zxc);
            }
        }
    }

