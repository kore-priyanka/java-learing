public class infosysarray {
    public static void main(String[] args) {
        int arr[][]={{60,70,80},{40,50,60},{30,40,50}};

        


        int R1=(arr[0][0]+arr[0][1]+arr[0][2])/3;
        int R2=(arr[1][0]+arr[1][1]+arr[1][2])/3;
        int R3=(arr[2][0]+arr[2][1]+arr[2][2])/3;
         int count=0;
                 if(R1>50){
            count++;

        }
        if(R2>50){
            count++;

        }
        if(R3>50){
            count++;

        }

        System.out.println(count);
        
        
    }
}
