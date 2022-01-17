package br.com.example.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.example.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Fire TV Stick com Controle Remoto");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/51degAt5CFL._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Fire-TV-Stick-Streaming/dp/B08C1K6LB2");
		pedido.setDescricao("Uma descrição qualquer para esse pedido");
		
		List<Pedido> pedidos = Arrays.asList(pedido);		
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
