package Labirint;

public class Floor {
    public int[][] mas;
    public static int[][] route;
    public  int a;
    public  int b;
    public  int xs;
    public  int ys;
    public  int xf;
    public  int yf;
    public  int ind = 0;
    public int X;
    public int Y;

    public Floor(int a, int b, int xs, int ys, int xf, int yf){
        this.a = a;
        this.b = b;
        this.xs = xs;
        this.ys = ys;
        this.xf = xf;
        this.yf = yf;
        this.X = xf;
        this.Y = yf;
    }


    public void solution(){
        if (xs<a) if (mas[xs+1][ys]==-1) mas[xs+1][ys]=1;
        if (xs>0) if (mas[xs-1][ys]==-1) mas[xs-1][ys]=1;
      if (ys>0)   if (mas[xs][ys-1]==-1) mas[xs][ys-1]=1;
      if (ys<b) if (mas[xs][ys+1]==-1) mas[xs][ys+1]=1;
      int k = 1;
      boolean f;
      do{
        f = find(mas,k);
        k++;
      }while(f == false);
      route = new int[k+1][2];
      mas[xf][yf] = k;
    }

    public boolean find(int[][] arr, int key){
         for(int i=0; i<=a; i++){
            for (int j=0; j<=b; j++){
               if (arr[i][j] == key) {
                  if (i==0){
                      if (j==0) {
                              if (arr[i][j + 1] == -3) return true;
                              if (arr[i][j + 1] == -1) arr[i][j + 1] = key + 1;
                      }
                      else if (j==b){
                              if (arr[i][j-1] == -3) return true;
                              if (arr[i][j-1] == -1) arr[i][j-1] = key+1;
                      }
                          else {
                              if (arr[i][j+1] == -3) return true;
                              if (arr[i][j-1] == -3) return true;
                              if (arr[i][j+1] == -1) arr[i][j+1] = key+1;
                              if (arr[i][j-1] == -1) arr[i][j-1] = key+1;
                          }

                      if (arr[i+1][j] == -3) return true;
                      if (arr[i+1][j] == -1) arr[i+1][j] = key+1;
                  }
                  else if (i==a){

                          if (j==0){
                              if (arr[i][j+1] == -3) return true;
                              if (arr[i][j+1] == -1) arr[i][j+1] = key+1;
                          }
                          else if (j==b) {
                              if (arr[i][j-1] == -3) return true;
                              if (arr[i][j-1] == -1) arr[i][j-1] = key+1;
                          }
                          else{
                              if (arr[i][j+1] == -3) return true;
                              if (arr[i][j-1] == -3) return true;
                              if (arr[i][j+1] == -1) arr[i][j+1] = key+1;
                              if (arr[i][j-1] == -1) arr[i][j-1] = key+1;
                          }

                      if (arr[i-1][j] == -3) return true;
                      if (arr[i-1][j] == -1) arr[i-1][j] = key+1;
                  }
                  else {
                      if (j == 0) {
                          if (arr[i][j+1] == -3) return true;
                          if (arr[i][j+1] == -1) arr[i][j + 1] = key + 1;
                      }
                      else if (j == b) {
                          if (arr[i][j-1] == -3) return true;
                          if (arr[i][j-1] == -1) arr[i][j - 1] = key + 1;
                      }
                      else {
                          if (arr[i][j+1] == -3) return true;
                          if (arr[i][j-1] == -3) return true;
                          if (arr[i][j+1] == -1)  arr[i][j + 1] = key + 1;
                          if (arr[i][j-1] == -1) arr[i][j - 1] = key + 1;
                      }
                      if (arr[i-1][j] == -3) return true;
                      if (arr[i+1][j] == -3) return true;
                      if (arr[i-1][j] == -1) arr[i - 1][j] = key + 1;
                      if (arr[i+1][j] == -1) arr[i + 1][j] = key + 1;
                  }

               }

            }

        }
        return false;
    }

    public  int path(int[][] arr){
        if (X <a && (((arr[X][Y] - arr[X + 1][Y] == 1) &&  arr[X+1][Y]!=0) || (arr[X+1][Y] == -2))) {
            route[ind][0] = X;
            route[ind][1]= Y;
            ind++;
            X = X + 1;
            return 0;
        }
        if (X > 0 && (((arr[X][Y] - arr[X - 1][Y] == 1) &&  arr[X-1][Y]!=0) || (arr[X-1][Y] == -2))) {
            route[ind][0] = X;
            route[ind][1]= Y;
            ind++;
            X = X - 1;
            return 0;
        }
        if (Y < b && (((arr[X][Y] - arr[X][Y+1] == 1) &&  arr[X][Y+1]!=0) || (arr[X][Y+1] == -2))) {
            route[ind][0] = X;
            route[ind][1]= Y;
            ind++;
            Y=Y+1;
            return 0;
        }
        if (Y > 0 && (((arr[X][Y] - arr[X][Y-1] == 1) &&  arr[X][Y-1]!=0) || (arr[X][Y-1] == -2 ))) {
            route[ind][0] = X;
            route[ind][1]= Y;
            ind++;
            Y = Y - 1;
            return 0;
        }
        return 0;
    }

}
