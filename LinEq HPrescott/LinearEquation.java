public class LinearEquation {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    
    
    public LinearEquation( int a, int b, int c, int d, int e, int f ){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public int geta(){
        return this.a;
    }
    
    public int getb(){
        return this.b;
    }
    
    public int getc(){
        return this.c;
    }
    
    public int getd(){
        return this.d;
    }
    
    public int gete(){
        return this.e;
    }
    
    public int getf(){
        return this.f;
    }
    
    public boolean isSolvable(){
        return ( this.a * this.d - this.b * this.c != 0);
    }
    
    public double getX(){
        double ed = (this.e * this.d);
        double bf = (this.b * this.f);
        double ad = (this.a * this.d);
        double bc = (this.b *this.c);
        return ( ed - bf )/( ad - bc );
    }
    
    public double getY(){
        double af = (this.a * this.f);
        double ec = (this.e * this.c);
        double ad = (this.a * this.d);
        double bc = (this.b *this.c);
        return ( af - ec )/( ad - bc );
    }
}