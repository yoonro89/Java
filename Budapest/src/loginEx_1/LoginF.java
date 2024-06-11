package loginEx_1;

import javax.swing.*;

import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import loginEx_2.*;

public class LoginF extends JFrame {

	private User user;
	private JLabel lblId;
	private JLabel lblPw;
	private JTextField tfId;
	private JPasswordField tfPw;
	private JButton btnSignIN;
	private JButton btnJoin;

	String id;
	String pw;
	String name;
	String nickName;
	String gender;

	static User uInfo = new User();         // << 1

	public String getTfId() {
		return tfId.getText();
	}

	public static void main(String[] args) {// ━┓
		new LoginF();						//	┃
	}// main━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛

	public LoginF() {// ━━━━━━━━┓
		user = new User();	//  ┃
		init();				//  ┃
		setDisplay();		//  ┃
		addListeners();		//  ┃
		showFrame();		//  ┃
	}// LoginF━━━━━━━━━━━━━━━━━━┛

	public void init() {// ━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
		// Regularization							//┃
		Dimension lblSize = new Dimension(80, 30);	//┃
		int tfSize = 10;							//┃
		Dimension btnSize = new Dimension(100, 25);	//┃
													//┃
		lblId = new JLabel("ID");					//┃
		lblId.setPreferredSize(lblSize);			//┃
		lblPw = new JLabel("PW");					//┃
		lblPw.setPreferredSize(lblSize);			//┃
													//┃
		tfId = new JTextField(tfSize);				//┃
		tfPw = new JPasswordField(tfSize);			//┃
													//┃
		btnSignIN = new JButton("Sign In");			//┃
		btnSignIN.setPreferredSize(btnSize);		//┃
		btnJoin = new JButton("Sign Up");			//┃
		btnJoin.setPreferredSize(btnSize);			//┃
	}// initiate━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛


	public void setDisplay() {//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
		// Left align												┃
		FlowLayout flowLeft = new FlowLayout(FlowLayout.LEFT);	//	┃
																//	┃
		// pnlNorth(pnlId, pnlPw)									┃
		JPanel pnlNorth = new JPanel(new GridLayout(0, 1));		//	┃
																//	┃
		JPanel pnlId = new JPanel(flowLeft);					//	┃
		pnlId.add(lblId);										//	┃
		pnlId.add(tfId);										//	┃
																//	┃
		JPanel pnlPw = new JPanel(flowLeft);					//	┃
		pnlPw.add(lblPw);										//	┃
		pnlPw.add(tfPw);										//	┃
																//	┃
		pnlNorth.add(pnlId);									//	┃
		pnlNorth.add(pnlPw);									//	┃
																//	┃
		JPanel pnlSouth = new JPanel();							//	┃
		pnlSouth.add(btnSignIN);								//	┃
		pnlSouth.add(btnJoin);									//	┃
																//	┃
		pnlNorth.setBorder(new EmptyBorder(0, 20, 0, 20));		//	┃
		pnlSouth.setBorder(new EmptyBorder(0, 0, 10, 0));		//	┃
																//	┃
		add(pnlNorth, BorderLayout.NORTH);						//	┃
		add(pnlSouth, BorderLayout.SOUTH);						//	┃
	}//Displayseting━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛

	public void addListeners() {//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
																																	//┃
		// 회원가입 버튼 동작																											//┃
		btnJoin.addActionListener(new ActionListener() {																			//┃
			@Override																												//┃
			public void actionPerformed(ActionEvent e) {																			//┃
				setVisible(false);																									//┃
				new JoinF(LoginF.this);// 회원가입창 호출																				//┃
				tfId.setText("");// 값 비우기																							//┃
				tfPw.setText("");// 값 비우기																							//┃
			}																														//┃
		});																															//┃
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////┃
		//로그인 버튼 동작																												//┃
		btnSignIN.addActionListener(new ActionListener() {																			//┃
			@Override																												//┃
			public void actionPerformed(ActionEvent e) {																			//┃
																																	//┃
				if (tfId.getText().isEmpty()) {																						//┃
					JOptionPane.showMessageDialog(LoginF.this, "아이디를 입력하세요.", "로그인폼", JOptionPane.WARNING_MESSAGE);			//┃
																																	//┃
					// ID가 존재하지 않을 경우																							//┃
				}else { 																											//┃
					uInfo.setId(tfId.getText());																					//┃
					UserL uload = new UserL(uInfo);																					//┃
					if(!uload.isNo()){																								//┃
						JOptionPane.showMessageDialog(LoginF.this, "존재하지 않는 Id입니다.");											//┃
																																	//┃
					}																												//┃
					// 존재하는 아이디일 경우																							//┃
					else {																											//┃
						uInfo = uload.user;																							//┃
																																	//┃						
						id = uInfo.getId();																							//┃
						pw = uInfo.getPw();																							//┃
						name = uInfo.getName();																						//┃
						nickName = uInfo.getNickName();																				//┃
						gender = uInfo.getGender();																					//┃
																																	//┃
																																	//┃
																																	//┃
						// 비밀번호칸이 비었을 경우																						//┃
						if (String.valueOf(tfPw.getPassword()).isEmpty()) {															//┃
							JOptionPane.showMessageDialog(LoginF.this, "비밀번호를 입력하세요.", "로그인폼", JOptionPane.WARNING_MESSAGE);	//┃
																																	//┃
							// 비밀번호가 일치하지 않을 경우																				//┃
						} else if (!uInfo.getPw().equals(String.valueOf(tfPw.getPassword()))) {										//┃
							JOptionPane.showMessageDialog(LoginF.this, "비밀번호가 일치하지 않습니다.");									//┃
																																	//┃
							// 모두 다 충족한 경우																						//┃
						} else {																									//┃
							JOptionPane.showMessageDialog(LoginF.this, "Wellcome to Hotel Budapest");								//┃
							setVisible(false);																						//┃
							new loginEx_2.AfterLogin( getTfId() );																	//┃
							tfId.setText("");																						//┃
							tfPw.setText("");																						//┃
						}																											//┃
					}																												//┃
				}																													//┃
			}																														//┃
		});																															//┃
																																	//┃
		// 로그인창 X의 동작																											//┃
		addWindowListener(new WindowAdapter() {																						//┃
			@Override																												//┃
			public void windowClosing(WindowEvent we) {																				//┃
				int choice = JOptionPane.showConfirmDialog(LoginF.this, "프로그램을 종료합니다.", "종료",									//┃
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);													//┃
																																	//┃
				if (choice == JOptionPane.YES_OPTION) {																				//┃
					System.exit(0);																									//┃
				}																													//┃
			}																														//┃
		});																															//┃
																																	//┃
	}//BundleofaddListener━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛

	public void showFrame() {//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
		setTitle("Budapest");											//┃
		pack(); // 컨텐츠에 맞게 프레임 크기 조정								//┃
		setLocationRelativeTo(null);// 프레임을 정중앙에 위치 시킴			//┃
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);// 프레임 닫힐 때 동작X/┃
		setResizable(false);// 프레임 크기 고정								//┃
		setVisible(true);												//┃
	}//showMetheFrame━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛

}