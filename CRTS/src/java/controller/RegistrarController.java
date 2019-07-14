package controller;

import entity.case_file;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import service.ProsecutorService;
import service.RegistrarService;

@Controller
@SessionAttributes({"name","id"})
@RequestMapping("/registrar")
public class RegistrarController {
    
    @Autowired
    private RegistrarService registrarService;
    
    @RequestMapping("page")
    public String page()
    {
        return "registrar";
    }
    
    @RequestMapping("/registrarprofile")
    public String UserProfile()
    {
        return "redirect:/profile/page";
    }
    
    @RequestMapping("/listcasefile")
    public String ListCaseFiles(@ModelAttribute("id") int id, Model model)
    {
        List<case_file> theCaseFile = registrarService.listCaseFile(id);
        if(theCaseFile.isEmpty())
        {
        model.addAttribute("casefilemsg", "No UnApproved Case Files");    
        }
        else
        {
            model.addAttribute("casefile", theCaseFile);
        }
        return "registrar_case_file";
    }
    
    @RequestMapping("/approvecasefile")
    public String ApproveCaseFiles(int casefileid)
    {
        registrarService.ApproveCasefile(casefileid);
        return "redirect:/registrar/listcasefile";
    }
}
