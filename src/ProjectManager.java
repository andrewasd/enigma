public class ProjectManager extends Replyer {

    protected String company;
    protected int bonus;

    ProjectManager(String company, int bonus)
    {
      this.company = company;
      this.bonus = bonus;

    }

    ProjectManager()
    {}

    public String GetCompany()
    {
         return this.company;

    }

    public int  GetBonus()
    {
         return this.bonus;

    }

    static public int bonusPotential(ProjectManager pr1, ProjectManager pr2)
    {
      if(pr1.GetCompany() == pr2.GetCompany())
      {
         return pr1.GetBonus()* pr2.GetBonus();

      }
      else
      {
          return 0;
      }
       
   } 
}
