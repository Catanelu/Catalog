package net.codejava;
import java.io.*; 
import java.util.Scanner;

public class Repo {

private Student[] Studenti=new Student[100];

public Repo()

{	
	for(int i=0;i<100;i++) {
		this.Studenti[i]=new Student();
	}
}

public boolean inserare(Student student)
	{	
		for(int i=0;i<Studenti.length;i++)
		{
			if(this.Studenti[i].getCNP()=="")
			{
				this.Studenti[i]=student;
				
				return true;
			}
			
		}
		return false;
		
		
	}

public void modificareNume(String CNP,String nou)
	{
		for(int i=0;i<this.Studenti.length;i++)
		{
			if(this.Studenti[i].getCNP()==CNP)
			{
				this.Studenti[i].setNume(nou);
			}
		}
	}
public void modificareAdresa(String CNP,String nou)
	{
		for(int i=0;i<this.Studenti.length;i++)
		{
			if(this.Studenti[i].getCNP()==CNP)
			{
				this.Studenti[i].setAdresa(nou);
			}
		}
	}
public void modificareCNP(String CNP,String nou)
	{
		for(int i=0;i<this.Studenti.length;i++)
		{
			if(this.Studenti[i].getCNP()==CNP)
			{
				this.Studenti[i].setCNP(nou);
			}
		}
	}
public void modificareDataN(String CNP,String nou)
	{
		for(int i=0;i<this.Studenti.length;i++)
		{
			if(this.Studenti[i].getCNP()==CNP)
			{
				this.Studenti[i].setDataN(nou);
			}
		}
	}
public void modificareNoteS(String CNP,Disciplina[] nou)
	{
	for(int i=0;i<this.Studenti.length;i++)
	{
		if(this.Studenti[i].getCNP()==CNP)
		{
			this.Studenti[i].setNoteS(nou);
		}
	}
	}

public void modificareTotal(String CNP,Student nou)
	{
		for(int i=0;i<this.Studenti.length;i++)
		{
			if(this.Studenti[i].getCNP()==CNP)
			{
				this.Studenti[i]=nou;
			}
		}
	
	}
public void stergere(String CNP)
	{
	
	for(int i=0;i<this.Studenti.length;i++)
	{		
		if((this.Studenti[i].getCNP()).equals(CNP))
		{
			
			this.Studenti[i]=new Student();
			System.out.println("Studentul a fost sters!");
		}
	}
	
	
	}

public void citire() throws Exception
{
	int n=0;
	File file = new File("C:\\Users\\a\\eclipse-workspace\\Catalog\\src\\net\\codejava\\data.in"); 
	  
	  BufferedReader br = new BufferedReader(new FileReader(file)); 
	  
	  String st; 
	  if((st=br.readLine())!=null)
	  {
		   n=Integer.parseInt(st);
	  }
	  String nume="";
	  String cnp="";
	  String adresa="";
	  String dataN="";
	  Disciplina[] note=new Disciplina[10];
	  for(int z=0;z<10;z++)
	  {
		  note[z]=new Disciplina();
	  }
	  for(int i=0;i<n;i++)
	  {
		  if((st=br.readLine())!=null)
		  {
			nume=st;  
		  }
		  if((st=br.readLine())!=null)
		  {
			cnp=st;  
		  }
		  if((st=br.readLine())!=null)
		  {
			adresa=st;  
		  }
		  if((st=br.readLine())!=null)
		  {
			dataN=st;  
		  }
		  for(int j=0;j<note.length;j++)
		  {	String den="";
		  	int medie=0;
			  if((st=br.readLine())!=null)
			  {
				den=st;
				
			  }
			  if((st=br.readLine())!=null)
			  {
				medie=Integer.parseInt(st);  
			  }
			  Disciplina d=new Disciplina(den,medie);
			  note[j].setNume(d.getNumeD());
			  note[j].setMedieD(d.getMedieD());
			  
		  }
		  Student s=new Student(nume,adresa,dataN,cnp,note);


		  this.Studenti[i]=new Student(s);
		 
		 
	  }
	  br.close();
}

public void citire2() throws Exception
{
	int n=0;
	File file = new File("//Catalog//src//net//codejava//data.out"); 
	  
	  BufferedReader br = new BufferedReader(new FileReader(file)); 
	  
	  String st; 
	  if((st=br.readLine())!=null)
	  {
		   n=Integer.parseInt(st);
	  }
	  String nume="";
	  String cnp="";
	  String adresa="";
	  String dataN="";
	  Disciplina[] note=new Disciplina[10];
	  for(int z=0;z<10;z++)
	  {
		  note[z]=new Disciplina();
	  }
	  for(int i=0;i<n;i++)
	  {
		  if((st=br.readLine())!=null)
		  {
			nume=st;  
		  }
		  if((st=br.readLine())!=null)
		  {
			cnp=st;  
		  }
		  if((st=br.readLine())!=null)
		  {
			adresa=st;  
		  }
		  if((st=br.readLine())!=null)
		  {
			dataN=st;  
		  }
		  for(int j=0;j<note.length;j++)
		  {	String den="";
		  	int medie=0;
			  if((st=br.readLine())!=null)
			  {
				den=st;
				
			  }
			  if((st=br.readLine())!=null)
			  {
				medie=Integer.parseInt(st);  
			  }
			  note[j]=new Disciplina(den,medie);
		  }
		  this.Studenti[i]=new Student(nume,adresa,dataN,cnp,note);
	  }
	  br.close();
}


public void scriereStudenti() throws IOException
	{
	BufferedWriter writer = new BufferedWriter(new FileWriter("//Catalog//src//net//codejava//data.out"));
	for(int i=0;i<Studenti.length;i++)
		{ if(this.Studenti[i].getCNP()!="") {
			writer.write(this.Studenti[i].getNume());
			writer.write(this.Studenti[i].getAdresa());
			writer.write(this.Studenti[i].getCNP());
			writer.write(this.Studenti[i].getDataN());
			int n=this.Studenti[i].getNoteS().length;
			for(int j=0;j<n;j++)
			{
				writer.write(this.Studenti[i].getNoteS()[j].getNumeD());
				writer.write(this.Studenti[i].getNoteS()[j].getMedieD());
			}
		}}
    writer.close();
	}
public void scriereStudentCNP(String CNP) throws IOException
{
BufferedWriter writer = new BufferedWriter(new FileWriter("//Catalog//src//net//codejava//data.out"));
writer.write(Studenti.length);
for(int i=0;i<Studenti.length;i++)
	{	if(this.Studenti[i].getCNP()!="") {
		if(this.Studenti[i].getCNP()==CNP)
		{
			writer.write(this.Studenti[i].getNume());
			writer.write(this.Studenti[i].getAdresa());
			writer.write(this.Studenti[i].getCNP());
			writer.write(this.Studenti[i].getDataN());
			int n=this.Studenti[i].getNoteS().length;
			for(int j=0;j<n;j++)
			{
				writer.write(this.Studenti[i].getNoteS()[j].getNumeD());
				writer.write(this.Studenti[i].getNoteS()[j].getMedieD());
			}
		}
	}
	}
writer.close();
}


public void afisare()
	{
	for(int i=0;i<Studenti.length;i++)
	{	if(this.Studenti[i].getCNP()!="")
		{
		
			System.out.println(this.Studenti[i].getNume());
			System.out.println(this.Studenti[i].getAdresa());
			System.out.println(this.Studenti[i].getCNP());
			System.out.println(this.Studenti[i].getDataN());
			
			for(int j=0;j<10;j++)
			{
				System.out.println(this.Studenti[i].getNoteS()[j].getNumeD());
				System.out.println(this.Studenti[i].getNoteS()[j].getMedieD());
			}
		
		}
	}
	}

public void afisareNume()
{
for(int i=0;i<Studenti.length;i++)
{	if(this.Studenti[i].getCNP()!="")
	{
	
		System.out.println(this.Studenti[i].getNume());
//		System.out.println(this.Studenti[i].getAdresa());
//		System.out.println(this.Studenti[i].getCNP());
//		System.out.println(this.Studenti[i].getDataN());
//		
//		for(int j=0;j<10;j++)
//		{
//			System.out.println(this.Studenti[i].getNoteS()[j].getNumeD());
//			System.out.println(this.Studenti[i].getNoteS()[j].getMedieD());
//		}
	
	}
}
}

public void afisareI(int i)
{
	for(int j=0;j<10;j++)
	{
		System.out.println(this.Studenti[i].getNoteS()[j].getNumeD());
		System.out.println(this.Studenti[i].getNoteS()[j].getMedieD());
	}
	}

public void afisareMedie()
{
for(int i=0;i<this.Studenti.length;i++)
{
	if(this.Studenti[i].getCNP()!="") {
	
		System.out.println(this.Studenti[i].getNume());
		System.out.println(this.Studenti[i].mediaGenerala());
		
	
}
}
}

public void afisareCNP(String cnp)
{
for(int i=0;i<Studenti.length;i++)
{	if((this.Studenti[i].getCNP()!="")&&(this.Studenti[i].getCNP().equals(cnp))) {
	
		System.out.println(this.Studenti[i].getNume());
		System.out.println(this.Studenti[i].getAdresa());
		System.out.println(this.Studenti[i].getCNP());
		System.out.println(this.Studenti[i].getDataN());
		int n=this.Studenti[i].getNoteS().length;
		for(int j=0;j<n;j++)
		{
			System.out.println(this.Studenti[i].getNoteS()[j].getNumeD());
			System.out.println(this.Studenti[i].getNoteS()[j].getMedieD());
		}
	
}
}
}

public void afisareIntegralisti()
{
for(int i=0;i<Studenti.length;i++)
{	if((this.Studenti[i].getCNP()!="")&&(this.Studenti[i].Integralist())) {
	
		System.out.print(this.Studenti[i].getNume() + " | ");
		/*System.out.println(this.Studenti[i].getAdresa());
		System.out.println(this.Studenti[i].getCNP());
		System.out.println(this.Studenti[i].getDataN());
		int n=this.Studenti[i].getNoteS().length;
		for(int j=0;j<n;j++)
		{
			System.out.println(this.Studenti[i].getNoteS()[j].getNumeD());
			System.out.println(this.Studenti[i].getNoteS()[j].getMedieD());
		}*/
		
	
}

}
System.out.println();
}

public void afisareNepromovati()
{
for(int i=0;i<Studenti.length;i++)
{	if((this.Studenti[i].getCNP()!="")&&(!this.Studenti[i].Integralist())) {
	
		System.out.println(this.Studenti[i].getNume());
				/*
				 * System.out.println(this.Studenti[i].getAdresa());
				 * System.out.println(this.Studenti[i].getCNP());
				 * System.out.println(this.Studenti[i].getDataN()); 
				 */ 
		int n=this.Studenti[i].getNoteS().length;
				 
		for(int j=0;j<n;j++)
		{
			if(this.Studenti[i].getNoteS()[j].getMedieD()<5) {
			System.out.println(this.Studenti[i].getNoteS()[j].getNumeD());
			System.out.println(this.Studenti[i].getNoteS()[j].getMedieD());
			}
		}
	
}
}
}

//public void afisareNepromovati2()
//{		Student[] st=new Student[100];
//for(int p=0;p<100;p++) {
//	st[p]=new Student();
//}
//    	int k=0;
//		
//for(int i=0;i<Studenti.length;i++)
//{	if((this.Studenti[i].getCNP()!="")&&(!this.Studenti[i].Integralist())) 
//	{
//		st[k]=new Student(this.Student[i]);
//		 
//		int n=this.Studenti[i].getNoteS().length;
//				 
//		for(int j=0;j<n;j++)
//		{
//			if(this.Studenti[i].getNoteS()[j].getMedieD()<5) 
//			{
//			
//			}
//		} k++;
//		 }
//	
//}
//}




public void ordonare()
{
	Student aux=new Student();
	for(int i=0;i<this.Studenti.length;i++)
	{ if(this.Studenti[i].getCNP()!="") {
		for(int j=i;j<Studenti.length;j++)
		{	if(this.Studenti[j].getCNP()!="")
			{
			if(this.Studenti[i].mediaGenerala()<this.Studenti[j].mediaGenerala())
			{
				aux=this.Studenti[i];
				this.Studenti[i]=Studenti[j];
				this.Studenti[j]=aux;
			}
			}
		}
	}
	}
}

public void ordonareVarsta()
{
	Student aux=new Student();
	for(int i=0;i<this.Studenti.length;i++)
	{ 	if(this.Studenti[i].getCNP()!="")
		{
		int ani=0;
		for(int k=0;k<4;k++)
			{
				ani=ani*(10^k)+Character.getNumericValue(this.Studenti[i].getDataN().charAt(6+k));
			}
		for(int j=i;j<Studenti.length;j++)
		{	
			int anj=0;
			if(this.Studenti[j].getCNP()!="") 
			{
		
			
			
			for(int k=0;k<4;k++)
			{
				anj=anj*(10^k)+Character.getNumericValue(this.Studenti[j].getDataN().charAt(6+k));
			}
				
			if(ani<anj)
			{
				aux=this.Studenti[i];
				this.Studenti[i]=Studenti[j];
				this.Studenti[j]=aux;
			}
			}
		}
		}
	}
}

public boolean citireStudent()
{
		String nume="";
	  String cnp="";
	  String adresa="";
	  String dataN="";
	  Disciplina[] note=new Disciplina[10];
	  for(int z=0;z<10;z++)
	  {
		  note[z]=new Disciplina();
	  }
	  
	  Scanner scan= new Scanner(System.in);

	    System.out.println("Introduceti numele:");
	  nume= scan.nextLine();
	  System.out.println("Introduceti cnp:");
	  cnp= scan.nextLine();
	  System.out.println("Introduceti adresa:");
	  adresa= scan.nextLine();
	  System.out.println("Introduceti data nasterii(zz/ll/aaaa):");
	  dataN= scan.nextLine();
	  for(int i=0;i<10;i++)
	  {
		  System.out.println("Introduceti materia:");
		  note[i].setNume(scan.nextLine());
		  System.out.println("Introduceti nota:");
		  note[i].setMedieD(Integer.parseInt(scan.nextLine()));;
	  }
	  Student sn=new Student(nume,adresa,cnp,dataN,note);
	  return(this.inserare(sn));
	

	  
}

}
