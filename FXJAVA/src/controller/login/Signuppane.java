package controller.login;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import dao.MemberDao;
import dto.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Signuppane implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText(""); // ó�� ����� ���� x
	}
	
    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Button btnsignup;

    @FXML
    private Button btnback;

    @FXML
    private Label lblconfirm;

    @FXML
    private PasswordField txtpasswordconfirm;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtaddress;

    @FXML
    void back(ActionEvent event) {
    	System.out.println("�ڷΰ��� ��ư�� �������ϴ�.");
    	Login.instance.loadpage("/view/login/loginpane.fxml");
    }

    @FXML
    void signup(ActionEvent event) {
    	// * ��Ʈ�ѿ� �Էµ� ������ ��������
    	String id = txtid.getText();
    	String password = txtpassword.getText();
    	String passwordconfirm = txtpasswordconfirm.getText();
    	String email = txtemail.getText();
    	String address = txtaddress.getText();
    	
    	//���糯¥ �������� [ SimpleDateFormat : ��¥ ���(����) ��ȯ Ŭ���� ]
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    	String cine = format.format( new Date() );
    	
    	// * ��ȿ�� �˻�
    		//1. id �ߺ� üũ
    		boolean result2 = MemberDao.memberDao.idcheck(id);
    		if(result2) {
    			lblconfirm.setText("������� ���̵�");
    			return;
    		}
    		//2. id ���� üũ
    		if(id.length() < 4 || id.length() > 10) {
    			lblconfirm.setText("���̵�� 5 ~ 9 �����Դϴ�");
    			return;
    		}
    		//3. ��й�ȣ üũ
    		if(password.length() < 4 || password.length() > 10) {
    			lblconfirm.setText("��й�ȣ�� 5 ~ 9 �����Դϴ�");
    			return;
    		}
    		//4. ��й�ȣ ��ġ üũ
    		if(!password.equals(passwordconfirm)) {// �н������ �н�����Ȯ���̶� ��ġ���� ������
    			lblconfirm.setText("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
    			return; // �޼ҵ� ����
    		}
    		//3. �̸��� üũ
    		// indexOf(����) // �����̾����� -1 ��ȯ ������ �ε��� ��ȯ
    		if( email.indexOf("@") == -1) {
    			lblconfirm.setText("�ùٸ� �̸����� �ƴմϴ�.");
    			return; // �޼ҵ� ����
    		}
    		//4. �ּ� üũ
    		if( !address.contains("��") && address.contains("��")&& address.contains("��")) {
    			lblconfirm.setText("�ùٸ� �ּҰ� �ƴմϴ�.");
    			return; // �޼ҵ� ����
    		}
    	// * ��� ��ȿ���� ����� DB�� ����
    		//1. ��üȭ [ ȸ����ȣ ����, ���̵�, ��й�ȣ, �̸���, �ּ�, ����Ʈ, cine]
    		Member member = new Member(0, id, password, email, address, 0, cine);
    		//2. DB ��ü�� �޼ҵ� ȣ��
    		boolean result = MemberDao.memberDao.signup(member);
    		//3. Ȯ��
    		if(result) {
    			// 1. �޽���â ��� [ Alert : �޼���(�˶�) Ŭ���� ]
    			Alert alert = new Alert( AlertType.INFORMATION);
    			alert.setTitle("�˸�");
    			alert.setHeaderText("�Ȼ�� �߰�ŷ��� ������ �����մϴ�");
    			alert.setContentText("ȸ������ ����");
    			alert.showAndWait();
    			// 2. ȭ����ȭ [�α��������� ��ȯ]
    			Login.instance.loadpage("/view/login/loginpane.fxml");
    		}else {
    			lblconfirm.setText("����] DB���� [ �����ڿ��� ���� ]");
    			System.out.println("���Խ���");
    		}
    }

}







