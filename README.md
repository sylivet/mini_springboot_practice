# wendyTseng_springboot_study

## Getting started
### Setup wendytseng_springboot_study db
####Import sql file to your database from \resources\sql\initSchema.sql 
```
CREATE DATABASE  IF NOT EXISTS `wendytseng_springboot_study` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `wendytseng_springboot_study`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 172.29.35.234    Database: wendytseng_springboot_study
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `product_pk` int NOT NULL,
  `product_name` varchar(100) NOT NULL,
  `product_description` varchar(500) NOT NULL,
  `product_stock` int NOT NULL,
  `product_status` int NOT NULL,
  PRIMARY KEY (`product_pk`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'伊莉莎白女王：一位現代君主的傳記','「這是一本優秀而全面的新傳記，像一道光線般照亮君主人生中那些不為人知的角落。」──《紐約時報》',1,1),(2,'這是什麼哏：圖解動物日常很有戲','世界萬物超有趣，生活是那麼的有意思！',1,1),(3,'拉麵之魂：從派別系譜、年代發展到商業經營，探索日本最強國民美食的究極指南','「比起找到究極的那一碗，不如把自己調整到『能享受所有店家』的境界，那就無敵了」by青木健',1,1),(4,'黛安娜王妃：害羞的黛、憂鬱的黛、溫暖的黛與憤怒的黛； 身在禁錮的皇室，她如何用服飾傳達心事','塑造專屬自己的強烈風格，用形象傳達內心想法，她至今仍是世上第一人。',1,1),(5,'絕望中的幽默製造者狄更斯：天生的作家，發文即成名，創作不輟，關注社會黑暗並帶來光明','「這是最美好的時代，這是最糟糕的時代……這是光明的季節，這是黑暗的季節；這是希望之春，這是失望之冬。」',1,1),(6,'法國鄉土甜點的經典本色：118道歷久不衰的地方及家庭糕點故事','各種鄉土甜點的命名由來及誕生故事， 所使用的麵團、奶餡以及材料細節， 並且附上11道step by step甜點食譜。',1,1),(7,'喝一碗茶：茶人、茶碗、陶瓷燒製，北大路魯山人說日用器皿的誕生','茶道具做為日常生活器皿開始的「燒物」，如何走向備受推崇的炙手逸品？備前燒、瀨戶燒、信樂燒、九谷燒、織部燒、伊萬里燒、有田燒……透過茶碗、茶陶一探和風美學的極致魅力！就算不是嗜茶之人，也值得跟著魯山人一起品味。',1,1),(8,'匕首與投槍，魯迅以文為刃的抗爭：橫眉冷對千夫指，卻以深情待人間','在紛亂的清末民初，戰爭、迫害、罵名、流離的噩夢如影隨形，他從不懼，一枝筆桿挺起他的傲骨，一串文字，成為鋒利的匕首投槍，刺向惡俗、舊制、麻木、自欺欺人、喪權辱國！切開這些，找到自由。那奮戰到生命終結仍至死不屈的身影，是魯迅。',1,1),(9,'別鬧了，動物大人！牛羊雞豬不只是盤中物，農場大腦比你想的更機智，鮮活呈現動物情感認知與社會行為的科普漫畫','離經不叛道、離奇又較眞……科學研究的「神」解讀，現在就用最八卦的方式討論動物！',1,1),(10,'厲害了，我的生物 (贈品版：限量加贈 U質生物紙製杯墊)','快訊！八卦能讓生物變厲害！',1,1),(11,'花朵的祕密生命：解剖一朵花的美、自然與科學','植物看似不會動，不代表他們天性善良、毫無心機',1,1),(12,'滿紙荒唐言，曹雪芹的追求與祭奠：滔天曹家散盡飛鳥各投林，十年浮沉鑄就紅樓辛酸淚','「滿紙荒唐言，一把辛酸淚，都云作者痴，誰解其中味。」',1,1),(13,'從叢林到文明，人類身體的演化和疾病的產生','沒有人比李伯曼更瞭解人類的身體',1,1),(14,'他改變了美國，也改變了世界：富蘭克林自傳','他的故事代表了真正的美國精神，激勵數代美國人！他的奮發精神改變了美國，也影響了全世界！',1,1),(15,'守護黑熊：和諧共存的保育之路','本書彙整了日本黑熊的科學研究成果，並剖析經營管理現況和挑戰，堪稱權威著作，非常值得國人借鏡與參考。若能透過本書吸取日本黑熊經營管理的寶貴經驗，謙卑地學習、記取其失敗或慘痛的教訓，再經由政府支援充足的資源及經費，以落實有科學根據的保育政策，系統地執行長期的野外族群生態研究和監測計畫，同時培育優秀的熊類研究和保育人才，則瀕危物種──台灣黑熊保育成功之日必然指日可待。',1,1),(16,'品嘗．烹煮．盛裝：日本飲食文化奠基人上至節氣、下至地理的美味追尋','富士山有山頂，但「美味」之路沒有盡頭「吃，不僅僅是一日三餐，而是耳、目、鼻等六種感官的一場對話。」',1,1),(17,'食學：全球第一本！以食事提問，從食物源頭到餐桌的新興知識體系','全球有77億人每日要面對大大小小的食事問題，預計2050年將達100億人口，臨近「食物母體」能夠承受的極限！食學，是解決食事問題的一把金鑰匙。本書作者於2019年G20高峰會期間舉辦第三屆食學論壇宣讀以食事為中心的《淡路島宣言》大獲肯定，正式將食學體系及其理念推上國際舞台。',1,1),(18,'未來食物大預報：後疫時代的食品優化、新時代包裝、烹調體驗與數據結合AI應用趨勢','━━2020年以前，點外送餐是生活中的輕奢品，━━━━現在，外送平台成為全球必需品！━━',1,1),(19,'香港人在台灣觀鳥','香港人在台灣尋找鳥仔探索旅程，領會到人類與大自然相處之道。',1,1),(20,'物種起源','出版於1859年的《物種起源》是進化論之奠基人達爾文的第一部巨著，也是生物學史上的一部經典著作，對人類歷史有著極大的影響。達爾文以無數的翔實資料和嚴密的邏輯推理論證了「遺傳」、「變異」、「物競天擇，適者生存」等觀點，用生存競爭與自然淘汰解釋生物進化的過程，理論平實易懂；且為生物學界第一次將理論建立在完全科學的基礎上，被學術界、思想界稱為十九世紀自然科學的三大發現之一。',1,1);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-19 12:17:42

```
### Edit application.yml 
#### Use your own db connection, change the spring.datasource.url, username and password
```
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://{your_hostname:your_port}/wendytseng_springboot_study?useUnicode=true&characterEncoding=utf-8
    username: {your_username}
    password: {your_password}
```

### Run DemoApplication

1. Go to http://localhost:8088/product/findFirst10Product, you will see the first ten products information.

2. Go to http://localhost:8088/hktvproducts/getCodeAndDescription, you will see products[].code and products[].description of `https://www.hktvmall.com/hktv/zh/ajax/getTop100?code=personalcarenhealth&pageSize=11&currentPage=0`

3. Find all products http://localhost:8088/product/all
4. Find specific product http://localhost:8088/product/{productPK}
5. Insert product http://localhost:8088/product/{productPK}
6. Update product http://localhost:8088/product/{productPk}/edit
7. Delete product http://localhost:8088/product/{productPK}/delete
