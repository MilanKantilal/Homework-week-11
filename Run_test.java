package Oops_concept_homework;

public class Run_test extends Android{

    public static void main(String[] args){

        System.out.println(" Samsung ");
        Android S=new Samsung();
        S.RAM();
        S.Storage();
        S.Cameras();
        S.Bluetooth();
        S.Internet();
        System.out.println(" ");


        System.out.println(" GoogglePixel ");
        Android G = new GoogelPixel();
        G.RAM();
        G.Storage();
        G.Cameras();
        G.Bluetooth();
        G.Internet();
        System.out.println(" ");


        System.out.println(" Nokia ");
        Android N = new Nokia();
        N.RAM();
        N.Storage();
        N.Cameras();
        N.Bluetooth();
        N.Internet();
        System.out.println(" ");


        System.out.println(" RedmiPro ");
        Android R = new RedmiPro();
        R.RAM();
        R.Storage();
        R.Cameras();
        R.Bluetooth();
        R.Internet();
        System.out.println(" ");


        System.out.println(" Different Colours ");
        Colours c= new Colours();
        c.Colour();


    }
}


//System.out.println(" Has 8GB RAM ");
//System.out.println(" Has 120GB storage ");
//System.out.println(" Has Front and Back cameras ");
//System.out.println(" Has Bluetooth ");
//System.out.println(" Has Internet Connectivity ");