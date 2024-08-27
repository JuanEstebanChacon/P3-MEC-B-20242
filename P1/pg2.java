//a partir de la anterior clase crear sobrecarga al constructor y crear dos objetos para cada una de las formas del constructor
class triangulo {
    public static void main(String[] args) {
       
        int base = 5;
        int altura = 10;
        int area = 0;
        area = (base * altura)/ 2;
        System.out.println(area);
        
    }
    public static int triangulo(String[] args){
     int base = 5;
        int altura = 10;
        int area = 0;
        area = (base * altura)/ 2;
        System.out.println(area);
        return area;
    }
}
