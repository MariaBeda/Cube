import java.util.regex.Matcher;

//Радиус - вектор
public class R3Vector {
    private double x, y, z;

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }

    public R3Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void out(){
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }

    public R3Vector sum(R3Vector a){
        return new R3Vector(x + a.x, y + a.y, z + a.z);
    }

    public static R3Vector sum(R3Vector a, R3Vector b){
        return new R3Vector(a.x + b.x, a.y + b.y, a.z + b.z);
    }

    public void scale(double k){
        this.x *= k;
        this.y *= k;
        this.z *= k;
    }
    public  void translate(double dx, double dy, double dz){
        this.x += dx;
        this.y += dy;
        this.z += dz;
    }

    public double scal(R3Vector a) {
        return this.x * a.x + this.y * a.y + this.z * a.z;
    }
    public static R3Vector vec(R3Vector a, R3Vector b) {
        return new R3Vector(a.y * b.z - a.z * b.y, a.z * b.x - a.x * b.z, a.x * b.y - a.y * b.x);
    }

    public void rotateX(double degree){
        degree *= Math.PI;
        degree /= 180;
        this.x *= 1;
        double y1 = this.y * Math.cos(degree) + this.z * Math.sin(degree);
        double z1 = this.z * Math.cos(degree) - this.y * Math.sin(degree);
        this.y = y1;
        this.z = z1;
    }
    public void rotateY(double degree){
        degree *= Math.PI;
        degree /= 180;
        this.y *= 1;
        double x1 = this.x * Math.cos(degree) + this.z * Math.sin(degree);
        double z1 = this.z * Math.cos(degree) - this.x * Math.sin(degree);
        this.x = x1;
        this.z = z1;


    }
    public void rotateZ( double degree){
        degree *= Math.PI;
        degree /= 180;
        this.z *= 1;
        double y1 = this.y * Math.cos(degree) + this.x * Math.sin(degree);
        double x1 = this.x * Math.cos(degree) - this.y * Math.sin(degree);
        this.y = y1;
        this.x = x1;

    }


    public void rotate(double degree_x, double degree_y, double degree_z){
        rotateX(degree_x);
        rotateY(degree_y);
        rotateZ(degree_z);
    }


}