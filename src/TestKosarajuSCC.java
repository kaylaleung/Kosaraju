
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayla
 */
public class TestKosarajuSCC {
    
    public static void main(String[] args)
    {
        Digraph d = new Digraph(50);
        
        d.addEdge(0, 7);
        d.addEdge(0, 34);
        d.addEdge(1, 22);
        d.addEdge(1, 22);
        d.addEdge(1, 49);
        d.addEdge(1, 45);
        d.addEdge(1, 14);
        d.addEdge(1, 21);
        d.addEdge(2, 25);
        d.addEdge(2, 33);
        d.addEdge(2, 19);
        d.addEdge(3, 4);
        d.addEdge(3, 17);
        d.addEdge(3, 36);
        d.addEdge(3, 42);
        d.addEdge(4, 17);
        d.addEdge(4, 17);
        d.addEdge(4, 27);
        d.addEdge(5, 43);
        d.addEdge(6, 13);
        d.addEdge(6, 13);
        d.addEdge(6, 28);
        d.addEdge(6, 28);
        d.addEdge(7, 41);
        d.addEdge(7, 44);
        d.addEdge(8, 19);
        d.addEdge(8, 48);
        d.addEdge(9, 9);
        d.addEdge(9, 11);
        d.addEdge(9, 30);
        d.addEdge(10, 28);
        d.addEdge(10, 28);
        d.addEdge(10, 28);
        d.addEdge(10, 0);
        d.addEdge(10, 7);
        d.addEdge(10, 41);
        d.addEdge(10, 29);
        d.addEdge(10, 29);
        d.addEdge(10, 34);
        d.addEdge(10, 28);
        d.addEdge(10, 28);
        d.addEdge(10, 28);
        d.addEdge(11, 21);
        d.addEdge(11, 30);
        d.addEdge(12, 21);
        d.addEdge(12, 21);
        d.addEdge(12, 26);
        d.addEdge(12, 11);
        d.addEdge(12, 9);
        d.addEdge(13, 22);
        d.addEdge(13, 23);
        d.addEdge(13, 47);
        d.addEdge(14, 8);
        d.addEdge(14, 21);
        d.addEdge(14, 48);
        d.addEdge(15, 8);
        d.addEdge(15, 49);
        d.addEdge(15, 34);
        d.addEdge(16, 9);
        d.addEdge(17, 24);
        d.addEdge(17, 38);
        d.addEdge(17, 20);
        d.addEdge(18, 28);
        d.addEdge(18, 6);
        d.addEdge(18, 32);
        d.addEdge(18, 42);
        d.addEdge(19, 15);
        d.addEdge(19, 40);
        d.addEdge(20, 3);
        d.addEdge(20, 38);
        d.addEdge(20, 35);
        d.addEdge(20, 46);
        d.addEdge(21, 22);
        d.addEdge(22, 6);
        d.addEdge(23, 11);
        d.addEdge(23, 21);
        d.addEdge(23, 22);
        d.addEdge(24, 4);
        d.addEdge(24, 5);
        d.addEdge(24, 38);
        d.addEdge(24, 43);
        d.addEdge(25, 2);
        d.addEdge(25, 34);
        d.addEdge(26, 12);
        d.addEdge(26, 16);
        d.addEdge(26, 9);
        d.addEdge(27, 31);
        d.addEdge(27, 32);
        d.addEdge(27, 5);
        d.addEdge(27, 24);
        d.addEdge(27, 42);
        d.addEdge(28, 22);
        d.addEdge(28, 29);
        d.addEdge(28, 39);
        d.addEdge(28, 44);
        d.addEdge(29, 49);
        d.addEdge(29, 22);
        d.addEdge(30, 23);
        d.addEdge(30, 37);
        d.addEdge(31, 18);
        d.addEdge(31, 32);
        d.addEdge(32, 6);
        d.addEdge(32, 13);
        d.addEdge(32, 37);
        d.addEdge(32, 47);
        d.addEdge(32, 5);
        d.addEdge(33, 2);
        d.addEdge(33, 18);
        d.addEdge(33, 19);
        d.addEdge(34, 29);
        d.addEdge(34, 2);
        d.addEdge(34, 19);
        d.addEdge(34, 40);
        d.addEdge(35, 37);
        d.addEdge(35, 9);
        d.addEdge(35, 46);
        d.addEdge(36, 20);
        d.addEdge(36, 42);
        d.addEdge(37, 5);
        d.addEdge(37, 9);
        d.addEdge(37, 47);
        d.addEdge(37, 47);
        d.addEdge(37, 35);
        d.addEdge(38, 38);
        d.addEdge(38, 37);
        d.addEdge(38, 35);
        d.addEdge(39, 18);
        d.addEdge(39, 42);
        d.addEdge(40, 15);
        d.addEdge(41, 28);
        d.addEdge(41, 44);
        d.addEdge(42, 31);
        d.addEdge(43, 37);
        d.addEdge(43, 38);
        d.addEdge(44, 39);
        d.addEdge(45, 8);
        d.addEdge(45, 15);
        d.addEdge(45, 49);
        d.addEdge(45, 14);
        d.addEdge(45, 14);
        d.addEdge(46, 16);
        d.addEdge(47, 23);
        d.addEdge(47, 30);
        d.addEdge(48, 12);
        d.addEdge(48, 21);
        d.addEdge(48, 33);
        d.addEdge(48, 33);
        d.addEdge(49, 49);
        d.addEdge(49, 22);
        d.addEdge(49, 34);
        
        KosarajuSCC k = new KosarajuSCC(d);
        
        System.out.println(k.count() + " strongly connected components");
        
        ArrayList<Integer>[] components = (ArrayList<Integer>[]) new ArrayList[k.count()];
        
        for(int i = 0; i < k.count(); i++)
        {
            components[i] = new ArrayList<Integer>();
        }
        for(int v = 0; v < d.V(); v++)
        {
            components[k.id(v)].add(v);
        }
        for(int i = 0; i < k.count(); i++)
        {
            System.out.print(i+1 + ": ");
            for(int v: components[i])
            {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
    
}

/* OUTPUT

run:
9 strongly connected components
1: 2 5 6 8 9 11 12 13 15 16 18 19 21 22 23 25 26 28 29 30 31 32 33 34 35 37 38 39 40 42 43 44 46 47 48 49 
2: 41 
3: 7 
4: 3 4 17 20 24 27 36 
5: 14 
6: 45 
7: 1 
8: 0 
9: 10 
BUILD SUCCESSFUL (total time: 0 seconds)


*/
