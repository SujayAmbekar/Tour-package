import java.util.*;
//Program to show the available tour packages and to print the bill
public class TourPackage
{
    int i,b,z,m,a;
    int []d=new int [10];
    String []n=new String [10];
    String []x=new String [10];
    char []g=new char [10];
    double c=250000,amt,dis,tot;     
    TourPackage()
    {
        i=0;
        a=0;
        b=0;
        z=0;
        c=250000;
        amt=0.0d;
        dis=0.0d;
        tot=0.0d;
    }
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("**********WELCOME TO SUJAY TOURS AND TRAVELS**********");
        System.out.println("The TOUR PACKAGES availabe in our travels are listed below");
        System.out.println("1.Australia \n2.Canada \n3.United States Of America \n4.Germany \n5.Spain");
        System.out.println("Choose your desired package by entering the number shown along the package"); 
        a=sc.nextInt();            
        while(a>5||a<1)
        {
            System.out.println("Choose only from the above options");
            a=sc.nextInt();
        }
        switch(a)
        {
        case 1:
        System.out.println("THANK YOU for choosing the package");
        System.out.println("The places covered in AUSTRALIA package are given below:");
        System.out.println("Places covered in SYDNEY:\nSydney Opera House\nBondi Beach");
        System.out.println("Places covered in CAIRNS:\nRainforest\nGreat Barrier Reef Gateway");
        System.out.println("Places covered in PERTH:\nKings Park\nFremantle Port");
        System.out.println("Places covered in GOLD COAST:\nSurfers Paradise\nTheme park\nCanals");
        System.out.println("Places covered in ADELAIDE:\nRenowed Arts Festival\n1869 Food Hall");
        System.out.println("Places covered in CANBERRA:\nParliment House\nAustralian War Memorial");
        System.out.println();
        System.out.println("Enter the number of people going on tour:");
        b=sc.nextInt();
        System.out.println("Total Expenses of 1 person including flight charges:Rs 2,50,000");
        System.out.println("Flight offered is SPICE JET");
        System.out.println("*****PACKAGE DETAILS*****");
        System.out.println("The following table shows the discount offered");
        System.out.println("Number of people\t Discount offered in percent");
        System.out.println("      1         \t              5");
        System.out.println(" Couple (2)     \t              10");
        System.out.println("     3-5        \t              15");
        System.out.println("     6-10       \t              20");
        System.out.println(" More than 10   \t              35");
        System.out.println();
        System.out.println("The package consists of 15 days and 16 nights");
        break;
        case 2:
        System.out.println("THANK YOU for choosing the package");
        System.out.println("Places covered in CANADA package are given below:");
        System.out.println("Places covered in TORONTO:\nCN Tower\nThe Royal Ontario museum");
        System.out.println("Places covered in MONTREAL:\nVieux-Montreal\nNotre-Dame");
        System.out.println("Places covered in NIAGARA FALLS:\nSkylon tower Views Of Horseshoe Falls");
        System.out.println("Places covered in OTTAWA:\nNational Gallery\nRideu Canal");
        System.out.println("Places covered in VICTORIA:\nButchart Gardens\nParliament House");
        System.out.println("Places covered in WINNIPEG:\nSt.Boniface Quarter");
        System.out.println();
        System.out.println("Enter the number of people going on tour:");
        b=sc.nextInt();
        System.out.println("Total Expenses of 1 person including flight charges:Rs 2,50,000");
        System.out.println("Flight offered is SPICE JET");
        System.out.println("*****PACKAGE DETAILS*****");
        System.out.println("The following table shows the discount offered");
        System.out.println("Number of people\t Discount offered in percent");
        System.out.println("      1         \t              5");
        System.out.println(" Couple (2)     \t              20");
        System.out.println("     3-5        \t              22");
        System.out.println("     6-10       \t              24");
        System.out.println(" More than 10   \t              35");
        System.out.println();
        System.out.println("The package consists of 13 days and 12 nights");
        break;
        case 3:
        System.out.println("THANK YOU for choosing the package");
        System.out.println("Places covered in UNITED STATES OF AMERICA package are given below:");
        System.out.println("Places covered in NEWYORK CITY:\nStatue Of Liberty");
        System.out.println("Places covered in LAS VEGAS:\nCasinos\nGourmet Dining");
        System.out.println("Places covered in LOS ANGELES:\nVenice Beach");
        System.out.println("Places covered in ORLANDO:\nWalt Disney World");
        System.out.println("Places covered in CHICAGO:\nWillis Tower\nDeep Dish Pizza");
        System.out.println("Places covered in HAWAII:\nVolcanoes\nBeaches\nKohala Coast");
        System.out.println();
        System.out.println("Enter the number of people going on tour:");
        b=sc.nextInt();
        System.out.println("Total Expenses of 1 person including flight charges:Rs 2,50,000");
        System.out.println("Flight offered is SPICE JET");
        System.out.println("*****PACKAGE DETAILS*****");
        System.out.println("The following table shows the discount offered");
        System.out.println("Number of people\t Discount offered in percent");
        System.out.println("      1         \t              5");
        System.out.println(" Couple (2)     \t              15");
        System.out.println("     3-5        \t              25");
        System.out.println("     6-10       \t              35");
        System.out.println(" More than 10   \t              50");
        System.out.println();
        System.out.println("The package consists of 14 days and 15 nights");
        break;
        case 4:
        System.out.println("THANK YOU for choosing the package");
        System.out.println("Places covered in GERMANY package are given below:");
        System.out.println("Places covered in BERLIN:\nBrandenburg Gate\nBerlin Wall");
        System.out.println("Places covered in FRANKFURT:\nGoethe House\nmuseums");
        System.out.println("Places covered in HAMBURG:\nCanals\nReeperbahn Nightlife");
        System.out.println("Places covered in BREMEN:\nSt.Peter's Cathedral");
        System.out.println("Places covered in STUTTGART:\nCar Museums");
        System.out.println("Places covered in Aachen:\nAachen Cathedral\nMineral Springs");
        System.out.println();
        System.out.println("Enter the number of people going on tour:");
        b=sc.nextInt();
        System.out.println("Total Expenses of 1 person including flight charges:Rs 2,50,000");
        System.out.println("Flight offered is SPICE JET");
        System.out.println("*****PACKAGE DETAILS*****");
        System.out.println("The following table shows the discount offered");
        System.out.println("Number of people\t Discount offered in percent");
        System.out.println("      1         \t              5");
        System.out.println(" Couple (2)     \t              12");
        System.out.println("     3-5        \t              15");
        System.out.println("     6-10       \t              18");
        System.out.println(" More than 10   \t              20");
        System.out.println();
        System.out.println("The package consists of 15 days and 16 nights");
        break;
        case 5:
        System.out.println("THANK YOU for choosing the package");
        System.out.println("Places covered in SPAIN package are given below:");
        System.out.println("Places covered in BARCELONA:\nGothic Quarter\nTapas");
        System.out.println("Places covered in MADRID:\nRoyal Talce\nPrado Museum");
        System.out.println("Places covered in MAJORCA:\nPalma");
        System.out.println("Places covered in VALENCIA:\nSerranos Towers");
        System.out.println("Places covered in BILBAO:\nGehry's Guggenheim Museum");
        System.out.println("Places covered in SEGOVIA:\nRoman Aqueduct");
        System.out.println();
        System.out.println("Enter the number of people going on tour:");
        b=sc.nextInt();
        System.out.println("Total Expenses of 1 person including flight charges:Rs 2,50,000");
        System.out.println("Flight offered is SPICE JET");
        System.out.println("*****PACKAGE DETAILS*****");
        System.out.println("The following table shows the discount offered");
        System.out.println("Number of people\t Discount offered in percent");
        System.out.println("      1         \t              5");
        System.out.println(" Couple (2)     \t              10");
        System.out.println("     3-5        \t              11");
        System.out.println("     6-10       \t              12");
        System.out.println(" More than 10   \t              15");
        System.out.println();
        System.out.println("The package consists of 13 days and 14 nights");
        break;        
}
}
void calc()
{    
     switch(a)
    {
    case 1:        
        if(b==1)
    {
        dis=(0.05*c)*b;        
    }
    else if(b==2)
    {
        dis=(0.1*c)*b;
    }
    else if(b>=3 && b<=5)
    {
        dis=(0.15*c)*b;
    }
    else if(b>=6 && b<=10)
    {
        dis=(0.2*c)*b;
    }
    else 
    {
        dis=(0.35*c)*b;
    }    
    break;
    case 2:
    if(b==1)
    {
        dis=(0.05*c)*b;
    }
    else if(b==2)
    {
        dis=(0.2*c)*b;
    }
    else if(b>=3 && b<=5)
    {
        dis=(0.22*c)*b;
    }
    else if(b>=6 && b<=10)
    {
        dis=(0.24*c)*b;
    }
    else 
    {
        dis=(0.35*c)*b;
    }      
    break;
    case 3:
    if(b==1)
    {
        dis=(0.05*c)*b;
    }
    else if(b==2)
    {
        dis=(0.15*c)*b;
    }
    else if(b>=3 && b<=5)
    {
        dis=(0.25*c)*b;
    }
    else if(b>=6 && b<=10)
    {
        dis=(0.35*c)*b;
    }
    else 
    {
        dis=(0.5*c)*b;
    }    
    break;
    case 4:
    if(b==1)
    {
        dis=(0.05*c)*b;
    }
    else if(b==2)
    {
        dis=(0.12*c)*b;
    }
    else if(b>=3 && b<=5)
    {
        dis=(0.15*c)*b;
    }
    else if(b>=6 && b<=10)
    {
        dis=(0.18*c)*b;
    }
    else 
    {
        dis=(0.2*c)*b;
    }    
    break;
    case 5:
    if(b==1)
    {
        dis=(0.05*c)*b;
    }
    else if(b==2)
    {
        dis=(0.1*c)*b;
    }
    else if(b>=3 && b<=5)
    {
        dis=(0.11*c)*b;
    }
    else if(b>=6 && b<=10)
    {
        dis=(0.12*c)*b;
    }
    else 
    {
        dis=(0.15*c)*b;
    }    
    break;    
}
}
void discount()
{
    System.out.println("DISCOUNT GIVEN="+dis);
    tot=c*b;
    amt=tot-dis;
    System.out.println("AMOUNT AFTER DISCOUNT = Rs"+amt);  
}    
void read()
{
    System.out.println("If you have accepted the above terms and conditions of the package and if you want to confirm your booking, then press 1, else press any other number");
    z=sc.nextInt();      
    if(z==1)
    {
    for(i=0;i<b;i++)
    {
    System.out.println("Enter the names of the tourists:");
    n[i]=sc.next();
    System.out.println("Enter m for MALE and f for female:");
    g[i]=sc.next().charAt(0);
        while(g[i]!='m'&&g[i]!='M'&&g[i]!='f'&&g[i]!='F')
    {
        System.out.println("Enter only 'm' or 'f':");
        g[i]=sc.next().charAt(0);        
    }    
    if(g[i]=='m'||g[i]=='M')
        {
            x[i]="Male";
        }
        else if(g[i]=='f'||g[i]=='F')
        {
            x[i]="Female";
        }        
    System.out.println("Enter the age:");
    d[i]=sc.nextInt();
}
}
else
{
    System.out.println("Thank you for visiting us\nWe hope you would visit us soon"); 
    for(i=0;i<1000000000;i++)
    {           
    }
System.exit(0);
}
}
void display()
{
    System.out.println("**********SUJAY TOURS AND TRAVELS**********");
    System.out.println("**********        BILL           **********");
    System.out.println("Name\t Gender\t Age:");
    for(i=0;i<b;i++)
    {        
        System.out.println(n[i]+"\t"+x[i]+"\t"+d[i]);
    }
    System.out.println("Total number of people:"+b);
    System.out.println();
    System.out.println("TOTAL AMOUNT:Rs"+tot);
    System.out.println("DISCOUNT GIVEN:Rs"+dis);
    System.out.println("AMOUNT AFTER DISCOUNT:Rs"+amt);
    System.out.println("THANK YOU FOR CHOOSING OUR TOURS AND TRAVELS");
    System.out.println("WISH YOU A HAPPY AND SAFE JOURNEY");
    System.out.println("********************************************");
}
public static void main()
{
    TourPackage t1=new TourPackage();
    t1.input();
    t1.calc();
    t1.discount();
    t1.read();  
    t1.display();
}
}      
