import arithmetic_package.Arithmetic;

class Pack {
    public static void main(String []args){
        Arithmetic testObj = new Arithmetic();
        System.out.println("Addition: "+testObj.add(1,2));
        System.out.println("Substraction: "+testObj.substract(1,2));
        System.out.println("Multiplication: "+testObj.multiple(1,2));
        System.out.println("Division: "+testObj.divide(5,2));
        System.out.println("Remainder: "+testObj.remainder(11,2));
    }
}
