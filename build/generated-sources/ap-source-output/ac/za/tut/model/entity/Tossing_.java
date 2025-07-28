package ac.za.tut.model.entity;

import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2025-05-26T15:03:21")
@StaticMetamodel(Tossing.class)
public class Tossing_ { 

    public static volatile SingularAttribute<Tossing, List> guessesByPlayer;
    public static volatile SingularAttribute<Tossing, String> name;
    public static volatile SingularAttribute<Tossing, Integer> siriWon;
    public static volatile SingularAttribute<Tossing, List> tossesBySiri;
    public static volatile SingularAttribute<Tossing, Long> id;
    public static volatile SingularAttribute<Tossing, Integer> numGames;
    public static volatile SingularAttribute<Tossing, Date> creationDate;
    public static volatile SingularAttribute<Tossing, Integer> playerWon;

}