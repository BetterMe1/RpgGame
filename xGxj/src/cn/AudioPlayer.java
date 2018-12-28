package cn;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

	

	public class AudioPlayer {
		
		public static void MusicMap(){
			AudioPlayer mp3 = new AudioPlayer("src/com/��ʱ����nszx - ��������.mp3");
			mp3.play();
		}
		
		public AudioPlayer(String filename) {
			this.filename = filename;
		}

		public void play() {
			try {
				BufferedInputStream buffer = new BufferedInputStream(
						new FileInputStream(filename));
				player = new Player(buffer);

				player.play();


			} catch (Exception e) {
				System.out.println(e);
			}

		}

		public static void main(String[] args) {
			AudioPlayer mp3 = new AudioPlayer("src/com/��ʱ����nszx - ��������.mp3");
			mp3.play();

		}

		private String filename;
		private Player player;

	}
