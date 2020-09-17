package br.com.edeploy.bkofficeapi.bean;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Constant {
	public static final boolean TRUE = true;
    public static final boolean FALSE = false;
    public static final String EMPTY = "";
    public static final String SPACE = " ";
    public static final String CAUGHT = "\nProblemas encontrados na: ";
    public static final String SUCCESS = "\nOperação realizada com sucesso. ";
    public static final String PERMISSION = "\nUsuário sem permissão para executar essa ação. ";
    public static final String PERMISSIONRESTAURANT = "\nUsuário sem permissão para este Restaurante. ";
    public static final String PERMISSIONREGIONAL = "\nUsuário sem permissão para esta Região. ";
    public static final String PERMISSIONSECTOR = "\nUsuário sem permissão para este Setor. ";
    public static final String PERMISSIONALL = "\nUsuário sem permissão para todos os Restaurantes. ";
    public static final String FAILURE = "\nA operação resultou em um ou mais problemas. ";
    public static final String SEMRESULTADO = "\nOperacão não retornou resultado na busca. ";
    public static final String INVALID_LOGIN = "Usuário inválido. ";
    public static final String DATA_FORMAT = "yyyy-dd-MM";
    public static final String DATA_FORMAT_SQL = "dd/MM/yy";
    public static final String DATA_FORMAT_SQL2 = "dd/MM/yyyy";
    public static final String TIME = "hh:MM:ss";
    public static final String DATA_FORMAT_SQL_ORACLE = "yyyy-MM-dd";
    public static final String DATA_FORMAT_SQL_ORACLE2 = "yyyy-MM-dd HH:MM:SS";
    public static final String USER = "user";
    public static final String LOGIN_TIMEOUT = "Login tempo esgotado. ";
    public static final boolean DEBUGGING = true;
    public static final String SAP_STATUS = "'processed'";
    public static final String BROWSER_DATE_FORMAT = "yyyy-MM-dd";
    public static final String BROWSER_DATE_FORMAT2 = "yyyy-MM-ddTHH:MM:SS.SSSZ";
    public static final Integer QUANTITY_SAP_INVOICE_PROVIDER = 15;
    public static final String LOGGER_MENSAGEM = "Falha ao Execultar a função :";
    public static final boolean TEST_LEAD_TIME = true;
    public static final String UTF8 = "UTF-8";
    public static final String XML_RESPONSE = "xmlResponse";
    public static final Integer THREE_DAY_PAST = 3;
    public static final Integer ONE_DAY_PAST = 1;
    //public static final Integer limitDay = 3;
    public static final String dataInitialLarger = "Data menor que a data permitida";
    public static final String RESTAURANT_INVALIDO = "Restaurante não Autorizado (Aguardando Reprocessamento)";
    public static final String RESTAURANT_INVALIDO_GTV = "Restaurante não Autorizado";
    public static final String RESTAURANT_NOT_CONFIG = "Restaurante não Configurado (Aguardando Reprocessamento)";
    public static final String INTEGRADO_SAP = "Integrado com o SAP";
    public static final String PROCESS_WAIT = "Aguardando Processamento";
    public static final String NO_DATA = "Recebido Sangria nula";
    public static final String SANGRIA_EXIST = "A Sangria informada já existe com o status: ";
    public static final String EXIST_LACRE = "Lacre informado já existe para este Restaurante";
    public static final String TYPE_SANGRIA = "Tipo de Sangria Inválido";
    public static final String VALUE_LIMIT = "O valor da Sangria não pode ser maior que: ";
    public static final String DATA_INVALIDA = "Data Inválida";
    public static final String CLERCK_INVALIDA = "Atendente Inválido";
    public static final String CLERCK_ERROR = "Atendente deve ser informado";
    public static final String SESSAO_EXPIROU = "Sessão Expirou";
    public static final String COMPANY_FAIL = "Empresa de transporte não cadastrada para este Restaurante";
    public static final String NUM_RERIAL = "Número de Série Inválido ou Ausente para essa Transportadora";
    public static final String NUM_DIGIT = "Dígito Verificador Inválido ou Ausente para essa Transportadora";
    public static final String NUM_GTV = "Número GTV inválido";
    public static final String ERRO_BD = "Erro ao acessar Banco de Dados";
    public static final String ERRO_SAP = "Erro Chamada SAP";
    public static final String GTV_EXIST = "Número de GTV já existente";
    public static final String GTV_NOT_BE_SEND = "Não há Sangrias para envio de Malote";
    public static final String GTV_ERRO_CONECT = "Não foi possivel acessar o banco de dados, tente novamente";
    public static final String NUM_PDV_ERROR = "Número do pdv está errado";
    public static final String NUM_RERIAL_ERROR = "Número do Lacre está errado";
    public static final String GTV_INTEGRITY = "Não foi possível recuperar a integridade das sangrias";
    public static final String GTV_JUSITFY_ERROR = "É necessário preencher a justificativa do GTV";
    public static final String DATA_SAVE = "Dados salvos com sucesso <br/>";
    public static final String REGISTER_PROCESS_INTEGRATION = "Registros Integrado, Fechado e Processado não podem ser alterados";
    public static final String DATA_CORTE = " Data menor que a data de corte, Favor informar uma data maior. ";
    public static final String DELETE_PROCESS_INTEGRATION = "Registros Processados, Integrados ou Fechado para 'Usuário Comum' não podem ser removidos";
    public static final String SEARCH_NOT_BREAK = "Break não encontrado para Remoção";
    public static final String INGREDIENT_MASTER = "COMP MASTER";
    public static final String INGREDIENT_DISPLAY = "COMP DISPLAY";
    public static final String NOT_FOUND_VALUE_APPROBATION = " Favor informar o status e o codigo da transferência.";
    public static final String NOT_FOUND_RESTAURANT_ID = "Não foi encontrado o restaurante para está operação.";
    public static final String NOT_FOUND_RESTAURANT_ID_WS = "Falha na localização do Restaurant_id no WS : ";
    public static final String END_WS = "Finalizando o WS de : ";
    public static final String SAP_INTEGRATION = "sapIntegration";
    public static final String BUSINESS_ONE = "businessOne";
    public static final String LEAD_TIME = "30";
    public static final String INITIAL_WS = "Finalizando o WS de : ";
    public static final String REST_ID = " para o restaurant_id : ";
    public static final String SCORE_FOR_DATE_BY_RESTAURANT = "Contagem já realizada nesta Data para este Restaurante.";
    public static final String SCORE_NOT_FOUND = "Não foi encontrando a contagem para está operação.";
    public static final String RESTAURANT_ID_BASE = "5005";
    public static final Integer LEAD_TIME_BASE = 15;
    public static final String DEVOLUTION_N_PROCESS_S = "RECUSANÃOPROCESSADA";
    public static final String DEVOLUTION_N_PROCESS_N = "RECUSANAOPROCESSADA";
    public static final String DEVOLUTION_N_APPROVED_S = "RECUSANÃOAPROVADA";
    public static final String DEVOLUTION_N_APPROVED_N = "RECUSANAOAPROVADA";
    public static final String RESQUEST_NULL = "Request nulo ";
    public static final String RESTAURANT_NULL = "Obrigatório informar Restaurante";
    public static final String VALUE_THEORETICAL_INVALID = "Valor teorico invalido";
    public static final String DATE_FISCAL_INVALID = "Data fiscal inválida.";
    public static final String VALUE_SAGRIA_INVALID = "Valor de Sangria Invalido";
    public static final String LIMIT_OBS_INVALID = "Campo Observacao com limite de 250 caracteres";
    public static final String PERFIL_ADMIN_SHIFT = "Atenção somente o Perfil de Agrupamento Matriz pode alterar os Turnos";
    public static final String BKOFFICE = "bkoffice";
    public static final String CORPORE_BK = "corporebk";
    public static final String DATA_BASE_USERNAME_CORPORE = "databaseCorporeUsername";
    public static final String DATA_BASE_PASSWORD_CORPORE = "databaseCorporePassword";
    public static final String HOST_CORPORE = "hostCorpore";
    public static final String POT_CORPORE = "portCorpore";
    public static final String BASE_NAME_CORPORE = "baseNameCorpore";
    public static final String PERFIL_MATRIZ = "Atenção somente o Perfil de Agrupamento Matriz pode executa está opção.";
    public static final String PARAMETER_RESTAURANT = "Já existe um parâmetro configurado para este restaurante no periodo selecionado.";
    public static final String NOT_REMOVER_PARAMETER_SCALE_INITIAL = "Não é possivel remover um Parâmetro de Escala após a geração da Escala.";
    public static final String INITIAL_PARAMETER_FOR_SCALE_INITIAL = "Atenção favor lançar a Configuração de Parâmetros das Escalas";
    public static final String NOT_EXECUTE_SERVICE = "Falha na execução do Service : ";
    public static final String RECEIPT_ONE = "Favor infomar o horário do Recebimento 1";
    public static final String RECEIPT_TWO = "Favor infomar o horário do Recebimento 2";
    public static final String RECEIPT_THREEE = "Favor infomar o horário do Recebimento 3";
    public static final String FORMAT_HOUR_WEEK_ERROR = "Formato incorreto para o Recebimento do dia da semana : ";

    public static final String CPF_ALREADY_EXISTS_PTBR = "Já existe um usuário cadastrado com esse CPF.";
    public static final String EMAIL_ALREADY_EXISTS_PTBR = "Já existe um usuário cadastrado com esse E-mail.";
    public static final String USER_REGISTER_SUCCESS_PTBR = "Usuário cadastro com sucesso!";

    /*Password Configurations UserApp Digital*/
    public static final Integer NUMBER_OF_ITERATIONS = 1000;
    public static final String TYPE_OF_HASH_ALGORITHM = "PBKDF2WithHmacSHA1";
    public static final String PSEUDO_RANDOM_NUMBER_GENERATOR = "SHA1PRNG";
    public static final String REQUIRED_COMPANY = "Para alterar um agrupamento o usuário deve ter uma companhia relacionada.";
    public static final Map<String, String> RETURN_MESSAGES;
    public static final String ERROR_EXCEPTION = " Error no : ";
    /*Sangria - Deprecated[29/09/2017]*/
    public static final String GVT_EXIST = "Número de GTV já existente";
    public static final String GVT_NOT_BE_SEND = "Não há Sangrias para envio de Malote";
    public static final String GVT_ERRO_CONECT = "Não foi possivel acessar o banco de dados, tente novamente";
    public static final String GVT_INTEGRITY = "Não foi possível recuperar a integridade das sangrias";
    public static final String GVT_JUSITFY_ERROR = "É necessário preencher a justificativa do ";
    public static final String NUM_GVT = "Número GTV inválido";
    public static final String RESTAURANT_INVALIDO_GVT = "Restaurante não Autorizado";
    public static final String PDV_USER_BKNUMBER = "Atencao o usuario nao pertence ao bknumber na sangria.";
    public static final String URL_AUTHENTICATION = "org.apache.cxf.configuration.security.AuthorizationPolicy";
    public static final String COMPANY_NOT_FIND = "Atencção usuário não atrelado a uma companhia";

    static {
        Map<String, String> tMap = new HashMap<>();
        tMap.put("SUCCESS_PT-BR", "Operação realizada com sucesso.");
        tMap.put("INVALID_PT-BR", "Consulta inválida.");
        /*UserApp*/
        tMap.put("VALIDATE_LOGIN_SUCCESS_PT-BR", "Sucesso ao validar login.");
        tMap.put("VALIDATE_LOGIN_FAIL_PT-BR", "Falha no processo de validação do login. Por favor tente novamente.");
        tMap.put("REGISTER_USER_FAIL_PT-BR", "Falha no processo de cadastro do usuário. Por favor tente novamente.");
        tMap.put("SEARCH_USERS_REGISTERED_FAIL_PT-BR", "Falha no processo de busca de usuários. Por favor tente novamente.");
        tMap.put("CPF_ALREADY_EXISTS_PT-BR", "Já existe um usuário cadastrado com esse CPF.");
        tMap.put("EMAIL_ALREADY_EXISTS_PT-BR", "Já existe um usuário cadastrado com esse E-mail.");
        tMap.put("USER_REGISTER_SUCCESS_PT-BR", "Usuário cadastro com sucesso!");
        tMap.put("EMAIL_OR_PASSWORD_INVALID_PT-BR", "E-mail ou senha inválidos.");
        tMap.put("USER_OR_EMAIL_NULL_PT-BR", "É necessário que preencha os campos de e-mail e senha.");
        tMap.put("USER_MUST_BE_VALID_PT-BR", "Usuário deve ser válido para cadastro.");
        tMap.put("USER_ORIGIN_INVALID_PT-BR", "Origem do usuário inválida.");
        tMap.put("USER_CPF_INVALID_PT-BR", "Origem do usuário inválida.");
        tMap.put("USER_NAME_INVALID_PT-BR", "Nome de usuário inválido.");
        tMap.put("USER_GENDER_INVALID_PT-BR", "Sexo do usuário inválido.");
        tMap.put("USER_BIRTHDAY_INVALID_PT-BR", "Data de nascimento inválido.");
        tMap.put("USER_CITY_INVALID_PT-BR", "Cidade inválida.");
        tMap.put("USER_REGION_INVALID_PT-BR", "Estado inválido.");
        tMap.put("USER_COUNTRY_INVALID_PT-BR", "País inválido.");
        tMap.put("USER_EMAIL_INVALID_PT-BR", "E-mail inválido.");
        tMap.put("USER_PASSWORD_INVALID_PT-BR", "Senha não pode ser vazia.");
        tMap.put("USER_CPF_INVALID_PT-BR", "CPF inválido. CPF deve ser composto por 11 dígitos decimais, sem potuação");
        /*Banner*/
        tMap.put("REGISTER_BANNER_SUCCESS_PT-BR", "Banners cadastrados com sucesso.");
        tMap.put("REGISTER_BANNER_FAIL_PT-BR", "Falha no processo de cadastro de banners. Por favor tente novamente. Se o problema persistir contate um administrador.");
        tMap.put("SAVE_BANNER_SUCCESS_PT-BR", "Banners salvos com sucesso.");
        tMap.put("SEARCH_BANNER_FAIL_PT-BR", "Falha no processo de busca de banners. Por favor tente novamente. Se o problema persistir contate um administrador.");
        tMap.put("ERROR_BANNER_FAIL_VIDEO_TOTEM_PT-BR", "O formato do arquivo deve ser .ogv e a aplicação deve ser TOTEM.");
        /*Category*/
        tMap.put("APPLICATION_PARAMETER_NOT_FOUND_PT-BR", "Parâmetro application não encontrado.");
        tMap.put("SEARCH_CATEGORY_FAIL_PT-BR", "Falha no processo de busca de categorias. Por favor tente novamente. Se o problema persistir contate um administrador.");
        /*Terms*/
        tMap.put("GET_TERMS_FAIL_PT-BR", "Falha no processo de busca dos termos. Por favor tente novamente. Se o problema persistir contate um administrador.");
        tMap.put("GET_TERMS_NOT_FOUND_PT-BR", "Erro: Existem inconsistências no Banco de dados em relação ao Termo de Uso e Privacidade.");
        tMap.put("GET_ACORDO_FAIL_PT-BR", "Falha no processo de busca do termo de acordo. Por favor tente novamente. Se o problema persistir contate um administrador.");
        /*Notification*/
        tMap.put("COUPON_ID_INVALID_PT-BR", "ID do Cupom inválido.");
        tMap.put("GET_NOTIFICATION_FAIL_PT-BR", "Falha no processo de busca de notificações. Por favor tente novamente. Se o problema persistir contate um administrador.");
        /*Restaurant*/
        tMap.put("GET_RESTAURANT_INFO_FAIL_PT-BR", "Falha no processo de busca do restaurante. Por favor tente novamente. Se o problema persistir contate um administrador.");
        tMap.put("NO_RESULT_PT-BR", "0 registros encontrados.");
        /*Inserir dicionario aqui.*/
        tMap.put("EMAIL_ALREADY_EXISTS_EN-US", "There is already a user with this e-mail.");
        RETURN_MESSAGES = Collections.unmodifiableMap(tMap);
    }
}