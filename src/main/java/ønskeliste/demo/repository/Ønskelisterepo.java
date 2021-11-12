package ønskeliste.demo.repository;

import ønskeliste.demo.model.Ønske;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Ønskelisterepo {
    List<Ønske> ønsker;
    Connection conn = DBManager.getConnection();

    public List<Ønske> getAllWishes(){
        ønsker = new ArrayList<>();

        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM wish");
            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
                Ønske ønske = new Ønske(
                        rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("link"),
                        rs.getString("description")
                );
                ønsker.add(ønske);
            }

        } catch (SQLException e) {
            System.out.println("Something went wrong");
            System.out.println(e.getMessage());
        }

        return ønsker;
    }
}
