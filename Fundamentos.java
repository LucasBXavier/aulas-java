package fundamentos;

public class Fundamentos {

	public static void main(String[] args) {
		String nome = "Lucas Boareto";
		int idade = 20;
		char sexo = 'M';
		double temperatura = 26.7;
		boolean arCondicionado = false;
		System.out.println("Uso de variaveis na linguagem Java");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Temperatura: " + temperatura);
		System.out.println("Ar Condionado: " + arCondicionado);
		System.out.println("__________________________________");
		System.out.println("");
		double i = 10;
		System.out.println("Operadores Aritimeticos e atribuições");
		System.out.println("Exemplos: ");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5));
		System.out.println("i = " + i + " * 5 | i = " + (i * 5));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5));
		System.out.println("i += 5       | =" + (i += 5));
		System.out.println("i -= 5       | =" + (i -= 5));
		System.out.println("i *= 5       | =" + (i *= 5));
		System.out.println("i /= 5       | =" + (i /= 5));
		i++;
		System.out.println("i++          | i = " + i);
		System.out.println("i--          | i = " + i);
		System.out.println("__________________________________");
		System.out.println("");
		System.out.println("Estruturas de controle");
		System.out.println("");
		System.out.println("Estruturas de controle condicional");
		System.out.println("Exemplo 1 - uso do if");
		if (sexo == 'M') {
			System.out.println("Alistamento militar obrigatorio");
		};
		System.out.println("");
		System.out.println("Exemplo 2 - if else");
		if (idade < 18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
		System.out.println("");
		System.out.println("Exemplo 3 - if/ else if/ else");
		if (idade < 16){
			System.out.println("Proibido votar");
			
		}else if (idade >= 18 && idade <= 70){
			System.out.println("Voto obrigatorio");
			
		}else if (idade == 16 || idade == 17 || idade > 70){
			System.out.println("Voto facultativo");
			
		}
		System.out.println("");
		System.out.println("Exemplo 4 - uso switch case");
		System.out.println("1. cadastro de clientes");
		System.out.println("2. cadastro de usuarios");
		System.out.println("3. relatorios");
		System.out.println("");
		int opcao = 1;
		switch (opcao) {
		case 1:
			System.out.println("Clientes");
			break;
		
		case 2:
			System.out.println("Usuarios");
			break;
			
		default:
			System.out.println("Opção invalida");
			break;
		}
		System.out.println("");
		System.out.println("Estruturas de repetição");
		System.out.println("");
		System.out.println("Exemplo 5 - uso for");
		for  (int j = 10; j >0; j--){
			System.out.println("hello");
		}
		System.out.println("");
		System.out.println("exemplo 6 - Tabuada");
		for (int tabuada = 1; tabuada <= 10; tabuada ++) {
			System.out.println("");
			for (int valor = 1; valor <= 10; valor++) {
				System.out.println(tabuada + " x " + valor + " = " + (tabuada * valor));
			}
		}
		System.out.println("");
		System.out.println("exemplo 7 - estrutua while");
		System.out.println("");
		int contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("");
		System.out.println("exemplo 8 - estrutua do while");
		System.out.println("");
		char novoJogo;
		do {
			System.out.println("Deseja jogar novamente? (s/n)");
			novoJogo = 'n';
		} while (novoJogo == 's');
			System.out.println("GAME OVER");


	}

}
