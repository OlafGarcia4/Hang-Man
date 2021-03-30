package HANGMANGAME;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// to play the game go to HngManGame.java
public class HngManPannel extends JPanel implements MouseListener {
    HngManStrings chStrings;
    int won;
    int loss;


    public HngManPannel(){ // we use the HngManString class for getting interaction with the display panel and activate a mouse listener
        chStrings = new HngManStrings();
        chStrings.wordPicking();
        addMouseListener(this);

    }
    public void paint(Graphics g){ // this displays the graphics in out Jframe

        bckground(g);
        abcs(g);
        g.setColor(Color.blue);
        g.fillRect(490,375,200,100);

        g.setColor(Color.yellow);
        g.drawRect(490,375,199,50);
        g.drawRect(492,377,195,46);

        g.drawRect(490,425,199,50);
        g.drawRect(492,427,195,46);

        g.setColor(new Color(148, 156, 40));
        g.drawRect(491,426,197,48);
        g.drawRect(491,376,197,48);


        g.setColor(Color.white);
        g.setFont(new Font("Arial",Font.ITALIC,20));
        g.drawString("Click on a letter to start guessing",50,45);
        g.setFont(new Font("Arial",Font.BOLD,25));
        g.drawString("Won games: "+won,505,410);
        g.drawString("Lost games: "+loss,505,460);
        g.setFont(new Font("Arial", Font.ITALIC, 68));

        g.drawChars(chStrings.wordLetters,0, chStrings.wordLetters.length, 350,360);


        if(chStrings.wrongGuess ==1){
            base(g);
        }
        if(chStrings.wrongGuess ==2){
            base(g);
            pole(g);
        }
        if(chStrings.wrongGuess ==3){
            base(g);
            pole(g);
            head(g);
        }
        if(chStrings.wrongGuess ==4){
            base(g);
            pole(g);
            head(g);
            torso(g);
        }
        if(chStrings.wrongGuess ==5){
            base(g);
            pole(g);
            head(g);
            torso(g);
            rigthArm(g);
        }
        if(chStrings.wrongGuess ==6){
            base(g);
            pole(g);
            head(g);
            torso(g);
            rigthArm(g);
            leftArm(g);
        }
        if(chStrings.wrongGuess ==7){
            base(g);
            pole(g);
            head(g);
            torso(g);
            rigthArm(g);
            leftArm(g);
            rightleg(g);
        }
        blocking(g);
        if(chStrings.wrongGuess ==8) {
            base(g);
            pole(g);
            head(g);
            torso(g);
            rigthArm(g);
            leftArm(g);
            rightleg(g);
            leftleg(g);
            lose(g);
        }
        if(chStrings.winOrlose == true){
            win(g);
        }

        repaint();
    }
    public void blocking(Graphics g) {          // this is draws new boxes bocking the letter that were guessed correctly
        g.setColor(new Color(49, 193, 255));
        for (int i = 0; i < chStrings.charArray.length; i++) {
            if (chStrings.wordLetters[i] == 'a' ) {
                g.fillRect(423, 73, 36, 36);//a
            }
            if (chStrings.wordLetters[i] == 'b') {
                g.fillRect(461, 73, 36, 36);//b
            }
            if (chStrings.wordLetters[i] == 'c') {
                g.fillRect(499, 73, 36, 36);//c
            }
            if (chStrings.wordLetters[i] == 'd') {
                g.fillRect(537, 73, 30, 36);//d
            }
            if (chStrings.wordLetters[i] == 'e') {
                g.fillRect(570, 73, 36, 36);//e
            }
            if (chStrings.wordLetters[i] == 'f') {
                g.fillRect(608, 73, 30, 36);//f
            }
            if (chStrings.wordLetters[i] == 'g') {
                g.fillRect(640, 73, 36, 36);//g
            }
            if (chStrings.wordLetters[i] == 'h') {
                g.fillRect(423, 111, 36, 36);//h
            }
            if (chStrings.wordLetters[i] == 'i') {
                g.fillRect(461, 111, 30, 36);//i
            }
            if (chStrings.wordLetters[i] == 'j') {
                g.fillRect(493, 111, 26, 36);//j
            }
            if (chStrings.wordLetters[i] == 'k') {
                g.fillRect(521, 111, 36, 36);//k
            }
            if (chStrings.wordLetters[i] == 'l') {
                g.fillRect(557, 111, 36, 36);//l
            }
            if (chStrings.wordLetters[i] == 'm') {
                g.fillRect(593, 111, 42, 36);//m

            }
            if (chStrings.wordLetters[i] == 'n') {
                g.fillRect(638, 111, 36, 36);//n
            }
            if (chStrings.wordLetters[i] == 'o') {
                g.fillRect(423, 150, 36, 36);//o
            }
            if (chStrings.wordLetters[i] == 'p') {
                g.fillRect(461, 150, 36, 36);//p
            }
            if (chStrings.wordLetters[i] == 'q') {
                g.fillRect(499, 150, 36, 36);//q
            }
            if (chStrings.wordLetters[i] == 'r') {
                g.fillRect(537, 150, 35, 36);//r
            }
            if (chStrings.wordLetters[i] == 's') {
                g.fillRect(573, 150, 33, 36);//s
            }
            if (chStrings.wordLetters[i] == 't') {
                g.fillRect(608, 150, 30, 36);//t
            }
            if (chStrings.wordLetters[i] == 'u') {
                g.fillRect(640, 150, 36, 36);//u
            }
            if (chStrings.wordLetters[i] == 'v') {
                g.fillRect(423, 189, 36, 36);//v
            }
            if (chStrings.wordLetters[i] == 'w') {
                g.fillRect(461, 189, 44, 36);//W
            }
            if (chStrings.wordLetters[i] == 'x') {
                g.fillRect(505, 189, 36, 36);//x
            }
            if (chStrings.wordLetters[i] == 'y') {
                g.fillRect(541, 189, 42, 36);//y
            }
            if (chStrings.wordLetters[i] == 'z') {
                g.fillRect(583, 189, 36, 36);//z
            }
            if (chStrings.wordLetters[i] == ' ') {
                g.fillRect(619, 189, 68, 36);//__
            }
        }
    }



    private void win(Graphics g) { // this displays a text and build the graphic for the new game if the game is won
        g.setColor(new Color(84, 60, 205));
        g.setFont(new Font("Arial",Font.ITALIC,100));
        g.drawString("YOU WIN!",80,200);
        g.setColor(Color.red);
        g.fillRect(40,418,100,50);
        g.setColor(Color.white);
        g.setFont(new Font("Arial",Font.ITALIC,18));
        g.drawString("New Game",45,450);

    }

    private void lose(Graphics g) { // this displays a text and build the graphic for the new game if the game is lost
        g.setColor(new Color(84, 60, 205));
        g.drawString("HANGED!",80,300);
        g.setColor(Color.red);
        g.fillRect(40,418,100,50);
        g.setColor(Color.white);
        g.setFont(new Font("Arial",Font.ITALIC,18));
        g.drawString("New Game",45,450);
    }

    private void abcs(Graphics g) {//this diplays the keybord on the right side of the panel
        g.setColor(Color.white);
        g.setFont(new Font("Serif",Font.BOLD,38));
        g.drawString("A B C D E F G",428,106);
        g.drawString("H I J K L M N",428,144);
        g.drawString("O P Q R S T U",428,182);
        g.drawString("V W X Y Z  ---",428,220);

    }


    private void bckground(Graphics g) {// this builds the graphic for the background (of a castle) and a border around the whole window
        g.setColor(new Color(49,193,255));
        g.fillRect(0,0,700,500);// sky
        g.setColor(Color.green);
        g.fillRect(0,270,700,229);//ground
        g.setColor(new Color(183,115,79));
        g.fillRect(0,0,20,513);//border
        g.fillRect(0,473,700,20);
        g.fillRect(0,0,700,20);
        g.fillRect(690,0,20,513);
        g.setColor(Color.darkGray);
        g.fillRect(79,150,90,50);//castle top
        g.fillRect(79,130,20,20);//tower top left
        g.fillRect(149,130,20,20);// tower top right
        g.fillRect(106,144,7,7);// wall tops
        g.fillRect(121,144,7,7);
        g.fillRect(136,144,7,7);
        g.setColor(Color.gray);
        g.fillRect(39,200,170,71);//castle bottom
        g.fillRect(39,180,20,20);//tower bottom left
        g.fillRect(189,180,20,20);//tower bottom right
        g.fillRect(67,194,7,7);//wall tops
        g.fillRect(81,194,7,7);
        g.fillRect(98,194,7,7);
        g.fillRect(114,194,7,7);
        g.fillRect(130,194,7,7);
        g.fillRect(146,194,7,7);
        g.fillRect(160,194,7,7);
        g.fillRect(173,194,7,7);

        int[] x ={89,105,72};
        int[] y ={111,130,130};

        int[] x2 ={159,178,141};
        int[] y2={111,130,130};

        int[] x3 ={49,66,32};
        int[] y3 ={162,180,180};

        int[] x4 ={199,217,181};
        int[] y4 ={162,180,180};

        int n = 3;
        Polygon p= new Polygon(x,y,n);// upper right tower top
        Polygon p2= new Polygon(x2,y2,n);//upper right tower top
        Polygon p3= new Polygon(x3,y3,n);// bottom left tower top
        Polygon p4= new Polygon(x4,y4,n);//bottom right tower top
        g.setColor(Color.red);
        g.fillPolygon(p);
        g.fillPolygon(p2);
        g.fillPolygon(p3);
        g.fillPolygon(p4);
        g.setColor(new Color(141,87,58));
        g.fillOval(112,222,25,25);// this is the door on the castle
        g.fillRect(112,235,25,35);
    }
    public void head(Graphics g){// this displayes the head
        g.setColor(Color.white);
        g.fillOval(273,140,64,64);//head
        g.setColor(Color.black);
        g.drawOval(273,140,64,64);//head outline
        g.drawOval(297,153,7,16);//left eye
        g.drawOval(319,153,7,16);//right eye

    }
    private void pole(Graphics g) { // this creates the frame to hang the man
        g.setColor(new Color(128, 78, 51));
        g.fillRect(128,86,37,354);//the verticla pole
        g.fillRect(128,86,230,30);// the horizontal pole

        int [] x = {195,218,166,166};
        int[] y ={111,111,163,140};
        Polygon p = new Polygon(x,y,4); // the support beam
        g.fillPolygon(p);

        g.setColor(Color.black);
        g.drawRect(128,86,37,354);//pole outline vertical
        g.drawRect(128,86,230,30);//pole outline horizontal
        g.setColor(Color.gray);
        g.fillOval(130,403,10,10);// these are the "bolts" for extra design
        g.fillOval(130,423,10,10);
        g.fillOval(150,403,10,10);
        g.fillOval(150,423,10,10);
        g.fillOval(198,102,10,10);
        g.fillOval(150,145,10,10);
        g.fillOval(134,97,22,12);
        g.setColor(new Color(198, 149, 57));
        g.fillRect(298,111,12,30);// this displays the rope from where the man hangs
        g.setColor(new Color(153, 118, 43));
        g.drawLine(298,117,309,111);//these adds a somewhat texture to the rope
        g.drawLine(298,124,309,118);
        g.drawLine(298,131,309,125);
        g.drawLine(298,138,309,132);



    }

    private void base(Graphics g) { // this displays the base
        g.setColor(new Color(128, 78, 51));
        g.fillRect(59,399,186,41);//base
        g.setColor(Color.black);
        g.drawRect(59,399,186,41);//base outlline
    }

    private void leftleg(Graphics g) {
        int []x ={308,308,335,345};
        int []y ={297,312,366,366};
        int n =4;
        Polygon p = new Polygon(x,y,n);
        g.setColor( Color.white);
        g.fillPolygon(p);// this is the leg body
        g.setColor(Color.black);
        g.drawPolygon(p);// this is the leg outline
    }

    private void rightleg(Graphics g) {
        int []x ={300,300,275,266};
        int []y ={297,312,366,366};
        int n =4;
        Polygon p = new Polygon(x,y,n);
        g.setColor( Color.white);
        g.fillPolygon(p);// this is the leg body
        g.setColor(Color.black);
        g.drawPolygon(p);// this is the leg outline
    }

    private void leftArm(Graphics g) {
        int []x ={308,308,362,367};
        int []y ={213,224,250,242};
        int n =4;
        Polygon p = new Polygon(x,y,n);
        g.setColor( Color.white); // this is the arm body
        g.fillPolygon(p);
        g.setColor(Color.black);
        g.drawPolygon(p);// this is the leg body
    }

    private void rigthArm(Graphics g) {
        int []x ={300,300,248,243};
        int []y ={213,224,250,242};
        int n =4;
        Polygon p = new Polygon(x,y,n);
        g.setColor( Color.white);
        g.fillPolygon(p);// this is the arm body
        g.setColor(Color.black);
        g.drawPolygon(p);// this is the leg body
    }

    private void torso(Graphics g) {
        g.setColor(Color.white); // this is the body of the torso
        g.fillRect(300,203,8,108);
        g.setColor(Color.black);// this is the torso outline
        g.drawRect(300,203,8,108);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        /**
         *Approximated coordinates areas of the letters are in these comments used to detect what letter is clicked and then return it to the
         * *HngManString class for checking, and a special area if the user desiers to play another game
         * g.drawRect(423,73,36,36);//a      x1>423  &&  x2<459  && y1 >73  && y2<109 *****
         * g.drawRect(461,73,36,36);//b      x1>461  &&  x2<497  && y1 >73  && y2<109 ***
         * g.drawRect(499,73,36,36);//c      x1>499  &&  x2<535  && y1 >73  && y2< 109 ***
         * g.drawRect(537,73,30,36);//d      x1>537  &&  x2<567  && y1 >73  && y2<  109 ***
         * g.drawRect(570,73,36,36);//e      x1>570  &&  x2<606  && y1 >73  && y2<  109***
         * g.drawRect(608,73,30,36);//f      x1>608  &&  x2<638  && y1 >73  && y2<  109***
         * g.drawRect(640,73,36,36);//g      x1>640  &&  x2<676  && y1 >73  && y2<  109
         */
        int mouseX= e.getX();
        int mouseY= e.getY();

        // first row of letters
        if (mouseX>423  &&  mouseX<459  && mouseY >73  && mouseY<109){
            char ch = 'a';
            chStrings.cheking(ch);

        }
        if (mouseX>461  &&  mouseX<497  && mouseY >73  && mouseY<109){
            char ch = 'b';
            chStrings.cheking(ch);
        }
        if (mouseX>499  &&  mouseX<535  && mouseY >73  && mouseY< 109){
            char ch = 'c';
            chStrings.cheking(ch);
        }
        if (mouseX>537  &&  mouseX<567  && mouseY >73  && mouseY<  109){
            char ch = 'd';
            chStrings.cheking(ch);
        }
        if (mouseX>570  &&  mouseX<606  && mouseY >73  && mouseY<  109){
            char ch = 'e';
            chStrings.cheking(ch);
        }
        if (mouseX>608  &&  mouseX<638  && mouseY >73  && mouseY<  109){
            char ch = 'f';
            chStrings.cheking(ch);
        }
        if (mouseX>640  &&  mouseX<676  && mouseY >73  && mouseY<  109 ){
            char ch = 'g';
            chStrings.cheking(ch);
        }
        /**
         *          g.drawRect(423,111,36,36);//h     x1>423  &&  x2<459  && y1 >111  && y2<  147**
         *          g.drawRect(461,111,30,36);//i     x1>461  &&  x2<491  && y1 >111  && y2<  147**
         *          g.drawRect(493,111,26,36);//j     x1>493  &&  x2<519  && y1 >111  && y2<  147**
         *          g.drawRect(521,111,36,36);//k     x1>521  &&  x2<557  && y1 >111  && y2<  147**
         *          g.drawRect(557,111,36,36);//l     x1>557  &&  x2<593  && y1 >111  && y2<  147**
         *          g.drawRect(593,111,42,36);//m     x1>593  &&  x2<635  && y1 >111  && y2<  147
         *          g.drawRect(638,111,36,36);//n     x1>638  &&  x2<674  && y1 >111  && y2<  147
         *
         */



        //Second row of letters
        if (mouseX>423  &&  mouseX<459  && mouseY >111  && mouseY<  147){
            char ch = 'h';
            chStrings.cheking(ch);
        }
        if (mouseX>461  &&  mouseX<491  && mouseY >111  && mouseY<  147){
            char ch = 'i';
            chStrings.cheking(ch);
        }
        if (mouseX>493  &&  mouseX<519  && mouseY >111  && mouseY<  147){
            char ch = 'j';
            chStrings.cheking(ch);
        }
        if (mouseX>521  &&  mouseX<557  && mouseY >111  && mouseY<  147){
            char ch = 'k';
            chStrings.cheking(ch);
        }
        if (mouseX>557  &&  mouseX<593  && mouseY >111  && mouseY<  147){
            char ch = 'l';
            chStrings.cheking(ch);
        }
        if (mouseX>593  &&  mouseX<635  && mouseY >111  && mouseY<  147){
            char ch = 'm';
            chStrings.cheking(ch);
        }if (mouseX>638  &&  mouseX<674  && mouseY >111  && mouseY<  147){
            char ch = 'n';
            chStrings.cheking(ch);
        }
        /**
         *           g.drawRect(423,150,36,36);//o     x1>423  &&  x2<459  && y1 >150  && y2<  186
         *           g.drawRect(461,150,36,36);//p     x1>461  &&  x2<497  && y1 >150  && y2<  186
         *           g.drawRect(499,150,36,36);//q     x1>499  &&  x2<535  && y1 >150  && y2<  186
         *           g.drawRect(537,150,35,36);//r     x1>537  &&  x2<572  && y1 >150  && y2<  186
         *          g.drawRect(573,150,33,36);//s     x1>573  &&  x2<606  && y1 >150  && y2<  186
         *          g.drawRect(608,150,30,36);//t     x1>608  &&  x2<638  && y1 >150  && y2<  186
         *          g.drawRect(640,150,36,36);//u     x1>640  &&  x2<676  && y1 >150  && y2<  186
         */
        //Third row of letters
        if (mouseX>423  &&  mouseX<459  && mouseY >150  && mouseY<  186){
            char ch = 'o';
            chStrings.cheking(ch);
        }
        if (mouseX>461  &&  mouseX<497  && mouseY >150  && mouseY<  186){
            char ch = 'p';
            chStrings.cheking(ch);
        }
        if (mouseX>499  &&  mouseX<535  && mouseY >150  && mouseY<  186){
            char ch = 'q';
            chStrings.cheking(ch);
        }
        if (mouseX>537  &&  mouseX<572  && mouseY >150  && mouseY<  186){
            char ch = 'r';
            chStrings.cheking(ch);
        }
        if (mouseX>573  &&  mouseX<606  && mouseY >150  && mouseY<  186){
            char ch = 's';
            chStrings.cheking(ch);
        }if (mouseX>608  &&  mouseX<638  && mouseY >150  && mouseY<  186){
            char ch = 't';
            chStrings.cheking(ch);
        }
        if (mouseX>640  &&  mouseX<676  && mouseY >150  && mouseY<  186){
            char ch = 'u';
            chStrings.cheking(ch);
        }
        /**
         *                    g.drawRect(423,189,36,36);//v     x1>423  &&  x2<459  && y1 >189  && y2<  225
         *                    g.drawRect(461,189,44,36);//W     x1>461  &&  x2<505  && y1 >189  && y2<  225
         *                    g.drawRect(505,189,36,36);//x     x1>505  &&  x2<541  && y1 >189  && y2<  225
         *                    g.drawRect(541,189,42,36);//y     x1>541  &&  x2<583  && y1 >189  && y2<  225
         *                    g.drawRect(583,189,36,36);//z     x1>583  &&  x2<619  && y1 >189  && y2<  225
         *                    g.drawRect(619,189,68,36);//__    x1>619  &&  x2<676  && y1 >189  && y2<  225
         *
         *                     g.fillRect(40,410,100,58);new game       x1>40  &&  x2<140 && y1>410 &&  y2<468
         */
        //last row of letters
        if (mouseX>423  &&  mouseX<459  && mouseY >189  && mouseY<  225){
            char ch = 'v';
            chStrings.cheking(ch);
        }
        if ( mouseX>461  &&  mouseX<505  && mouseY >189  && mouseY<  225){
            char ch = 'w';
            chStrings.cheking(ch);

        }
        if (mouseX>541  &&  mouseX<583  && mouseY >189  && mouseY<  225){
            char ch = 'y';
            chStrings.cheking(ch);
        }
        if ( mouseX>505  &&  mouseX<541  && mouseY >189  && mouseY<  225){
            char ch = 'x';
            chStrings.cheking(ch);
        }
        if (mouseX>583  &&  mouseX<619  && mouseY >189  && mouseY<  225){
            char ch = 'z';
            chStrings.cheking(ch);
        }
        if(mouseX>619  &&  mouseX<676  && mouseY >189  && mouseY<  225){
            char ch = ' ';
            chStrings.cheking(ch);
        }
        //this is our new game restorer, resets all the variable in HngManStrings and chooses a new word most of the time
        if((mouseX>40  &&  mouseX<140 && mouseY>410 &&  mouseY<468) && (chStrings.wrongGuess == 8 || chStrings.winOrlose== true)){
            if(chStrings.wrongGuess==8){
                loss++;
                won--;

            }
            if(chStrings.winOrlose=true){
                won++;
            }

            chStrings.wrongGuess = 0;
            chStrings.wordPicking();
            chStrings.winOrlose = false;
            for(int i = 0; i < 27; i++){
                chStrings.wordBlocker[i] = '*';
            }

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
