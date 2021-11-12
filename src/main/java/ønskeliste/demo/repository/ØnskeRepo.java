package ønskeliste.demo.repository;

import ønskeliste.demo.model.Ønske;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ØnskeRepo {
    List<Ønske> ønskes;
    Connection conn = DBManager.getConnection();

    public List<Ønske> getAllØnsker(){
        ønskes = new ArrayList<>();

        PreparedStatement stmt;
        try {
            stmt = conn.prepareStatement("SELECT * FROM b6f9503510677f.ønske");
            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
                Ønske ønske = new Ønske(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("URL"),
                        rs.getString("beskrivelse")
                );
                ønskes.add(ønske);
            }

        } catch (SQLException e) {
            System.out.println("Something went wrong");
            System.out.println(e.getMessage());
        }


        return ønskes;
    }

    public List<Ønske> tilføjØnskerTilØnskeListe(Ønske ønske) throws SQLException {
        PreparedStatement stmt;

        try {
            stmt = conn.prepareStatement("INSERT INTO ønske (ID, title, URL, beskrivelse) VALUES (?,?,?,?)");

            stmt.setInt(1, ønske.getID());
            stmt.setString(2, ønske.getTitle());
            stmt.setString(3, ønske.getURL());
            stmt.setString(4, ønske.getBeskrivelse());

            return ønskes;

        } catch (SQLException e){
            System.out.println(e.getMessage());
            return ønskes;
        }
    }
}
    /*private List<Ønske> unpackQuery(ResultSet resultSet) throws SQLException {
        Wishes = new ArrayList<>();

        while (resultSet.next()) {

            Ønske ønske = new Ønske(
                    resultSet.getInt("ønskeId"),
                    resultSet.getString("ønskeTitle"),
                    resultSet.getString("ønskeURL"),
                    resultSet.getString("ønskeBeskrivelse"));
            Wishes.add(ønske);
        }
        return Wishes;
    }
}*/
