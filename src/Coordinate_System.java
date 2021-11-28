import java.util.Scanner;

public class Coordinate_System {
    public static void main(String[] args)
    {
        char[] cordX = new char[10];
        Scanner in = new Scanner(System.in);
        int cordY = 10;

        int playerX = 0;
        int playerY = 0;

        for(int i = 0; i < cordY; i++)
        {
            if(playerY == i)
            {
                for (int index = 0; index < 10; index++)
                {
                    cordX[index] = '-';
                }
                cordX[playerX] = '#';
                System.out.println(cordX);
            }
            else
            {
                for (int index = 0; index < 10; index++)
                {
                    cordX[index] = '-';
                }
                System.out.println(cordX);
            }
        }

        while (true)
        {
            for (int i = 0; i < 10; i++)
            {
                cordX[i] = '-';
            }
            String s = in.nextLine();
            if(s.equals("d"))
            {
                playerX++;
                for(int i = 0; i < cordY; i++)
                {
                    if(playerY == i)
                    {
                        cordX[playerX] = '#';
                        System.out.println(cordX);
                    }
                    else
                    {
                        for (int index = 0; index < 10; index++)
                        {
                            cordX[index] = '-';
                        }
                        System.out.println(cordX);
                    }
                }
            }
            if(s.equals("a"))
            {
                playerX--;
                for(int i = 0; i < cordY; i++)
                {
                    if(playerY == i)
                    {
                        cordX[playerX] = '#';
                        System.out.println(cordX);
                    }
                    else
                    {
                        for (int index = 0; index < 10; index++)
                        {
                            cordX[index] = '-';
                        }
                        System.out.println(cordX);
                    }
                }
            }
            if(s.equals("s"))
            {
                playerY++;
                if(playerY >= cordY)
                {
                    playerY = 0;
                }
                for(int i = 0; i < cordY; i++)
                {
                    if(playerY == i)
                    {
                        cordX[playerX] = '#';
                        System.out.println(cordX);
                    }
                    else
                    {
                        for (int index = 0; index < 10; index++)
                        {
                            cordX[index] = '-';
                        }
                        System.out.println(cordX);
                    }
                }
            }
            if(s.equals("w"))
            {
                playerY--;
                if(playerY < 0)
                {
                    playerY = cordY - 1;
                }
                for(int i = 0; i < cordY; i++)
                {
                    if(playerY == i)
                    {
                        cordX[playerX] = '#';
                        System.out.println(cordX);
                    }
                    else
                    {
                        for (int index = 0; index < 10; index++)
                        {
                            cordX[index] = '-';
                        }
                        System.out.println(cordX);
                    }
                }
            }
            if(s.equals("exit"))
            {
                break;
            }
        }
    }
}
