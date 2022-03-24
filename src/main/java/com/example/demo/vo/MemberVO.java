package com.example.demo.vo;

public class MemberVO {

		private String id,pw,pwd, name, email;
		
		

		public MemberVO() {
		}

		public MemberVO(String id, String pw, String pwd, String name, String email) {
		
			setId(id);
			setPw(pw);
			setPwd(pwd);
			setName(name);
			setEmail(email);
		}

		
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getPw() {
			return pw;
		}

		public void setPw(String pw) {
			this.pw = pw;
		}

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		@Override
		public String toString() {
			return "MemberVO [id=" + id + ", pw=" + pw + ", pwd=" + pwd + ", name=" + name + ", email=" + email + "]";
		}
}
