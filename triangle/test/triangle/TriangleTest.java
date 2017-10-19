package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle implementation.
 */
public class TriangleTest {

    @Test
    public void test1() {
        Type actual = Triangle.classify(10, 10, 10);
        Type expected = EQUILATERAL;
        assertEquals(actual, expected);
    }

    @Test
    public void test2() {
        Type actual = Triangle.classify(10, 10, 15);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    @Test
    public void test3() {
        Type actual = Triangle.classify(10, 11, 15);
        Type expected = SCALENE;
        assertEquals(actual, expected);
    }

    @Test
    public void test4() {
        Type actual = Triangle.classify(10, 1, 15);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    //check 1st arg = 0
    public void test5() {
        Type actual = Triangle.classify(0, 11, 12);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    //check 2nd arg = 0
    public void test6() {
        Type actual = Triangle.classify(11, 0, 12);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    //check 3rd arg = 0
    public void test7() {
        Type actual = Triangle.classify(11, 12, 0);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    //check negative 1st arg
    public void test8() {
        Type actual = Triangle.classify(-1, 11, 12);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    //check negative 2nd arg
    public void test9() {
        Type actual = Triangle.classify(11, -1, 12);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    //check negative 3rd arg
    public void test10() {
        Type actual = Triangle.classify(11, 12, -1);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    //check a + b <= c 
    public void test11() {
        Type actual = Triangle.classify(1, 2, 10);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    //check a + c <= b 
    public void test12() {
        Type actual = Triangle.classify(1, 10, 2);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    //check b + c <= a
    public void test13() {
        Type actual = Triangle.classify(10, 1, 2);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    //trian == 1 && a + b > c
    public void test14() {
        Type actual = Triangle.classify(4, 4, 2);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    @Test
    //trian == 2 && a + c > b
    public void test15() {
        Type actual = Triangle.classify(4, 2, 4);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    @Test
    //trian == 3 && b + c > a
    public void test16() {
        Type actual = Triangle.classify(2, 4, 4);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    @Test
    //trian == 1 && a + b > c INVALID
    public void test14() {
        Type actual = Triangle.classify(100, 100, 1);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    //trian == 2 && a + c > b
    public void test15() {
        Type actual = Triangle.classify(100, 1, 100);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    //trian == 3 && b + c > a
    public void test16() {
        Type actual = Triangle.classify(1, 100, 100);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }
}
