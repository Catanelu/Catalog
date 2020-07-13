package net.codejava;

import java.util.Scanner;

public class CTRL 
{
	private Repo repo;
	
	public CTRL()
	{
		this.repo=new Repo();
	}
	
	public static int Citire(String sir){
		System.out.print(sir);
		try {
			Scanner scn = new Scanner(System.in);		
			int l=scn.nextInt();				
			return l;
		
		}
		catch(Exception exp) {
			System.out.println("Ai gresit!! Da numar intreg!");
			return Citire(sir);				
		}
	 
	}
			        
	public static String CitireString(String sir){
		System.out.print(sir);
		try {
			Scanner scn = new Scanner(System.in);		
			String l=scn.nextLine();				
			return l;
		}
		catch(Exception exp) {
			System.out.println("Ai gresit!!!");
			return CitireString(sir);				
		}
	}
	
	public void meniu()
	{	
		String CNP="";
		int a=1;
		try 
		{
		this.repo.citire();
		}
		catch(Exception exp)
		{
			System.out.println("Nu s-a putut citi din fisier!");
		}
		while(a!=0)
		{
			
			System.out.println("1.Afisare studenti");
			System.out.println("2.Adaugare student");
			System.out.println("3.Stergere student");
			System.out.println("4.Modificare student");
			System.out.println("5.Afisare student dupa cnp");
			System.out.println("6.Scriere studenti in fisier");
			System.out.println("7.Afisare tabel studenti");
			System.out.println("8.Afisare tabel studenti nepromovati + discipline");
			System.out.println("9.Afisare tabel integralisti");
			System.out.println("10.Afisare studenti dupa varsta");
			System.out.println("0.Iesire");
		
			a=Citire("Introduceti optiunea dumneavoastra:");
			switch(a) 
			{
			case 0:
				System.out.println("Programul s-a incheiat!");
				break;
			case 1:
				this.repo.afisare();
				break;
			case 2:
				this.repo.citireStudent();
				break;
			case 3:
				CNP=CitireString("Introduceti cnp-ul studentului pe care doriti sa il stergeti:");
				this.repo.stergere(CNP);	
				break;
			case 4:
				
				break;
			case 5:
				CNP=CitireString("Introduceti cnp-ul studentului pe care doriti sa il afisati:");
				this.repo.afisareCNP(CNP);
				break;
			case 6:
				try {
				this.repo.scriereStudenti();
				}
				catch(Exception exp)
				{
					System.out.println("Scrierea studentiilor nu a reusit!");
				}
				break;
			case 7:
				this.repo.ordonare();
				this.repo.afisareMedie();
				break;
			case 8:
				this.repo.afisareNepromovati();
				break;
					
			case 9:
				this.repo.ordonare();
				this.repo.afisareIntegralisti();
				break;
			case 10:
				this.repo.ordonareVarsta();
				this.repo.afisareNume();
				break;
		
			}
		}
		
	}
}
