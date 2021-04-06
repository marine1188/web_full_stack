/*

 Trans 인터페이스로 구행 <----- 부모는 모든 자손에게 상속핳 수 있는 최소한의 것 
 	추상 메소드 : start () / stop ()

 public String name(){
 	return " 기차" 
 }
 sub class : Subway /Bus/Biclycle/Plain
 
 
 */
package quiz02;

public class MianEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trans [] tt = new Trans[4];
		tt[0] = new Trans();
		tt[1] = new Trans();
		tt[2] = new Trans();
		tt[3] = new Trans();
		String[]name = {"지하철","버스","자전거","비행기"};
		for (int i = 0; i < tt.length; i++) {
			tt[i].start(name[i]);
			tt[i].stop(name[i]);
		}
	
	}

}
