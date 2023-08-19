import java.util.Scanner;

public class TextRPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("***長きに渡る魔王の封印が、今解き放たれたり***");
        System.out.println("あなたは冒険者です。どうしますか？");
        System.out.println("1. 洞窟に入る");
        System.out.println("2. 森へ行く");
        System.out.println("3. 街へ戻る");
        
        int choice = scanner.nextInt();//キーボード入力を受け付ける命令分
        
        switch (choice) { //整数１、２、３で分岐
            case 1:
                System.out.println("洞窟に入りました。暗くて怖いですが、何かが見えます！");
                // ここで洞窟のイベントや戦闘などの処理を追加する
                int r = new java.util.Random().nextInt(90);
                System.out.print("スライムが現れた！");
                System.out.println("スライムはレベル" + r + "だ！");//←乱数の命令分
                break;
            case 2:
                System.out.println("森へ行きました。美しい自然に囲まれています！");
                // ここで森のイベントやアイテム入手などの処理を追加する
                break;
            case 3:
                System.out.println("街へ戻りました。安心感があります！");
                // ここで街のイベントやショップなどの処理を追加する
                System.out.println("あなたの名前を教えてください");
                String name = new java.util.Scanner(System.in).nextLine();
                System.out.println("ようこそ" + name + "さん");
                break;
            default:
                System.out.println("無効な選択肢です。もう一度選んでください。");
        }
        
        System.out.println("あなたはどうする？");
    }
}
