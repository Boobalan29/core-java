package comhttpmethods.http;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")

public class HttpController {

	@GetMapping("/one")
	public String message() {
		return "hi this sample";
	}
	
    @PostMapping("/two")
	String message1()
	{
		return "Set the details";
	}
    
    @PostMapping()
	String message2()
	{
		return "Set ";
	}
    
    @GetMapping()
	public String message3() {
		return " sample";
	}
	
    @DeleteMapping()
    String msg4()
    {
    	return "delete";
    }
	
	
    
	
}