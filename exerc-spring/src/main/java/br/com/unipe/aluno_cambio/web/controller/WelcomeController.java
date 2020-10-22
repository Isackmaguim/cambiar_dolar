package br.com.unipe.aluno_cambio.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.unipe.aluno_cambio.model.Conversor;

@Controller
public class WelcomeController {
	
	
	
	@RequestMapping(value = "/teste", method = RequestMethod.GET)
	public String welcome(){
		return "welcome";
	}
	
	@RequestMapping(value = "/formulario", method = RequestMethod.GET)
	public ModelAndView formulario(Model model){
		model.addAttribute("conversor", new Conversor());
		return new ModelAndView("formulario");
	}
	
	
	@RequestMapping(value = "/formulario", method = RequestMethod.POST)
	public ModelAndView exibereal(@ModelAttribute Conversor conversor){
		double resultado = conversor.getReal()  / conversor.getDolar();
		
		ModelAndView view = new ModelAndView("formulario");
		
		view.addObject("mensagem", " Convertendo R$ " + conversor.getReal() + " em dolar: $ " + (resultado));
		return view;
	}

}
