import javax.lang.model.util.ElementScanner6;

public class Replyer {

    

    
    public static int GetTotalPotential(Replyer r1, Replyer r2)
    {
      
      if(r1.getClass()==Developer.class && r2.getClass() == Developer.class)
      {
       
        return  Developer.workPotential(r1,r2) + Developer.bonusPotential(r1, r2);

      }
      else if(r1.getClass() == ProjectManager.class && r2.getClass() == ProjectManager.class)
      {

        return  Developer.bonusPotential(r1, r2);
      } 
     else if(r1.getClass() == Developer.class && r2.getClass() == ProjectManager.class)
     {
       Developer d1 = (Developer)r1;  
       ProjectManager d2 = (ProjectManager)r2;
  

      if (d1.getCompany().equals(d2.GetCompany())){
        return d1.getBonus() * d2.GetBonus();
      }
      else
      return 0;

     }
     else if(r1.getClass() == ProjectManager.class && r2.getClass() == Developer.class)
     {
      ProjectManager d1 = (ProjectManager)r1;  
      Developer d2 = (Developer)r2;
 

     if (d1.GetCompany().equals(d2.getCompany())){
       return d1.GetBonus() * d2.getBonus();
     }
       else
       return 0;
   
   



      }
      else
      return 0;
   
    

    }

}
