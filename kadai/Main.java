package myProject;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// HelloWorld
		String greeting = "HelloWorld";
		System.out.println(greeting);

		// 1から10までを計算
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);



		// 3年後の今日が何曜日なのか
		LocalDateTime t1 = LocalDateTime.now();
		LocalDateTime t2 = t1.plusYears(3);

		DayOfWeek dayweek = t2.getDayOfWeek();
			//曜日名を日本語に変換
		String str_dayweek = dayweek.getDisplayName(TextStyle.FULL, Locale.JAPAN);
		System.out.println("今日の三年後は" + str_dayweek);



		// 引数が0なら偽、引数が1なら真　と表示
		int a = 1;
		if (a == 0) {
			System.out.println("偽");
		} else {
			System.out.println("真");
		}


		// 和暦一覧表示
		ArrayList<String> wareki = new ArrayList<String>();
		wareki.add("睦月");
		wareki.add("如月");
		wareki.add("弥生");

		for (String i : wareki) {
			System.out.println(i);
		}

		// WorkplaceCommnicationを作成してこんにちは
		WorkplaceCommunication w1 = new WorkplaceCommunication();

		w1.greet("Hello");
		
		// グループ名を指定してこんにちは
		WorkplaceCommunication w2 = new WorkplaceCommunication("学校");
		
		w2.GShandan("Hello");
		
		// 詳細を追加してこんにちは
		WorkplaceCommunication w3 = new WorkplaceCommunication("職場", "上司");

		w3.ee("Hello");
		




	}
}
