public class JawabanNomorDua {
    public static void main(String[] args){
        UbahHurufEToStar();

        //  UbahHufurEToStar(_Block);
    }
    public static void UbahHurufEToStar(){
        String[] _Block = new String[]{"Triangle","Cubes","Circle"};
        char x;
        for  (int i=0;i<_Block.length;i++){
            String Bangun = _Block[i];
            if (Bangun.contains("e")){
                System.out.println(_Block[i].replace("e","*"));
            }

        }
        System.out.println(_Block);
    }
}
