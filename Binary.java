/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BinarySearchTree;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.FontUIResource;


/**
 *
 * @author acer
 */
public class Binary extends javax.swing.JFrame {
    TreeNode head; // custom class
    Border blackline;
    Border redline;
    String str;
    JPanel jpan;
    /**
     * Creates new form Binary
     */
    public Binary() {
     initComponents();
     Seticon();//method call
     this.setExtendedState(this.getExtendedState()|Binary.MAXIMIZED_BOTH);//to maximize the screen
    }

    //method to set the icon of the application
    private void Seticon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("binarysearchtreeicon.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        clear = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        tinsert = new javax.swing.JTextField();
        binsert = new javax.swing.JButton();
        tdelete = new javax.swing.JTextField();
        bdelete = new javax.swing.JButton();
        tfind = new javax.swing.JTextField();
        bfind = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BINARY  SEARCH  TREE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(145, 198, 163));

        clear.setBackground(new java.awt.Color(54, 138, 88));
        clear.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("CLEAR");
        clear.setToolTipText("Clears the WorkSpace");
        clear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(255, 255, 255), null, null));
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });

        exit.setBackground(new java.awt.Color(54, 138, 88));
        exit.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("EXIT");
        exit.setToolTipText("Qiut Binary Tree");
        exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(255, 255, 255), null, null));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear)
                    .addComponent(exit))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(145, 198, 163));

        jInternalFrame2.setBackground(new java.awt.Color(0, 102, 102));
        jInternalFrame2.setBorder(null);
        jInternalFrame2.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jInternalFrame2.setTitle("WORKSPACE"); // NOI18N
        jInternalFrame2.setAutoscrolls(true);
        jInternalFrame2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jInternalFrame2.setFrameIcon(null);
        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame2)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(145, 198, 163));

        tinsert.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        tinsert.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        binsert.setBackground(new java.awt.Color(54, 138, 88));
        binsert.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        binsert.setForeground(new java.awt.Color(255, 255, 255));
        binsert.setText("INSERT");
        binsert.setToolTipText("Add Node");
        binsert.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(255, 255, 255), null, null));
        binsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                binsertMouseClicked(evt);
            }
        });

        tdelete.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tdelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        bdelete.setBackground(new java.awt.Color(54, 138, 88));
        bdelete.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        bdelete.setForeground(new java.awt.Color(255, 255, 255));
        bdelete.setText("DELETE");
        bdelete.setToolTipText("Delete Node");
        bdelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(255, 255, 255), null, null));
        bdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bdeleteMouseClicked(evt);
            }
        });

        tfind.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tfind.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        bfind.setBackground(new java.awt.Color(54, 138, 88));
        bfind.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        bfind.setForeground(new java.awt.Color(255, 255, 255));
        bfind.setText("FIND");
        bfind.setToolTipText("Find Node");
        bfind.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(255, 255, 255), null, null));
        bfind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bfindMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tinsert, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(binsert, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(tdelete, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bdelete, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(tfind, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bfind, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tinsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(binsert)
                    .addComponent(tdelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bdelete)
                    .addComponent(tfind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bfind))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public class TreeNode {
        int data;
        int x;
        int y;
        TreeNode parent;
        TreeNode left;
        TreeNode right;
    public TreeNode(int data, TreeNode parent, int x, int y) {
            this.data = data;
            this.parent = parent;
            this.x=x;
            this.y=y;
            }        
     }
     //method to add nodes
       void add( TreeNode t, TreeNode parent,int value) {
           if(head==null){//if no nodes are present
               head=new TreeNode(value,parent, 44,1);//node created at(44,1)
               drawNodes(head,head);//create a node
           }
           else{//if nodes are present
               if(t.data > value) {//entered value if smaller then the current created node, will go to the left node
                if(t.left == null) {//if no left child
                    t.left = new TreeNode(value,t,t.x-2,t.y+1);//left child created
                    removeAllOverlap(head);
                    
                  drawNodes(head,t.left);//displays from head in blackline except t.right which is in redline
                  return;
                }
                add(t.left,t,value);//add()
            }
            else {
                if(t.right == null) {//no right child present 
                    t.right = new TreeNode(value,t,t.x+2,t.y+1);//right child created 
                    removeAllOverlap(head);
                    
                  drawNodes(head,t.right);//displays from head in blackline except t.right which is in redline
                    return; 
           }
        add(t.right,t,value);//add()
            }
           }
          }
      //method to delete nodes 
       void delete(int value) {
        if(findNode(head, value)) {//if node is present
         JLabel jLabels =new JLabel(str+" is deleted");//actionbox command
         jLabels.setFont(new Font("Arial Narrow",Font.BOLD,20));//setting font, font size in jlabel
         jLabels.setBounds(40,20,400,20);//setting bounds of the actionbox
         jInternalFrame2.add(jLabels);//adding the actionbox in the internal frame
        }
        else {
         JLabel jLabels =new JLabel(str+" not found");//command if the value is not found
         jLabels.setBounds(40,20,400,20);//setting the bounds of the actionbox
         jLabels.setFont(new Font("Arial Narrow",Font.BOLD,20));//setting font, font size in jlabel
         jInternalFrame2.add(jLabels);//adding the actionbox to the internal frame
}
    }
       //method to check if the node is present
    boolean findNode(TreeNode t, int value) {
        while(t != null) {//if current node is not null
            if(t.data > value) //if entered value is less than the current node value
                t = t.left;//use left child as the current node                                 
            else if(t.data < value)//if entered value is greater than the current node value  
                t = t.right;//use right child as the current node
            else {
                if(t.left != null && t.right!=null) //if the node have no children
                    replaceNode(t,t.left);//passing parameters to method 
                else
                    del(t);//deleting node
return true;
}
}
return false;
    }
    //method to replace a Node 
    void replaceNode(TreeNode t,TreeNode p) {
        while(p.right != null)//finding a right node with no right child node
            p = p.right;//traversing the right node
        t.data = p.data;//replacing data
        del(p);//deleting the node
    }
   //method to delete a node
     void del(TreeNode t) {
        if(t.left == null && t.right == null) {//check if the node to be deleted doesnot have child
            if(head == t)//if the node to be deleted is the parent node
                head = null;//then delete the parent node
            else if(t == t.parent.left)//check if the node to be deleted is the left child of the parent node
                t.parent.left = null;//then delete that node
            else
                t.parent.right = null;//else delete the other child
        }
        else if(t.left == null) {//check if there is a right child of the parent node
            if(t == head) {
                head = t.right;//then the right child becomes the parent node
                t.parent = null;//delete that node
            }
            else if(t == t.parent.left) {//
                t.parent.left = t.right;
                t.right.parent = t.parent;
            }
            else {
                t.parent.right = t.right;
                t.right.parent = t.parent;
            }
        }
        else {
            if(t == head) {//the node to be deleted is the parent 
                head = t.left;//
                t.parent = null;
            }
            else if(t == t.parent.left) {
                t.parent.left = t.left;
                t.left.parent = t.parent;
            }
            else {
                t.parent.right = t.left;
                t.left.parent = t.parent;
            }
        }
        resetPosition(head, 44, 1);
        removeAllOverlap(head);
    }
   //method to Find the Node 
      void getNode(TreeNode t, int value) {
        while(t != null) {//until current node is not null
            if(t.data > value) //entered value is less than the current Node value
            t = t.left;//left child node becomes the current node
            
            else if(t.data < value) //if entered value is greater than the current Node value
t = t.right;//right child node becomes the current node

            
            else {//when the entered value=current Node value
                JLabel jLabels = new JLabel(str+" found");
                jLabels.setFont(new Font("Arial Narrow",Font.BOLD,20));//setting font, font size in jlabel
                jLabels.setBounds(40, 20, 400, 20);
                jInternalFrame2.add(jLabels);
                drawNodes(head, t);
                return;

            }
}
JLabel jLabels = new JLabel(str+" not found");
jLabels.setFont(new Font("Arial Narrow",Font.BOLD,20));//setting font, font size in jlabel
                jLabels.setBounds(40, 20, 400, 20);
                jInternalFrame2.add(jLabels);
                drawNodes(head, t);
    }
    
       //method to remove Overlapping of nodes
        void removeAllOverlap(TreeNode t) {
        if(t== null)//if parent is null 
        return;
            if(t.left!=null){ //left child present                
            removeAllOverlap(t.left);
            checkForOverlap(head,t.left.y,t.left);
        }    
        if(t.right != null) { //right child present                
            removeAllOverlap(t.right);
           checkForOverlap(head,t.right.y,t.right);
        }
    }
    
         
          void checkForOverlap(TreeNode t, int lvl, TreeNode i) {  
            if(t == null)
                return;
if(lvl == 1) {
            if(i.data != t.data && i.x == t.x )
                findCommonNode(i,t);
        }
else {
            checkForOverlap(t.left, lvl-1, i);
            checkForOverlap(t.right, lvl-1, i);
        }
      
    }
   
    
   void findCommonNode(TreeNode i, TreeNode t) {
           if(i.data == t.data)
               shiftDegree(t);
        else
            findCommonNode(i.parent, t.parent);
    }
    
    void shiftDegree(TreeNode i) {          
        if(i != null) {
            if(i.data < head.data)
                shift(i.left, -4);
            else if(i.data > head.data)
                shift(i.right, 4);
            else {
                shift(i.left, -2);
                shift(i.right, 2);
            }
            i.x = ( i.left.x + i.right.x )/2;
        }
    }
    
    void shift(TreeNode t, int val) {
        if(t==null)
            return;
        t.x = t.x + val;
        shift(t.left,val);
        shift(t.right,val);
    }
    
      
       void resetPosition(TreeNode t, int val, int lvl) {
        if(t == null)
            return;
        t.x = val;//position of x-axis of the Node 
        t.y = lvl;//position of y-axis of the Node 
        resetPosition(t.left, val-2, lvl+1);
        resetPosition(t.right, val+2, lvl+1);
    } 
       
    //method to draw Nodes
       void drawNodes(TreeNode t, TreeNode i) {
        if(t == null)
        return;

            JLabel jLabels =new JLabel(""+t.data);//dynamically creating jlabel with text
            jLabels.setBounds(t.x*15, t.y*40, 50, 20);//jlabel size
            jLabels.setHorizontalAlignment(SwingConstants.CENTER);//centering the text in the jlabel
            jLabels.setForeground(new java.awt.Color(255, 255, 255));//setting text color
            jLabels.setFont(new Font("Arial Narrow",Font.BOLD,20));//setting font, font size in jlabel

            
        if(t != i) {
            jLabels.setBorder(blackline);           
            }
else{
    
    jLabels.setBorder(redline);
               
    
        }
        jInternalFrame2.add(jLabels);//adding created jlabels in the workspace

    jpan =new JPanel();
    jpan.setBounds(t.x*15, t.y*40, 50, 20);
    jpan.setBackground(new java.awt.Color(0,102,102));   
    jInternalFrame2.add(jpan);//adding jpanel to jInternalFrame

drawNodes(t.left,i);
drawNodes(t.right,i);
drawline(head);        
}

            //method to draw a line in between the nodes
     void drawline(TreeNode t) {
        if(t.right != null) {
            jpan = new JPanel() {//inserting jpanel
                @Override
                public void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.setColor(Color.BLACK);//setting line color
                    g.drawLine(0, 0, (t.right.x-t.x)*15-10, 20);//setting position of the line 
                }
            };
            jpan.setBounds(t.x*15+30, t.y*40+20, (t.right.x-t.x)*15-10, 20);
            jInternalFrame2.add(jpan);

            drawline(t.right);
        }
        if(t.left != null) {

            jpan = new JPanel() {//inserting jpanel 
                @Override
                public void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.setColor(Color.BLACK);
                    g.drawLine((t.x-t.left.x)*15-10, 0, 0, 20);
                }
            };
            jpan.setBounds(t.left.x*15+20, t.y*40+20 , (t.x-t.left.x)*15-10, 20);
            jInternalFrame2.add(jpan);
             drawline(t.left);
        }
      
    }


    
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
             
        UIManager.put("control",new Color(145,198,163));//to set the background color of the messagebox
        UIManager.put("nimbusBase",new Color(0,102,102));//setting the button color of the messagebox
        UIManager.put("text",new Color(255,255,255));//setting the text color 
        UIManager.put("OptionPane.messageFont",new FontUIResource(new Font("Poor Richard",Font.BOLD,27)));//setting the font style, size of the message box

        int ques=JOptionPane.showConfirmDialog(null,"Do you want to exit the application?", "EXIT",JOptionPane.YES_NO_OPTION); 
         if(ques==JOptionPane.YES_OPTION){
            dispose();//if clicked yes then closing the application
            }
    }//GEN-LAST:event_exitActionPerformed

    private void binsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_binsertMouseClicked
         str = tinsert.getText();//getting the text from the textbox
            this.blackline = BorderFactory.createLineBorder(Color.black);//giving black border 
            this.redline=BorderFactory.createLineBorder(Color.red,2);//red border as the new node is inserted
            jInternalFrame2.getContentPane().removeAll();
            if(!str.equals(""))
            {
                try{
                add(head,null,Integer.parseInt(str));//add() values
                JLabel jLabels = new JLabel(str+" is added");
                jLabels.setFont(new Font("Arial Narrow",Font.BOLD,20));//setting font, font size in jlabel
                jLabels.setBounds(40, 20, 400, 20);
                 jInternalFrame2.add(jLabels); //adding jlabel to jInternalFrame
                }
                catch(NumberFormatException e){
                JLabel jLabels = new JLabel(str+" is not an integer");
                jLabels.setFont(new Font("Arial Narrow",Font.BOLD,20));//setting font, font size in jlabel
                jLabels.setBounds(40, 20, 400, 20);
                 jInternalFrame2.add(jLabels); //adding jlabel to jInternalFrame
                drawNodes(head,null);
                }
            }
            else
                drawNodes(head,null);
            jInternalFrame2.validate();
                jInternalFrame2.repaint();//refreshes            
                tinsert.setText("");//clearing the textbox
           
    }//GEN-LAST:event_binsertMouseClicked

    
    

    private void bdeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdeleteMouseClicked
        str = tdelete.getText();//getting the text from the textbox
        jInternalFrame2.getContentPane().removeAll();
        if(!str.equals("")) {
            try{
            delete(Integer.parseInt(str));
            }catch(NumberFormatException e){
                 JLabel jLabels = new JLabel(str+" is not an integer");
                jLabels.setFont(new Font("Arial Narrow",Font.BOLD,20));//setting font, font size in jlabel
                jLabels.setBounds(40, 20, 400, 20);
                 jInternalFrame2.add(jLabels); //adding jlabel to jInternalFrame
            }
        }
                drawNodes(head,null);
            jInternalFrame2.validate();
            jInternalFrame2.repaint();            
            tdelete.setText(""); //clearing the textbox 
    }//GEN-LAST:event_bdeleteMouseClicked

       
    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
       
        head = null;
        jInternalFrame2.getContentPane().removeAll();
        jInternalFrame2.validate();
      jInternalFrame2.repaint();
    }//GEN-LAST:event_clearMouseClicked

    private void bfindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bfindMouseClicked
       str = tfind.getText();//getting the text from the textbox
       jInternalFrame2.getContentPane().removeAll();
       if(!str.equals("")) {
            try{            
            getNode(head,Integer.parseInt(str));
            }catch(NumberFormatException e){
            JLabel jLabels = new JLabel(str+" is not an integer");
                jLabels.setFont(new Font("Arial Narrow",Font.BOLD,20));//setting font, font size in jlabel
                jLabels.setBounds(40, 20, 400, 20);
                 jInternalFrame2.add(jLabels); //adding jlabel to jInternalFrame
                }  
       }
       drawNodes(head,null);
            jInternalFrame2.validate();
            jInternalFrame2.repaint();
           
            tfind.setText("");//clearing the textbox
                                             
    }//GEN-LAST:event_bfindMouseClicked



    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Binary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Binary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Binary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Binary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Binary().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bdelete;
    private javax.swing.JButton bfind;
    private javax.swing.JButton binsert;
    private javax.swing.JButton clear;
    private javax.swing.JButton exit;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tdelete;
    private javax.swing.JTextField tfind;
    private javax.swing.JTextField tinsert;
    // End of variables declaration//GEN-END:variables
}
