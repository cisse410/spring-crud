package sn.cisse410.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.validation.Valid;
import sn.cisse410.model.Customer;
import sn.cisse410.service.CustomerService;

@Controller
public class HomeController {

    private final CustomerService customerService;

    public HomeController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/")
    public String home(@RequestParam(defaultValue = "") String name, Model model) {
        List<Customer> customers = customerService.getAllCustomers();
        model.addAttribute("customers", customers);
        return "home";
    }

    @GetMapping("/create")
    public String create(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "create";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute Customer customer, RedirectAttributes redirectAttributes,
            BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "create";
        }
        customerService.saveCustomer(customer);
        redirectAttributes.addFlashAttribute("message", "Client ajouté avec success!");
        return "redirect:/";
    }

    @GetMapping("/customer/{id}")
    public String show(@PathVariable Long id, Model model) {
        customerService.getCustomerById(id).ifPresent(customer -> model.addAttribute("customer", customer));
        return "show";
    }

    @GetMapping("/customer/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        Customer customer = customerService.getCustomerById(id).orElse(null);
        model.addAttribute("customer", customer);
        return "create";
    }

    @GetMapping("/customer/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        customerService.deleteCustomer(id);
        redirectAttributes.addFlashAttribute("message", "Client supprimé avec success!");
        return "redirect:/";
    }
}
