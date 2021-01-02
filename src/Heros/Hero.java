package Heros;
import Items.*;
public class Hero {
	int HP,DEF,STA,ATK,SPD,VIT,EXP;
	Item[][] item= {
			{},// silah,
			{},// zýrh,
			{},// çizme
			{null, null, null} // potlar max 3 pot olmalý
	};
	//VIT= maxHp
	//DEF= Direnc
	//STA= Dayanýklýlýk-->kullanabileceði yetenekleri sýnýrlandýrýr
	//ATK= atak
	//SPD= koþma hýzý
	//HP= anlýk can
	//EXP= tecrübe puaný
	public Hero(int HP, int DEF, int STA, int ATK, int SPD, int VIT, int EXP)
	{
		this.HP=HP;
		this.DEF=DEF;
		this.STA=STA;
		this.ATK=ATK;
		this.SPD=SPD;
		this.VIT=VIT;
		this.EXP=EXP;
	}
	
	public Hero(){
		System.out.println("Hero oluþturuldu.");
	}
	
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public int getDEF() {
		return DEF;
	}
	public void setDEF(int dEF) {
		DEF = dEF;
	}
	public int getSTA() {
		return STA;
	}
	public void setSTA(int sTA) {
		STA = sTA;
	}
	public int getATK() {
		return ATK;
	}
	public void setATK(int aTK) {
		ATK = aTK;
	}
	public int getSPD() {
		return SPD;
	}
	public void setSPD(int sPD) {
		SPD = sPD;
	}
	public int getVIT() {
		return VIT;
	}
	public void setVIT(int vIT) {
		VIT = vIT;
	}
	public int getEXP() {
		return EXP;
	}
	public void setEXP(int eXP) {
		EXP = eXP;
	}
	
	public int DMG(int atk, int def) 
	{
		if(atk-(def*0.8)<0 || atk-(def*0.8)==0 )
		{
			return 3;
		}else {
			return (int)(atk-(def*0.8));
		}	
	}
	public void AttackFromAtoB(Hero A, Hero B)
	{
		B.HP-=DMG(A.ATK, B.DEF);
	}
	public int IsDead(Hero A) {
		if(A.HP==0) 
		{
			return 1;
		}else if(A.HP<0){
			A.VIT-=3;
			return 1;
		}else {
			return 0;
		}
	}


}
