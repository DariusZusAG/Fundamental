package VarArgs;

public class MainVarArgs {
    public static void main(String[] args) {
        TestVarArgs.print(2,3,4,1,5,6,3,2,42);
        int[] v1=new int[]{10,15,16};
        int[] v2=new int[]{14,18,20};

        //int[] v3=new int[]{10,14,15,18,16,20}

        int[] v=TestVarArgs.alipire2Verctori(v1, v2);

        for (int i=0; i< v.length; i++){
            System.out.println("Pozitia "+ (i+1) + "In vectorul suma avem: "+ v[i]);
        }
    }
}
