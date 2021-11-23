import javax.swing.*;

public class Spelkontrol {
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog(null, "Ange antal drag");
        String drag = "";
        int x = 0;
        int y = 0;
        char[]koordinater = new char[Integer.parseInt(input)];
        for (int i = 0; i < Integer.parseInt(input); i++)
        {
            drag = JOptionPane.showInputDialog(null, "Ange en riktning \nNord[W]\nSyd[S]\nVäst[A]\nÖst[D]");
            koordinater[i] = drag.charAt(0);
        }
        for (int i = 0; i < koordinater.length; i++)
        {
            if(koordinater[i] == 'W')
            {
                y++;
            }
            if(koordinater[i] == 'S')
            {
                y--;
            }
            if(koordinater[i] == 'A')
            {
                x--;
            }
            if(koordinater[i] == 'D')
            {
                x++;
            }
        }
        JOptionPane.showMessageDialog(null, "X=" + x + "\nY=" + y + "\nAntal drag: " + Integer.parseInt(input));
    }
}
