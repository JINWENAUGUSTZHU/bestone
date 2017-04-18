package Day07;

import java.math.MathContext;
import java.util.Scanner;

public class Game {
	private Player player;

	public Game(Player player) {
		this.player = player;
	}

	public void start() {
		System.out.println("�_ʼ�[��");
		System.out.println(player.getName() + "�M���[�򣬳�ʼ�e�֞�" + player.getScore());

		String[] arr = new String[] { "����", "ʯ�^", "��" };
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Ոݔ�������ʯ�^��������֮һ");
			String s1 = sc.next();// ��ҵ�ݔ��
			int count = (int) (Math.random() * 3);
			String s2 = arr[count];
			int flag = rule(s1, s2);
			System.out.println("��ݔ����ǣ�" + s1 + "��ϵ�y������" + s2);
			if (flag > 0) {
				System.out.println("��ϲ" + player.getName() + "�A�ˣ�����10�e�֣�");
				player.setScore(player.getScore() + 10);
			} else if (flag < 0) {
				System.out.println("������" + player.getName() + "ݔ�ˣ��۳�10�e�֣�");
				player.setScore(player.getScore() - 10);
			} else {
				System.out.println("��ƽ��");
			}
			System.out.println(player);
		}
		// System.out.println(player.getName() + "�˳����[�򣬮�ǰ�e�֞飺" +
		// player.getScore());

	}

	/**
	 * �[��Ҏ�t
	 * 
	 * @return
	 */
	public int rule(String s1, String s2) {
		if (s1.equals(s2)) {
			return 0;
		}
		if (s1.equals("����")) {
			if (s2.equals("ʯ�^")) {
				return -1;
			}
			if (s2.equals("��")) {
				return 1;
			}
		}
		if (s1.equals("ʯ�^")) {
			if (s2.equals("����")) {
				return 1;
			}
			if (s2.equals("��")) {
				return -1;
			}
		}

		if (s1.equals("��")) {
			if (s2.equals("����")) {
				return -1;
			}
			if (s2.equals("ʯ�^")) {
				return 1;
			}
		}

		return 0;
	}
}
