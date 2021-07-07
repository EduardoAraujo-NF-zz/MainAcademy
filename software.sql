
CREATE DATABASE /*!32312 IF NOT EXISTS*/ `mydb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mydb`;

--
-- Table structure for table `Conteudos`
--

DROP TABLE IF EXISTS `Conteudos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Conteudos` (
  `Materias_siglaMateria` varchar(5) NOT NULL,
  `conteudo` varchar(500) DEFAULT NULL,
  CONSTRAINT `fk_Conteudos_Materias1` FOREIGN KEY (`Materias_siglaMateria`) REFERENCES `Materias` (`siglaMateria`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Conteudos`
--

LOCK TABLES `Conteudos` WRITE;
/*!40000 ALTER TABLE `Conteudos` DISABLE KEYS */;
INSERT INTO `Conteudos` VALUES ('E201','Conceitos físicos das grandezas elétricas fundamentais'),('E201','Elementos e estruturas constitutivas típicas dos circuitos elétricos'),('E201','Fundamentos de eletricidade aplicada e leis básicas como elementos fundamentais de análise de circuitos elétricos'),('E201','Métodos e teoremas principais para análise de circuitos elétricos.'),('AC1','As Atividades Curriculares Complementares desta disciplina são estruturadas a cada semestre através de uma grade que engloba atividades nas áreas de Desenvolvimento Pessoal, Desenvolvimento Profissional, Empreendedorismo e Inovação e Responsabilidade Sócio Cultural e Ambiental.'),('C201','Introdução aos conceitos básicos e às aplicações de engenharia.'),('C202','Variáveis'),('C202','Tipos de dados'),('C202','Operadores e expressões'),('C202','Estruturas de sequenciação, decisão e repetição.\nModularização'),('C202','Estruturas elementares de dados: vetores, matrizes e registros'),('C202','Arquivos'),('M001','Potenciação'),('M001','Radiciação'),('M001','Expressões e Operações Algébricas'),('M001','Fatoração'),('M001','Polinômios'),('M001','Equações e Inequações'),('M001','Funções'),('M001','Matrizes'),('M001','Determinantes'),('M001','Sistemas de Equações'),('M001','Números complexos.'),('M002','Álgebra vetorial'),('M002','Retas'),('M002','Planos'),('M002','Cônicas'),('M002','Superfícies Quádricas'),('M002','Sistemas de coordenadas.'),('AC2','As Atividades Curriculares Complementares desta disciplina são estruturadas a cada semestre através de uma grade que engloba atividades nas áreas de Desenvolvimento Pessoal, Desenvolvimento Profissional, Empreendedorismo e Inovação e Responsabilidade Sócio Cultural e Ambiental.'),('C103','Análise de complexidade de algoritmos'),('C103','Algoritmos de ordenação e busca'),('C103','Projetos de algoritmos'),('C103','Estruturas de dados avançadas.'),('E110','Normas Técnicas'),('E110','Sistema de Projeção'),('E110','Vistas Ortogonais'),('E110','Perspectivas'),('E110','Esquema e Layout de PCI'),('E110','Aplicativos Computacionais 3D'),('E110','Atividades de integração de conteúdos.'),('M003','Limites'),('M003','Derivadas Ordinárias'),('M003','Integrais Simples.'),('F201','Mecânica Clássica: mecânica da partícula e do corpo sólido.'),('M020','Lógica formal'),('M020','Demonstrações'),('M020','Conjuntos e Combinatória'),('M020','Modelagem Aritmética.'),('AC3','As Atividades Curriculares Complementares desta disciplina são estruturadas a cada semestre através de uma grade que engloba atividades nas áreas de Desenvolvimento Pessoal, Desenvolvimento Profissional, Empreendedorismo e Inovação e Responsabilidade Sócio Cultural e Ambiental.'),('C204','Análise e projeto de algoritmos avançados.'),('E207','Sistemas de numeração'),('E207','Funções e Portas lógicas'),('E207','HDL e arquitetura de FPGA'),('E207','Álgebra de Boole e simplificação de circuitos utilizando HDL'),('E207','Circuitos combinacionais com utilização de HDL.'),('F202','Oscilações'),('F202','Ondas mecânicas'),('F202','Ótica física e ótica geométrica'),('F202','Teoria cinética'),('F202','Fenômenos de transporte'),('F202','Termodinâmica.'),('M004','Funções de várias variáveis'),('M004','Derivadas Parciais'),('M004','Integrais Múltiplas'),('M004','Cálculo Vetorial.'),('AC4','As Atividades Curriculares Complementares desta disciplina são estruturadas a cada semestre através de uma grade que engloba atividades nas áreas de Desenvolvimento Pessoal, Desenvolvimento Profissional, Empreendedorismo e Inovação e Responsabilidade Sócio Cultural e Ambiental.'),('C005','Conceitos e paradigmas de linguagens de programação'),('C005','Conceitos de compiladores'),('C005','Fundamentos de projeto de compiladores.'),('C206','Conceitos'),('C206','Terminologia'),('C206','Aplicação da abordagem de programação orientada a objetos.'),('C207','Conceituação e projeto de bancos de dados.'),('E208','Famílias lógicas'),('E208','Osciladores e circuitos multivibradores'),('E208','Circuitos sequenciais com utilização de HDL'),('E208','Amostragem e quantização'),('E208','Circuitos conversores analógico digital e digital analógico.'),('M005','Equações Diferenciais'),('M005','Sequências e Séries Numéricas'),('M005','Séries de Potência.'),('AC5','As Atividades Curriculares Complementares desta disciplina são estruturadas a cada semestre através de uma grade que engloba atividades nas áreas de Desenvolvimento Pessoal, Desenvolvimento Profissional, Empreendedorismo e Inovação e Responsabilidade Sócio Cultural e Ambiental.'),('E209','Memórias semicondutoras'),('E209','Arquitetura de microcontroladores e microprocessadores'),('E209','Programação de microcontroladores'),('E209','Atividades de integração de conteúdos.'),('G304','Conceitos'),('G304','Metodologias'),('G304','Ferramentas práticas aplicadas ao gerenciamento de projetos'),('G304','Atividades de integração de conteúdos.'),('H001','A Administração e as organizações'),('H001','Teoria geral e modelos de administração'),('H001','Papéis, responsabilidades e perfis do Administrador'),('H001','Evolução, desafios e tendências'),('H001','Atividades de integração de conteúdos.'),('H002','Ambiente econômico'),('H002','Demanda, Oferta e Equilíbrio de Mercado'),('H002','Produtividade e competitividade'),('H002','Elasticidades'),('H002','Estrutura de Mercados'),('H002','Variáveis Macroeconômicas: Juros, Inflação, Desemprego, PIB e Desenvolvimento'),('H002','Atividades de integração de conteúdos.'),('M019','Probabilidade'),('M019','Variáveis aleatórias'),('M019','Distribuições de probabilidade.'),('S201','Estudos dos diversos paradigmas de programação: características principais, vantagens, desvantagens e aplicações.'),('S202','Coleta, preparação, análise e visualização de dados em Bancos de Dados NoSQL.'),('M106','Erros'),('M106','Zeros de Funções'),('M106','Interpolação'),('M106','Sistemas de Equações'),('M106','Integração.'),('AC1','As Atividades Curriculares Complementares desta disciplina são estruturadas a cada semestre através de uma grade que engloba atividades nas áreas de Desenvolvimento Pessoal, Desenvolvimento Profissional, Empreendedorismo e Inovação e Responsabilidade Sócio Cultural e Ambiental.'),('AC6','As Atividades Curriculares Complementares desta disciplina são estruturadas a cada semestre através de uma grade que engloba atividades nas áreas de Desenvolvimento Pessoal, Desenvolvimento Profissional, Empreendedorismo e Inovação e Responsabilidade Sócio Cultural e Ambiental.'),('C208','Sistemas computacionais'),('C208','Organização de computadores'),('C208','Diagramas funcional e físico de computadores'),('C208','Hardware'),('C208','Processos'),('C208','Software'),('C208','Inter-relação entre hardware e software'),('C208','Arquiteturas paralelas e não convencionais'),('C208','Avaliação de desempenho.'),('C209','Arquitetura de interfaces gráficas'),('C209','Representação e construção de objetos gráficos'),('C209','Transformações geométricas'),('C209','Síntese de imagens'),('C209','Técnicas de iluminaçãoo e sombreamento'),('C209','Fundamentos de animação'),('C209','Ferramentas de aplicação gráfica'),('C209','Comunicação usuário-máquina'),('C209','Tipos e processamento de dados de mídia'),('C209','Plataformas para multimídia'),('C209','Sistemas hipermídia'),('C209','Estruturas hipertexto'),('C209','Aplicações multimídia e hipermídia'),('C209','Fundamentos de modelagem.'),('M109','Fundamentos de estatística.'),('M210','Introdução à pesquisa operacional'),('M210','Formulação matemática de problemas de otimização'),('M210','Programação linear'),('M210','Introdução à Programação inteira.'),('S203','Princípios básicos, conceitos teóricos; modelagem; design e avaliação de interfaces homem máquina.'),('S206','Verificação e Validação'),('S206','Planejamento de Teste'),('S206','Estratégias de testes e outros artefatos'),('S206','Revisão de software'),('S206','Tipos de testes'),('S206','Casos de teste'),('S206','Cobertura de testes.'),('AC7','As Atividades Curriculares Complementares desta disciplina são estruturadas a cada semestre através de uma grade que engloba atividades nas áreas de Desenvolvimento Pessoal, Desenvolvimento Profissional, Empreendedorismo e Inovação e Responsabilidade Sócio Cultural e Ambiental.'),('C012','Conceituação de sistemas operacionais'),('C012','Aspectos básicos do projeto e compreensão de sistemas operacionais.'),('C210','Fundamentos de inteligência artificial'),('C210','Estruturas e estratégias de busca'),('C210','Representação do conhecimento e inferência'),('C210','Fundamentos e conceituação do paradigma de programação conexionista'),('C210','Topologia, aprendizado e aplicações de redes neurais.'),('C111','Coleta, preparação, análise e visualização de dados'),('C111','Ferramentas.'),('S204','Arquitetura de Software: estilos, visões e avaliação'),('S204','Fundamentos de desenho de software; conceitos de abstração, acoplamento e coesão, decomposição e modularização, encapsulamento, interfaces'),('S204','Modelo e métricas.'),('S308','Verificar lista de disciplinas eletivas e suas respectivas ementas.'),('T202','Conceitos básicos em redes de computadores'),('T202','Arquiteturas'),('T202','Redes locais cabeadas e sem fio'),('T202','Redes IP.'),('AC8','As Atividades Curriculares Complementares desta disciplina são estruturadas a cada semestre através de uma grade que engloba atividades nas áreas de Desenvolvimento Pessoal, Desenvolvimento Profissional, Empreendedorismo e Inovação e Responsabilidade Sócio Cultural e Ambiental.'),('C214','Controle de Versão, Gerência de Dependências, Automatização da Compilação, Teste de Software, Integração e Entrega, Métodos de Desenvolvimento, Métricas, Padrões de Projeto, Modelagem.'),('P108','Otimização de Redes (custos mínimos, fluxos máximos, tempo mínimo, relações tempo/custo'),('P108','Introdução a análise de decisão'),('P108','Introdução a teoria de filas'),('P108','Atividades de integração de conteúdo.'),('S107','Identificação dos itens de configuração'),('S107','Mudanças'),('S107','Definição e gerenciamento das configurações'),('S107','Aplicações e ferramentas.\n\n'),('S205','Tipos de produto de software'),('S205','Conceitos de qualidade de produto e de processo'),('S205','Qualidade do produto de software.'),('S309','Verificar lista de disciplinas eletivas e suas respectivas ementas.'),('T106','Conceitos e modelos de administração e gerência de redes'),('T106','Segurança de redes.'),('C317','Planejadas a cada semestre.'),('H003','Ética e Cidadania'),('H003','Regulamentação Profissional'),('H003','Educação das Relações Étnico-raciais e Ensino de História e Cultura Afro-brasileira e Indígena'),('H003','Atividades de integração de conteúdos.'),('H004','Noção de Meio Ambiente'),('H004','Legislação Ambiental'),('H004','Reciclagem'),('H004','Certificação ISO'),('H004','Desenvolvimento Sustentável e Responsabilidade Social'),('H004','Atividades de Integração de Conteúdos.'),('C216','Conceitos básicos'),('C216','Mecanismos de comunicação entre processos'),('C216','Paradigmas de comunicação e sincronização'),('C216','Sistemas operacionais distribuídos.'),('TCC1','Planejadas a cada semestre.'),('C318','Planejadas a cada semestre.');
/*!40000 ALTER TABLE `Conteudos` ENABLE KEYS */;
UNLOCK TABLES;

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
INSERT INTO `Materias` VALUES ('AC1','Atividades Complementares 1',3,0,0),('AC2','Atividades Complementares 2',3,0,1),('AC3','Atividades Complementares 3',3,0,1),('AC4','Atividades Complementares 4',3,0,1),('AC5','Atividades Complementares 5',3,0,1),('AC6','Atividade Complementar 6',3,0,1),('AC7','Atividade Complementar 7',3,0,1),('AC8','Atividade Complementar 8',3,0,1),('C005','Linguagens de Programação e Compiladores',4,0,1),('C012','Sistemas Operacionais',4,0,1),('C103','Algoritmos e Estrutura de Dados II',3,0,1),('C111','Análise de Dados',1,0,1),('C201','Introdução à Engenharia',1,0,0),('C202','Algoritmos e Estruturas de Dados I',6,0,0),('C204','Algoritmos e Estruturas de Dados III',4,0,1),('C206','Programação Orientada a Objetos',6,0,1),('C207','Banco de Dados I',4,0,1),('C208','Arquiteturas de Computadores',4,0,1),('C209','Computação Gráfica e Multimídia',6,0,1),('C210','Inteligência Computacional',4,0,1),('C214','Engenharia de Software',6,0,1),('C216','Sistemas Distribuídos',3,0,1),('C317','Tópicos Especiais I',4,0,1),('C318','Tópicos Especiais II',4,0,1),('E110','Desenho',1,0,1),('E201','Circuitos Elétricos I',3,0,0),('E207','Eletrônica Digital I',3,0,1),('E208','Eletrônica Digital II',3,0,1),('E209','Sistemas Microcontrolados e Microprocessados',4,0,1),('F201','Física I',5,0,1),('F202','Física II',5,0,1),('G304','Gestão de Projetos I',1,0,0),('H001','Administração',2,0,0),('H002','Economia',2,0,0),('H003','Humanidades, Ciências Sociais e Cidadania',2,0,0),('H004','Ciências do Ambiente',2,0,0),('M001','Matemática',4,0,0),('M002','Álgebra e Geometria Analítica',4,0,0),('M003','Cálculo I',4,0,1),('M004','Cálculo II',5,0,1),('M005','Cálculo III',3,0,1),('M019','Probabilidade',2,0,1),('M020','Matemática Discreta',4,0,1),('M106','Cálculo Numérico',2,0,1),('M109','Estatística',1,0,1),('M210','Otimização I ',2,0,1),('P108','Otimização II',2,0,1),('S107','Gerência e Evolução de Software',2,0,1),('S201','Paradigmas da Programação',6,0,1),('S202','Banco de Dados II',4,0,1),('S203','Arquitetura e desenho de Software',3,0,1),('S204','Engnenharia de Produto de Sotware',4,0,1),('S205','IHM',4,0,0),('S206','Qualidade de Software',2,0,1),('S308','Disciplina Eletiva I',4,0,0),('S309','Disciplina Eletiva II',4,0,0),('T106','Gerência,QoS e Segurança em Redes',2,0,1),('T202','Redes de Computadores',3,0,0),('TCC1','Trabalho de Conclusão de Curso I',2,0,0);
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
  PRIMARY KEY (`idPeriodo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Periodo`
--

LOCK TABLES `Periodo` WRITE;
/*!40000 ALTER TABLE `Periodo` DISABLE KEYS */;
INSERT INTO `Periodo` VALUES (1,3),(2,6),(3,6),(4,11),(5,24),(6,26),(7,25),(8,27),(9,8),(10,0);
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
  CONSTRAINT `fk_Periodo_has_Materias_Materias1` FOREIGN KEY (`Materias_siglaMateria`) REFERENCES `Materias` (`siglaMateria`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `fk_Periodo_has_Materias_Periodo1` FOREIGN KEY (`Periodo_idPeriodo`) REFERENCES `Periodo` (`idPeriodo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Periodo_has_Materias`
--

LOCK TABLES `Periodo_has_Materias` WRITE;
/*!40000 ALTER TABLE `Periodo_has_Materias` DISABLE KEYS */;
INSERT INTO `Periodo_has_Materias` VALUES (1,'AC1','0'),(1,'C201','0'),(1,'C202','0'),(1,'E201','0'),(1,'M001','0'),(1,'M002','0'),(2,'AC2','0'),(2,'C103','0'),(2,'E110','0'),(2,'F201','0'),(2,'M003','0'),(2,'M020','0'),(3,'AC3','0'),(3,'C204','0'),(3,'E207','0'),(3,'F202','0'),(3,'M004','0'),(4,'AC4','0'),(4,'C005','0'),(4,'C206','0'),(4,'C207','0'),(4,'E208','0'),(4,'M005','0'),(5,'AC5','0'),(5,'E209','0'),(5,'G304','0'),(5,'H001','0'),(5,'H002','0'),(5,'M019','0'),(5,'S201','0'),(5,'S202','0'),(6,'AC6','0'),(6,'C208','0'),(6,'C209','0'),(6,'M106','0'),(6,'M109','0'),(6,'M210','0'),(6,'S203','0'),(6,'S206','0'),(7,'AC7','0'),(7,'C012','0'),(7,'C111','0'),(7,'C210','0'),(7,'S204','0'),(7,'S308','0'),(7,'T202','0'),(8,'AC8','0'),(8,'C214','0'),(8,'P108','0'),(8,'S107','0'),(8,'S205','0'),(8,'S309','0'),(8,'T106','0'),(9,'C317','0'),(9,'H003','0'),(9,'H004','0'),(10,'C216','0'),(10,'C318','0'),(10,'TCC1','0');
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
  CONSTRAINT `fk_Requisito_Materias1` FOREIGN KEY (`Materias_siglaMateria`) REFERENCES `Materias` (`siglaMateria`) ON DELETE CASCADE ON UPDATE NO ACTION
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