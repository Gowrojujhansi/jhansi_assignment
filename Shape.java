package HiearchyOFAOrganizatiom;
import java.io.*;
import java.util.*;
public abstract class Shape {
	abstract void draw();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape l=new line();
		l.draw();
		Shape r=new Rectangle();
		r.draw();
		Shape c=new Cube();
		c.draw();
	}

}
