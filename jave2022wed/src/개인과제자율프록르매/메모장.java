package ���ΰ����������ϸ���;

public class �޸��� extends ȸ��{
	//�ʵ�
	private String content;
	private boolean �ϷῩ��;
	//������
	public �޸���(String content, boolean �ϷῩ��, String id, String pw, String name) {
		super(id, pw, name);
		this.content = content;
		this.�ϷῩ�� = �ϷῩ��;
	}
	//�޼ҵ�
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean is�ϷῩ��() {
		return �ϷῩ��;
	}
	public void set�ϷῩ��(boolean �ϷῩ��) {
		this.�ϷῩ�� = �ϷῩ��;
	}

	
	
}
