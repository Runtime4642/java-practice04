package prob05;

public class MyBase extends Base {
	
	@Override
	public void service(String state) {
		// TODO Auto-generated method stub
		  if(state.equals("낮")) {
		      super.day();
		   } else if(state.equals("밤")){
		      super.night();	
	           }
		   else
			   System.out.println("오후도 낮과 마찬가지로 일해야 됩니다.");
	}

}