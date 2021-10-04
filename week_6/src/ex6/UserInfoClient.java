//package ex6;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//
//public class UserInfoClient {
//
//    public static void main(String[] args) throws IOException {
//
//
//        UserInfo userInfo = new UserInfo();
//        userInfo.setUserId("12345");
//        userInfo.setPasswd("!@#$%");
//        userInfo.setUserName("이순신");
//
//
//        UserInfoDao userInfoDao = null;
//
//        if(dbType.equals("ORACLE")){
//            userInfoDao = new OracleDao();
//        }
//        else{
//            System.out.println("db support error");
//            return;
//        }
//
//        userInfoDao.insertUserInfo(userInfo);
//        userInfoDao.updateUserInfo(userInfo);
//        userInfoDao.deleteUserInf(userInfo);
//    }
//}