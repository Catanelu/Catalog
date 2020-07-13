package net.codejava;

public class Student {
	private String nume="";
	private String adresa="";
	private String dataN="";
	private String cnp="";
	private Disciplina[] noteS=new Disciplina[10];
public Student()
	{
	this.nume="";
	this.adresa="";
	this.dataN="";
	this.cnp="";
	for(int i=0;i<10;i++)
	{
		this.noteS[i]=new Disciplina();
	}
	}
public Student(String nume, String adresa, String data, String cnp, Disciplina[] note )
	{	
	this.nume=nume;
	this.adresa=adresa;
	this.dataN=data;
	this.cnp=cnp;
	for(int i=0;i<note.length;i++)
	{
		this.noteS[i]=new Disciplina(note[i].getNumeD(),note[i].getMedieD());
		
	}
	
	}

public Student(Student s)
{
this.nume=s.nume;
this.adresa=s.adresa;
this.dataN=s.dataN;
this.cnp=s.cnp;
for(int i=0;i<10;i++)
{
	this.noteS[i]=new Disciplina(s.noteS[i].getNumeD(),s.noteS[i].getMedieD());
	
}
}

public boolean Integralist()
	{
		for(int i=0;i<this.noteS.length;i++)
		{
			if(this.noteS[i].getMedieD()<5)
				return false;
		}
		return true;
	}

public Disciplina[] Restante()
	{	Disciplina[] restante=new Disciplina[10];
	
		for(int k=0;k<10;k++)
		{
			restante[k]=new Disciplina();
		}
	int j=0;
		for(int i=0;i<this.noteS.length;i++)
		{
			if(this.noteS[i].getMedieD()<5)
				{
				restante[j].setNume(this.noteS[i].getNumeD());
				restante[j].setMedieD(this.noteS[i].getMedieD());
				j=j+1;
				}
		}
		return restante;
	}

public float mediaGenerala()
	{
		float medG;	
		float suma=0;
		for(int i=0;i<this.noteS.length;i++)
		{  
			suma=suma+this.noteS[i].getMedieD();
		}
		medG=suma/10;
		return medG;
	}

public void setNume(String numeN)
	{
	this.nume=numeN;
	}
public void setAdresa(String adresaN)
{
	this.adresa=adresaN;
}
public void setCNP(String cnpN)
{
	this.cnp=cnpN;
}
public void setDataN(String data)
{	
	this.dataN=data;
}
public void setNoteS(Disciplina[] noteN)
{
	for(int i=0;i<noteN.length;i++)
	{
		this.noteS[i].setMedieD(noteN[i].getMedieD());
		this.noteS[i].setNume(noteN[i].getNumeD());
		
	}
}

public String getNume()
{
	return this.nume;
}
public String getAdresa()
{
	return this.adresa;
}
public String getDataN()
{
	return this.dataN;
}
public String getCNP()
{
	return this.cnp;
}
public Disciplina[] getNoteS()
{
	return this.noteS;
}


}
