package order.Service;

import order.Dao.BuyTicket;
import order.Dao.CreateTrain;
import order.Dao.WorkDao;
import order.Do.Node;
import order.Do.Train;
import order.Do.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.logging.SimpleFormatter;

public class WorkDaoService implements WorkDao, BuyTicket, CreateTrain {

    public User[] data = new User[10];

    @Override
    public int login(User user) {
        for (User user1:data){
            if (user.getName().equals(user1.getName())&&user.getPassword().equals(user1.getPassword())){
                System.out.println(user1.toString());
                System.out.println("登录成功");
                return user1.getId();
            }else if (user.getName().equals(user1.getName())&&!user.getPassword().equals(user1.getPassword())){
                System.out.println("密码输入错误");
                return -1;
            }
        }

        System.out.println("用户不存在");
        return 0;
    }

    @Override
    public User sign(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的姓名：");
        String name = scanner.nextLine();
        System.out.print("请输入你的电话号码：");
        String phone = scanner.nextLine();
        System.out.print("请输入你的密码：");
        String password1 = scanner.nextLine();
        System.out.print("请确认你的密码：");
        String password2 = scanner.nextLine();
        if (checkPhone(phone)&&checkPassword(password1,password2)){
            user.setName(name);
            user.setPassword(password1);
            user.setPhone(phone);
            System.out.println("注册成功");
            data[user.getId()-1] = user;
        }else {
            return null;
        }
        return null;
    }

    @Override
    public void searchUserInfo(int id) {
        for (User user: data){
          if (user.getId()==id){
              System.out.println(user);
              return;
          }
        }
        System.out.println("没有找到该用户");
        return;
    }

    //核验密码
    boolean checkPassword(String first,String second){
        if(first.length()<6){
            System.out.println("密码不符合规定");
            return false;
        }

        if (first.equals(second)){
            return true;
        }else {
            System.out.println("两次密码输入不一致");
            return false;
        }
    }

    //核验电话号码
    boolean checkPhone(String phone){
        if (phone.length()!=11){
            System.out.println("电话号码不正确");
            return false;
        }else {
            return true;
        }

    }

    @Override
    public int buyTicket(String name, String sfz, String phone) {
        return 0;
    }

    @Override
    public int buyBaoXian(String name, String sfz, String phone) {
        return 0;
    }

    @Override
    public int buyTicket(User user) {
        return 0;
    }

    @Override
    public int buyBaoXian(User user) {
        return 0;
    }

    @Override
    public Train[] createTrains() {

        Train train1 = new Train("G2210","和谐号",new Date(),new Date(),new Node("111"),500);

        return new Train[0];
    }

    public static void main(String[] args) throws ParseException {

        SimpleFormatter formatter = new SimpleFormatter();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String startTime = "2023-5-01";

        String endTime = "2023-5-02";

        Date start = simpleDateFormat.parse(startTime);

        Date end = simpleDateFormat.parse(endTime);

        System.out.println(simpleDateFormat.format(start));

        System.out.println(simpleDateFormat.format(end));

    }
}
