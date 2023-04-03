package calculate;

import java.util.ArrayList;
import java.util.Iterator;

public class Programme_5 {



        public static void main(String[] args) {
            ArrayList<String> namesList = new ArrayList<String>();
            namesList.add("Rashmita");
            namesList.add("Trushar");
            namesList.add("saambhavi");

            Iterator<String> listItr = namesList.iterator();
            while(listItr.hasNext()) {
                System.out.println(listItr.next());
            }
        }
    }

