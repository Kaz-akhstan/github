import javax.swing.*;

public class github {
    public static void main(String[] args)
    {
        String antal = JOptionPane.showInputDialog(null, "Ange antal nummer");
        int antalInt = Integer.parseInt(antal);
        int[] lista = new int[antalInt + 1]; /*Kan vara fel, fixa*/
        for(int i = 1; i <= antalInt; i++)
        {
            String newNum = JOptionPane.showInputDialog(null, "Ange det " + i + "e numret");
            lista[i] = Integer.parseInt(newNum);
        }
        for(int i = 0; i <= antalInt; i++)
        {

        }
    }
}