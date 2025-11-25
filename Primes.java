public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n = Integer.parseInt(args[0]);
        boolean array [] = new boolean[n +1]; // לוודא למה n +1

          array[0] = false;
          array[1] = false;

             if (n <2){
                System.out.println("No primes found up to " + n); 
                return; // לא בטוחה למה חובה להחזיר אם זה במיין
             }
             for (int i=2;  i<array.length; i++){ // לולאה שמכניסה למערך מ 0 עד אנ ערכי אמת - החל מאינדקס 2
             array[i] = true;
             }
            int prime =2;
            while (prime <= Math.sqrt(n)){ // לולאה שבודקת מי מתחלק בראשוני 2 
              if (array[prime] == true){
                for (int i = prime*prime; i<=n; i= i+ prime){
                    array[i] = false;
              }
                 
               }
                prime++;    
               // array[i] = !array[i]; זאת טעות כי זה היפוך ולא שינוי קבוע 
            }
            // 7. הדפסת התוצאות וספירת הראשוניים
        System.out.println("Prime numbers up to " + n + ":");
        int count = 0;
        
        // לולאה להדפסת הראשוניים שנותרו True
        for (int i = 2; i <= n; i++) {
            if (array[i]) {
                System.out.println(i);
                count++;
            }
        }
      //  double percentage = (double) count / (n - 1) * 100;
        double percentage = (double) count / n * 100;
        System.out.printf("There are %d primes between 2 and %d (%.0f%% are primes)\n", count, n, percentage);

    }
 }

 