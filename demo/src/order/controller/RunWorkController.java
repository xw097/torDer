package order.controller;

import order.Do.User;
import order.Service.WorkDaoService;

import java.util.Scanner;

public class RunWorkController {

    WorkDaoService service = new WorkDaoService();

    public void Sign(){
        User user = new User(1);
        service.sign(user);
    }

    public void searchUserinfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你要搜索的用户id：");
        int id = scanner.nextInt();
        service.searchUserInfo(id);
    }

    public void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你要登录的用户昵称：");
        String name = scanner.nextLine();
        System.out.print("请输入用户密码：");
        String password = scanner.nextLine();
        User user = new User(0);
        user.setName(name);
        user.setPassword(password);
        service.login(user);
    }

    public static void main(String[] args) {
       RunWorkController controller = new RunWorkController();
       controller.Sign();
       controller.login();
    }
}
