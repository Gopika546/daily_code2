/*
Problem: Jumpy Ball (Bouncing Ball Distance)

Description:
A ball is dropped from a height H meters. Each time the ball hits the ground,
it bounces back to a height equal to B × H, where B is the bounce factor
such that 0 < B < 1.

The ball continues bouncing until the height becomes less than 1 meter.

Your task is to calculate the total distance travelled by the ball.

Rules:
- The first fall from height H is counted once.
- After each bounce, the ball travels upward and then downward,
  so that distance is counted twice (up + down).
- Stop the process when the bounce height becomes less than 1 meter.

Input:
Two values:
H → Initial height (integer or float)
B → Bounce factor (float)

Output:
Print the total distance travelled by the ball.

Example:

Input:
5
0.5

Output:
12.5
*/

import java.util.Scanner;
public class JumpyBall 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        float h = s.nextFloat();
        float bounce = s.nextFloat();
        s.close();
        float dis = h;
        while(true)
        {
            h = h * bounce;
            if(h < 1)
                break;
            dis += 2 * h;
        }
        System.out.println(dis);
    }    
}
