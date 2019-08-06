package com.principal;

public class OuterClass {
	
	private String outerClassProperty;
	
	
	 class InnerClass {
		private String innerClassProperty;

		public String getInnerClassProperty() {
			return innerClassProperty;
		}

		public void setInnerClassProperty(String innerClassProperty) {
			this.innerClassProperty = innerClassProperty;
		}

	}


	public String getOuterClassProperty() {
		return outerClassProperty;
	}


	public void setOuterClassProperty(String outerClassProperty) {
		this.outerClassProperty = outerClassProperty;
	}
	 
	 

}
