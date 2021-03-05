import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class App {
   
  /*  static public Set<Developer> developers = new HashSet();
   static public Set<ProjectManager> projectManagers = new HashSet(); */

   static public Set<Replyer> replyers = new HashSet<>();
  
  
   


    public static void main(String[] args) throws Exception {

          Spacefloor space;
          WorkerFactory fact = new WorkerFactory();

        
        try {
            File myObj = new File("src/input.txt");
            Scanner myReader = new Scanner(myObj);

            String data =  myReader.nextLine();
             
             //initializing floor 
             String[] x = data.split(" ");
             space = new Spacefloor(Integer.valueOf(x[1]),Integer.valueOf(x[0]));
             

           //setting spaces        
           for(int i = 0; i<space.GetRows();i++)
           {
            data = myReader.nextLine();

            for (int j = 0; j < data.length(); j++)
            {
              space.SetWorker(i, j, fact.WorkerCreate(data.charAt(j)));
      
           }
          }

                //developer numbers
                data = myReader.nextLine();
           int devnumber = Integer.valueOf(data);

           for(int j = 0; j<devnumber;j++)
           {
                data = myReader.nextLine();
                String[] options = data.split(" ");

                Set<String> skills = new HashSet();

                for(int i = 3; i<options.length;i++)
                {
                   skills.add(options[i]);
                }

              
               replyers.add(new Developer(options[0],Integer.valueOf(options[1]),skills));
                 
           }

           data = myReader.nextLine();
           int projectmangersnumber = Integer.valueOf(data);

           for(int j = 0; j<projectmangersnumber;j++)
           {
                data = myReader.nextLine();
                String[] options = data.split(" ");


               replyers.add(new ProjectManager(options[0],Integer.valueOf(options[1])));       
    
      
           }
            
            


              System.out.println(data);

              for(int row =0; row<space.GetRows();row++)
              {
                for(int col = 0; col<space.GetColumns();col++)
                {
                     if(space.getReplyer(row, col)!=null)
                     {
                        if(space.getReplyer(row, col).getClass() == ProjectManager.class)
                        {
                          space.checkavailableSpace(row,col);
                        }

                     }
               

                }

                
              }
  
             


            
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}
