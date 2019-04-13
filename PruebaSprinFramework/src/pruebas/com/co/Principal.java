package pruebas.com.co;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
	
	public static void main(String[] args) {
	/*	
		Empleado emp1 = new SecretarioEmpleado();
		System.out.println(emp1.getFunciones());*/
		
		//Crear un contexto
	
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Empleado juan = ctx.getBean("miEmpleado",Empleado.class);
		System.out.println(juan.getFunciones());
		ctx.close();
		
	}
	
	
	
}
