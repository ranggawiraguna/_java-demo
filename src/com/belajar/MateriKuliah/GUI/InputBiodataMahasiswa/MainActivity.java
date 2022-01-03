package com.belajar.MateriKuliah.GUI.InputBiodataMahasiswa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Cursor;
import javax.swing.Box;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainActivity extends JFrame {
    private static final long serialVersionUID = 1L;

    Font fontStyle = null;

    JPanel decoratePanel, inputDataPanel, formInputPanel;
    JLabel ButtonClose, titleTop, iconBio, lineAbstrak, titleBottom;
    JLabel titleTop2, titleNama, inputBoxNama, underlineNama, titleNim, inputBoxNim, underlineNim, 
           titleFakultas, inputBoxFakultas, underlineFakultas, titleJurusan, inputBoxJurusan, 
           titleAngkatan, inputBoxAngkatan, underlineAngkatan, ButtonSimpan;
    JTextField inputNama, inputNim, inputFakultas, inputJurusan, inputAngkatan;
    JComboBox<String> comboBoxFakultas;
    JRadioButton radioButton1, radioButton2, radioButton3;
    Box boxRadio;
    JButton iconButtonClose, iconButtonSimpan;

    MainActivity() throws IOException, FontFormatException {
        fontStyle = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Font\\PRODUCT SANS REGULAR.TTF"));

        setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File(
                ".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Background.png")))));

        iconButtonClose = new JButton();
        iconButtonClose.setIcon(new ImageIcon(ImageIO.read(new File(
                ".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Icon_Close.png"))));
        iconButtonClose.setBackground(new Color(0, 0, 0, 0));
        iconButtonClose.setOpaque(false);
        iconButtonClose.setBounds(11, 12, 25, 25);
        iconButtonClose.setBorder(null);
        iconButtonClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        ButtonClose = new JLabel(new ImageIcon(ImageIO.read(new File(
                ".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Close_Shape.png"))));
        ButtonClose.setBounds(0, 0, 62, 62);
        ButtonClose.setLayout(null);
        ButtonClose.add(iconButtonClose);

        iconButtonClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        createLeftPanel();
        createRightPanel();

        getContentPane().add(ButtonClose);
        getContentPane().add(decoratePanel);
        getContentPane().add(inputDataPanel);
    }

    public void createLeftPanel() throws IOException {
        decoratePanel = new JPanel();
        decoratePanel.setLayout(new FlowLayout());
        decoratePanel.setBounds(0, 0, 350, 600);
        decoratePanel.setSize(350, 600);
        decoratePanel.setOpaque(false);

        titleTop = new JLabel(new ImageIcon(ImageIO.read(
                new File(".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Title_Top.png"))));
        titleTop.setBorder(new EmptyBorder(30, 0, 0, 0));

        iconBio = new JLabel(new ImageIcon(ImageIO.read(
                new File(".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Icon_Bio.png"))));

        lineAbstrak = new JLabel(new ImageIcon(ImageIO.read(new File(
                ".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Line_Abstrak.png"))));
        lineAbstrak.setBorder(new EmptyBorder(5, 0, 0, 0));

        titleBottom = new JLabel(new ImageIcon(ImageIO.read(new File(
                ".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Title_Bottom.png"))));
        titleBottom.setBorder(new EmptyBorder(15, 0, 0, 0));

        decoratePanel.add(titleTop);
        decoratePanel.add(iconBio);
        decoratePanel.add(lineAbstrak);
        decoratePanel.add(titleBottom);
    }

    public void createRightPanel() throws IOException {
        inputDataPanel = new JPanel();
        inputDataPanel.setLayout(new FlowLayout());
        inputDataPanel.setBounds(350, 0, 550, 600);
        inputDataPanel.setSize(550, 600);
        inputDataPanel.setOpaque(false);

        titleTop2 = new JLabel(new ImageIcon(ImageIO.read(
                new File(".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Title_Top2.png"))));
        titleTop2.setBorder(new EmptyBorder(20, 0, 0, 0));

        formInputPanel = new JPanel();
        formInputPanel.setLayout(new BoxLayout(formInputPanel, BoxLayout.Y_AXIS));
        formInputPanel.setOpaque(false);

        titleNama = new JLabel(new ImageIcon(ImageIO.read(new File(
                ".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Title_Nama.png"))));
        titleNama.setBorder(new EmptyBorder(20, 5, 0, 0));
        inputNama = new JTextField();
        inputNama.setBorder(new EmptyBorder(0, 10, 0, 10));
        inputNama.setFont(fontStyle.deriveFont(Font.TRUETYPE_FONT, 16f));
        inputNama.setOpaque(false);
        underlineNama = new JLabel(new ImageIcon(ImageIO.read(
                new File(".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Underline.png"))));
        underlineNama.setBorder(new EmptyBorder(0, 0, 6, 0));
        inputBoxNama = new JLabel( new ImageIcon(ImageIO.read(new File(
                ".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Input_Box.png"))));
        inputBoxNama.setLayout( new BorderLayout() );
        inputBoxNama.setBorder(null);
        inputBoxNama.add(inputNama, BorderLayout.CENTER);
        inputBoxNama.add(underlineNama, BorderLayout.SOUTH);

        titleNim = new JLabel(new ImageIcon(ImageIO.read(new File(
                ".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Title_Nim.png"))));
        titleNim.setBorder(new EmptyBorder(20, 5, 0, 0));
        inputNim = new JTextField();
        inputNim.setBorder(new EmptyBorder(0, 10, 0, 10));
        inputNim.setFont(fontStyle.deriveFont(Font.TRUETYPE_FONT, 16f));
        inputNim.setOpaque(false);
        underlineNim = new JLabel(new ImageIcon(ImageIO.read(
                new File(".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Underline.png"))));
        underlineNim.setBorder(new EmptyBorder(0, 0, 6, 0));
        inputBoxNim = new JLabel(new ImageIcon(ImageIO.read(
                new File(".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Input_Box.png"))));
        inputBoxNim.setLayout(new BorderLayout());
        inputBoxNim.setBorder(null);
        inputBoxNim.add(inputNim);
        inputBoxNim.add(underlineNim, BorderLayout.SOUTH);

        String fakultas[] = { "", "Fakultas Ekonomi dan Bisnis", "Fakultas Teknik", "Fakultas Keguruan Ilmu Pendidikan"};
        titleFakultas = new JLabel(new ImageIcon(ImageIO.read(
                new File(".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Title_Fakultas.png"))));
        titleFakultas.setBorder(new EmptyBorder(20, 5, 0, 0));
        inputFakultas = new JTextField();
        inputFakultas.setBorder(new EmptyBorder(0, 10, 0, 10));
        inputFakultas.setFont(fontStyle.deriveFont(Font.TRUETYPE_FONT, 16f));
        inputFakultas.setOpaque(false);
        inputBoxFakultas = new JLabel(new ImageIcon(ImageIO.read(
                new File(".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Input_Box.png"))));
        inputBoxFakultas.setLayout(new BorderLayout());
        inputBoxFakultas.add(inputFakultas);
        comboBoxFakultas = new JComboBox<>(fakultas);
        comboBoxFakultas.setOpaque(false);
        comboBoxFakultas.setBorder(new EmptyBorder(5, 5, 5, 5));
        inputBoxFakultas.add(comboBoxFakultas, BorderLayout.CENTER);

        comboBoxFakultas.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        String[] newProdi = {};

                        if(comboBoxFakultas.getSelectedIndex() == 1){
                                newProdi = new String[]{"Manajemen", "Akutansi", "Perpajakan"};
                        }else if(comboBoxFakultas.getSelectedIndex() == 2){
                                newProdi = new String[] { "Elektro", "Informatika", "Mesin" };
                        }else if(comboBoxFakultas.getSelectedIndex() == 3) {
                                newProdi = new String[] { "Sejarah", "Matematika", "Fisika" };
                        }

                        reCreateRadioProdi(newProdi);
                }
        });

        titleJurusan = new JLabel(new ImageIcon(ImageIO.read(
                new File(".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Title_Prodi.png"))));
        titleJurusan.setBorder(new EmptyBorder(20, 5, 0, 0));
        boxRadio = Box.createHorizontalBox();
        boxRadio.setOpaque(false);
        inputBoxJurusan = new JLabel(new ImageIcon(ImageIO.read(
                new File(".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Input_Box.png"))));
        inputBoxJurusan.setLayout(new BorderLayout());
        inputBoxJurusan.setBorder(null);
        inputBoxJurusan.add(boxRadio);

        titleAngkatan = new JLabel(new ImageIcon(ImageIO.read(new File(
                ".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Title_Angkatan.png"))));
        titleAngkatan.setBorder(new EmptyBorder(20, 5, 0, 0));
        inputAngkatan = new JTextField();
        inputAngkatan.setBorder(new EmptyBorder(0, 10, 0, 10));
        inputAngkatan.setFont(fontStyle.deriveFont(Font.TRUETYPE_FONT, 16f));
        inputAngkatan.setOpaque(false);
        underlineAngkatan = new JLabel(new ImageIcon(ImageIO.read(
                new File(".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Underline.png"))));
        underlineAngkatan.setBorder(new EmptyBorder(0, 0, 6, 0));
        inputBoxAngkatan = new JLabel(new ImageIcon(ImageIO.read(
                new File(".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Input_Box.png"))));
        inputBoxAngkatan.setLayout(new BorderLayout());
        inputBoxAngkatan.setBorder(null);
        inputBoxAngkatan.add(inputAngkatan);
        inputBoxAngkatan.add(underlineAngkatan, BorderLayout.SOUTH);

        iconButtonSimpan = new JButton();
        iconButtonSimpan.setIcon(new ImageIcon(ImageIO.read(new File(
                ".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Title_Simpan.png"))));
        iconButtonSimpan.setBackground(new Color(0, 0, 0, 0));
        iconButtonSimpan.setOpaque(false);
        iconButtonSimpan.setBorder(null);
        iconButtonSimpan.setFocusPainted(false);

        ButtonSimpan = new JLabel(new ImageIcon(ImageIO.read(new File(
                ".\\src\\com\\belajar\\MateriKuliah\\GUI\\InputBiodataMahasiswa\\_Pictures\\Button_Simpan.png"))));
        ButtonSimpan.setBounds(0, 0, 62, 62);
        ButtonSimpan.setBorder(new EmptyBorder(20, 150, 0, 0));
        ButtonSimpan.setLayout(new BorderLayout());
        ButtonSimpan.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ButtonSimpan.add(iconButtonSimpan);

        iconButtonSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String prodi;

                if(radioButton1.isSelected()){
                        prodi = radioButton1.getText().toString();
                }else if(radioButton2.isSelected()){
                        prodi = radioButton2.getText().toString();
                }else if(radioButton3.isSelected()){
                        prodi = radioButton3.getText().toString();
                }else{
                        prodi = "";
                }

                if (inputNama.getText().toString().length() != 0
                    && inputNim.getText().toString().length() != 0
                    && comboBoxFakultas.getSelectedItem().toString().length() != 0
                    && prodi.length() != 0
                    && inputAngkatan.getText().toString().length() != 0) {
                    
                    final String biodata = "Nama     : " + inputNama.getText().toString() + "\n" + 
                                           "NIM      : " + inputNim.getText().toString() + "\n" + 
                                           "Fakultas : " + comboBoxFakultas.getSelectedItem().toString() + "\n" + 
                                           "Jurusan  : " + prodi + "\n" + 
                                           "Angkatan : " + inputAngkatan.getText().toString() + "\n";

                    try {
                        BufferedWriter output;
                        final File file = new File(System.getProperty("user.home") + "/Downloads/Biodata.txt");
                        output = new BufferedWriter(new FileWriter(file));
                        output.write(biodata);
                        output.close();

                        JOptionPane.showMessageDialog(null, "Biodata berhasil disimpan pada folder Downloads",
                                "Success Message", JOptionPane.PLAIN_MESSAGE);
                    } catch (final IOException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Silahkan lengkapi formulir biodata dengan benar!", "Error Message", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        formInputPanel.add(titleNama); formInputPanel.add(inputBoxNama);
        formInputPanel.add(titleNim); formInputPanel.add(inputBoxNim);
        formInputPanel.add(titleFakultas); formInputPanel.add(inputBoxFakultas);
        formInputPanel.add(titleJurusan); formInputPanel.add(inputBoxJurusan);
        formInputPanel.add(titleAngkatan); formInputPanel.add(inputBoxAngkatan);
        formInputPanel.add(ButtonSimpan);

        inputDataPanel.add(titleTop2);
        inputDataPanel.add(formInputPanel);

    }

    private void reCreateRadioProdi(String[] prodi){
            if(prodi.length != 0) {
                boxRadio.removeAll();
                radioButton1 = new JRadioButton(prodi[0]);
                radioButton1.setOpaque(false);
                radioButton1.setBorder(new EmptyBorder(0, 10, 0, 0));
                radioButton1.setFocusPainted(false);
                radioButton2 = new JRadioButton(prodi[1]);
                radioButton2.setOpaque(false);
                radioButton2.setBorder(new EmptyBorder(0, 20, 0, 0));
                radioButton2.setFocusPainted(false);
                radioButton3 = new JRadioButton(prodi[2]);
                radioButton3.setOpaque(false);
                radioButton3.setBorder(new EmptyBorder(0, 20, 0, 0));
                radioButton3.setFocusPainted(false);
                ButtonGroup buttonGroup = new ButtonGroup();
                buttonGroup.add(radioButton1);
                buttonGroup.add(radioButton2);
                buttonGroup.add(radioButton3);
                boxRadio.add(radioButton1);
                boxRadio.add(radioButton2);
                boxRadio.add(radioButton3);

                inputBoxJurusan.add(boxRadio);
                this.pack();
            } else {
                    boxRadio.removeAll();
                    this.pack();
            }
    }

    public static void main(String args[]) throws IOException, FontFormatException {
        JFrame frame = new MainActivity();

        frame.setUndecorated(true);

        frame.setSize(900, 600);
        frame.setMinimumSize(new Dimension(900, 600));
        frame.setMaximumSize(new Dimension(900, 600));
        frame.setLocationRelativeTo(null);
  
        frame.setLayout(null);
        frame.setVisible(true);

        
    }
}

