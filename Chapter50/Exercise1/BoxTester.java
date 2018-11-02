class BoxTester {

    public static void main ( String[] args ) {
    
        Box box = new  Box( 2.5, 5.0, 6.0 );
        Box ben = box.biggerBox(box);
        Box sue = box.smallerBox(box);


        System.out.println("Area: "  + box.area() + " Volume: " + box. volume());
        System.out.println("Length: " + box.length + " Height: " + box.height + " Width:  " + box.width);
        
        System.out.println(sue.nests(ben));
    }
}