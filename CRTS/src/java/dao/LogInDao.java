package dao;

import org.springframework.ui.Model;

public interface LogInDao {

    public String NextPage(String name, String password,Model model);
}
