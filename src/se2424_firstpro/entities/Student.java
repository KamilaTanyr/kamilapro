package se2424_firstpro.entities;


public class Student {
    
    public Student(){
        
    }
    
    public static int var=344;
    
    private int barcode;
    private int gpa;
    
    
    public int getBarcode(){
        return this.barcode;
    }
    
    public void setBarcode(int b){
        this.barcode=b;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
    
    
    
    public static int sum(int a, int b){
        return a+b;
    }
}
