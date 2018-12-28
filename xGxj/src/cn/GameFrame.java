package cn;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;









//import bao.MyThread;
import cn.GameFrame;
import cn.Gameutil;
//import cn.GameFrame.MyThread;
import down.DAO;

/**
 * 游戏窗口类
 * @author Dell
 *
 */
public class GameFrame extends Frame {
	static Image img1=Gameutil.getImage("images/宫廷计.png");
	static Image img2=Gameutil.getImage("images/秀女篇.png");
	static Image img3=Gameutil.getImage("images/家中.png");
	static Image img4=Gameutil.getImage("images/对话框.png");
	static Image img5=Gameutil.getImage("images/入宫前.png");
	static Image img6=Gameutil.getImage("images/选项框.png");
	static Image img7=Gameutil.getImage("images/父亲.png");
	static Image img8=Gameutil.getImage("images/容秀庭.png");
	static Image img9=Gameutil.getImage("images/采女.png");
	static Image img10=Gameutil.getImage("images/赵粉.png");
	static Image img11=Gameutil.getImage("images/宫宴.png");
	static Image img12=Gameutil.getImage("images/浅紫底.png");
	static Image img13=Gameutil.getImage("images/采女篇.png");
	static Image img14=Gameutil.getImage("images/自己寝宫.png");
	static Image img15=Gameutil.getImage("images/太后宫.png");
	static Image img16=Gameutil.getImage("images/太后.png");
	static Image img17=Gameutil.getImage("images/皇宫.png");
	static Image img18=Gameutil.getImage("images/皇上.png");
	static Image img19=Gameutil.getImage("images/看梅美人.png");
	static Image img20=Gameutil.getImage("images/宝林篇.png");
	static Image img21=Gameutil.getImage("images/宝林.png");
	static Image img22=Gameutil.getImage("images/一角.png");
	static Image img23=Gameutil.getImage("images/宫女.png");
	static Image img24=Gameutil.getImage("images/婕妤篇.png");
	static Image img25=Gameutil.getImage("images/婕妤.png");
	static Image img26=Gameutil.getImage("images/充仪篇.png");
	static Image img27=Gameutil.getImage("images/充仪.png");
	static Image img28=Gameutil.getImage("images/公公.png");
	static Image img30=Gameutil.getImage("images/淑妃.png");
	static Image img31=Gameutil.getImage("images/池塘.png");
	static Image img32=Gameutil.getImage("images/孩子.png");
	static Image img33=Gameutil.getImage("images/皇后.png");
	static Image img34=Gameutil.getImage("images/嬷嬷.png");
	int number=0;
	int  love=0;//皇上对你的喜爱度
	public void LunchFrame(){
		setSize(750, 480);
		setLocation(250, 130);
		setVisible(true);
		new MyThread().start();
		new MyThread2().start();
		
		addWindowListener(new WindowAdapter(){
			//关闭窗口
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}	
		});	
		//鼠标监听
		this.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){				
				super.mouseClicked(e);
				int x=e.getX();
				int y=e.getY();
				if(x>=180&&x<=280&&y>=60&&y<=90){
					number+=1;
				}
				else if(x>=180&&x<=280&&y>=120&&y<=140){
					number+=2;
				}
				else if(x>=180&&x<=280&&y>=170&&y<=190){
					number+=3;
				}
				else{
					number++;
				}
	}		
	});		
	}
	
	//去除双缓冲
	private Image offScreenImage=null;
	public void update(Graphics g){
		if(offScreenImage== null)
			offScreenImage=this.createImage(808, 534);
		Graphics gOff= offScreenImage.getGraphics();
		paint(gOff);
		g.drawImage(offScreenImage, 0, 0, null);
	}
	
	//线程显示动画窗口
	class MyThread extends Thread{
		public void run(){
			while(true){
				repaint();				
				try {					
					Thread.sleep(5);
				//	AudioPlayer.MusicMap();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	} 
}
	//线程实现音乐
	class MyThread2 extends Thread{
		public void run(){
			while(true){
				AudioPlayer.MusicMap();				
				try {					
					Thread.sleep(5);
				//	AudioPlayer.MusicMap();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	} 
}
		
	//窗口内画东西	
	int x=0,y=150;
	int x1=480,y1=152;
	int x2=0,y2=152;
	int x3=0,y3=153;
	int x4=0,y4=153;
	int x5=480,y5=152;
	int x6=480,y6=152;
	int x7=0,y7=153;
	int x8=0,y8=153;
	int x9=480,y9=152;
	int x10=480,y10=152;
	int x11=0,y11=153;
	int x12=480,y12=152;
	int x13=480,y13=170;
	int x14=0,y14=153;
	int x15=480,y15=170;
	String s="你叫东香,你的父亲是户部侍郎，你拥有了入宫的机会。你的父亲来告诉你这件事的时候，似乎十分希望你去";
    String s1="1.父亲既然想我去,我便去好了。";
    String s2="2.我只想平淡一生，不想去那么复杂的地方。";
    String s3;
	public void paint(Graphics g) {
		Font f=new Font("TimesRoman", Font.PLAIN, 18);
		g.setFont(f);
		if(number==-1){
			DAO dao = new DAO();
			try {
				dao.save(love);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			love=0;
			
		}
		if(number==0){
			g.drawImage(img1, 0, 0, null);	//宫廷计	
		}		
		if(number ==1){
			g.drawImage(img2, 0, 0, null);//秀女篇
		}	
		if(number==2){//你叫东香,去或不去
			g.drawImage(img3, 0, 0, null);//家中背景
			g.drawImage(img5, x, y, null);//东香	
			g.drawImage(img4, 0,350, null);//对话框
			g.drawImage(img6, 210, 100, null);//选择
			g.drawImage(img6, 210, 170, null);
		    g.drawString(s, 10, 380);//独白
			g.drawString(s1,230, 120);//选字
			g.drawString(s2,230, 190);
			if(x<40){
				x+=3;	
				}
		}
		if(number==3){//父亲欣慰
			s1="父亲很欣慰，认为你很深明大义";
			g.drawImage(img3, 0, 0, null);	
			g.drawImage(img7, x1, y1, null);
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawString(s1, 10, 380);//独白
			love +=5;
			if(x1>500){
				x1-=3;	
				}
		}
		if(number==4){//父亲愤怒
			s1="你的父亲很愤怒，认为你无知任性，罚你跪祠堂，最终还是要入宫。";
			g.drawImage(img3, 0, 0, null);	
			g.drawImage(img7, x1, y1, null);
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawString(s1, 10, 380);//独白
			if(x1>500){
				x1-=3;	
				}
		}
	   if(number==5){//入宫
		   s="教引嬷嬷带你来到了秀女住的容秀庭中。你选好了住处后，桂嬷嬤告诉你将在这里学习一月的宫礼仪";
			g.drawImage(img8, 0, 0, null);//容秀庭
			g.drawImage(img34, x15, y15, null);//嬷嬷
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawString(s, 10, 380);//独白
			if(x15>450){
				x15-=3;	
				}
		}
	   if(number==6){//入宫
		   s="我见了嬷嬤，便像见了待我如亲女的乳母，格外亲近。”嬷嬤\n十分高兴，告诉你一个秘密，皇帝喜欢赵粉的";
			g.drawImage(img8, 0, 0, null);//容秀庭
			g.drawImage(img9, x2+200, y2, null);
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawString(s, 10, 380);//独白
		}
		if(number==7){
			s="很快皇帝亲选的日子到了，宫女给你拿来了三套面圣礼服。";
			s1="1.黑底白色圆领襦裙。";
			s2="2.蓝底赵粉方领襦裙。";	
			s3="3.浅紫底魏紫方领襦裙。";	
			g.drawImage(img8, 0, 0, null);
			g.drawImage(img9, x2, y2, null);	
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawImage(img6, 210, 100, null);//选择
			g.drawImage(img6, 210, 170, null);
			g.drawImage(img6, 210, 240, null);
		    g.drawString(s, 10, 380);//独白
			g.drawString(s1,230, 120);//选字
			g.drawString(s2,230, 190);
			g.drawString(s3,230, 260);
			if(x2<50){
				x2+=3;	
				}
		}
		if(number==8){
			s="你在人群中衣着显眼，\n皇帝认为你衣着晦气，\n大发雷霆，\n赐死\n";
			g.drawImage(img11, 0, 0, null);	
			g.drawImage(img9, 50, 183, null);
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawString(s, 10, 380);//独白
		}
		if(number==7){
			s= "皇帝迅速被你裙角的赵粉吸引，对你产生好感。你被封为彩女。";
			g.drawImage(img11, 0, 0, null);	
			g.drawImage(img10, x3, y3, null);
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawString(s, 10, 380);//独白
			if(x3<50){
				x3+=3;	
				}
		}
		if(number==9){
			s="秀女众多，皇帝没有注意到你，你最终落选，父亲很失望\n";
			g.drawImage(img11, 0, 0, null);	
			g.drawImage(img12, 50, 183, null);
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawString(s, 10, 380);//独白
		}
		if(number ==10){
			g.drawImage(img13, 0, 0, null);//女篇
		}	
		if(number==11){
			s="次日，你要向皇后请安";
			s1="1.点唇为朱，尽显娇媚。";	
			s2="2.略施粉黛，清水芙蓉。";	
			g.drawImage(img14, 0, 0, null);//背景
			g.drawImage(img10, x4, y4, null);//东香	
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawImage(img6, 210, 100, null);//选择
			g.drawImage(img6, 210, 170, null);
		    g.drawString(s, 10, 380);//独白
			g.drawString(s1,230, 120);//选字
			g.drawString(s2,230, 190);
			if(x4<40){
				x4+=3;	
				}
		}
		if(number==12){
			s="太后认为你妖祸后宫，因此皇帝也疏远你，你郁郁寡欢，无疾而终。";
			g.drawImage(img15, 0, 0, null);	
			g.drawImage(img16, x6, y6, null);
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawString(s, 10, 380);//独白
			if(x6>500){
				x6-=3;	
				}
		}
		if(number==13){
			s= "清秀谦和，对你印象很好。";
			g.drawImage(img15, 0, 0, null);	
			g.drawImage(img16, x6, y6, null);
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawString(s, 10, 380);//独白
			if(x6>500){
				x6-=3;	
				}
		}
		if(number==14){
			s="恰逢月初，你十分幸运地要进承欢殿侍奉皇帝。进殿后，你发现皇帝在批改奏折，面有疲惫，但未停歇。";
			s1="1.悄悄走到皇帝身边为其磨墨。";	
			s2="2.规矩地向皇帝请安，走到他身后为他揉肩";	
			g.drawImage(img17, 0, 0, null);//背景
			g.drawImage(img18, x5, y5, null);
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawImage(img6, 210, 100, null);//选择
			g.drawImage(img6, 210, 170, null);
		    g.drawString(s, 10, 380);//独白
			g.drawString(s1,230, 120);//选字
			g.drawString(s2,230, 190);
			if(x5<40){
				x5+=3;	
				}
		}
		if(number==15){
			s="皇帝面无表情地问了一句:“见到朕竟不请安！”你松来了拿着墨研的手，吓得脸色惨白。皇帝冷哼一声，认为你无视礼数，将你打入冷宫!  可怜刚为彩女便被削了嫔位，你成为后来宫中新人的反面教材。";
			g.drawImage(img14, 0, 0, null);	
			g.drawImage(img9, 0, 183, null);
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawString(s, 10, 380);//独白
		}
		if(number==16){
			s= "“爱妃的推拿术甚是让人舒心”。你被皇帝封为东宝林。";
			g.drawImage(img17, 0, 0, null);	
			g.drawImage(img19, x7, y7, null);
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawString(s, 10, 380);//独白
			if(x7<40){
				x7+=3;	
				}
		}
		if(number ==17){
			g.drawImage(img20, 0, 0, null);
		}	
		if(number==18){
			s="进宫两月便连晋两级，宫中几乎都知道你是皇帝的新宠，畏惧讨好你的人有，仇恨嫉妒你的也有。自你成为宝林之后，皇帝来你这里已经有一定的规律，闲时你颇爱侍弄花草。";
			g.drawImage(img22, 0, 0, null);	
			g.drawImage(img21, x8, y8, null);
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawString(s, 10, 380);//独白
			if(x8<40){
				x8+=3;	
				}
		}
		if(number==19){
			s="这日，你的宫女突然慌张地来告诉你一个小侍婢在修剪花草时不小心将园子里的赵粉给剪了!你心感不安。\n";
			s1="1.一朵赵粉而已，命令宫女不准传出去，将此事偷偷隐瞒。";	
			s2="2.待皇帝来时，带着宫女请罪。";	
			g.drawImage(img22, 0, 0, null);//背景
			g.drawImage(img23, x9, y9, null);	
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawImage(img6, 210, 100, null);//选择
			g.drawImage(img6, 210, 170, null);
		    g.drawString(s, 10, 380);//独白
			g.drawString(s1,230, 120);//选字
			g.drawString(s2,230, 190);
			if(x9>450){
				x9-=3;	
				}
		}
		if(number==20){
			s="(永远的御女)你对此事并不在意，却没料到那是皇帝命人送予你的赵粉。有心人将此事添油加醋的说与皇帝。皇帝将你降为御女并禁足。";
			g.drawImage(img22, 0, 0, null);	
			g.drawImage(img21, x4, y4, null);
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawString(s, 10, 380);//独白
		}
		if(number==21){
			s="皇帝虽可惜赵粉，但更爱怜与你，认为你对他十分坦诚，再叫人搬了一盆赵粉到你宫里。但是那个宫女却被杖责二十。";
			g.drawImage(img22, 0, 0, null);	
			g.drawImage(img18, x10, y10, null);
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawString(s, 10, 380);//独白
			if(x10>450){
				x10-=3;	
				}
		}
		if(number==22){
			s="不久，司礼太监就带着一旨昭书恭喜你晋为婕妤，封号为“沉”。";
			g.drawImage(img22, 0, 0, null);	
			g.drawImage(img21, x4, y4, null);
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawString(s, 10, 380);//独白
		}
		if(number ==23){
			g.drawImage(img24, 0, 0, null);
		}	
		if(number==24){
			s="你父亲前几日突然传信给你，告诉你近日朝廷与北疆鞑子交战，他想让你帮你的哥哥东岭说说好话，让他随便当个副将，免上战场。";
			g.drawImage(img22, 0, 0, null);	
			g.drawImage(img25, x11, y11, null);
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawString(s, 10, 380);//独白
			if(x11<40){
				x11+=3;	
				}
		}
		if(number==25){
			s="此时皇帝正好从殿外走来。";
			s1="1.将事情原本告诉他（包括父亲的书信）";	
			s2="2.委婉地提一下。";	
			g.drawImage(img14, 0, 0, null);//背景
			g.drawImage(img18, x12, y12, null);	
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawImage(img6, 210, 100, null);//选择
			g.drawImage(img6, 210, 170, null);
		    g.drawString(s, 10, 380);//独白
			g.drawString(s1,230, 120);//选字
			g.drawString(s2,230, 190);
			if(x12>450){
				x12-=3;	
				}
		}
		if(number==26){
			s="皇帝听着你说完，忽然将你抱起道，“香儿如此信任朕么?”你被他突如其来的亲呢吓了一跳，不过还是低声道，“皇上不会怪罪香儿吧.....”皇上“当然不会，香儿是朕最珍贵的宝贝，朕怎么舍得伤害自己的宝贝呢。";
			g.drawImage(img14, 0, 0, null);	
			g.drawImage(img25, x4, y4, null);
			g.drawImage(img18, x5, y5, null);
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawString(s, 10, 380);//独白
		}
		if(number==26){
			s="皇帝听出你言外之意，轻笑道，他会无事的。";
			g.drawImage(img14, 0, 0, null);	
			g.drawImage(img25, x4, y4, null);
			g.drawImage(img18, x5, y5, null);
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawString(s, 10, 380);//独白
		}
		if(number==27){
			s="宠爱日盛，不久你便被封为充仪。";
			g.drawImage(img14, 0, 0, null);	
			g.drawImage(img25, x4, y4, null);
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawString(s, 10, 380);//独白
		}
		if(number ==28){
			g.drawImage(img26, 0, 0, null);
		}
		if(number==29){
			s="皇帝召你去紫龙殿，正当气氛融恰之时，奉臣太监走进来行礼“参见皇上!”,太监悄悄看了你一眼后对皇上道，“皇上，小的有事要向皇上禀告...”说罢又看了你一眼。皇帝道，“讲便是，这里没有外人。”奉臣太监从袖中抽出一卷卷轴向皇帝走去。走到皇帝面前时，他突然从袖口中抽出一把利刃向皇帝刺去!（意外会导致剑锋偏转）";
			s1="1.傻站着不动";	
			s2="2.伸手去挡";	
			s3="3.拦在皇帝身前";	
			g.drawImage(img17, 0, 0, null);//背景
			g.drawImage(img18, x4+200, y4, null);	
			g.drawImage(img27, x4, y4, null);	
			g.drawImage(img28, x13, y13, null);	
			g.drawImage(img4, 0, 350, null);//对话框
			g.drawImage(img6, 210, 100, null);//选择
			g.drawImage(img6, 210, 170, null);
			g.drawImage(img6, 210, 240, null);
		    g.drawString(s, 10, 380);//独白
			g.drawString(s1,230, 120);//选字
			g.drawString(s2,230, 190);
			g.drawString(s3,230, 270);
			if(x13>450){
				x13-=3;	
				}
		}
		if(number==30){
			s="你傻站着没动，眼睁睁地看着那利刃刺向皇帝。然而皇帝却冷静地用手臂一挡，捂着伤口迅速退到了墙边，那刺客一看情形不对，便将一脸傻样的你拉了过来，利刃抵在你的脖子上，突然哈哈大笑“老子死也要拉一个垫背的!”说罢刀划过你的脖子你，他也自杀了。";	
			g.drawImage(img17, 0, 0, null);//背景
			g.drawImage(img18, x4, y4, null);	
			g.drawImage(img27, x4+300, y4, null);	
			g.drawImage(img28, x13, y13, null);	
			g.drawImage(img4, 0, 350, null);//对话框
		    g.drawString(s, 10, 380);//独白
		}
		if(number==31){
			s="你见情况不对微微愣了一下，竟伸出手臂去挡!那刺客原本是朝着皇帝的心口刺去，今却被你挡住，自你的肩膀贯穿而过!你“啊”了一声坐倒在地，皇帝已经抽出挂在墙壁上的剑与刺客缠斗了起来。";	
			g.drawImage(img17, 0, 0, null);//背景
			g.drawImage(img18, x4, y4, null);	
			g.drawImage(img27, x4+300, y4, null);	
			g.drawImage(img28, x13, y13, null);	
			g.drawImage(img4, 0, 350, null);//对话框
		    g.drawString(s, 10, 380);//独白
		}
		if(number==32){
			s="情况紧急，你来不及多想便用身体挡住了皇帝!利刃贯胸而过，皇帝一边搂着你，一边抓住了刺客想要抽出剑的手!皇上“香儿，香儿....”你听见他的声音有些颤抖，你忽然笑了，眼前一片模糊。皇帝感念你危难相救，将你封为淑妃并厚葬。";	
			g.drawImage(img17, 0, 0, null);//背景
			g.drawImage(img18, x4, y4, null);	
			g.drawImage(img27, x4+300, y4, null);	
			g.drawImage(img28, x13, y13, null);	
			g.drawImage(img4, 0, 350, null);//对话框
		    g.drawString(s, 10, 380);//独白
		}
		if(number==33){
			s="皇上感念你对他一片赤诚，又护驾有功，将你封为淑妃。";	
			g.drawImage(img17, 0, 0, null);//背景
			g.drawImage(img27, x4, y4, null);		
			g.drawImage(img4, 0, 350, null);//对话框
		    g.drawString(s, 10, 380);//独白
		}
		if(number ==34){
			g.drawImage(img24, 0, 0, null);
		}
		
		if(number==34){
			s="一日，你在突然湖边散步，你感到下腹隐隐有些不舒服，心底一惊，你加快了回去的脚步...";	
			g.drawImage(img31, 0, 0, null);//背景
			g.drawImage(img30, x4+500, y4, null);	
			g.drawImage(img4, 0, 350, null);//对话框
		    g.drawString(s, 10, 380);//独白
		}
		if(number==35){
			s="你悄悄请来了御医为你诊脉，御医告诉你确实已有喜脉，两个月后，你胎已稳.";
			g.drawImage(img14, 0, 0, null);//背景
			g.drawImage(img30, x14, y14, null);	
			g.drawImage(img4, 0, 350, null);//对话框
		    g.drawString(s, 10, 380);//独白
		    if(x14<80){
				x14+=3;	
				}
		}
		if(number==36){
			s="八个月后，你为皇帝诞下一子，自此皇帝对你宠爱有加，五年后，你们总共抚育了二子一女，皇帝感念你多年来辛苦，将你封后，普天同庆。";	
			g.drawImage(img17, 0, 0, null);//背景
			g.drawImage(img18, x4+500, y4, null);	
			g.drawImage(img33, x4+100, y4, null);	
			g.drawImage(img32, x4+300, y4+100, null);	
			g.drawImage(img4, 0, 350, null);//对话框
		    g.drawString(s, 10, 380);//独白
		}
	}
	
	public static void main(String[] args){
		GameFrame gf=new GameFrame();
		gf.LunchFrame();	
	}	
}

