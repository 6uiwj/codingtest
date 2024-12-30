package geo;

import java.io.IOException;
public class BOJ9063 {

        public static void main(String[] args) throws IOException {
            int n = readInt();
            int[] a = new int[n*2];
            int maxX = -10000;
            int minX = 10000;
            int maxY = -10000;
            int minY = 10000;
            int ans =0;
            for(int i =0; i<n*2; i++) {
                a[i]=readInt();
                if(i%2==0) {
                    if (a[i] > maxX) maxX = a[i];
                    if (a[i] < minX) minX = a[i];
                } else {
                    if (a[i] > maxY) maxY = a[i];
                    if (a[i] < minY) minY = a[i];
                }
            }

            System.out.println( n>1 ? (maxX-minX)*(maxY-minY) : 0);
        }

        private static int readInt() throws IOException {
            int r = 0;
            boolean isNegative = false;

            while(true) {
                int n = System.in.read();

                if(n<=32) return isNegative? r*(-1) : r;
                else if (n=='-') isNegative=true;
                else r = (r<<3) + (r<<1) + (n-'0');

            }

        }
    }


