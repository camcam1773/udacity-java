
public class SPF
{
    public static void main (String[] args) {
        int M=100;
        int[][] G={{M,5,12,11,M,M},
                   {5,M,7,1,M,M},
                   {M,7,M,M,6,4},
                   {11,1,M,M,2,M},
                   {M,M,6,2,M,8},
                   {M,M,4,M,8,M},
                };
        final int N=G.length;
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                if (G[i][j]>=M || i==j) continue;
                for (int k=0;k<N;k++){
                    if (G[j][k]>=M || j==k) continue;
                    int T=G[i][j]+G[j][k];
                    if (T<G[i][k] && i!=k) {
                        G[i][k]=T;
                        System.out.printf("%d %d %3d\n",i+1,k+1,G[i][k]);
                    }
                }
            }
        }
    }
    
}
