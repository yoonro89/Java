package loginEx_1;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JoinF extends JDialog {
    private LoginF owner;
    private User userss;

    
    private JLabel lblTitle;
    private JLabel lblId;
    private JLabel lblPw;
    private JLabel lblRe;
    private JLabel lblName;
    private JLabel lblNickName;
    private JRadioButton rbtnMale;
    private JRadioButton rbtnFemale;
    private JTextField tfId;
    private JPasswordField tfPw;
    private JPasswordField tfRe;
    private JTextField tfName;
    private JTextField tfNickName;
    private JButton btnJoin;
    private JButton btnCancel;

    
	static User uInfo = new User(); 
    
    
    public JoinF(LoginF owner) {
        super(owner, "Join", true);
        this.owner = owner;
        
        init();
        setDisplay();
        addListeners();
        showFrame();
    }
    
    //회원가입창
    private void init() {
        // 크기 고정
        int tfSize = 10;
        Dimension lblSize = new Dimension(80, 35);
        Dimension btnSize = new Dimension(100 ,25);


        lblTitle = new JLabel("Persnal Information");
        lblTitle.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        lblId = new JLabel("ID", JLabel.LEFT);
        lblId.setPreferredSize(lblSize);
        lblPw = new JLabel("PW", JLabel.LEFT);
        lblPw.setPreferredSize(lblSize);
        lblRe = new JLabel("Confirm PW", JLabel.LEFT);
        lblRe.setPreferredSize(lblSize);
        lblName = new JLabel("Name", JLabel.LEFT);
        lblName.setPreferredSize(lblSize);
        lblNickName = new JLabel("NickName", JLabel.LEFT);
        lblNickName.setPreferredSize(lblSize);

        tfId = new JTextField(tfSize);
        tfPw = new JPasswordField(tfSize);
        tfRe = new JPasswordField(tfSize);
        tfName = new JTextField(tfSize);
        tfNickName = new JTextField(tfSize);

        rbtnMale = new JRadioButton("Male", true);
        rbtnFemale = new JRadioButton("Female");
        ButtonGroup group = new ButtonGroup();
        group.add(rbtnMale);
        group.add(rbtnFemale);

        btnJoin = new JButton("Join");
        btnJoin.setPreferredSize(btnSize);
        btnCancel = new JButton("Cancel");
        btnCancel.setPreferredSize(btnSize);

    }
    
    private void setDisplay() {
        // FlowLayout 왼쪽 정렬
        FlowLayout flowLeft = new FlowLayout(FlowLayout.LEFT);

        // pnlMain(pnlMNorth / pnlMCenter / pnlMSouth)
        JPanel pnlMain = new JPanel(new BorderLayout());

        // pnlMNorth(lblTitle)
        JPanel pnlMNorth = new JPanel(flowLeft);
        pnlMNorth.add(lblTitle);

        // pnlMCenter(pnlId / pnlPw / pnlRe / pnlName / pnlNickName)
        JPanel pnlMCenter = new JPanel(new GridLayout(0, 1));
        JPanel pnlId = new JPanel(flowLeft);
        pnlId.add(lblId);
        pnlId.add(tfId);

        JPanel pnlPw = new JPanel(flowLeft);
        pnlPw.add(lblPw);
        pnlPw.add(tfPw);

        JPanel pnlRe = new JPanel(flowLeft);
        pnlRe.add(lblRe);
        pnlRe.add(tfRe);

        JPanel pnlName = new JPanel(flowLeft);
        pnlName.add(lblName);
        pnlName.add(tfName);

        JPanel pnlNickName = new JPanel(flowLeft);
        pnlNickName.add(lblNickName);
        pnlNickName.add(tfNickName);

        pnlMCenter.add(pnlId);
        pnlMCenter.add(pnlPw);
        pnlMCenter.add(pnlRe);
        pnlMCenter.add(pnlName);
        pnlMCenter.add(pnlNickName);

        // pnlMSouth(rbtnMale / rbtnFemale)
        JPanel pnlMSouth = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnlMSouth.add(rbtnMale);
        pnlMSouth.add(rbtnFemale);
        pnlMSouth.setBorder(new TitledBorder("Gender"));

        // pnlMain
        pnlMain.add(pnlMNorth, BorderLayout.NORTH);
        pnlMain.add(pnlMCenter, BorderLayout.CENTER);
        pnlMain.add(pnlMSouth, BorderLayout.SOUTH);

        // pnlSouth(btnJoin / btnCancel)
        JPanel pnlSouth = new JPanel();
        pnlSouth.add(btnJoin);
        pnlSouth.add(btnCancel);

        // 화면 테두리의 간격을 주기 위해 설정 (insets 사용 가능)
        pnlMain.setBorder(new EmptyBorder(0, 20, 0, 20));
        pnlSouth.setBorder(new EmptyBorder(0, 0, 10, 0));

        add(pnlMain, BorderLayout.NORTH);
        add(pnlSouth, BorderLayout.SOUTH);
    }
    private void addListeners() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                dispose();
                owner.setVisible(true);
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
                owner.setVisible(true);
            }
        });
        btnJoin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            	// 정보 하나라도 비어있으면
                if(isBlank()) {
                    JOptionPane.showMessageDialog(
                            JoinF.this,
                            "모든 정보를 입력해주세요."
                    );
                    
                // 모두 입력했을 때
                } else {
                    
                	uInfo.setId(tfId.getText());
					UserL uload = new UserL(uInfo);
					uInfo = uload.user;
					System.out.println(uInfo.getId());
					
                	
                	
                	// ID 중복일 때
                    if(uload.isNo()) {
                    	
                    	System.out.println("dasdasdas");
                    	
                        JOptionPane.showMessageDialog(
                                JoinF.this,
                                "이미 존재하는 Id입니다."
                        );
                        tfId.requestFocus();
                        return;
                        // PW와 ConfirmPW가 일치하지 않았을 때
                    } else if(!String.valueOf(tfPw.getPassword()).equals(String.valueOf(tfRe.getPassword()))) {
                        JOptionPane.showMessageDialog(
                                JoinF.this,
                                "비밀번호가 일치하지 않습니다."
                        );
                        tfPw.requestFocus();
                    } else {
                    	//UserDataSet에 보내기
                    	
                    	uInfo.setPw(String.valueOf(tfPw.getPassword()));
                    	uInfo.setName(tfName.getText());
                    	uInfo.setNickName(tfNickName.getText());
                    	uInfo.setGender(getGender());

                        
                        System.out.println(tfId.getText());
                        System.out.println(String.valueOf(tfPw.getPassword()));
                        System.out.println(tfName.getText());
                        System.out.println(tfNickName.getText());
                        System.out.println(getGender());
                        
                    	//User
                        new UserW(uInfo);
                    	
//                    	//UserDataSet에 보내기
//                    	User u = new User(
//                    			tfId.getText(),
//                    			String.valueOf(tfPw.getPassword()),
//                    			tfName.getText(),
//                    			tfNickName.getText(),
//                    			getGender());
//                    	//User
//                    	users.addUsers(u);	
                        JOptionPane.showMessageDialog(
                                JoinF.this,
                                "회원가입을 완료했습니다!"
                                
                        );
                        
                        
                        dispose();
                        owner.setVisible(true);
                        
                        
                    }
                }
            }
        });
    }
    public boolean isBlank() {
        boolean result = false;
        if(tfId.getText().isEmpty()) {
            tfId.requestFocus();
            return true;
        }
        if(String.valueOf(tfPw.getPassword()).isEmpty()) {
            tfPw.requestFocus();
            return true;
        }
        if(String.valueOf(tfRe.getPassword()).isEmpty()) {
            tfRe.requestFocus();
            return true;
        }
        if(tfName.getText().isEmpty()) {
            tfName.requestFocus();
            return true;
        }
        if(tfNickName.getText().isEmpty()) {
            tfNickName.requestFocus();
            return true;
        }
        return result;
    }
    
    public String getGender() {
        if(rbtnMale.isSelected()) {
            return rbtnMale.getText();
        }
        return rbtnFemale.getText();
    }

    private void showFrame() {
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}