package net.codejava;

public class Disciplina {
	private String numeD="";
	private int medie;
	
public Disciplina()
	{
	this.numeD="";
	this.medie=0;
	}

public Disciplina(String disciplina, int medie)
	{
	this.numeD=disciplina;
	this.medie=medie;
	
	}


public Disciplina(Disciplina d)
{
this.medie=d.medie;
this.numeD=d.numeD;
}

public String getNumeD()
	{
		return this.numeD;
	}
public int getMedieD()
	{
	return this.medie;
	}
public void setMedieD(int medieNoua)
 	{
	this.medie=medieNoua;
 	}

public void setNume(String numeN)
	{
	this.numeD=numeN;
	}
}
