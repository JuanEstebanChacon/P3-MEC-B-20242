class triangulo {
    public static void main(String[] args) {
       
        int base = 5;
        int altura = 10;
        double a = 0;
        double p = 0;
        a = area(base, altura);
        p = perimetro(base, altura);
        System.out.println(a);
        System.out.println(p);
    }
    public static int triangulo(String[] args){
     int base = 5;
        int altura = 10;
        int area = 0;
        area = (base * altura)/ 2;
        System.out.println(area);
        return area;
    }
     public static double area(double a,double b){
  
     double area = 0;
     area = (a*b)/ 2;
     return area;
    }
       public static double perimetro(double a,double b){
  
     double perimetro = 0;
     perimetro = ((a*a)+(b*b))^2;
     return perimetro;
    }
}
