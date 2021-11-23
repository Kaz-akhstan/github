import javax.swing.*;

public class CamelCase {
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog(null, "Ange en text sträng");
        char[]inputString = new char[input.length()];
        String nyText = "";
        for(int i = 0; i < inputString.length; i++)
        {
            if(i == 0)
            {
                inputString[0] = input.toUpperCase().charAt(0);
            }
            else
            {
                inputString[i] = input.charAt(i);
            }
        }
        for(int i = 0; i < inputString.length; i++)
        {
            if(inputString[i] == ' ')
            {
                inputString[i+1] = input.toUpperCase().charAt(i+1);
            }
            nyText = nyText + inputString[i];
        }
        nyText = nyText.replace(" ", "");

        JOptionPane.showMessageDialog(null, nyText);
    }
}
