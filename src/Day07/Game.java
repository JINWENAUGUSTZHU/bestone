package Day07;

import java.math.MathContext;
import java.util.Scanner;

public class Game {
	private Player player;

	public Game(Player player) {
		this.player = player;
	}

	public void start() {
		System.out.println("開始遊戲");
		System.out.println(player.getName() + "進入遊戲，初始積分為" + player.getScore());

		String[] arr = new String[] { "剪刀", "石頭", "布" };
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("請輸入剪刀、石頭、布其中之一");
			String s1 = sc.next();// 玩家的輸入
			int count = (int) (Math.random() * 3);
			String s2 = arr[count];
			int flag = rule(s1, s2);
			System.out.println("您輸入的是：" + s1 + "，系統出的是" + s2);
			if (flag > 0) {
				System.out.println("恭喜" + player.getName() + "贏了，獎勵10積分！");
				player.setScore(player.getScore() + 10);
			} else if (flag < 0) {
				System.out.println("對不起" + player.getName() + "輸了，扣除10積分！");
				player.setScore(player.getScore() - 10);
			} else {
				System.out.println("打平了");
			}
			System.out.println(player);
		}
		// System.out.println(player.getName() + "退出了遊戲，當前積分為：" +
		// player.getScore());

	}

	/**
	 * 遊戲規則
	 * 
	 * @return
	 */
	public int rule(String s1, String s2) {
		if (s1.equals(s2)) {
			return 0;
		}
		if (s1.equals("剪刀")) {
			if (s2.equals("石頭")) {
				return -1;
			}
			if (s2.equals("布")) {
				return 1;
			}
		}
		if (s1.equals("石頭")) {
			if (s2.equals("剪刀")) {
				return 1;
			}
			if (s2.equals("布")) {
				return -1;
			}
		}

		if (s1.equals("布")) {
			if (s2.equals("剪刀")) {
				return -1;
			}
			if (s2.equals("石頭")) {
				return 1;
			}
		}

		return 0;
	}
}
