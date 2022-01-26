package net.codejava.ws;

import java.util.Objects;

public class STUDENT
{
	 	private int id;
	    private String sname;
	    private String sdob;
	    private String sdoj;
	    public STUDENT()
	    {
	    }
		public STUDENT(int id) {
			this.id = id;
			// TODO Auto-generated constructor stub
		}
		public STUDENT(int id,String sname ,String sdob,String sdoj) {
			super();
			this.id = id;
			this.sname=sname;
			this.sdob=sdob;
			this.sdoj=sdoj;
		}
			
		public int getid() {
			return id;
		}
		public void setid(int id) {
			this.id = id;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getSdob() {
			return sdob;
		}
		public void setSdob(String sdob) {
			this.sdob = sdob;
		}
		public String getSdoj() {
			return sdoj;
		}
		public void setSdoj(String sdoj) {
			this.sdoj = sdoj;
		}
		@Override
		public int hashCode() {
			 final int prime = 31;
		        int result = 1;
		        result = prime * result + id;
		        return result;	
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			STUDENT other = (STUDENT) obj;
			return id == other.id;
		}
	 
	    
	}

