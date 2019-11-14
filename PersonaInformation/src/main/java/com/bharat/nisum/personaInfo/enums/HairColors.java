package com.bharat.nisum.personaInfo.enums;

public enum HairColors {
	
	  red("red"),
	  black("black"),
	  yellow("yellow"),
	  brown("brown"),
	  white("white");
	  
	  private final String name;       

	    private HairColors(String s) {
	        name = s;
	    }

		public String getName() {
			return name;
		}

		@Override
	    public String toString() {
	        return name;
	    }
}
