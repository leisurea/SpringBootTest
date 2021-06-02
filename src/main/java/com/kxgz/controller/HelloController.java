package com.kxgz.controller;

import com.kxgz.api.UserLoginToken;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController//标注这是一个处理器
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @Value("${abc.name}")
    private String name;

    @UserLoginToken
    @GetMapping("hello")
    public String hello(){
        System.out.println("name = " + name);
        System.out.println("dataSource = " + dataSource);
        return "干爆鸡丁";
    }

    @PostMapping("/v1/game/category")
    public String category(){
        String source = "{\"statusCode\": \"01\",\n" +
                "\"data\": {\n" +
                "\t\"AG\": [{\n" +
                "\t\t\"cid\": \"1\",            \n" +
                "\t\t\"name\": \"老虎机\",       \n" +
                "\t\t\"en_name\": \"\",            \n" +
                "\t\t\"sec_category\": [{        \n" +
                "\t\t\t\"cid\": \"5\",       \n" +
                "\t\t\t\"name\": \"1-4线\",  \n" +
                "\t\t\t\"en_name\": \"\"     \n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"6\",\n" +
                "\t\t\t\"name\": \"5-14线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"7\",\n" +
                "\t\t\t\"name\": \"15-29线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"8\",\n" +
                "\t\t\t\"name\": \"30-60线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"9\",\n" +
                "\t\t\t\"name\": \"多线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"2\",\n" +
                "\t\t\"name\": \"街机游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"3\",\n" +
                "\t\t\"name\": \"水果机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"4\",\n" +
                "\t\t\"name\": \"桌面游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"10\",\n" +
                "\t\t\t\"name\": \"桌牌游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"11\",\n" +
                "\t\t\t\"name\": \"轮盘游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"77\",\n" +
                "\t\t\t\"name\": \"骰宝游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"78\",\n" +
                "\t\t\"name\": \"捕鱼机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}],\n" +
                "\t\"AP\": [{\n" +
                "\t\t\"cid\": \"166\",\n" +
                "\t\t\"name\": \"捕鱼机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}],\n" +
                "\t\"BBIN\": [{\n" +
                "\t\t\"cid\": \"71\",\n" +
                "\t\t\"name\": \"累积彩池\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"72\",\n" +
                "\t\t\"name\": \"桌面游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"73\",\n" +
                "\t\t\t\"name\": \"桌牌游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"74\",\n" +
                "\t\t\t\"name\": \"轮盘游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"75\",\n" +
                "\t\t\t\"name\": \"骰宝游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"76\",\n" +
                "\t\t\"name\": \"捕鱼机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}],\n" +
                "\t\"BNG\": [{\n" +
                "\t\t\"cid\": \"141\",\n" +
                "\t\t\"name\": \"老虎机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"142\",\n" +
                "\t\t\t\"name\": \"1-4线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"143\",\n" +
                "\t\t\t\"name\": \"5-14线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"144\",\n" +
                "\t\t\t\"name\": \"15-29线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"145\",\n" +
                "\t\t\t\"name\": \"30-60线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"146\",\n" +
                "\t\t\t\"name\": \"多线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}],\n" +
                "\t\"CQ9\": [{\n" +
                "\t\t\"cid\": \"16\",\n" +
                "\t\t\"name\": \"捕鱼机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"17\",\n" +
                "\t\t\"name\": \"老虎机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"19\",\n" +
                "\t\t\t\"name\": \"1-4线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"20\",\n" +
                "\t\t\t\"name\": \"5-14线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"21\",\n" +
                "\t\t\t\"name\": \"15-29线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"22\",\n" +
                "\t\t\t\"name\": \"30-60线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"23\",\n" +
                "\t\t\t\"name\": \"多线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"18\",\n" +
                "\t\t\"name\": \"街机游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"79\",\n" +
                "\t\t\"name\": \"累积彩池\\t\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}],\n" +
                "\t\"DT\": [{\n" +
                "\t\t\"cid\": \"153\",\n" +
                "\t\t\"name\": \"老虎机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"154\",\n" +
                "\t\t\t\"name\": \"1-4线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"155\",\n" +
                "\t\t\t\"name\": \"5-14线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"156\",\n" +
                "\t\t\t\"name\": \"15-29线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"157\",\n" +
                "\t\t\t\"name\": \"30-60线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"158\",\n" +
                "\t\t\t\"name\": \"多线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}],\n" +
                "\t\"FG\": [{\n" +
                "\t\t\"cid\": \"123\",\n" +
                "\t\t\"name\": \"老虎机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"127\",\n" +
                "\t\t\t\"name\": \"1-4线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"128\",\n" +
                "\t\t\t\"name\": \"5-14线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"129\",\n" +
                "\t\t\t\"name\": \"15-29线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"130\",\n" +
                "\t\t\t\"name\": \"30-60线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"131\",\n" +
                "\t\t\t\"name\": \"多线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"124\",\n" +
                "\t\t\"name\": \"捕猎游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"125\",\n" +
                "\t\t\"name\": \"棋牌游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"126\",\n" +
                "\t\t\"name\": \"街机游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}],\n" +
                "\t\"GA\": [{\n" +
                "\t\t\"cid\": \"171\",\n" +
                "\t\t\"name\": \"老虎机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"173\",\n" +
                "\t\t\t\"name\": \"15-29线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"174\",\n" +
                "\t\t\t\"name\": \"多线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"172\",\n" +
                "\t\t\"name\": \"其他游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}],\n" +
                "\t\"GNS\": [{\n" +
                "\t\t\"cid\": \"175\",\n" +
                "\t\t\"name\": \"老虎机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"177\",\n" +
                "\t\t\t\"name\": \"1-4线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"178\",\n" +
                "\t\t\t\"name\": \"5-14线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"179\",\n" +
                "\t\t\t\"name\": \"15-29线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"180\",\n" +
                "\t\t\t\"name\": \"30-60线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"181\",\n" +
                "\t\t\t\"name\": \"多线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"176\",\n" +
                "\t\t\"name\": \"其他游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"209\",\n" +
                "\t\t\"name\": \"捕鱼机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}],\n" +
                "\t\"GPI\": [{\n" +
                "\t\t\"cid\": \"100\",\n" +
                "\t\t\"name\": \"老虎机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"101\",\n" +
                "\t\t\t\"name\": \"1-4线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"102\",\n" +
                "\t\t\t\"name\": \"5-14线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"103\",\n" +
                "\t\t\t\"name\": \"15-29线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"104\",\n" +
                "\t\t\t\"name\": \"30-60线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"105\",\n" +
                "\t\t\t\"name\": \"多线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}],\n" +
                "\t\"GTI\": [{\n" +
                "\t\t\"cid\": \"162\",\n" +
                "\t\t\"name\": \"累积彩池\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}],\n" +
                "\t\"HB\": [{\n" +
                "\t\t\"cid\": \"63\",\n" +
                "\t\t\"name\": \"老虎机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"65\",\n" +
                "\t\t\t\"name\": \"15-29线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"66\",\n" +
                "\t\t\t\"name\": \"多线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"210\",\n" +
                "\t\t\t\"name\": \"1-4线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"211\",\n" +
                "\t\t\t\"name\": \"5-14线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"212\",\n" +
                "\t\t\t\"name\": \"30-60线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"64\",\n" +
                "\t\t\"name\": \"桌面游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"67\",\n" +
                "\t\t\t\"name\": \"视频扑克\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"68\",\n" +
                "\t\t\t\"name\": \"桌牌游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"69\",\n" +
                "\t\t\t\"name\": \"骰宝游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"70\",\n" +
                "\t\t\"name\": \"经典游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}],\n" +
                "\t\"ISB\": [{\n" +
                "\t\t\"cid\": \"190\",\n" +
                "\t\t\"name\": \"老虎机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"193\",\n" +
                "\t\t\t\"name\": \"1-4线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"194\",\n" +
                "\t\t\t\"name\": \"5-14线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"195\",\n" +
                "\t\t\t\"name\": \"15-29线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"196\",\n" +
                "\t\t\t\"name\": \"30-60线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"197\",\n" +
                "\t\t\t\"name\": \"多线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"191\",\n" +
                "\t\t\"name\": \"桌面游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"198\",\n" +
                "\t\t\t\"name\": \"视频扑克\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"199\",\n" +
                "\t\t\t\"name\": \"桌牌游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"200\",\n" +
                "\t\t\t\"name\": \"轮盘游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"192\",\n" +
                "\t\t\"name\": \"其他游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}],\n" +
                "\t\"JDB\": [{\n" +
                "\t\t\"cid\": \"46\",\n" +
                "\t\t\"name\": \"捕鱼机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"47\",\n" +
                "\t\t\"name\": \"老虎机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"49\",\n" +
                "\t\t\t\"name\": \"1-4线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"50\",\n" +
                "\t\t\t\"name\": \"5-14线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"51\",\n" +
                "\t\t\t\"name\": \"15-29线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"52\",\n" +
                "\t\t\t\"name\": \"30-60线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"53\",\n" +
                "\t\t\t\"name\": \"多线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"48\",\n" +
                "\t\t\"name\": \"街机游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"62\",\n" +
                "\t\t\"name\": \"电子彩票\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"170\",\n" +
                "\t\t\"name\": \"棋牌游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}],\n" +
                "\t\"MG\": [{\n" +
                "\t\t\"cid\": \"12\",\n" +
                "\t\t\"name\": \"老虎机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"24\",\n" +
                "\t\t\t\"name\": \"1-4线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"25\",\n" +
                "\t\t\t\"name\": \"5-14线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"26\",\n" +
                "\t\t\t\"name\": \"15-29线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"27\",\n" +
                "\t\t\t\"name\": \"30-60线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"29\",\n" +
                "\t\t\t\"name\": \"多线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"13\",\n" +
                "\t\t\"name\": \"桌面游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"30\",\n" +
                "\t\t\t\"name\": \"视频扑克\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"31\",\n" +
                "\t\t\t\"name\": \"轮盘游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"54\",\n" +
                "\t\t\t\"name\": \"宾果游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"55\",\n" +
                "\t\t\t\"name\": \"赛马游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"56\",\n" +
                "\t\t\t\"name\": \"桌牌游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"57\",\n" +
                "\t\t\t\"name\": \"骰宝游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"32\",\n" +
                "\t\t\"name\": \"累积彩池\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"58\",\n" +
                "\t\t\"name\": \"特色游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"59\",\n" +
                "\t\t\t\"name\": \"刮卡游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"60\",\n" +
                "\t\t\t\"name\": \"消除游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"61\",\n" +
                "\t\t\t\"name\": \"趣味游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}],\n" +
                "\t\"MT\": [{\n" +
                "\t\t\"cid\": \"119\",\n" +
                "\t\t\"name\": \"捕鱼机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"120\",\n" +
                "\t\t\"name\": \"多人游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"121\",\n" +
                "\t\t\"name\": \"棋牌对战\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"122\",\n" +
                "\t\t\"name\": \"街机游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}],\n" +
                "\t\"MW\": [{\n" +
                "\t\t\"cid\": \"14\",\n" +
                "\t\t\"name\": \"捕鱼机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"15\",\n" +
                "\t\t\"name\": \"棋牌扑克\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}],\n" +
                "\t\"PG\": [{\n" +
                "\t\t\"cid\": \"164\",\n" +
                "\t\t\"name\": \"老虎机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"165\",\n" +
                "\t\t\"name\": \"捕鱼机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}],\n" +
                "\t\"PGS\": [{\n" +
                "\t\t\"cid\": \"202\",\n" +
                "\t\t\"name\": \"老虎机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"204\",\n" +
                "\t\t\t\"name\": \"1-4线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"205\",\n" +
                "\t\t\t\"name\": \"5-14线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"206\",\n" +
                "\t\t\t\"name\": \"15-29线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"207\",\n" +
                "\t\t\t\"name\": \"30-60线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"208\",\n" +
                "\t\t\t\"name\": \"多线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"203\",\n" +
                "\t\t\"name\": \"桌面游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}],\n" +
                "\t\"PNG\": [{\n" +
                "\t\t\"cid\": \"147\",\n" +
                "\t\t\"name\": \"老虎机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"148\",\n" +
                "\t\t\t\"name\": \"1-4线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"149\",\n" +
                "\t\t\t\"name\": \"5-14线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"150\",\n" +
                "\t\t\t\"name\": \"15-29线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"151\",\n" +
                "\t\t\t\"name\": \"30-60线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"152\",\n" +
                "\t\t\t\"name\": \"多线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"159\",\n" +
                "\t\t\"name\": \"桌牌游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"160\",\n" +
                "\t\t\"name\": \"视频扑克\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"161\",\n" +
                "\t\t\"name\": \"其他游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}],\n" +
                "\t\"PP\": [{\n" +
                "\t\t\"cid\": \"80\",\n" +
                "\t\t\"name\": \"老虎机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"82\",\n" +
                "\t\t\t\"name\": \"1-4线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"83\",\n" +
                "\t\t\t\"name\": \"5-14线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"84\",\n" +
                "\t\t\t\"name\": \"15-29线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"85\",\n" +
                "\t\t\t\"name\": \"30-60线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"86\",\n" +
                "\t\t\t\"name\": \"6线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"87\",\n" +
                "\t\t\t\"name\": \"多线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"81\",\n" +
                "\t\t\"name\": \"桌面游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"88\",\n" +
                "\t\t\t\"name\": \"宾果游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"89\",\n" +
                "\t\t\t\"name\": \"桌牌游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"90\",\n" +
                "\t\t\t\"name\": \"轮盘游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}],\n" +
                "\t\"PT\": [{\n" +
                "\t\t\"cid\": \"34\",\n" +
                "\t\t\"name\": \"捕鱼机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"35\",\n" +
                "\t\t\"name\": \"老虎机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"37\",\n" +
                "\t\t\t\"name\": \"1-4线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"38\",\n" +
                "\t\t\t\"name\": \"5-14线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"39\",\n" +
                "\t\t\t\"name\": \"15-29线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"40\",\n" +
                "\t\t\t\"name\": \"30-60线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"41\",\n" +
                "\t\t\t\"name\": \"5线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"42\",\n" +
                "\t\t\t\"name\": \"多线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"36\",\n" +
                "\t\t\"name\": \"特色游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"43\",\n" +
                "\t\t\t\"name\": \"刮卡游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"44\",\n" +
                "\t\t\t\"name\": \"消除游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"45\",\n" +
                "\t\t\t\"name\": \"趣味游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}],\n" +
                "\t\"QT\": [{\n" +
                "\t\t\"cid\": \"106\",\n" +
                "\t\t\"name\": \"老虎机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"107\",\n" +
                "\t\t\t\"name\": \"1-4线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"108\",\n" +
                "\t\t\t\"name\": \"5-14线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"109\",\n" +
                "\t\t\t\"name\": \"15-29线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"110\",\n" +
                "\t\t\t\"name\": \"30-60线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"111\",\n" +
                "\t\t\t\"name\": \"多线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"167\",\n" +
                "\t\t\"name\": \"桌面游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"168\",\n" +
                "\t\t\"name\": \"宾果游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"169\",\n" +
                "\t\t\"name\": \"即时游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}],\n" +
                "\t\"RT\": [{\n" +
                "\t\t\"cid\": \"182\",\n" +
                "\t\t\"name\": \"累积彩池\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"183\",\n" +
                "\t\t\"name\": \"老虎机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"185\",\n" +
                "\t\t\t\"name\": \"1-4线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"186\",\n" +
                "\t\t\t\"name\": \"5-14线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"187\",\n" +
                "\t\t\t\"name\": \"15-29线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"188\",\n" +
                "\t\t\t\"name\": \"30-60线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"189\",\n" +
                "\t\t\t\"name\": \"多线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"184\",\n" +
                "\t\t\"name\": \"其他游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"201\",\n" +
                "\t\t\"name\": \"桌面游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}],\n" +
                "\t\"SA\": [{\n" +
                "\t\t\"cid\": \"112\",\n" +
                "\t\t\"name\": \"捕鱼机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"113\",\n" +
                "\t\t\"name\": \"老虎机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"114\",\n" +
                "\t\t\t\"name\": \"1-4线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"115\",\n" +
                "\t\t\t\"name\": \"5-14线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"116\",\n" +
                "\t\t\t\"name\": \"15-29线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"117\",\n" +
                "\t\t\t\"name\": \"30-60线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"118\",\n" +
                "\t\t\t\"name\": \"多线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}],\n" +
                "\t\"SG\": [{\n" +
                "\t\t\"cid\": \"91\",\n" +
                "\t\t\"name\": \"累积彩池\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"92\",\n" +
                "\t\t\"name\": \"老虎机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"94\",\n" +
                "\t\t\t\"name\": \"1-4线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"95\",\n" +
                "\t\t\t\"name\": \"5-14线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"96\",\n" +
                "\t\t\t\"name\": \"15-29线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"97\",\n" +
                "\t\t\t\"name\": \"30-60线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"98\",\n" +
                "\t\t\t\"name\": \"多线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"93\",\n" +
                "\t\t\"name\": \"特色游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"99\",\n" +
                "\t\t\t\"name\": \"趣味游戏\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}],\n" +
                "\t\"SW\": [{\n" +
                "\t\t\"cid\": \"132\",\n" +
                "\t\t\"name\": \"捕鱼机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"133\",\n" +
                "\t\t\"name\": \"老虎机\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": [{\n" +
                "\t\t\t\"cid\": \"135\",\n" +
                "\t\t\t\"name\": \"1-4线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"136\",\n" +
                "\t\t\t\"name\": \"5-14线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"137\",\n" +
                "\t\t\t\"name\": \"15-29线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"138\",\n" +
                "\t\t\t\"name\": \"30-60线\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"cid\": \"139\",\n" +
                "\t\t\t\"name\": \"多线老虎机\",\n" +
                "\t\t\t\"en_name\": \"\"\n" +
                "\t\t}]\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"134\",\n" +
                "\t\t\"name\": \"射击游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}, {\n" +
                "\t\t\"cid\": \"140\",\n" +
                "\t\t\"name\": \"桌牌游戏\",\n" +
                "\t\t\"en_name\": \"\",\n" +
                "\t\t\"sec_category\": []\n" +
                "\t}]\n" +
                "},\n" +
                "\"message\": \"成功\"\n" +
                "}";
        return source;
    }

}
