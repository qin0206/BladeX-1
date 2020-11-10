package org.springblade.enums;

import org.springblade.core.tool.utils.Func;

/**
 * @author bond
 * @date 2020/7/14 15:01
 * @desc
 */
public enum ProductSid{

	SID1("1","A 相电压"),
	SID2("2","B 相电压"),
	SID3("3","C 相电压"),
	SID4("4","AB 线电压"),
	SID5("5","BC 线电压"),
	SID6("6","CA 线电压"),
	SID7("7","A 相电流"),
	SID8("8","B 相电流"),
	SID9("9","C 相电流"),
	SID10("10","三相电流矢量和"),
	SID11("11","A 相功率因数"),
	SID12("12","B 相功率因数"),
	SID13("13","C 相功率因数"),
	SID14("14","总功率因数"),
	SID15("15","频率"),
	SID16("16","电压不平衡度"),
	SID17("17","电流不平衡度"),
	SID18("18","负载率"),
	SID19("19","A 相有功功率"),
	SID20("20","B 相有功功率"),
	SID21("21","C 相有功功率"),
	SID22("22","总有功功率"),
	SID23("23","A 相无功功率"),
	SID24("24","B 相无功功率"),
	SID25("25","C 相无功功率"),
	SID26("26","总无功功率"),
	SID27("27","A 相视在功率"),
	SID28("28","B 相视在功率"),
	SID29("29","C 相视在功率"),
	SID30("30","总视在功率"),
	SID31("31","总用电量"),
	SID32("32","三相正向有功用电量"),
	SID33("33","三相反向有功用电量"),
	SID34("34","三相正向无功用电量"),
	SID35("35","三相反向无功用电量"),
	SID36("36","A 相总用电量"),
	SID37("37","B 相总用电量"),
	SID38("38","C 相总用电量"),
	SID39("39","A相正向有功用电量"),
	SID40("40","A相反向有功用电量"),
	SID41("41","A相正向无功用电量"),
	SID42("42","A相反向无功用电量"),
	SID43("43","B相正向有功用电量"),
	SID44("44","B相反向有功用电量"),
	SID45("45","B相正向无功用电量"),
	SID46("46","B相反向无功用电量"),
	SID47("47","C相正向有功用电量"),
	SID48("48","C相反向有功用电量"),
	SID49("49","C相正向无功用电量"),
	SID50("50","C相反向无功用电量"),
	SID51("51","A相电压相位"),
	SID52("52","B相电压相位"),
	SID53("53","C相电压相位"),
	SID54("54","A相电流相位"),
	SID55("55","B相电流相位"),
	SID56("56","C相电流相位"),
	SID57("57","实时有功需量"),
	SID58("58","剩余电流"),
	SID59("59","A相温度"),
	SID60("60","B相温度"),
	SID61("61","C相温度"),
	SID62("62","N相温度"),
	SID63("63","Ua总谐波"),
	SID64("64","Ub总谐波"),
	SID65("65","Uc总谐波"),
	SID66("66","Ia总谐波"),
	SID67("67","Ib总谐波"),
	SID68("68","Ic总谐波"),
	SID69("69","Ua 3次谐波"),
	SID70("70","Ua 5次谐波"),
	SID71("71","Ua 7次谐波"),
	SID72("72","Ua 9次谐波"),
	SID73("73","Ua 11次谐波"),
	SID74("74","Ua 13次谐波"),
	SID75("75","Ua 15次谐波"),
	SID76("76","Ua 17次谐波"),
	SID77("77","Ua 19次谐波"),
	SID78("78","Ua 21次谐波"),
	SID79("79","Ua 23次谐波"),
	SID80("80","Ua 25次谐波"),
	SID81("81","Ua 27次谐波"),
	SID82("82","Ua 29次谐波"),
	SID83("83","Ua 31次谐波"),
	SID84("84","Ub 3次谐波"),
	SID85("85","Ub 5次谐波"),
	SID86("86","Ub 7次谐波"),
	SID87("87","Ub 9次谐波"),
	SID88("88","Ub 11次谐波"),
	SID89("89","Ub 13次谐波"),
	SID90("90","Ub 15次谐波"),
	SID91("91","Ub 17次谐波"),
	SID92("92","Ub 19次谐波"),
	SID93("93","Ub 21次谐波"),
	SID94("94","Ub 23次谐波"),
	SID95("95","Ub 25次谐波"),
	SID96("96","Ub 27次谐波"),
	SID97("97","Ub 29次谐波"),
	SID98("98","Ub 31次谐波"),
	SID99("99","Uc 3次谐波"),
	SID100("100","Uc 5次谐波"),
	SID101("101","Uc 7次谐波"),
	SID102("102","Uc 9次谐波"),
	SID103("103","Uc 11次谐波"),
	SID104("104","Uc 13次谐波"),
	SID105("105","Uc 15次谐波"),
	SID106("106","Uc 17次谐波"),
	SID107("107","Uc 19次谐波"),
	SID108("108","Uc 21次谐波"),
	SID109("109","Uc 23次谐波"),
	SID110("110","Uc 25次谐波"),
	SID111("111","Uc 27次谐波"),
	SID112("112","Uc 29次谐波"),
	SID113("113","Uc 31次谐波"),
	SID114("114","Ia 3次谐波"),
	SID115("115","Ia 5次谐波"),
	SID116("116","Ia 7次谐波"),
	SID117("117","Ia 9次谐波"),
	SID118("118","Ia 11次谐波"),
	SID119("119","Ia 13次谐波"),
	SID120("120","Ia 15次谐波"),
	SID121("121","Ia 17次谐波"),
	SID122("122","Ia 19次谐波"),
	SID123("123","Ia 21次谐波"),
	SID124("124","Ia 23次谐波"),
	SID125("125","Ia 25次谐波"),
	SID126("126","Ia 27次谐波"),
	SID127("127","Ia 29次谐波"),
	SID128("128","Ia 31次谐波"),
	SID129("129","Ib 3次谐波"),
	SID130("130","Ib 5次谐波"),
	SID131("131","Ib 7次谐波"),
	SID132("132","Ib 9次谐波"),
	SID133("133","Ib 11次谐波"),
	SID134("134","Ib 13次谐波"),
	SID135("135","Ib 15次谐波"),
	SID136("136","Ib 17次谐波"),
	SID137("137","Ib 19次谐波"),
	SID138("138","Ib 21次谐波"),
	SID139("139","Ib 23次谐波"),
	SID140("140","Ib 25次谐波"),
	SID141("141","Ib 27次谐波"),
	SID142("142","Ib 29次谐波"),
	SID143("143","Ib 31次谐波"),
	SID144("144","Ic 3次谐波"),
	SID145("145","Ic 5次谐波"),
	SID146("146","Ic 7次谐波"),
	SID147("147","Ic 9次谐波"),
	SID148("148","Ic 11次谐波"),
	SID149("149","Ic 13次谐波"),
	SID150("150","Ic 15次谐波"),
	SID151("151","Ic 17次谐波"),
	SID152("152","Ic 19次谐波"),
	SID153("153","Ic 21次谐波"),
	SID154("154","Ic 23次谐波"),
	SID155("155","Ic 25次谐波"),
	SID156("156","Ic 27次谐波"),
	SID157("157","Ic 29次谐波"),
	SID158("158","Ic 31次谐波"),
	SID159("159","总流量"),
	SID160("160","压力"),
	SID161("161","标况流量"),
	SID162("162","工况流量"),
	SID163("163","电池电压"),
	SID164("164","空调温度"),
	SID165("165","温度"),
	SID166("166","湿度"),
	SID167("167","风量"),
	SID168("168","风速"),
	SID169("169","总无功功率最大值需量"),
	SID170("170","总视在功率最大值需量"),
	SID171("171","A 相电流最大值需量"),
	SID172("172","B 相电流最大值需量"),
	SID173("173","C 相电流最大值需量"),
	SID174("174","总视在功率实时需量"),
	SID175("175","总视在功率实时需量"),
	SID176("176","A 相电流实时需量"),
	SID177("177","B 相电流实时需量"),
	SID178("178","C 相电流实时需量"),
	SID179("179","视在电能"),
	SID180("180","平均相电压"),
	SID181("181","平均线电压"),
	SID182("182","平均相电流"),
	SID183("183","通道1温度"),
	SID184("184","通道2温度"),
	SID185("185","通道3温度"),
	SID186("186","通道4温度"),
	SID187("187","通道5温度"),
	SID188("188","通道6温度"),
	SID189("189","通道7温度"),
	SID190("190","通道8温度"),
	SID191("191","通道9温度"),
	SID192("192","通道10温度"),
	SID193("193","通道11温度"),
	SID194("194","通道12温度"),
	SID195("195","通道13温度"),
	SID196("196","通道14温度"),
	SID197("197","通道15温度"),
	SID198("198","通道16温度"),
	SID199("199","通道17温度"),
	SID200("200","通道18温度"),
	SID201("201","通道19温度"),
	SID202("202","通道20温度"),
	SID203("203","通道21温度"),
	SID204("204","通道22温度"),
	SID205("205","通道23温度"),
	SID206("206","通道24温度"),
	SID207("207","通道25温度"),
	SID208("208","通道26温度"),
	SID209("209","通道27温度"),
	SID210("210","通道28温度"),
	SID211("211","通道29温度"),
	SID212("212","通道30温度"),
	SID213("213","通道31温度"),
	SID214("214","通道32温度"),
	SID215("215","瞬时流量"),
	SID216("216","余量"),
	SID217("217","标况瞬时流量"),
	SID218("218","工况瞬时流量"),
	SID219("219","压差设定值"),
	SID220("220","温差设定值"),
	SID221("221","电动压差调节阀开度设置"),
	SID222("222","累积时"),
	SID223("223","累积分"),
	SID224("224","频率手动给定"),
	SID225("225","冷却塔风机启1台温度设置"),
	SID226("226","冷却塔风机启2台温度设置"),
	SID227("227","冷却塔风机停1台温度设置"),
	SID228("228","冷却塔风机停2台温度设置"),
	SID229("229","启停"),
	SID230("230","频率给定"),
	SID231("231","运行频率反馈"),
	SID232("232","运行电流反馈"),
	SID233("233","供水温度实际值"),
	SID234("234","回水温度实际值"),
	SID235("235","供水压力实际值"),
	SID236("236","回水压力实际值"),
	SID237("237","冷却塔_温度设置"),
	SID238("238","PID_P"),
	SID239("239","PID_I"),
	SID240("240","PID_D"),
	SID241("241","PID_T"),
	SID242("242","夏季温度基础设定值"),
	SID243("243","冬季温度基础设定值"),
	SID244("244","故障_锁定"),
	SID245("245","紧急复位键"),
	SID246("246","瞬时功率"),
	SID247("247","累计热量"),
	SID248("248","累计冷量"),
	SID249("249","状态"),
	SID250("250","温度控制点_C"),
	SID251("251","控制方式"),
	SID252("252","故障"),
	SID253("253","远程控制"),
	SID254("254","制冷设置值"),
	SID255("255","制热设置值"),
	SID256("256","浓溶液出高发"),
	SID257("257","浓溶液出低发"),
	SID258("258","高发高温/高压"),
	SID259("259","高发高液位开关"),
	SID260("260","高发低液位开关"),
	SID261("261","冷热模式"),
	SID262("262","冷_热水进"),
	SID263("263","冷_热水出"),
	SID264("264","容量阀目标"),
	SID265("265","实际容量阀"),
	SID266("266","机组运行继电器"),
	SID267("267","冷却水进吸收器"),
	SID268("268","冷却水出吸收器"),
	SID269("269","浓溶液出低交"),
	SID270("270","稀溶液出吸收器"),
	SID271("271","冷_热水泵"),
	SID272("272","冷却水出冷凝器"),
	SID273("273","冷却水泵"),
	SID274("274","蒸发温度"),
	SID275("275","冷剂水出低发"),
	SID276("276","蒸汽冷凝温度"),
	SID277("277","调节阀开度手动设置"),
	SID278("278","水位"),

	SID279("279","水压力"),
	SID280("280","吸收有功电能二次侧"),
	SID281("281","释放有功电能二次侧"),
	SID282("282","感性无功电能二次侧"),
	SID283("283","容性无功电能二次侧"),
	SID284("284","吸收有功电能一次侧"),
	SID285("285","释放有功电能一次侧"),
	SID286("286","感性无功电能一次侧"),
	SID287("287","容性无功电能一次侧"),
	SID288("288","标况体积总量"),
	SID289("289","交流过压告警值"),
	SID290("290","交流低压告警值"),
	SID291("291","直流过压告警值"),
	SID292("292","直流低压告警值"),
	SID293("293","过温告警值"),
	SID294("294","年"),
	SID295("295","月"),
	SID296("296","日"),
	SID297("297","时"),
	SID298("298","分"),
	SID299("299","秒"),
	SID300("300","交流停电时长"),
	SID301("301","设备温度"),
	SID302("302","交流电压"),
	SID303("303","直流电压"),
	SID304("304","直流负载总电流"),
	SID305("305","直流负载总功率"),
	SID306("306","直流负载总用电量"),
	SID307("307","用户1总电流"),
	SID308("308","用户1总功率"),
	SID309("309","用户1总电量"),
	SID310("310","用户2总电流"),
	SID311("311","用户2总功率"),
	SID312("312","用户2总电量"),
	SID313("313","用户3总电流"),
	SID314("314","用户3总功率"),
	SID315("315","用户3总电量"),
	SID316("316","用户4总电流"),
	SID317("317","用户4总功率"),
	SID318("318","用户4总电量"),
	SID319("319","用户5总电流"),
	SID320("320","用户5总功率"),
	SID321("321","用户5总电量"),
	SID322("322","支路状态"),
	SID323("323","用户代码"),
	SID324("324","过流告警值"),
	SID325("325","过流告警延时"),
	SID326("326","过流保护值"),
	SID327("327","过流保护延时"),
	SID328("328","下电时长"),
	SID329("329","下电电压"),
	SID330("330","时段1时间"),
	SID331("331","时段2时间"),
	SID332("332","时段3时间"),
	SID333("333","时段4时间"),
	SID334("334","时段5时间"),
	SID335("335","时段6时间"),







	SID1001("1001","A相电压欠压报警"),
	SID1002("1002","A相电压过压报警"),
	SID1003("1003","A相电流过流预警"),
	SID1004("1004","A相电流过流报警"),
	SID1005("1005","A相温度过高报警"),
	SID1006("1006","B相电压欠压报警"),
	SID1007("1007","B相电压过压报警"),
	SID1008("1008","B相电流过流预警"),
	SID1009("1009","B相电流过流报警"),
	SID1010("1010","B相温度过高报警"),
	SID1011("1011","C相电压欠压报警"),
	SID1012("1012","C相电压过压报警"),
	SID1013("1013","C相电流过流预警"),
	SID1014("1014","C相电流过流报警"),
	SID1015("1015","C相温度过高报警"),
	SID1016("1016","剩余电流过流预警"),
	SID1017("1017","剩余电流过流报警"),
	SID1018("1018","A相缺相告警"),
	SID1019("1019","B相缺相告警"),
	SID1020("1020","C相缺相告警"),
	SID1021("1021","停电告警"),
	SID1022("1022","A相电压暂降"),
	SID1023("1023","B相电压暂降"),
	SID1024("1024","C相电压暂降"),
	SID1025("1025","电池欠电"),
	SID1026("1026","DI1"),
	SID1027("1027","DI2"),
	SID1028("1028","DI3"),
	SID1029("1029","DI4"),
	SID1030("1030","DI5"),
	SID1031("1031","DI6"),
	SID1032("1032","DI7"),
	SID1033("1033","DI8"),
	SID1034("1034","DI9"),
	SID1035("1035","DI10"),
	SID1036("1036","DO1"),
	SID1037("1037","DO2"),
	SID1038("1038","DO3"),
	SID1039("1039","DO4"),
	SID1040("1040","DO5"),
	SID1041("1041","DO6"),
	SID1042("1042","DO7"),
	SID1043("1043","DO8"),
	SID1044("1044","DO9"),
	SID1045("1045","DO10"),
	SID1046("1046","断路器分位信号"),
	SID1047("1047","断路器合位信号"),
	SID1048("1048","弹簧储能位信号"),
	SID1049("1049","上刀闸位置信号"),
	SID1050("1050","下刀闸位置信号"),
	SID1051("1051","重瓦斯"),
	SID1052("1052","轻瓦斯"),
	SID1053("1053","压力释放"),
	SID1054("1054","备用开关量信号"),
	SID1055("1055","手动跳闸信号"),
	SID1056("1056","远方/就地信号"),
	SID1057("1057","手动合闸信号"),
	SID1058("1058","超温跳闸"),
	SID1059("1059","过温报警"),
	SID1060("1060","速断"),
	SID1061("1061","限时速断"),
	SID1062("1062","过电流"),
	SID1063("1063","低频减载I"),
	SID1064("1064","后加速"),
	SID1065("1065","重瓦斯"),
	SID1066("1066","轻瓦斯"),
	SID1067("1067","控制回路断线"),
	SID1068("1068","低电压"),
	SID1069("1069","过负荷"),
	SID1070("1070","PT断线"),
	SID1071("1071","母线接地"),
	SID1072("1072","零序过流"),
	SID1073("1073","网门联跳"),
	SID1074("1074","超温跳闸"),
	SID1075("1075","过温报警"),
	SID1076("1076","时钟错"),
	SID1077("1077","开出错"),
	SID1078("1078","定值错"),
	SID1079("1079","RAM错"),
	SID1080("1080","ROM错"),
	SID1081("1081","24V错"),
	SID1082("1082","速断"),
	SID1083("1083","限时速断"),
	SID1084("1084","限时速断侯加速"),
	SID1085("1085","过电流"),
	SID1086("1086","过电流侯加速"),
	SID1087("1087","低电压闭锁过流"),
	SID1088("1088","负序电压闭锁过流"),
	SID1089("1089","过负荷"),
	SID1090("1090","零序过流"),
	SID1091("1091","零序电压闭锁"),
	SID1092("1092","零序方向"),
	SID1093("1093","零序过流跳闸"),
	SID1094("1094","低频减载I"),
	SID1095("1095","低压闭锁低频减载"),
	SID1096("1096","PT断线报警"),
	SID1097("1097","合闸不检条件"),
	SID1098("1098","手合/遥合无压"),
	SID1099("1099","重瓦斯"),
	SID1100("1100","轻瓦斯"),
	SID1101("1101","网门跳闸"),
	SID1102("1102","超温跳闸"),
	SID1103("1103","温度过压报警"),
	SID1104("1104","母线接地报警"),
	SID1105("1105","低电压"),
	SID1106("1106","录波"),

	SID1107	("1107","短路报警"),
	SID1108	("1108","浪涌报警"),
	SID1109	("1109","过载报警"),
	SID1110	("1110","温度报警"),
	SID1111	("1111","漏电保护功能"),
	SID1112	("1112","漏电保护自检"),
	SID1113	("1113","打火报警"),
	SID1114	("1114","开关状态"),
	SID1115	("1115","控制模式"),
	SID1116	("1116","采集模块故障"),
	SID1117	("1117","控制输出故障"),
	SID1118	("1118","时钟模块故障"),
	SID1119	("1119","存储器1异常(铁电)"),
	SID1120	("1120","存储器2异常(flash)"),
	SID1121	("1121","4G模块异常"),
	SID1122	("1122","交流停电告警"),
	SID1123	("1123","交流过压"),
	SID1124	("1124","交流欠压"),
	SID1125	("1125","直流低压"),
	SID1126	("1126","直流高压"),
	SID1127	("1127","温度高"),
	SID1128	("1128","时段1控制状态"),
	SID1129	("1129","时段2控制状态"),
	SID1130	("1130","时段3控制状态"),
	SID1131	("1131","时段4控制状态"),
	SID1132	("1132","时段5控制状态"),
	SID1133	("1133","时段6控制状态"),





	SID1501("1501","电流量程"),
	SID1502("1502","CT变比"),
	SID1503("1503","剩余电流CT变比"),
	SID1504("1504","过流预警值"),
	SID1505("1505","过流告警值"),
	SID1506("1506","过压报警值"),
	SID1507("1507","欠压报警值"),
	SID1508("1508","过温度报警值"),
	SID1509("1509","剩余电流预警值"),
	SID1510("1510","剩余电流告警值"),

	SID1511	("1511","PT变比"),
	SID1512	("1512","电压上限定值"),
	SID1513	("1513","电压下限定值"),
	SID1514	("1514","功率上限"),
	SID1515	("1515","年"),
	SID1516	("1516","月"),
	SID1517	("1517","日"),
	SID1518	("1518","时"),
	SID1519	("1519","分"),
	SID1520	("1520","秒"),
	SID1521	("1521","用户代码"),
	SID1522	("1522","过流告警值"),
	SID1523	("1523","过流告警延时"),
	SID1524	("1524","过流保护值"),
	SID1525	("1525","过流保护延时"),
	SID1526	("1526","下电时长"),
	SID1527	("1527","下电电压"),
	SID1528	("1528","定时控制使能"),
	SID1529	("1529","时段1时间"),
	SID1530	("1530","时段1控制状态"),
	SID1531	("1531","时段2时间"),
	SID1532	("1532","时段2控制状态"),
	SID1533	("1533","时段3时间"),
	SID1534	("1534","时段3控制状态"),
	SID1535	("1535","时段4时间"),
	SID1536	("1536","时段4控制状态"),
	SID1537	("1537","时段5时间"),
	SID1538	("1538","时段5控制状态"),
	SID1539	("1539","时段6时间"),
	SID1540	("1540","时段6控制状态"),



	SID2001("2001","清除告警"),
	SID2002("2002","清除电度"),
	SID2003("2003","合闸控制"),
	SID2004("2004","启动空调"),
	SID2005("2005","关闭空调"),
	SID2006("2006","制冷28度"),
	SID2007("2007","制冷27度"),
	SID2008("2008","制冷26度"),
	SID2009("2009","制冷25度"),
	SID2010("2010","制冷24度"),
	SID2011("2011","制冷23度"),
	SID2012("2012","制冷22度"),
	SID2013("2013","制冷21度"),
	SID2014("2014","制冷20度"),
	SID2015("2015","制冷19度"),
	SID2016("2016","制冷18度"),
	SID2017("2017","制冷17度"),
	SID2018("2018","制冷16度"),
	SID2019("2019","控制模式"),
	SID2020("2020","短路保护解除");








	public String id;
	public String value;

	ProductSid(String id, String value) {
		this.id = id;
		this.value = value;
	}

	/**
	 * 获取对应属性值
	 * @param id
	 * @return
	 */
	public static String getValue(String id){
		ProductSid[] alarmLevels = ProductSid.values();
		for (ProductSid alarmLevel : alarmLevels) {
			if(Func.equals(id,alarmLevel.id)){
				return alarmLevel.value;
			}
		}
		return "";
	}

	/**
	 * 获取对应属性值
	 * @param id
	 * @return
	 */
	public static ProductSid getProductSid(String id){
		ProductSid[] alarmLevels = ProductSid.values();
		for (ProductSid alarmLevel : alarmLevels) {
			if(Func.equals(id,alarmLevel.id)){
				return alarmLevel;
			}
		}
		return null;
	}

	}