import javax.swing.JOptionPane;

public class ClassExercise{

        public static void main(String[] args){
        String s1="";
        s1=JOptionPane.showInputDialog("Please enter the 1,5, or 10 dollar ");
        double dbls1,dblbill;
        	dbls1=Double.parseDouble(s1);
        final int QUARTER=25;
        	  int NICKLES=5;
        	  int DIMES=10;
        dblbill=dbls1*100;
        JOptionPane.showMessageDialog(null,"there are \""+dblbill/QUARTER + "\"quarter in your bill."
        		+ "\n"+"or" +dblbill/DIMES+ "\"dimes in your bill."
        		+ "\n"+"or" +dblbill/NICKLES+ "\"nickles in your bill."
        		+ "\n"+"or" +dblbill+ "\"pennise in your bill.");
        }
}


