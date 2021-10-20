public class Task1_2 {
    public static void main(String[] args) {
        String[] Country = {"JAPAN", "AMERICA", "KOREA"};
        System.out.println("Country" + Country.length);
        Country[0] = "りんご";
        Country[1] = "もも";
        Country[2] = "ぶどう";
        System.out.println(Country[1]);
        // ⑤下記の処理について、何をしているのかコメントを記入してください。
        // [10,20,30,40,50の要素の値とする配列 intを作成している]
        int[] intArray = { 10, 20, 30, 40, 50 };
        // ⑥下記の処理について、何をしているのかコメントを記入してください。
        // [初期値20と50を足した数字を出力している]
        System.out.println(intArray[1] + intArray[4]);
    }
}
