import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testTriangleClassifier(){
        String expect = "Tam giac deu";
        String result = TriangleClassifier.phanLoai(2, 2, 2);
        assertEquals(expect, result);
    }

    @Test
    void testTriangleClassifier1(){
        String expect = "Tam giac can";
        String result = TriangleClassifier.phanLoai(2, 2, 3);
        assertEquals(expect, result);
    }

    @Test
    void testTriangleClassifier2(){
        String expect = "Tam giac thuong";
        String result = TriangleClassifier.phanLoai(3, 4, 5);
        assertEquals(expect, result);
    }

    @Test
    void testTriangleClassifier3(){
        String expect = "Khong phai la tam giac";
        String result = TriangleClassifier.phanLoai(8, 2, 3);
        assertEquals(expect, result);
    }
    @Test
    void testTriangleClassifier4(){
        String expect = "Khong phai la tam giac";
        String result = TriangleClassifier.phanLoai(-1, 2, 1);
        assertEquals(expect, result);
    }
    @Test
    void testTriangleClassifier5(){
        String expect = "Khong phai la tam giac";
        String result = TriangleClassifier.phanLoai(0, 1, 1);
        assertEquals(expect, result);
    }
}