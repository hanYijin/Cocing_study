package mh;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MyMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext gxac = 
				new GenericXmlApplicationContext("myconf.xml");
		
		AA aa1 = gxac.getBean(AA.class);
		System.out.println(aa1);
		
		AA aa2 = gxac.getBean(AA.class);
		System.out.println(aa2);
	}
}
