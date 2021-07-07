drop SCHEMA IF EXISTS `mydb`;
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb`;

--
-- Table structure for table `Materias`
--

DROP TABLE IF EXISTS `Materias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Materias` (
  `siglaMateria` varchar(5) NOT NULL,
  `nomeMateria` varchar(45) NOT NULL,
  `nCreditosMateria` int(11) NOT NULL,
  `concluido` tinyint(4) NOT NULL,
  `bloqueado` tinyint(4) NOT NULL,
  PRIMARY KEY (`siglaMateria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Materias`
--

LOCK TABLES `Materias` WRITE;
/*!40000 ALTER TABLE `Materias` DISABLE KEYS */;
INSERT INTO `Materias` VALUES ('AC1','AC1',3,1,0),('AC2','AC2',3,1,1),('AC3','AC3',3,1,1),('AC4','AC4',3,1,1),('AC5','AC5',3,1,1),('AC6','AC6',3,1,1),('AC7','AC7',3,1,1),('AC8','AC8',3,1,1),('C005','Compiladores',4,1,1),('C012','Sistemas Operacionais',4,1,1),('C103','Algoritmos 2',3,1,1),('C111','Analise de Dados',1,1,1),('C201','Algoritmos 1',1,1,0),('C202','Introdução a Software',6,1,0),('C204','Algoritmos 3',4,1,1),('C206','POO',6,1,1),('C207','BD 1',4,1,1),('C208','Arquitetura de Computadores',4,1,1),('C209','Computação Grafica',6,1,1),('C210','Inteligência Computacional',4,1,1),('C214','Engenharia de Software',6,1,1),('C216','Sistemas Distribuídos',3,1,1),('C317','Tópicos Especiais',4,1,1),('C318','Tópicos Especiais 2',4,1,1),('E110','Desenho',1,1,1),('E201','Circuitos 1',3,1,0),('E207','Digital 1',3,1,1),('E208','Digital 2',3,1,1),('E209','Digital 2',4,1,1),('F201','Física 1',5,1,1),('F202','Fisica 2',5,1,1),('G304','Projetos',1,1,0),('H001','Administração',2,1,0),('H002','Economia',2,1,0),('H003','Humanidades',2,1,0),('H004','Meio Ambiente',2,1,0),('M001','Matematica',4,1,0),('M002','Algebra Línear',4,1,0),('M003','Calculo 1',4,1,1),('M004','Calculo 2',5,1,1),('M005','Calculo 3',3,1,1),('M019','Probabilidade',2,1,1),('M020','Matemática Discreta',4,1,1),('M106','Calculo Numérico',2,1,1),('M109','Estatistica',1,1,1),('M210','Otimização 1',2,1,1),('P108','Otimização 2',2,1,1),('S107','Gerência e Evolução de Software',2,1,1),('S201','Paradigmas',6,1,1),('S202','BD2',4,1,1),('S203','Arquitetura e Desenho de Software',3,1,1),('S204','Engenharia e Produção de Software',4,1,1),('S205','Interface Homem-Maquina',4,1,0),('S206','Qualidade de Software',2,1,1),('S308','Eletiva 1',4,1,0),('S309','Eletiva 2',4,1,0),('T106','Gerencia e Segurança de Redes',2,1,1),('T202','Redes de Computadores',3,1,0),('TCC1','Trabalho de Conclusão de Curso',2,1,0);
/*!40000 ALTER TABLE `Materias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Periodo`
--

DROP TABLE IF EXISTS `Periodo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Periodo` (
  `idPeriodo` int(11) NOT NULL,
  `creditosemUso` int(11) NOT NULL,
  `creditoPeriodo` int(11) NOT NULL,
  PRIMARY KEY (`idPeriodo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Periodo`
--

LOCK TABLES `Periodo` WRITE;
/*!40000 ALTER TABLE `Periodo` DISABLE KEYS */;
INSERT INTO `Periodo` VALUES (1,21,27),(2,20,27),(3,20,27),(4,23,27),(5,24,27),(6,23,27),(7,23,27),(8,23,27),(9,8,27),(10,9,27);
/*!40000 ALTER TABLE `Periodo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Periodo_has_Materias`
--

DROP TABLE IF EXISTS `Periodo_has_Materias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Periodo_has_Materias` (
  `Periodo_idPeriodo` int(11) NOT NULL,
  `Materias_siglaMateria` varchar(5) NOT NULL,
  `periodo` varchar(45) NOT NULL,
  PRIMARY KEY (`Periodo_idPeriodo`,`Materias_siglaMateria`),
  KEY `fk_Periodo_has_Materias_Materias1_idx` (`Materias_siglaMateria`),
  KEY `fk_Periodo_has_Materias_Periodo1_idx` (`Periodo_idPeriodo`),
  CONSTRAINT `fk_Periodo_has_Materias_Materias1` FOREIGN KEY (`Materias_siglaMateria`) REFERENCES `Materias` (`siglaMateria`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Periodo_has_Materias_Periodo1` FOREIGN KEY (`Periodo_idPeriodo`) REFERENCES `Periodo` (`idPeriodo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Periodo_has_Materias`
--

LOCK TABLES `Periodo_has_Materias` WRITE;
/*!40000 ALTER TABLE `Periodo_has_Materias` DISABLE KEYS */;
INSERT INTO `Periodo_has_Materias` VALUES (1,'AC1','1'),(1,'C201','1'),(1,'C202','1'),(1,'E201','1'),(1,'M001','1'),(1,'M002','1'),(2,'AC2','2'),(2,'C103','2'),(2,'E110','2'),(2,'F201','2'),(2,'M003','2'),(2,'M020','2'),(3,'AC3','3'),(3,'C204','3'),(3,'E207','3'),(3,'F202','3'),(3,'M004','3'),(4,'AC4','4'),(4,'C005','4'),(4,'C206','4'),(4,'C207','4'),(4,'E208','4'),(4,'M005','4'),(5,'AC5','5'),(5,'E209','5'),(5,'G304','5'),(5,'H001','5'),(5,'H002','5'),(5,'M019','5'),(5,'S201','5'),(5,'S202','5'),(6,'AC6','6'),(6,'C208','6'),(6,'C209','6'),(6,'M106','6'),(6,'M109','6'),(6,'M210','6'),(6,'S203','6'),(6,'S206','6'),(7,'AC7','7'),(7,'C012','7'),(7,'C111','7'),(7,'C210','7'),(7,'S204','7'),(7,'S308','7'),(7,'T202','7'),(8,'AC8','8'),(8,'C214','8'),(8,'P108','8'),(8,'S107','8'),(8,'S205','8'),(8,'S309','8'),(8,'T106','8'),(9,'C317','9'),(9,'H003','9'),(9,'H004','9'),(10,'C216','10'),(10,'C318','10'),(10,'TCC1','10');
/*!40000 ALTER TABLE `Periodo_has_Materias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Requisito`
--

DROP TABLE IF EXISTS `Requisito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Requisito` (
  `Materias_siglaMateria` varchar(5) NOT NULL,
  `pre1_1` varchar(5) DEFAULT NULL,
  `pre1_2` varchar(5) DEFAULT NULL,
  `pre1_3` varchar(5) DEFAULT NULL,
  `pre2_1` varchar(5) DEFAULT NULL,
  `pre2_2` varchar(5) DEFAULT NULL,
  `pre2_3` varchar(5) DEFAULT NULL,
  `coReq_1` varchar(5) DEFAULT NULL,
  `coReq_2` varchar(5) DEFAULT NULL,
  `coReq_3` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`Materias_siglaMateria`),
  CONSTRAINT `fk_Requisito_Materias1` FOREIGN KEY (`Materias_siglaMateria`) REFERENCES `Materias` (`siglaMateria`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Requisito`
--

LOCK TABLES `Requisito` WRITE;
/*!40000 ALTER TABLE `Requisito` DISABLE KEYS */;
INSERT INTO `Requisito` VALUES ('AC1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('AC2',NULL,NULL,NULL,NULL,NULL,NULL,'AC1',NULL,NULL),('AC3','AC1',NULL,NULL,NULL,NULL,NULL,'AC2',NULL,NULL),('AC4','AC2',NULL,NULL,NULL,NULL,NULL,'AC3',NULL,NULL),('AC5','AC3',NULL,NULL,NULL,NULL,NULL,'AC4',NULL,NULL),('AC6','AC4',NULL,NULL,NULL,NULL,NULL,'AC5',NULL,NULL),('AC7','AC5',NULL,NULL,NULL,NULL,NULL,'AC6',NULL,NULL),('AC8','AC6',NULL,NULL,NULL,NULL,NULL,'AC7',NULL,NULL),('C005','C202',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('C012','C103',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('C103','C202',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('C111',NULL,NULL,NULL,'C207',NULL,NULL,'C210',NULL,NULL),('C201',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('C202',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('C204',NULL,NULL,NULL,'C103',NULL,NULL,NULL,NULL,NULL),('C206','C103',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('C207',NULL,NULL,NULL,NULL,NULL,NULL,'C103','C204','C206'),('C208',NULL,NULL,NULL,'E209',NULL,NULL,NULL,NULL,NULL),('C209','M001',NULL,NULL,'C206',NULL,NULL,NULL,NULL,NULL),('C210','C204','C206',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('C214',NULL,NULL,NULL,'C206',NULL,NULL,NULL,NULL,NULL),('C216','T202','C012',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('C317','C204','C206','C207',NULL,NULL,NULL,NULL,NULL,NULL),('C318','C206','C210',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('E110',NULL,NULL,NULL,'E201',NULL,NULL,NULL,NULL,NULL),('E201',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('E207',NULL,NULL,NULL,'E201',NULL,NULL,NULL,NULL,NULL),('E208',NULL,NULL,NULL,'E207',NULL,NULL,NULL,NULL,NULL),('E209','C202','E207',NULL,'E208',NULL,NULL,NULL,NULL,NULL),('F201',NULL,NULL,NULL,'M001',NULL,NULL,'M003',NULL,NULL),('F202',NULL,NULL,NULL,'M003','F201',NULL,NULL,NULL,NULL),('G304',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('H001',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('H002',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('H003',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('H004',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('M001',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('M002',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('M003','M001',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('M004','M003',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('M005','M003',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('M019',NULL,NULL,NULL,'M003',NULL,NULL,NULL,NULL,NULL),('M020',NULL,NULL,NULL,'M001',NULL,NULL,NULL,NULL,NULL),('M106','C202','M003',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('M109',NULL,NULL,NULL,'M019',NULL,NULL,NULL,NULL,NULL),('M210',NULL,NULL,NULL,NULL,NULL,NULL,'M109',NULL,NULL),('P108',NULL,NULL,NULL,'M003',NULL,NULL,NULL,NULL,NULL),('S107','C206',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('S201',NULL,NULL,NULL,'C206',NULL,NULL,NULL,NULL,NULL),('S202','C207',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('S203','C206',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('S204','C206',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('S205',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('S206','C206',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('S308',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('S309',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('T106',NULL,NULL,NULL,'T202',NULL,NULL,'C012',NULL,NULL),('T202',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('TCC1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `Requisito` ENABLE KEYS */;
UNLOCK TABLES;
