public class Main {
    public static void main(String[] args){
//        R3Vector a = new R3Vector(10, 0, 0);
//        R3Vector b = new R3Vector(0, 10, 10);
//
//        a.rotate(180, 0 ,90);
//        Facet f = new Facet(
//                new R3Vector(0,0,0),
//                new R3Vector(0,1,0),
//                new R3Vector(1,1,0),
//                new R3Vector(1,0,0));
//        f.out();
//        f.scale(2);
//        f.translate(2,2,2);
//        f.out();

        Cube c = new Cube();
        c.translate(-0.5, -0.5, -0.5);
        c.rotate(125, 125,125);
        c.scale(200);

        Viewer v = new Viewer(c);

    }
}
