package com.ithama.run;

import com.ithama.bean.Business;
import com.ithama.bean.Customer;
import com.ithama.bean.Movie;
import com.ithama.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MovieSystem {

    public static final List<User> ALL_USERS =new ArrayList<>();

    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    public static Map<Business, List<Movie>> ALL_MOVIE = new HashMap<>();
    public static final Logger LOGGER = LoggerFactory.getLogger("MovieSystem.class");
    static {
        Customer c =  new Customer();
        c.setLoginName("a");
        c.setPassWord("a");
        c.setUserName("Customer_ken");
        c.setSex('M');
        c.setMoney(10000);
        c.setPhone("123456");
        ALL_USERS.add(c);

        Customer c1 =  new Customer();
        c1.setLoginName("gzl888");
        c1.setPassWord("123456");
        c1.setUserName("Customer_c1");
        c1.setSex('F');
        c1.setMoney(0);
        c1.setPhone("9876543");
        ALL_USERS.add(c1);



        Business b =  new Business();
        b.setLoginName("admin");
        b.setPassWord("admin");
        b.setUserName("Business_b");
        b.setSex('M');
        b.setMoney(0);
        b.setPhone("9876543");
        b.setAddress("tsz wan A");
        b.setShopName("shop A");
        List<Movie> movies =new ArrayList<>();
        String stime="2011/11/11 11:11:11";
        try {
            movies.add(new Movie("1","1",1,1,1,sdf.parse(stime)));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        ALL_USERS.add(b);
        ALL_MOVIE.put(b,movies);

        Business b1 =  new Business();
        b1.setLoginName("baozugong888");
        b1.setPassWord("123456");
        b1.setUserName("Business_b1");
        b1.setSex('F');
        b1.setMoney(0);
        b1.setPhone("9876543");
        b1.setAddress("tsz wan B");
        b1.setShopName("shop B");
        List<Movie> movies2 =new ArrayList<>();
        try {
            movies2.add(new Movie("2","2",2,2,2,sdf.parse(stime)));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        ALL_USERS.add(b1);

        ALL_MOVIE.put(b1,movies2);




    }
    public  static  User loginUser;
    public  static final Scanner SYS_SC=new Scanner(System.in);
    public static void main(String[] args) {

        showMain();




    }

    private static void showMain() {
        System.out.println("================Movie Main Page ================");
        System.out.println("1. Login");
        System.out.println("2.Customer Register");
        System.out.println("3.Business Register");
        System.out.println("Please input command");
        String command =SYS_SC.nextLine();

        while (true) {
            switch (command){
                case "1":
                    login();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("error please confine again");
            }
        }

    }

    private static void login() {
        while (true) {
            System.out.println("请您输入登录名称：");
            String loginName = SYS_SC.nextLine();
            System.out.println("请您输入登录密码：");
            String passWord = SYS_SC.nextLine();

            // 1、根据登录名称查询用户对象。
            User u = getUserByLoginName(loginName);
            // 2、判断用户对象是否存在，存在说明登录名称正确了
            if(u != null){
                // 3、比对密码是否正确
                if(u.getPassWord().equals(passWord)){
                    // 登录成功了：...
                    loginUser = u; // 记住登录成功的用户
                    LOGGER.info(u.getUserName() +"登录了系统~~~");
                    // 判断是用户登录的，还是商家登录的。
                    if(u instanceof Customer) {
                        // 当前登录的是普通用户
                        showCustomerMain();

                    }else {
                        // 当前登录的肯定是商家用户
                        showBusinessMain();


                    }
                    return;
                }else {
                    System.out.println("密码有毛病~~");
                }
            }else {
                System.out.println("登录名称错误，请确认");
            }
        }

    }

    private static void showCustomerMain() {
        while (true) {
            System.out.println("============黑马电影客户界面===================");
            System.out.println(loginUser.getUserName() + (loginUser.getSex()=='男'? "先生":"女士" + "欢迎您进入系统" +
                    "\t余额：" + loginUser.getMoney()));
            System.out.println("请您选择要操作的功能：");
            System.out.println("1、展示全部影片信息功能:");
            System.out.println("2、根据电影名称查询电影信息:");
            System.out.println("3、评分功能:");
            System.out.println("4、购票功能:");
            System.out.println("5、退出系统:");
            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    // 展示全部排片信息
                    showAllMovies();
                    break;
                case "2":
                    break;
                case "3":
                    // 评分功能
//                    scoreMovie();
//                    showAllMovies();
                    break;
                case "4":
                    // 购票功能
                    buyMovie();
                    break;
                case "5":
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }

    }

    private static void buyMovie() {
        showAllMovies();
        System.out.println("enter shop name");
        String shopName=SYS_SC.nextLine();
        System.out.println("enter movie name");
        String movieName=SYS_SC.nextLine();

         Business business =getShopByName(shopName);
         if(business!=null){
             List<Movie> movies= ALL_MOVIE.get(business);
             for (Movie movie : movies) {
                 if(movie.getName().equals(movieName)){
                     if(movie.getNumber()>0){
                         System.out.println("how many ticket you want to buy");
                         String ticketNumber =SYS_SC.nextLine();
                         int ticketNumbers=Integer.valueOf(ticketNumber);
                         if (movie.getNumber()>= ticketNumbers){
                             double money = movie.getPrice()*ticketNumbers;
                             if (loginUser.getMoney()>money){
                                 loginUser.setMoney(loginUser.getMoney()-money);
                                 business.setMoney(business.getMoney()+money);
                                 movie.setNumber(movie.getNumber()-ticketNumbers);

                                 System.out.println("ok");
                                    return;
                             }else System.out.println(" money not eunght");return;
                         }else System.out.println("ticket not eunght");return;

                     }else System.out.println("ticket not eunght");return;

                 }

             }
         }

    }

    private static Business getShopByName(String shopName) {
      Set<Business> businesses= ALL_MOVIE.keySet();
        for (Business business : businesses) {
            if (business.getShopName().equals(shopName)){
                return business;
            }else {

            }
        }return null;
    }

    private static void scoreMovie() {

    }

    private static void showAllMovies() {
        System.out.println("=============展示全部商家排片信息=================");
        ALL_MOVIE.forEach((business, movies) -> {
            System.out.println(business.getShopName() + "\t\t电话：" + business.getPhone() + "\t\t地址:" + business.getAddress());
            System.out.println("\t\t\t片名\t\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println("\t\t\t" + movie.getName()+"\t\t\t" + movie.getActor()+ "\t\t" + movie.getTime()
                        + "\t\t" + movie.getScore() + "\t\t" + movie.getPrice() + "\t\t" + movie.getNumber() + "\t\t"
                        +   sdf.format(movie.getStarTime()));
            }
        });
    }

    private static void showBusinessMain() {
        while (true) {
            System.out.println("============黑马电影商家界面===================");
            System.out.println(loginUser.getUserName() + (loginUser.getSex()=='男'? "先生":"女士" + "欢迎您进入系统"));
            System.out.println("1、展示详情:");
            System.out.println("2、上架电影:");
            System.out.println("3、下架电影:");
            System.out.println("4、修改电影:");
            System.out.println("5、退出:");

            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    // 展示全部排片信息
                    showBusinessInfos();
                    break;
                case "2":
                    // 上架电影信息
                    addMovie();
                    break;
                case "3":
                    // 下架电影信息
                    deleteMovie();
                    break;
                case "4":
                    // 修改电影信息
                    updateMovie();
                    break;
                case "5":
                    System.out.println(loginUser.getUserName() +"请您下次再来啊~~~");
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    private static void updateMovie() {
        Business business = (Business) loginUser;
        List<Movie> movies =ALL_MOVIE.get(business);
        if (movies.size()==0){
            System.out.println("you don't have movie");
        }

        while (true) {
            showBusinessInfos();
            System.out.println("input movie to update ");
            String movieName=SYS_SC.nextLine();

            Movie movie=getMovieByName(movieName);
            if(movie!=null){
                String newMovieName =SYS_SC.nextLine();
                movie.setName(newMovieName);
                System.out.println("movie name updated ");
                return;
            }else {
                System.out.println(movieName+"not found ");
            }
        }
    }

    private static Movie getMovieByName(String movieName) {
        List<Movie> movies =ALL_MOVIE.get(loginUser);

        for (Movie movie : movies) {
            if (movie.getName().equals(movieName)){
                return movie;
            }
        }
        return null;

    }

    private static void deleteMovie() {
        Business business = (Business) loginUser;
        List<Movie> movies =ALL_MOVIE.get(business);
        if(movies.size()==0){
            System.out.println("you don't have movie");
        }

        while (true) {
            showBusinessInfos();
            System.out.println("please input movie name to delete ");
            String delMovieName = SYS_SC.nextLine();

            for (Movie movie : movies) {
                if(movie.getName().equals(delMovieName)){
                    movies.remove(movie);
                    System.out.println("ok");
                    return;
                }
            }
            System.out.println("movie not found ");
        }


    }

    private static void addMovie() {
//        public static final List<User> ALL_USERS =new ArrayList<>();
//
//        public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        public static Map<Business, List<Movie>> ALL_MOVIE = new HashMap<>();
//        public static final Logger LOGGER = LoggerFactory.getLogger("MovieSystem.class");
//
//        public  static  User loginUser;
//        public  static final Scanner SYS_SC=new Scanner(System.in);
//
        System.out.println("================上架电影====================");
        // 根据商家对象(就是登录的用户loginUser)，作为Map集合的键 提取对应的值就是其排片信息 ：Map<Business , List<Movie>> ALL_MOVIES
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIE.get(business);

        System.out.println("请您输入新片名：");
        String name  = SYS_SC.nextLine();
        System.out.println("请您输入主演：");
        String actor  = SYS_SC.nextLine();
        System.out.println("请您输入时长：");
        String time  = SYS_SC.nextLine();
        System.out.println("请您输入票价：");
        String price  = SYS_SC.nextLine();
        System.out.println("请您输入票数：");
        String totalNumber  = SYS_SC.nextLine(); // 200\n
        while (true) {
            try {
                System.out.println("请您输入影片放映时间：");
                String stime  = SYS_SC.nextLine();
                // public Movie(String name, String actor, double time, double price, int number, Date startTime)        // 封装成电影对象 ，加入集合movices中去
                Movie movie = new Movie(name, actor ,Double.valueOf(time) , Double.valueOf(price)
                        , Integer.valueOf(totalNumber) ,  sdf.parse(stime));
                movies.add(movie);
                System.out.println("您已经成功上架了：《" + movie.getName() + "》");
                return; // 直接退出去
            } catch (ParseException e) {
                e.printStackTrace();
                LOGGER.error("时间解析出了毛病");
            }
        }


    }

    private static void showBusinessInfos() {
        System.out.println("================商家详情界面=================");
        LOGGER.info(loginUser.getUserName() +"商家，正在看自己的详情~~~");
        // 根据商家对象(就是登录的用户loginUser)，作为Map集合的键 提取对应的值就是其排片信息 ：Map<Business , List<Movie>> ALL_MOVIES
        Business business = (Business) loginUser;
        System.out.println(business.getShopName() + "\t\t电话：" + business.getPhone()
                + "\t\t地址:" + business.getAddress() + "\t\t余额：" + business.getMoney());
        List<Movie> movies = ALL_MOVIE.get(business);
        if(movies.size() > 0) {
            System.out.println("片名\t\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\t\t放映时间");
            for (Movie movie : movies) {

                System.out.println(movie.getName()+"\t\t\t" + movie.getActor()+ "\t\t" + movie.getTime()
                        + "\t\t" + movie.getScore() + "\t\t" + movie.getPrice() + "\t\t" + movie.getNumber() + "\t\t"
                        +   sdf.format(movie.getStarTime()));
            }
        }else {
            System.out.println("您的店铺当前无片在放映~~~~");
        }
    }

    private static void showCustomerMian() {
        while (true) {
            System.out.println("============黑马电影客户界面===================");
            System.out.println(loginUser.getUserName() + (loginUser.getSex()=='男'? "先生":"女士" + "欢迎您进入系统" +
                    "\t余额：" + loginUser.getMoney()));
            System.out.println("请您选择要操作的功能：");
            System.out.println("1、展示全部影片信息功能:");
            System.out.println("2、根据电影名称查询电影信息:");
            System.out.println("3、评分功能:");
            System.out.println("4、购票功能:");
            System.out.println("5、退出系统:");
            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    // 展示全部排片信息
//                    showAllMovies();
                    break;
                case "2":
                    break;
                case "3":
                    // 评分功能
//                    scoreMovie();
//                    showAllMovies();
                    break;
                case "4":
                    // 购票功能
                    buyMovie();
                    break;
                case "5":
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }


    public static User getUserByLoginName(String loginName  ){
        for (User user : ALL_USERS) {
            // 判断这个用户的登录名称是否是我们想要的
            if(user.getLoginName().equals(loginName)){
                return user;
            }
        }
        return null; // 查询此用户登录名称
    }

}
