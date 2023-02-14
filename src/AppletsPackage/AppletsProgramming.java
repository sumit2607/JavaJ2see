package AppletsPackage;

import java.applet.Applet;
import java.awt.*;

public class AppletsProgramming extends Applet {

    //applets work at client side
    //to run applets run in browser wee need to install plugin
    /*
    life cycle of applets
    1.init   ----------------------- public void init()--- in this phase we initialize the variable.... this method run only
    once...
    2.starting ------ public void start() -- applets started ----- this method can be executed any number of time.....
    if the applets are stopped for starting again start method will be executed.........

    3.painting------- public void paint(Graphics g)  for example drawing rectangle, circle, lines, ovel, string
    4.stopped--- applets works when we minimize the browser
    5.destroyed--- executed only once

    How to run applets
    = there are two-way to run applets programs:-
    1.By appletViewerTools
    2.by html file
    Note: applets does not have any main method
*/
    @Override
    public void start() {
        setSize(800, 600);
        setBackground(Color.yellow);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("My First Applets Program" , 50, 50);
    }

    public static void main(String[] args) {


    }


}
