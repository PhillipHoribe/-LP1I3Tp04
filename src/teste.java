
public class teste {
	public static void main(String[]args) { 
		Data data;
		data = new Data();
		System.out.println("dia: "+Data.retDia());
		System.out.println("mês: "+Data.retMes());
		System.out.println("ano: "+Data.retAno());
		System.out.println("data: "+Data.mostra1());
		//System.out.println("data: "+Data.mostra2());
		System.out.println("dias Transcorridos: "+Data.diasTranscorridos());
		//System.out.println("dias Transcorridos: "+Data.apresentaDataAtual());
	}
}
