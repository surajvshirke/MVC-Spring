/**
 * 
 */
package mypack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author suraj
 *
 *
 */
@Controller
@RequestMapping("/new_book")
public class BookNewController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView before()
	{
		Book defaultBook = new Book();
		defaultBook.setBookName("Enter Book Name");
		defaultBook.setPrice(0);
		return new ModelAndView("bookNew","mybook",defaultBook);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String afterSubmit(@ModelAttribute("mb")Book book)
	{
		System.out.println("inside after submiut\t"+book);
		return "success";
	}
	

}
