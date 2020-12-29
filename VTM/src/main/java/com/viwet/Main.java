package com.viwet;


import com.viwet.DAO.ClanDAO;
import com.viwet.DAO.PlayerDAO;
import com.viwet.config.HibernateUtil;
import com.viwet.entities.*;
import com.viwet.services.PlayerService;
import org.hibernate.Session;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        clan.setTitle("Бруха");
//        clan.setDescription("Клан Бруха в основном состоит из бун- тарей, как идейных, так и безыдейных." +
//                "Индивидуалистичные, искренние и буйные, Бруха придают огромное значение" +
//                "социальным изменениям, и среди представителей клана имеются некоторые из наиболее жестоких" +
//                "Сородичей Камарильи.");
//        clanDAO.addClan(clan);
//
//        clan.setTitle("Гангрел");
//        clan.setDescription("Среди вампиров Гангрелы, возможно, более всего близки к своей внутренней природе. Эти бродяги–одиночки" +
//                "с презрением отвергают ограничения общества, предпочитая комфорт дикой природы.");
//        clanDAO.addClan(clan);
//
//        clan.setTitle("Малкавиан");
//        clan.setDescription("Даже остальные Проклятые боятся Малкавиан." +
//                "Проклятая кровь клана отравила их" +
//                "сознание, и в результате этого все до единого Малкавиане в мире — неизлечимо" +
//                "безумны.");
//        clanDAO.addClan(clan);
//
//        clan.setTitle("Носферату");
//        clan.setDescription("Потомков Каина зовут «Проклятыми», и нет других вампиров, которые воплощали бы это " +
//                "понятие более полно, чем несчастные из клана Носферату. Если прочие" +
//                "вампиры по–прежнему похожи на людей и могут обитать в обществе смертных," +
//                "то Носферату искажены и обезображены проклятием вампиризма.");
//        clanDAO.addClan(clan);
//
//        clan.setTitle("Тореадор");
//        clan.setDescription("Тореадоров называют по–всякому: «дегенераты», «художники», «позёры» и «гедонисты» — " +
//                "вот лишь некоторые из прозвищ. Но любая пошлая категоризация" +
//                "подобного рода оказывает клану дурную услугу. В зависимости от конкретного" +
//                "индивидуума и его настроения, Тореадор может быть и элегантным, и вызывающим, блестящим и нелепым, " +
//                "мечтательным и беспутным. Пожалуй, единственное обобщение, которое можно сделать относительно клана в целом — это" +
//                "эстетическая страсть всех его представителей.");
//        clanDAO.addClan(clan);
//
//        clan.setTitle("Тремер");
//        clan.setDescription("Скрытных вампиров клана Тремер можно бояться, можно благоговеть перед ними, не доверять им" +
//                "или презирать их, но их нельзя игнорировать. Те, кому доводилось слышать о делах клана, обычно" +
//                "относятся к Тремерам с подозрением, и не без причины — их прозвали Колдунами весьма метко." +
//                "Благодаря собственным умениям, они освоили разновидность вампирского чародейства, " +
//                "дополненного ритуалами и заклятиями, и оно столь же могущественно — если не в большей" +
//                "мере — как и любая иная способность Крови.");
//        clanDAO.addClan(clan);
//
//        clan.setTitle("Вентру");
//        clan.setDescription("Сородичи из клана Вентру славятся своей честностью, благородством и безукоризненным вкусом. " +
//                "С незапамятных времён Вентру были кланом лидеров, претворяющих в жизнь древние традиции и стремящихся " +
//                "построить для Сородичей лучшее будущее. В былые ночи Вентру выбирались из числа" +
//                "аристократов, торговых магнатов и прочих лиц, наделённых властью. В нынешние ночи клан" +
//                "набирает новичков из богатых старинных семейств, из числа безжалостных карьеристов и" +
//                "политиков.");
//        clanDAO.addClan(clan);
//
//        clan.setTitle("Ласомбра");
//        clan.setDescription("Клан Ласомбра лишился милости небес — и его представители" +
//                "наслаждаются этим. Одновременно элегантные и хищные, Ласомбра" +
//                "направляют — а при необходимости, и подхлёстывают — Шабаш," +
//                "превращая его в безжалостную силу. Отторгая человека, которым они" +
//                "когда–то были, Ласомбра всецело отдаются тёмному величию Становления/");
//        clanDAO.addClan(clan);
//
//        clan.setTitle("Цимисхи");
//        clan.setDescription("Если клан Ласомбра — сердце Шабаша, то клан Цимисхи — его душа. Даже другие" +
//                "вампиры начинают чувствовать себя неуютно рядом с этими зловещими Сородичами," +
//                "а прозвище «Изверги» когда–то дали им устрашённые вампиры из других кланов. Характерная " +
//                "Дисциплина Цимисхи, Изменчивость — объект особенного трепета; ходят" +
//                "рассказы об уродующих изменениях, насылаемых по капризу, об омерзительных «экспериментах» " +
//                "и пытках, отточенных сверх пределов человеческого — или вампирского" +
//                "— понимания и выдержки.");
//        clanDAO.addClan(clan);
//
//        clan.setTitle("Ассамиты");
//        clan.setDescription("Ассамиты явились из пустынных просторов Востока, сопровождаемые зловещей" +
//                "атмосферой ужаса. Среди вампиров Ассамиты прославились в качестве клана убийц, работающего " +
//                "на любую из сторон, способную заплатить им. Плата," +
//                "которую они взимают за свой труд — витэ других Сородичей; для Ассамитов " +
//                "диаблери — это величайшее таинство. Ассамиты стараются не вмешиваться в " +
//                "дела Камарильи и Шабаша, работая на любую из сторон и одновременно преследуя собственные цели.");
//        clanDAO.addClan(clan);
//
//        clan.setTitle("Последователи Сета");
//        clan.setDescription("Последователям Сета, куда чаще называемым «Сетитами», вероятно, не доверяют больше, " +
//                "чем любому другому клану. Их ассоциация с изна- чальным Змеем из легенды хорошо известна, и только усиливается их\n" +
//                "тревожащими способностями. Они являются хранителями знаний," +
//                "которые, согласно их утверждениям, даже старше, чем Первый" +
//                "Город. Когда они приходят в город, властная структура Каинитов" +
//                "почти неизбежно разрушается. Но, что пугает больше всего, весь" +
//                "клан разделяет единую тёмную и сильную веру — веру в то, что" +
//                "в их холодных жилах течёт кровь богов.");
//        clanDAO.addClan(clan);
//
//        clan.setTitle("Джованни");
//        clan.setDescription("Джованни вежливы, благовоспитанны и наделены хорошими манерами. Корни клана Джованни, " +
//                "богатого сверх всякого воображения, прослеживаются до времён, предшествующих" +
//                "Ренессансу, восходя к семье торговых королей. Клан по–прежнему удерживает свои изначальные " +
//                "владения в Венеции, в тысячелетнем поместье, расположенном совсем рядом с центром" +
//                "города. Ни один клан не устраивает такой показухи из смирения и благопристойности, как Джованни. " +
//                "И ни один клан не скрывает таких нечестивых тайн.");
//        clanDAO.addClan(clan);
//


        ClanDAO clanDAO = new ClanDAO();
        List<Clan> clans = clanDAO.readClanByTitle("Brujah");
        clanDAO.deleteClan(clans.get(0));
//        clanDAO.addClan(clan);
//
//        PlayerService playerService = new PlayerService();
////        playerService.createPlayer("12345", "12345".hashCode(), "Pablo");
//
//        System.out.println(playerService.authorization("12345", "12345".hashCode()));
    }



}