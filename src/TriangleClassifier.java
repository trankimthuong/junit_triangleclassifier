public class TriangleClassifier {
    public static String phanLoai(double a, double b, double c){
        if(a < 1 || b < 1|| c < 1 || (a + b) <= c
        || (b + c) <= a || (a + c) <= b){
            return "Khong phai la tam giac";
        }
        if(a == b && b == c)
            return "Tam giac deu";
        if(a == b || b == c || a == c)
            return "Tam giac can";
        return "Tam giac thuong";
    }
}
