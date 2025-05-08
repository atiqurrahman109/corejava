
package first10naturalnumber;

import java.util.Scanner;
import javax.swing.text.StyledEditorKit;


public class First10NaturalNumber {

   
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
                  
//      int sum=0;
//        
//        for(int i=1; i<=100; i++){
//        
//        System.out.println(i);
//        
//     sum+=i;
//       
//        }
//
//        
//       System.out.println("\n"  +"total  "+  sum);
       
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("weekly day number");
        String weeklyDay=s.next();
        String daysName="";
        
        int integerDay = 0;
        
        if(weeklyDay.contains("a") || weeklyDay.contains("b") || weeklyDay.contains("c")){
            
        }
        else if(weeklyDay.contains("1")){
            integerDay = Integer.parseInt(weeklyDay);
            System.out.println(integerDay);
        }
       
        switch (weeklyDay) {

            case "a":
                daysName="saturday";
                break;
            case "1":
                daysName="saturday";
                break;
            case "b":
                daysName="sunday";
                break;
            case "2":
                daysName="sunday";
                break;
            case "c":
                daysName="monday";
                break;
            case "3":
                daysName="monday";
                break;
            case "d":
                daysName="tuesday";
                break;
            case "4":
                daysName="tuesday";
                break;
           case "e":
               daysName="wednasday";
                break;
           case "5":
               daysName="wednasday";
                break;
            case "f":
                daysName="thursdayday";
               break;
            case "6":
                daysName="thursdayday";
               break;
           case "g":
                daysName="friday" + "\n";
            //   studentDetails=" reja was absent his mind for a girl";                
           case "7":
                daysName="friday" + "\n";
//               studentDetails=" reja was absent his mind for a girl";                
               
               break;
               
            
            default:             System.out.println("unknown day name");
     }
        System.out.println(""+daysName);        
                    
                    
//            System.out.println("enter floor number");
//            Scanner floor=new Scanner(System.in);
//            
//            int floorNumber=floor.nextInt();
//            
//            String floorname;
//            
//            switch (floorNumber) {
//            case 1:
//             floorname = "first";
//                System.out.println(""+floorname);
//                break;
//            case 2:
//             floorname = "parking zone";
//                System.out.println(""+floorname);
//                break;
//            case 3:
//             floorname = "herlan showroom";
//                System.out.println(""+floorname);
//                break;
//            case 4:
//             floorname = "adidas showroom";
//                System.out.println(""+floorname);
//                break;
//            case 5:
//             floorname = "puma showroom";
//                System.out.println(""+floorname);
//                break;
//            case 6:
//             floorname = "amd showroom";
//                System.out.println(""+floorname);
//                break;
//            case 7:
//             floorname = "samsung showroom";
//                System.out.println(""+floorname);
//                break;
//            case 8:
//             floorname = "nokia showroom";
//                System.out.println(""+floorname);
//                break;
//            case 9:
//             floorname = "htc showroom";
//                System.out.println(""+floorname);
//                break;
//            case 10:
//             floorname = "apple showroom";
//                System.out.println(""+floorname);
//                break;
//
//           
//            
//            
//            
//            
//            default:
//                System.out.println("invaid number"+floorNumber);
//        }
            
            
            
            
        }
        
       
    }
        
       
        
        
        
  
    

