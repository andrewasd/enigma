import java.util.Set;

public class Developer extends Replyer {
    
  
    public Set<String> skills;

    public int bonus;
    public String company;

    Developer(String company, int bonus, Set<String> skills)
    {   
        this.bonus = bonus; 
        this.skills = skills;
        this.company = company;

    }

    Developer()
    {}


     public String getCompany() {
         return company;
     }
 
      public int  getBonus()
      {
        return bonus; 
      }


    static private int commonSkills(Replyer dev1, Replyer dev2)
    {
           int commonskills=0;
           
           Developer dv1 = (Developer)dev1;
           Developer dv2 = (Developer)dev2;

          
        for (String skill : dv1.skills) 
        {
             if(dv2.skills.contains(skill))
             commonskills++;

        }

        return commonskills;
    

    }


    static private int distinctSkills(Replyer dev1, Replyer dev2)
    {

        Developer dv1 = (Developer)dev1;
        Developer dv2 = (Developer)dev2;

       return dv1.skills.size()+dv2.skills.size()-commonSkills(dev1,dev2);
    }

    static public int  workPotential(Replyer dev1, Replyer dev2)
    {


        return commonSkills(dev1,dev2) *distinctSkills(dev1,dev2);
    }



    static public int bonusPotential(Replyer dev1, Replyer dev2)
    {
      
    
        Developer dv1 = (Developer)dev1;
        Developer dv2 = (Developer)dev2; 

      if(dv1.getCompany() == dv2.getCompany())
      {
         return dv1.getBonus()* dv2.getBonus();
      }
      else
      {
          return 0;
      }
       
   } 
 



}