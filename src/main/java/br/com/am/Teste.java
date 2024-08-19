package br.com.am;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Teste  extends JFrame{
    private JPanel panel1;
    private JButton verificarButton;
    private JCheckBox c01;
    private JCheckBox c02;
    private JCheckBox c03;
    private JCheckBox c04;
    private JCheckBox c05;
    private JCheckBox c06;
    private JCheckBox c07;
    private JCheckBox c11;
    private JCheckBox c10;
    private JCheckBox c12;
    private JCheckBox c13;
    private JCheckBox c14;
    private JCheckBox c15;
    private JCheckBox c16;
    private JCheckBox c17;
    private JCheckBox c20;
    private JCheckBox c30;
    private JCheckBox c40;
    private JCheckBox c50;
    private JCheckBox c60;
    private JCheckBox c70;
    private JCheckBox c21;
    private JCheckBox c31;
    private JCheckBox c41;
    private JCheckBox c51;
    private JCheckBox c61;
    private JCheckBox c71;
    private JCheckBox c22;
    private JCheckBox c32;
    private JCheckBox c42;
    private JCheckBox c52;
    private JCheckBox c62;
    private JCheckBox c72;
    private JCheckBox c23;
    private JCheckBox c33;
    private JCheckBox c43;
    private JCheckBox c53;
    private JCheckBox c63;
    private JCheckBox c73;
    private JCheckBox c24;
    private JCheckBox c34;
    private JCheckBox c44;
    private JCheckBox c54;
    private JCheckBox c64;
    private JCheckBox c74;
    private JCheckBox c25;
    private JCheckBox c35;
    private JCheckBox c45;
    private JCheckBox c55;
    private JCheckBox c65;
    private JCheckBox c75;
    private JCheckBox c26;
    private JCheckBox c36;
    private JCheckBox c46;
    private JCheckBox c56;
    private JCheckBox c66;
    private JCheckBox c76;
    private JCheckBox c27;
    private JCheckBox c37;
    private JCheckBox c47;
    private JCheckBox c57;
    private JCheckBox c67;
    private JCheckBox c77;
    private JCheckBox c00;

    public Teste(){

        HebbApplication application = new HebbApplication();
        HebbTester tester = new HebbTester(application.getW(), application.getB());


        verificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(verificarButton,(tester.testar(getLetra()) == 1) ? "A" : "B");
            }

        });
    }

    public float[] getLetra(){
        float[] l = new float[64];

        l[0] = (c00.isSelected()) ? 1 : -1;
        l[1] = (c01.isSelected()) ? 1 : -1;
        l[2] = (c02.isSelected()) ? 1 : -1;
        l[3] = (c03.isSelected()) ? 1 : -1;
        l[4] = (c04.isSelected()) ? 1 : -1;
        l[5] = (c05.isSelected()) ? 1 : -1;
        l[6] = (c06.isSelected()) ? 1 : -1;
        l[7] = (c07.isSelected()) ? 1 : -1;
        l[8] = (c10.isSelected()) ? 1 : -1;
        l[9] = (c11.isSelected()) ? 1 : -1;
        l[10] = (c12.isSelected()) ? 1 : -1;
        l[11] = (c13.isSelected()) ? 1 : -1;
        l[12] = (c14.isSelected()) ? 1 : -1;
        l[13] = (c15.isSelected()) ? 1 : -1;
        l[14] = (c16.isSelected()) ? 1 : -1;
        l[15] = (c17.isSelected()) ? 1 : -1;
        l[16] = (c20.isSelected()) ? 1 : -1;
        l[17] = (c21.isSelected()) ? 1 : -1;
        l[18] = (c22.isSelected()) ? 1 : -1;
        l[19] = (c23.isSelected()) ? 1 : -1;
        l[20] = (c24.isSelected()) ? 1 : -1;
        l[21] = (c25.isSelected()) ? 1 : -1;
        l[22] = (c26.isSelected()) ? 1 : -1;
        l[23] = (c27.isSelected()) ? 1 : -1;
        l[24] = (c30.isSelected()) ? 1 : -1;
        l[25] = (c31.isSelected()) ? 1 : -1;
        l[26] = (c32.isSelected()) ? 1 : -1;
        l[27] = (c33.isSelected()) ? 1 : -1;
        l[28] = (c34.isSelected()) ? 1 : -1;
        l[29] = (c35.isSelected()) ? 1 : -1;
        l[30] = (c36.isSelected()) ? 1 : -1;
        l[31] = (c37.isSelected()) ? 1 : -1;
        l[32] = (c40.isSelected()) ? 1 : -1;
        l[33] = (c41.isSelected()) ? 1 : -1;
        l[34] = (c42.isSelected()) ? 1 : -1;
        l[35] = (c43.isSelected()) ? 1 : -1;
        l[36] = (c44.isSelected()) ? 1 : -1;
        l[37] = (c45.isSelected()) ? 1 : -1;
        l[38] = (c46.isSelected()) ? 1 : -1;
        l[39] = (c47.isSelected()) ? 1 : -1;
        l[40] = (c50.isSelected()) ? 1 : -1;
        l[41] = (c51.isSelected()) ? 1 : -1;
        l[42] = (c52.isSelected()) ? 1 : -1;
        l[43] = (c53.isSelected()) ? 1 : -1;
        l[44] = (c54.isSelected()) ? 1 : -1;
        l[45] = (c55.isSelected()) ? 1 : -1;
        l[46] = (c56.isSelected()) ? 1 : -1;
        l[47] = (c57.isSelected()) ? 1 : -1;
        l[48] = (c60.isSelected()) ? 1 : -1;
        l[49] = (c61.isSelected()) ? 1 : -1;
        l[50] = (c62.isSelected()) ? 1 : -1;
        l[51] = (c63.isSelected()) ? 1 : -1;
        l[52] = (c64.isSelected()) ? 1 : -1;
        l[53] = (c65.isSelected()) ? 1 : -1;
        l[54] = (c66.isSelected()) ? 1 : -1;
        l[55] = (c67.isSelected()) ? 1 : -1;
        l[56] = (c70.isSelected()) ? 1 : -1;
        l[57] = (c71.isSelected()) ? 1 : -1;
        l[58] = (c72.isSelected()) ? 1 : -1;
        l[59] = (c73.isSelected()) ? 1 : -1;
        l[60] = (c74.isSelected()) ? 1 : -1;
        l[61] = (c75.isSelected()) ? 1 : -1;
        l[62] = (c76.isSelected()) ? 1 : -1;
        l[63] = (c77.isSelected()) ? 1 : -1;

        for (int i = 0; i < 64; i++) {
            if(l[i]==-1)
                System.out.print("0 ");
            else
                System.out.print("* ");

            if ((i+1)%8==0)
                System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        return l;
    }





    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }
}
