// James Cooper

// This was as far as I got

class Queen {
    int col;
    int row;
    Queen() {
        col = 1;
        row = 1;
    }
}

public class NQueen {
    
    public static boolean check(Queen queen, ArrayListStack<Queen> S) {
        ArrayListStack<Queen> A = new ArrayListStack<Queen>();
        System.out.println(S.size());
        System.out.printf("queen c:%d  r:%d ", queen.col, queen.row);
        for (int i = 0; i < S.size(); i++) {
            Queen temp = S.pop();
            A.push(temp);
            System.out.printf("temp c:%d  r:%d \n", temp.col, temp.row);
            if (temp.col == queen.col || temp.row == queen.row) {
                return true;
            }
            if ((temp.row + 1 == queen.row && temp.col + 1 == queen.col) || (temp.row - 1 == queen.row && temp.col - 1 == queen.col)) {
                return true;
            }
            
        }
        
        for (int i = 0; i < A.size(); i++) {
            S.push(A.pop());
        }
        System.out.println("Check complete");
        return false;
    }
    
    public static void work() {
        ArrayListStack<Queen> S = new ArrayListStack<Queen>();
        Queen q = new Queen();
        /*
        S.push(q);
        Queen q2 = new Queen();
        q2.setRow(3);
        q2.setCol(3);
        boolean conf = check(q2, S);
        System.out.println(conf);
        S.push(q2);
        Queen q4 = new Queen();
        q4.col = 3;
        q4.row = 2;
        S.push(q4);
        Queen q3 = new Queen();
        q3.col = 4;
        q3.row = 4;
        conf = check(q3, S);
        System.out.println(conf);
        */
        
        while (S.size() < q.row) {
            while (q.col <= q.row) {
                boolean conf = check(q, S);
                if (!conf) {
                    S.push(q);
                    q = new Queen();
                    q.row = (S.size() + 1);
                }
                else {
                    q.col++;
                }
                q.col++;
            }
            System.out.println("loop 1 complete");
            //ArrayListStack<Queen> temp = new ArrayListStack<Queen>();
            while (!S.isEmpty() && q.col > q.row) {
                q = S.pop();
                q.col++;
            }
            System.out.println("loop 2 complete");
            if (q.col > q.row) { break; }
        }
        
    }
    
    public static void main(String args[]) {
        work();
    } 
}
