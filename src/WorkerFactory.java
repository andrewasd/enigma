public class WorkerFactory {

    private final char UNAVAILABLE_CELL = '#';
    private final char DEVELOPER_CELL = '_';
    private final char PROJECT_MANAGER_CELL = 'M';

   Replyer WorkerCreate(char type)
   {
      if(type==UNAVAILABLE_CELL)
      return null;
      else if(type==DEVELOPER_CELL)
      return new Developer();
      else if (type == PROJECT_MANAGER_CELL)
      return new ProjectManager();

      return null;



   }
    
}
