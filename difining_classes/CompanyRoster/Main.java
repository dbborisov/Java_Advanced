package difining_classes.CompanyRoster;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        HashMap<String,Department> department = new HashMap<>();

        for (int i = 0; i <lines ; i++) {
            String[] cmd = scanner.nextLine().split("\\s+");
            String depName = cmd[3];
            Employee employee =null;


            switch (cmd.length){
                case 4:
                    employee = new Employee(cmd[0],Double.parseDouble(cmd[1]));
                    break;
                case 5:

                    if(cmd[4].contains("@")){
                        employee = new Employee(cmd[0],Double.parseDouble(cmd[1]),cmd[4]);
                    }else{
                        employee = new Employee(cmd[0],Double.parseDouble(cmd[1]),Integer.parseInt(cmd[4]));
                    }
                    break;
                case 6:
                    employee = new Employee(cmd[0],Double.parseDouble(cmd[1]),cmd[4],Integer.parseInt(cmd[5]));

                    break;

            }
            if(!department.containsKey(depName)){
                department.put(depName,new Department(depName));
            }
            department.get(depName).getEmployees().add(employee);


        }

        System.out.println(department.entrySet().stream().min(Comparator.comparing(a -> a.getValue()
                .getAverageSalary())).get().getValue());


    }
}
