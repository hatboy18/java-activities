package app;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entidades.Pedido;
import entidades.Produto;
import entidades.ProdutoPedido;
import entidades.User;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        
        System.out.println("Digite seu email:");
        String email = sc.nextLine();
        
        System.out.println("Digite sua data de nascimento dd/MM/yyyy:");
        LocalDate nasc = LocalDate.parse(sc.next(), fmt);
        
        User usuario = new User(nome, email, nasc);
        System.out.println("Status:");
        String status = sc.next();
        Pedido total = new Pedido(LocalDateTime.now(), status, usuario);
        System.out.println("Digite a quantidade produtos que deseja comprar:");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++){
            System.out.println("Digite o nome do produto #" + i);
            String nomeP = sc.next();
            System.out.println("Digite o valor do produto #" + i);
            Double preco = sc.nextDouble();
            System.out.println("Digite a quantidade: ");
            int quantidade = sc.nextInt();
            
            Produto product = new Produto(nomeP, preco);
            ProdutoPedido p = new ProdutoPedido(quantidade, preco, product);
            total.AddItem(p);
        }
        
        System.out.println(total);
        
        sc.close();
        
    }
    
}
