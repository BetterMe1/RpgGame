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
 * ��Ϸ������
 * @author Dell
 *
 */
public class GameFrame extends Frame {
	static Image img1=Gameutil.getImage("images/��͢��.png");
	static Image img2=Gameutil.getImage("images/��Ůƪ.png");
	static Image img3=Gameutil.getImage("images/����.png");
	static Image img4=Gameutil.getImage("images/�Ի���.png");
	static Image img5=Gameutil.getImage("images/�빬ǰ.png");
	static Image img6=Gameutil.getImage("images/ѡ���.png");
	static Image img7=Gameutil.getImage("images/����.png");
	static Image img8=Gameutil.getImage("images/����ͥ.png");
	static Image img9=Gameutil.getImage("images/��Ů.png");
	static Image img10=Gameutil.getImage("images/�Է�.png");
	static Image img11=Gameutil.getImage("images/����.png");
	static Image img12=Gameutil.getImage("images/ǳ�ϵ�.png");
	static Image img13=Gameutil.getImage("images/��Ůƪ.png");
	static Image img14=Gameutil.getImage("images/�Լ��޹�.png");
	static Image img15=Gameutil.getImage("images/̫��.png");
	static Image img16=Gameutil.getImage("images/̫��.png");
	static Image img17=Gameutil.getImage("images/�ʹ�.png");
	static Image img18=Gameutil.getImage("images/����.png");
	static Image img19=Gameutil.getImage("images/��÷����.png");
	static Image img20=Gameutil.getImage("images/����ƪ.png");
	static Image img21=Gameutil.getImage("images/����.png");
	static Image img22=Gameutil.getImage("images/һ��.png");
	static Image img23=Gameutil.getImage("images/��Ů.png");
	static Image img24=Gameutil.getImage("images/��ƪ.png");
	static Image img25=Gameutil.getImage("images/��.png");
	static Image img26=Gameutil.getImage("images/����ƪ.png");
	static Image img27=Gameutil.getImage("images/����.png");
	static Image img28=Gameutil.getImage("images/����.png");
	static Image img30=Gameutil.getImage("images/����.png");
	static Image img31=Gameutil.getImage("images/����.png");
	static Image img32=Gameutil.getImage("images/����.png");
	static Image img33=Gameutil.getImage("images/�ʺ�.png");
	static Image img34=Gameutil.getImage("images/����.png");
	int number=0;
	int  love=0;//���϶����ϲ����
	public void LunchFrame(){
		setSize(750, 480);
		setLocation(250, 130);
		setVisible(true);
		new MyThread().start();
		new MyThread2().start();
		
		addWindowListener(new WindowAdapter(){
			//�رմ���
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}	
		});	
		//������
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
	
	//ȥ��˫����
	private Image offScreenImage=null;
	public void update(Graphics g){
		if(offScreenImage== null)
			offScreenImage=this.createImage(808, 534);
		Graphics gOff= offScreenImage.getGraphics();
		paint(gOff);
		g.drawImage(offScreenImage, 0, 0, null);
	}
	
	//�߳���ʾ��������
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
	//�߳�ʵ������
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
		
	//�����ڻ�����	
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
	String s="��ж���,��ĸ����ǻ������ɣ���ӵ�����빬�Ļ��ᡣ��ĸ���������������µ�ʱ���ƺ�ʮ��ϣ����ȥ";
    String s1="1.���׼�Ȼ����ȥ,�ұ�ȥ���ˡ�";
    String s2="2.��ֻ��ƽ��һ��������ȥ��ô���ӵĵط���";
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
			g.drawImage(img1, 0, 0, null);	//��͢��	
		}		
		if(number ==1){
			g.drawImage(img2, 0, 0, null);//��Ůƪ
		}	
		if(number==2){//��ж���,ȥ��ȥ
			g.drawImage(img3, 0, 0, null);//���б���
			g.drawImage(img5, x, y, null);//����	
			g.drawImage(img4, 0,350, null);//�Ի���
			g.drawImage(img6, 210, 100, null);//ѡ��
			g.drawImage(img6, 210, 170, null);
		    g.drawString(s, 10, 380);//����
			g.drawString(s1,230, 120);//ѡ��
			g.drawString(s2,230, 190);
			if(x<40){
				x+=3;	
				}
		}
		if(number==3){//������ο
			s1="���׺���ο����Ϊ�����������";
			g.drawImage(img3, 0, 0, null);	
			g.drawImage(img7, x1, y1, null);
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawString(s1, 10, 380);//����
			love +=5;
			if(x1>500){
				x1-=3;	
				}
		}
		if(number==4){//���׷�ŭ
			s1="��ĸ��׺ܷ�ŭ����Ϊ����֪���ԣ���������ã����ջ���Ҫ�빬��";
			g.drawImage(img3, 0, 0, null);	
			g.drawImage(img7, x1, y1, null);
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawString(s1, 10, 380);//����
			if(x1>500){
				x1-=3;	
				}
		}
	   if(number==5){//�빬
		   s="�������ִ�����������Ůס������ͥ�С���ѡ����ס���󣬹��֋߸����㽫������ѧϰһ�µĹ�����";
			g.drawImage(img8, 0, 0, null);//����ͥ
			g.drawImage(img34, x15, y15, null);//����
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawString(s, 10, 380);//����
			if(x15>450){
				x15-=3;	
				}
		}
	   if(number==6){//�빬
		   s="�Ҽ����֋ߣ�������˴�������Ů����ĸ�������׽������֋�\nʮ�ָ��ˣ�������һ�����ܣ��ʵ�ϲ���Է۵�";
			g.drawImage(img8, 0, 0, null);//����ͥ
			g.drawImage(img9, x2+200, y2, null);
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawString(s, 10, 380);//����
		}
		if(number==7){
			s="�ܿ�ʵ���ѡ�����ӵ��ˣ���Ů����������������ʥ�����";
			s1="1.�ڵװ�ɫԲ����ȹ��";
			s2="2.�����Է۷�����ȹ��";	
			s3="3.ǳ�ϵ�κ�Ϸ�����ȹ��";	
			g.drawImage(img8, 0, 0, null);
			g.drawImage(img9, x2, y2, null);	
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawImage(img6, 210, 100, null);//ѡ��
			g.drawImage(img6, 210, 170, null);
			g.drawImage(img6, 210, 240, null);
		    g.drawString(s, 10, 380);//����
			g.drawString(s1,230, 120);//ѡ��
			g.drawString(s2,230, 190);
			g.drawString(s3,230, 260);
			if(x2<50){
				x2+=3;	
				}
		}
		if(number==8){
			s="������Ⱥ���������ۣ�\n�ʵ���Ϊ�����Ż�����\n��������\n����\n";
			g.drawImage(img11, 0, 0, null);	
			g.drawImage(img9, 50, 183, null);
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawString(s, 10, 380);//����
		}
		if(number==7){
			s= "�ʵ�Ѹ�ٱ���ȹ�ǵ��Է���������������øС��㱻��Ϊ��Ů��";
			g.drawImage(img11, 0, 0, null);	
			g.drawImage(img10, x3, y3, null);
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawString(s, 10, 380);//����
			if(x3<50){
				x3+=3;	
				}
		}
		if(number==9){
			s="��Ů�ڶ࣬�ʵ�û��ע�⵽�㣬��������ѡ�����׺�ʧ��\n";
			g.drawImage(img11, 0, 0, null);	
			g.drawImage(img12, 50, 183, null);
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawString(s, 10, 380);//����
		}
		if(number ==10){
			g.drawImage(img13, 0, 0, null);//Ůƪ
		}	
		if(number==11){
			s="���գ���Ҫ��ʺ��밲";
			s1="1.�㴽Ϊ�죬���Խ��ġ�";	
			s2="2.��ʩ���죬��ˮܽ�ء�";	
			g.drawImage(img14, 0, 0, null);//����
			g.drawImage(img10, x4, y4, null);//����	
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawImage(img6, 210, 100, null);//ѡ��
			g.drawImage(img6, 210, 170, null);
		    g.drawString(s, 10, 380);//����
			g.drawString(s1,230, 120);//ѡ��
			g.drawString(s2,230, 190);
			if(x4<40){
				x4+=3;	
				}
		}
		if(number==12){
			s="̫����Ϊ�������󹬣���˻ʵ�Ҳ��Զ�㣬�������ѻ����޼����ա�";
			g.drawImage(img15, 0, 0, null);	
			g.drawImage(img16, x6, y6, null);
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawString(s, 10, 380);//����
			if(x6>500){
				x6-=3;	
				}
		}
		if(number==13){
			s= "����ǫ�ͣ�����ӡ��ܺá�";
			g.drawImage(img15, 0, 0, null);	
			g.drawImage(img16, x6, y6, null);
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawString(s, 10, 380);//����
			if(x6>500){
				x6-=3;	
				}
		}
		if(number==14){
			s="ǡ���³�����ʮ�����˵�Ҫ���л����̷�ʵۡ�������㷢�ֻʵ����������ۣ�����ƣ������δͣЪ��";
			s1="1.�����ߵ��ʵ����Ϊ��ĥī��";	
			s2="2.��ص���ʵ��밲���ߵ������Ϊ�����";	
			g.drawImage(img17, 0, 0, null);//����
			g.drawImage(img18, x5, y5, null);
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawImage(img6, 210, 100, null);//ѡ��
			g.drawImage(img6, 210, 170, null);
		    g.drawString(s, 10, 380);//����
			g.drawString(s1,230, 120);//ѡ��
			g.drawString(s2,230, 190);
			if(x5<40){
				x5+=3;	
				}
		}
		if(number==15){
			s="�ʵ����ޱ��������һ��:�������޾����밲����������������ī�е��֣��ŵ���ɫ�Ұס��ʵ����һ������Ϊ��������������������乬!  ������Ϊ��Ů�㱻������λ�����Ϊ�����������˵ķ���̲ġ�";
			g.drawImage(img14, 0, 0, null);	
			g.drawImage(img9, 0, 183, null);
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawString(s, 10, 380);//����
		}
		if(number==16){
			s= "�������������������������ġ����㱻�ʵ۷�Ϊ�����֡�";
			g.drawImage(img17, 0, 0, null);	
			g.drawImage(img19, x7, y7, null);
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawString(s, 10, 380);//����
			if(x7<40){
				x7+=3;	
				}
		}
		if(number ==17){
			g.drawImage(img20, 0, 0, null);
		}	
		if(number==18){
			s="�������±��������������м�����֪�����ǻʵ۵��³裬η���ֺ�������У���޼������Ҳ�С������Ϊ����֮�󣬻ʵ����������Ѿ���һ���Ĺ��ɣ���ʱ���İ���Ū���ݡ�";
			g.drawImage(img22, 0, 0, null);	
			g.drawImage(img21, x8, y8, null);
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawString(s, 10, 380);//����
			if(x8<40){
				x8+=3;	
				}
		}
		if(number==19){
			s="���գ���Ĺ�ŮͻȻ���ŵ���������һ��С������޼�����ʱ��С�Ľ�԰������Է۸�����!���ĸв�����\n";
			s1="1.һ���Է۶��ѣ����Ů��׼����ȥ��������͵͵������";	
			s2="2.���ʵ���ʱ�����Ź�Ů���";	
			g.drawImage(img22, 0, 0, null);//����
			g.drawImage(img23, x9, y9, null);	
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawImage(img6, 210, 100, null);//ѡ��
			g.drawImage(img6, 210, 170, null);
		    g.drawString(s, 10, 380);//����
			g.drawString(s1,230, 120);//ѡ��
			g.drawString(s2,230, 190);
			if(x9>450){
				x9-=3;	
				}
		}
		if(number==20){
			s="(��Զ����Ů)��Դ��²������⣬ȴû�ϵ����ǻʵ�������������Էۡ������˽��������ͼӴ׵�˵��ʵۡ��ʵ۽��㽵Ϊ��Ů�����㡣";
			g.drawImage(img22, 0, 0, null);	
			g.drawImage(img21, x4, y4, null);
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawString(s, 10, 380);//����
		}
		if(number==21){
			s="�ʵ����ϧ�Էۣ������������㣬��Ϊ�����ʮ��̹�ϣ��ٽ��˰���һ���Է۵��㹬������Ǹ���Ůȴ�������ʮ��";
			g.drawImage(img22, 0, 0, null);	
			g.drawImage(img18, x10, y10, null);
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawString(s, 10, 380);//����
			if(x10>450){
				x10-=3;	
				}
		}
		if(number==22){
			s="���ã�˾��̫��ʹ���һּ���鹧ϲ���Ϊ�楣����Ϊ��������";
			g.drawImage(img22, 0, 0, null);	
			g.drawImage(img21, x4, y4, null);
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawString(s, 10, 380);//����
		}
		if(number ==23){
			g.drawImage(img24, 0, 0, null);
		}	
		if(number==24){
			s="�㸸��ǰ����ͻȻ���Ÿ��㣬��������ճ�͢�뱱�����ӽ�ս�������������ĸ�綫��˵˵�û���������㵱������������ս����";
			g.drawImage(img22, 0, 0, null);	
			g.drawImage(img25, x11, y11, null);
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawString(s, 10, 380);//����
			if(x11<40){
				x11+=3;	
				}
		}
		if(number==25){
			s="��ʱ�ʵ����ôӵ���������";
			s1="1.������ԭ�����������������׵����ţ�";	
			s2="2.ί�����һ�¡�";	
			g.drawImage(img14, 0, 0, null);//����
			g.drawImage(img18, x12, y12, null);	
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawImage(img6, 210, 100, null);//ѡ��
			g.drawImage(img6, 210, 170, null);
		    g.drawString(s, 10, 380);//����
			g.drawString(s1,230, 120);//ѡ��
			g.drawString(s2,230, 190);
			if(x12>450){
				x12-=3;	
				}
		}
		if(number==26){
			s="�ʵ�������˵�꣬��Ȼ���㱧�������������������ô?���㱻��ͻ����������������һ�����������ǵ������������ϲ�����������.....�����ϡ���Ȼ���ᣬ������������ı���������ô����˺��Լ��ı����ء�";
			g.drawImage(img14, 0, 0, null);	
			g.drawImage(img25, x4, y4, null);
			g.drawImage(img18, x5, y5, null);
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawString(s, 10, 380);//����
		}
		if(number==26){
			s="�ʵ�����������֮�⣬��Ц�����������µġ�";
			g.drawImage(img14, 0, 0, null);	
			g.drawImage(img25, x4, y4, null);
			g.drawImage(img18, x5, y5, null);
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawString(s, 10, 380);//����
		}
		if(number==27){
			s="�谮��ʢ��������㱻��Ϊ���ǡ�";
			g.drawImage(img14, 0, 0, null);	
			g.drawImage(img25, x4, y4, null);
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawString(s, 10, 380);//����
		}
		if(number ==28){
			g.drawImage(img26, 0, 0, null);
		}
		if(number==29){
			s="�ʵ�����ȥ���������������ǡ֮ʱ���̫���߽������񡰲μ�����!��,̫�����Ŀ�����һ�ۺ�Ի��ϵ��������ϣ�С������Ҫ���������...��˵���ֿ�����һ�ۡ��ʵ۵����������ǣ�����û�����ˡ����̫������г��һ�������ʵ���ȥ���ߵ��ʵ���ǰʱ����ͻȻ������г��һ��������ʵ۴�ȥ!������ᵼ�½���ƫת��";
			s1="1.ɵվ�Ų���";	
			s2="2.����ȥ��";	
			s3="3.���ڻʵ���ǰ";	
			g.drawImage(img17, 0, 0, null);//����
			g.drawImage(img18, x4+200, y4, null);	
			g.drawImage(img27, x4, y4, null);	
			g.drawImage(img28, x13, y13, null);	
			g.drawImage(img4, 0, 350, null);//�Ի���
			g.drawImage(img6, 210, 100, null);//ѡ��
			g.drawImage(img6, 210, 170, null);
			g.drawImage(img6, 210, 240, null);
		    g.drawString(s, 10, 380);//����
			g.drawString(s1,230, 120);//ѡ��
			g.drawString(s2,230, 190);
			g.drawString(s3,230, 270);
			if(x13>450){
				x13-=3;	
				}
		}
		if(number==30){
			s="��ɵվ��û�����������ؿ��������д���ʵۡ�Ȼ���ʵ�ȴ�侲�����ֱ�һ���������˿�Ѹ���˵���ǽ�ߣ��Ǵ̿�һ�����β��ԣ��㽫һ��ɵ���������˹��������е�����Ĳ����ϣ�ͻȻ������Ц��������ҲҪ��һ���汳��!��˵�յ�������Ĳ����㣬��Ҳ��ɱ�ˡ�";	
			g.drawImage(img17, 0, 0, null);//����
			g.drawImage(img18, x4, y4, null);	
			g.drawImage(img27, x4+300, y4, null);	
			g.drawImage(img28, x13, y13, null);	
			g.drawImage(img4, 0, 350, null);//�Ի���
		    g.drawString(s, 10, 380);//����
		}
		if(number==31){
			s="����������΢΢���һ�£�������ֱ�ȥ��!�Ǵ̿�ԭ���ǳ��Żʵ۵��Ŀڴ�ȥ����ȴ���㵲ס������ļ��ᴩ����!�㡰������һ�������ڵأ��ʵ��Ѿ��������ǽ���ϵĽ���̿Ͳ�����������";	
			g.drawImage(img17, 0, 0, null);//����
			g.drawImage(img18, x4, y4, null);	
			g.drawImage(img27, x4+300, y4, null);	
			g.drawImage(img28, x13, y13, null);	
			g.drawImage(img4, 0, 350, null);//�Ի���
		    g.drawString(s, 10, 380);//����
		}
		if(number==32){
			s="���������������������������嵲ס�˻ʵ�!���й��ض������ʵ�һ��§���㣬һ��ץס�˴̿���Ҫ���������!���ϡ���������....������������������Щ���������ȻЦ�ˣ���ǰһƬģ�����ʵ۸�����Σ����ȣ������Ϊ���������ᡣ";	
			g.drawImage(img17, 0, 0, null);//����
			g.drawImage(img18, x4, y4, null);	
			g.drawImage(img27, x4+300, y4, null);	
			g.drawImage(img28, x13, y13, null);	
			g.drawImage(img4, 0, 350, null);//�Ի���
		    g.drawString(s, 10, 380);//����
		}
		if(number==33){
			s="���ϸ��������һƬ��ϣ��ֻ����й��������Ϊ������";	
			g.drawImage(img17, 0, 0, null);//����
			g.drawImage(img27, x4, y4, null);		
			g.drawImage(img4, 0, 350, null);//�Ի���
		    g.drawString(s, 10, 380);//����
		}
		if(number ==34){
			g.drawImage(img24, 0, 0, null);
		}
		
		if(number==34){
			s="һ�գ�����ͻȻ����ɢ������е��¸�������Щ��������ĵ�һ������ӿ��˻�ȥ�ĽŲ�...";	
			g.drawImage(img31, 0, 0, null);//����
			g.drawImage(img30, x4+500, y4, null);	
			g.drawImage(img4, 0, 350, null);//�Ի���
		    g.drawString(s, 10, 380);//����
		}
		if(number==35){
			s="��������������ҽΪ����������ҽ������ȷʵ����ϲ���������º���̥����.";
			g.drawImage(img14, 0, 0, null);//����
			g.drawImage(img30, x14, y14, null);	
			g.drawImage(img4, 0, 350, null);//�Ի���
		    g.drawString(s, 10, 380);//����
		    if(x14<80){
				x14+=3;	
				}
		}
		if(number==36){
			s="�˸��º���Ϊ�ʵ۵���һ�ӣ��Դ˻ʵ۶���谮�мӣ�����������ܹ������˶���һŮ���ʵ۸�������������࣬����������ͬ�졣";	
			g.drawImage(img17, 0, 0, null);//����
			g.drawImage(img18, x4+500, y4, null);	
			g.drawImage(img33, x4+100, y4, null);	
			g.drawImage(img32, x4+300, y4+100, null);	
			g.drawImage(img4, 0, 350, null);//�Ի���
		    g.drawString(s, 10, 380);//����
		}
	}
	
	public static void main(String[] args){
		GameFrame gf=new GameFrame();
		gf.LunchFrame();	
	}	
}

