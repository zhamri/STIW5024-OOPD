package Day2;

public class ZhamriCheAni {

    public ZhamriCheAni(String course){
        System.out.println("This is a zhamri constructor " + course);
    }

//    public static void main(String[] zhamri) {
//        System.out.println("Hello World");
////        displayMyName("zhamri");
//        Day2.ZhamriCheAni zca = new Day2.ZhamriCheAni("Information Technology");
//        zca.displayMyName1("zhamri non-static");
//        displayMyName2("zhamri-static");
//
//    }

    public void displayMyName1(String name){
        System.out.println("My name: " + name);
        displayMyAge1(30);
    }

    public void displayMyAge1(int age){
        System.out.println("My Age: " + age);
        displayMyName2("UUM");
    }

    public static void displayMyName2(String name){
        System.out.println(name);
    }
}

//local variable
//instance variable
//reference variable

/*
Day2.ZhamriCheAni@36baf30c
Day2.ZhamriCheAni@7a81197d


Memory Area
1. Stack
2. Heap

 */


// 1. from static to statis
// 2. from static to non-static
// 3. from non-static to non-static


