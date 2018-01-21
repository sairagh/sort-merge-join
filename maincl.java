	import  java.util.*;
	import java.io.*;
	class sortmergejoin
	{

		public void pri()
		{
			//.out.println("hello");
		}

		public void open(String s1,String s2,String m)
		{
			int k=0;
			int j=0;
			String r="r";
			String s5=s1;
			int rs=0;
			int ss=0;
			while(j<2)
			{
				if(j==1){r="s";s5=s2;}
				int mem=Integer.parseInt(m);
				List<ArrayList<String>> rsublist = new ArrayList<ArrayList<String>>();
				//rsublist.add(new ArrayList<String>(Arrays.asList("5", "(805) 766-4920")));

				try {

					File file1=new File(s5);
					FileReader x=new FileReader(file1);
					BufferedReader bufferedReader = new BufferedReader(x);
					String line;
					int cn=0;
					int no=1;
					PrintWriter o12 = new PrintWriter(r+no+".txt");
					while((line=bufferedReader.readLine())!=null)
					{

						String[] s3=line.split("\\s+");
						if(j==1){
							k=1;
							ss=no;
						}
						else
						{
						rs=no;
						}
						//System.out.println(s3[1]);
						rsublist.add(new ArrayList<String>(Arrays.asList(s3[1-k], s3[k])));
						cn++;
						if(cn==100*mem)
						{
							Collections.sort(rsublist, new Comparator<ArrayList<String>>() {
									@Override
									public int compare(ArrayList<String> o1, ArrayList<String> o2) {
									return o1.get(0).compareTo(o2.get(0));
									}
									});
							for(int i=0;i<rsublist.size();i++)
							{
								String line1=rsublist.get(i).get(0) +" "+ rsublist.get(i).get(1);
								o12.println(line1);
								//  no++;
							}
							no++;
							o12.close();
							o12 = new PrintWriter(r+no+".txt");
							rsublist.clear();
							cn=0;
						}
					}
					Collections.sort(rsublist, new Comparator<ArrayList<String>>() {
							@Override
							public int compare(ArrayList<String> o1, ArrayList<String> o2) {
							return o1.get(0).compareTo(o2.get(0));
							}
							});
					for(int i=0;i<rsublist.size();i++)
					{
						String line1=rsublist.get(i).get(0) +" "+ rsublist.get(i).get(1);
						o12.println(line1);
						//no++;
					}
					o12.close() ;
					//`System.out.println`(rsublist);
					rsublist.clear();
					//System.out.println(rsublist);

					//o12.close();
				}
				catch(IOException e)
				{
					System.out.println("fjak");
				}

				j++;
			}
			getnext(rs,ss);
			//System.out.println(rs);
			//System.out.println(ss);
		}
		public String getmin(List<List<String>> rsub,int r)
		{
			String x;
			String s123="";
			String s26="9";
			//.out.println(rsub.size());
			for (int i=0;i<rsub.size();i++) {
				if(rsub.get(i).size()!=0){
					s123=(rsub.get(i)).get(0);
					break;
		}

		}
			//s26=s123.substring(0,(s123.length()-1)/2);
			for(int i=0;i<(s123.length()-1)/2;i++)
			{
				s26=s26+"9";
			}
			//.out.println(s26);
			x=s123;
			String min1=s26;
			for(int i=0;i<rsub.size();i++)
			{
				if(rsub.get(i).size()==0){continue;}
				s123=(rsub.get(i)).get(0);
				s26=s123.substring(0,(s123.length()-1)/2);
				//.out.println(min1.compareTo(s26));
				//min1=min1.compareTo(s26);
				if(min1.compareTo(s26)>0){min1=s26;
					x=s123;
				}
				}
		//.out.println(min1);
		return x;
		}
		public int checempt(List<List<String>> rsub,int r,BufferedReader []rl)
		{
			//List<String> x=new ArrayList<String>();
			int x;
			//(rsub.size());
				for(int i=0;i<rsub.size();i++)
				{
					//(i);
					x=rsub.get(i).size();
					//(x);

					if(x==0){
									BufferedReader qw=rl[i+1];
										List<String> x1=new ArrayList<String>();
										String s2;
										String line;
										int j=0;
										try{
										while(j<100)
										{
											if((line=qw.readLine())==null){break;}
											rsub.get(i).add(line);
											//x1.add(line);
											//.out.println(line);
											//x2.add(line);
											j++;
										}
										rl[i+1]=qw;
									}
									catch(IOException e){int er=1;}
									}
								}
				return 1;
		}
		public int checkemp1(List<List<String>> rsub,int r)
		{
			int cn=0;
			for(int i=0;i<rsub.size();i++){
				int x=rsub.get(i).size();
				if(x==0){cn++;}
				}
				if(cn==r){return 1;}
				return 0;

		}
		public int addfil(List<String> x2,PrintWriter o12)
		{
				if(x2.size()>=100)
				{
					for (int i=0;i<x2.size();i++) {
						o12.println(x2.get(i));
					}
					x2.clear();
					return 1;
				}
				return 0;
		}
		public void checkle(List<List<String>> ssub,String min1,int s,BufferedReader []sl,List<String> x2,PrintWriter o12)
		{
			int fl=1;
			String s5=min1.substring(0,(min1.length()-1)/2);
			String s6=min1.substring((min1.length()-1)/2+1);
		//	System.out.println(s6);
			for(int j=0;j<ssub.size();j++)
			{
				if(ssub.get(j).size()==0)
				{
						checempt(ssub,s,sl);
						int k=checkemp1(ssub,s);
						if(k==0){continue;}
				}
				fl=1;
				while(ssub.get(j).size()!=0&&fl==1){
					int i=0;

		while(i<ssub.get(j).size())
			{
				//(ssub.get(j).get(i));
				String s123;
				String s26;
				s123=(ssub.get(j)).get(i);
				s26=s123.substring(0,(s123.length()-1)/2);
				////(s26);
				if(s5.compareTo(s26)==0){
					String line;
					line=s6+" "+ s123;
					//.println(line);
					x2.add(line);
					addfil(x2,o12);
					i++;
				}
				else if(s5.compareTo(s26)>0)
				{
					//("hiii");
					ssub.get(j).remove(i);
				}
				else{
					fl=0;
					break;
				}
			}
			if(ssub.get(j).size()!=0){fl=0;}
			if(ssub.get(j).size()==0)
			{
					checempt(ssub,s,sl);
					int k=checkemp1(ssub,s);
					if(k==0){break;}
			}
		}
	}
	}
	public void remov(List<List<String>> rsub,String min1,int r)
	{
			for(int i=0;i<rsub.size();i++)
			{
				if(rsub.get(i).size()!=0){
				if(min1.compareTo(rsub.get(i).get(0))==0){rsub.get(i).remove(0);
				break;}}
			}
	}
	  public void getnext(int r,int s)
	  {
		List<List<String>> rsub = new ArrayList<List<String>>();
		//List<String> x2 = new ArrayList<String>();
		List<List<String>>ssub = new ArrayList<List<String>>();
		BufferedReader []rl= new BufferedReader[20];
		BufferedReader []sl= new BufferedReader[20];
		int j=0;
		int k=j;
		int l=0;
		int f=r;
		String s1="r";
		while(l<2){

		try{
			if(l==1){s1="s";f=s;}
		for(int i=1;i<=f;i++)
		{	j=0;

			//x2.clear();
			//String s4=s1+i;
			File file1=new File(s1+i+".txt");
			FileReader x=new FileReader(file1);
			BufferedReader a = new BufferedReader(x);
			String line;
			List<String> x2 = new ArrayList<String>();
			while(j<100)
			{
				if((line=a.readLine())==null){break;}
				x2.add(line);
				j++;
			}
			if(l==0){rl[i]=a;rsub.add(x2);}
			if(l==1){sl[i]=a;ssub.add(x2);}
			//rsub.add(x2);
			////(x2);
			//rsub.add(x2);
			//x2.clear();
		}
		}
			catch(IOException e)
		{
			int le=0;
		}
		l++;
		}
	//(rsub);
	//(ssub);
		checempt(rsub,r,rl);
		checempt(ssub,s,sl);
		try{
		PrintWriter o12=new PrintWriter("rsjoin"+".txt");
		//checempt(ssub,s,sl);
		List<String> x = new ArrayList<String>();

		while(checkemp1(rsub,r)!=1&&checkemp1(ssub,s)!=1){
			String min1=getmin(rsub,r);
			//(min1);
		//int y=checkemp1(rsub,r)
		//.println(rsub);
		//.println(min1);
		//.println(ssub);

		checkle(ssub,min1,s,sl,x,o12);
		//(ssub);
		remov(rsub,min1,r);
		//(rsub);
		checempt(rsub,r,rl);
		checempt(ssub,s,sl);
		//.out.println(min1);
	  }
		for (int i=0;i<x.size() ;i++)
		{
				o12.println(x.get(i));
		}
		o12.close();
	}
	catch(IOException e)
	{
		int er=1;
	}
	}
	  public void close()
	  {

	  }
	}
class hashjoin
	{
			public void open(String s1,String s2,String me)
			{
				int mem=Integer.parseInt(me);
				PrintWriter []rp=new PrintWriter[mem];
				PrintWriter []sp=new PrintWriter[mem];
				int []rp1=new int[mem];
				int []sp1=new int[mem];

				for (int i=0;i<=mem-1;i++	)
				{
					try{
						rp1[i]=0;
					PrintWriter writer = new PrintWriter("r"+"hash"+i+".txt", "UTF-8");
					rp[i]=writer;
					PrintWriter writer1 = new PrintWriter("s"+"hash"+i+".txt", "UTF-8");
					sp1[i]=0;
					sp[i]=writer1;
				}
				catch(IOException e){
					int fl=1;
				}
				}
				String r=s1;
				int j=0;
				int k=1;
				while(j<2)
				{
					if(j==1){r=s2;}
					try{
					File file1=new File(r);
					FileReader x=new FileReader(file1);
					BufferedReader bufferedReader = new BufferedReader(x);
					String line;
					int cn=0;
					int no=1;

					while((line=bufferedReader.readLine())!=null)
					{

						String[] s3=line.split("\\s+");
						int ep;
						if(j==1){k=0;}
						int y=Integer.parseInt(s3[k]);
						if(j==0){
							rp1[y%mem]++;
						//.println(y%mem+"r");
						rp[y%mem].println(s3[1]+" "+s3[0]);
						}
						if(j==1){
							sp1[y%mem]++;
						sp[y%mem].println(s3[0]+" "+s3[1]);
						}
						//System.out.println(s3[0]);
				}

				}
				catch(IOException e)
				{
					int ee=1;
				}
				j++;

}
for (int i=0;i<=mem-1 ;i++ ){
	rp[i].close();
	sp[i].close();
}
getnext(mem,rp1,sp1);
}
public void load(String s,int i,List<String> mai)
{
	try{
	String r=s+"hash"+i+".txt";
	System.out.println(r);
	File file1=new File(r);
	FileReader x=new FileReader(file1);
	BufferedReader bufferedReader = new BufferedReader(x);
	String line;
	int ik=0;
	System.out.println(mai.size());
	int cn=0;
		while((line=bufferedReader.readLine())!=null)
		{
			String[] s3=line.split("\\s+");
			if(s3[0].compareTo("990")==0	)
			{
				System.out.println(line);
			}
			mai.add(line);
			cn++;
		}
		if(i==0)
		{System.out.println(mai);System.out.println(mai.size());System.out.println(cn);}
	//.println(mai);
}
catch(IOException e)
{
	int er=1;
}
}
public PrintWriter check(List<String>mainm,String s,List<String>su,int fl,PrintWriter o12,int j)
{
		try{
	String r=s+"hash"+j	+".txt";
	File file1=new File(r);
	FileReader x=new FileReader(file1);
	BufferedReader bufferedReader = new BufferedReader(x);
	String line;
		while((line=bufferedReader.readLine())!=null)
		{
			String[] s3=line.split("\\s+");
			for (int i=0;i<mainm.size();i++ ) {
				String s2=mainm.get(i);
				if(fl==0)
				{
				String	s26=s2.substring(0,(s2.length()-1)/2);
				String	s27=s2.substring((s2.length()-1)/2+1);

				if(s26.compareTo(s3[0])==0)
				{
					o12.println(s27+" "+s3[0]+" "+s3[1]);
					//o12=check1(su,o12);
				}
			}
			else
			{
				String	s26=s2.substring(0,(s2.length()-1)/2);
				String	s27=s2.substring((s2.length()-1)/2+1);

				if(s3[0].compareTo(s26)==0)
				{
					if(i==1&&s26=="661"){System.out.println(s3[1]+" "+s2);}
					o12.println(s3[1]+" "+s2);
				//	o12=check1(su,o12);
				}
			}
			}
			}
		}
		catch(IOException e)
		{
			int er=1;
		}
		return o12;
}
public PrintWriter check1(List<String>s,PrintWriter o12)
{
if(s.size()>=100)
{
	for (int i=0;i<s.size() ;i++ )
	 {
			o12.println(s.get(i));
		//	s.remove(i);
	}
	for (int i=0;i<s.size() ;i++ ) {
		s.remove(i);

	}
}
return o12;
}
public void getnext(int mem,int []rp1,int []sp1)
{
	try{
	PrintWriter writer = new PrintWriter("rs"+"hashjoin"+".txt", "UTF-8");
List<String> x = new ArrayList<String>();
List<String> mainm = new ArrayList<String>();
		for(int i=0;i<mem;i++)
		{

			if(rp1[i]==0||sp1[i]==0){continue;}
			if(i==1){
			System.out.println(rp1[i]);
			System.out.println(sp1[i]);
		}
			if(rp1[i]<sp1[i])
			{
				load("r",i,mainm);
				writer=check(mainm,"s",x,0,writer,i);

			}
			else
			{
				if(i==1){System.out.println("hello");}
				load("s",i,mainm);
				writer=check(mainm,"r",x,1,writer,i);
			}
			int ik=0;
			while(ik<mainm.size())
			{
				mainm.remove(ik);
			}
		}
	writer.close();
}
catch(IOException e)
{
	int eer=1;
}
}
}
	public class maincl
	{
		public static void main(String []args)
		{
			if(args.length<3)
			{
				System.out.println("error in input");
			}
			else
			{
				String f1=args[0];
				String f2=args[1];
				String type=args[2];
				String size=args[3];
				//.out.println(type);
				if(type.equals("sort"))
				{
					sortmergejoin obj=new sortmergejoin();
					obj.open(f1,f2,size);
				}
				if(type.equals("hash"))
				{
					int fo=1;
				hashjoin obj=new hashjoin();
				obj.open(f1,f2,size);
				}
			}
		}
	}
