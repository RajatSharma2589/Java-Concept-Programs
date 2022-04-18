package javapgmnconcepts;

public class InterviewTrials {


		public static void main(String args[]){
		String s="ind1234rty";

		String number="";
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<s.length();i++){
		if(s.charAt(i)>='a' && s.charAt(i)<='z'){
		break;
		}else{
		sb.append(s.charAt(i));
		}
		}
		System.out.println(sb);
		}
		}
