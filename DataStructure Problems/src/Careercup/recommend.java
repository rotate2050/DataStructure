package Careercup;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;

class RecommendationEngine
{
int service_count=1;	
ArrayList<ArrayList<Integer>> matrix;
HashMap<Integer, String> services;
HashMap<String,HashMap<Integer,String>> invertedindex=new HashMap<String,HashMap<Integer,String>>();

static RecommendationEngine re;


public RecommendationEngine() {
	// TODO Auto-generated constructor stub
matrix=new ArrayList<ArrayList<Integer>>();
services=new  HashMap<Integer, String> ();

services.put(0,"null service");
matrix.add(new ArrayList());
}







static RecommendationEngine getInstance()
{
	
	if (re==null)
	{
		re = new RecommendationEngine(); 
	}
	return re;	
}


void addService(String z)
{
	service_count++;
	services.put(new Integer(service_count),z);		
	ArrayList<Integer> s=new ArrayList();
    matrix.add(s);

    for (ArrayList<Integer> l: matrix)
    {
    	for (int i=l.size();i<service_count;i++)
    	{
    	
    	l.add(0);
    	
    	}
    
    }

}


void init (ArrayList<workflows> z)
{

	for (workflows e: z)
	{
		addWorkflow(e);
	}

}


void addWorkflow(workflows a)
{
	a.f.add(0, 0);
	a.f.add(a.f.size(),0);
	
	
	for (int i=0;i<a.f.size()-1;i++)
	{
		ArrayList<Integer> temp= matrix.get(a.f.get(i));
		
		for( int t=i+1;t<a.f.size();t++ )
		{
          	 
        temp.set(a.f.get(t),temp.get(a.f.get(t))+1);     

		}
	
	}

	
System.out.print(matrix);	

}



double  getprobability(int a, int b,int total) {
	
double prob=0.00;	
int pab=0,totala=0,totalb=0;
pab=matrix.get(a).get(b);

for(int i=0;i<matrix.size();i++)
	{
		totala+=matrix.get(a).get(i);
		totalb+=matrix.get(b).get(i);
	}

prob=(double)((pab/totala)*totalb)/total;

return prob;

}



ArrayList<String> getRecommendations(int x)
{
	int total=0;
	for(int i=0;i<matrix.size();i++)
	{
		for (int j=0;j<matrix.size();j++)
		{
		
		total+= matrix.get(i).get(j);
		
		}
		
}

	double max1=-1,max2=-1,max3=-1;
	int x1=0,x2=0,x3=0;
	for (int i=0;i<matrix.size();i++)
	{
		if (i!=x && i!=0)
	{
		double prob=getprobability(x, i, total);
		
	if (prob>max1)
	{
		max1=prob;
		x1=i;
		
	}	
	else if (prob>max2)
	{
		max2=prob;
		x2=i;
		
	}
	else if (prob>max3)
	{
		max3=prob;
		x3=i;
	}
	}
	
}
	
	
ArrayList<String> d=new ArrayList<String>();
	d.add(services.get(x1));
	d.add(services.get(x2));
	d.add(services.get(x3));
	
	System.out.println(d);
	return d;

}




}





class workflows
{
ArrayList <Integer>	f;

}



class test
{
	

public static void main(String[] args) {

RecommendationEngine e=RecommendationEngine.getInstance();
workflows a =new workflows();
ArrayList<Integer> t=new ArrayList<Integer>();
t.add(1);
t.add(3);
t.add(2);
a.f=t;
e.addService("a");
e.addService("b");
e.addService("c");

e.addWorkflow(a);	
	

e.getRecommendations(0);

}




}