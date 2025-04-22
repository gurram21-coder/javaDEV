package com.example.demo;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SpringApplication.run(Demo1Application.class, args);
//		Scanner sc=new Scanner(System.in);
//String Strlist=sc.nextLine();
//ArrayList<String> arrlist= new ArrayList<> ();
//  
//  String[] inputs=Strlist.split(" ");
//  for(int i=0;i<inputs.length;i++)
//  {
////  System.out.print(inputs[i]);
//  arrlist.add(inputs[i]);
//  }
  
// System.out.print(arrlist.get(2));

 ArrayList<data> dataList=new ArrayList<>();
  
//   dataobj.age="24";
//   dataobj.name="meg";
//   dataobj.age="26";
//   dataobj.name="meg";

   for(int i=0;i<3;i++)
   {  
	   data dataobj=new data();
	   dataobj.age="2"+i;
	   System.out.print(i);
	   dataobj.name="meg";
	   dataList.add(dataobj);
   }
   
   
  System.out.println(dataList.subList(1,2));
}

	
}
class data
{   
	
	String name;
	String age;
	@Override
	public String toString() {
		return "data [name=" + name + ", age=" + age + "]";
	}
	
	
}