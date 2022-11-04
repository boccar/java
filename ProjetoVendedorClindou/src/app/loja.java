package app;
import java.util.ArrayList;
import java.util.Scanner;

public class loja {
	private ArrayList<item> bd;
	Scanner sc = new Scanner(System.in);
	item i = new item();

	public loja() {
		bd = new ArrayList<item>();
	}

	public ArrayList<item> getBd() {
		return bd;
	}

	public void setBd(ArrayList<item> bd) {
		this.bd = bd;
	}

	@Override
	public String toString() {
		return "loja [Itens=" + bd + "]";
	}

	public void cadastrarItem() {
		System.out.println("Nome do item: ");
		
		i.setNomeItem(sc.next());
		System.out.println("Tamanho do item: ");
		sc.nextLine();
		i.setEspaco(sc.nextInt());
		System.out.println("Preoc do item: ");
		sc.nextLine();
		i.setPreco(sc.nextInt());
	}
	
	public void adicionarProduto(item i1) {
		this.bd.add(i1);
	}

	
	public void verTodos() {
		for (int i = 0; i < bd.size(); i++) {
			
			System.out.println("Itens: " + this.toString());
		}
	}

	public void vender() {
		System.out.println("Estes são os itens à venda: ");
		System.out.println(bd);
	}

}
