import java.sql.*;
import java.time.LocalDateTime;

    // DiceDatabase -- originalno ime
public class Dev {

    private Connection conn;

    // 1️⃣ Konstruktor – zove se JEDNOM na startu programa
    public Dev() throws SQLException {
        connect();
        createTableIfNotExists();
    }

    // 2️⃣ Povezivanje sa bazom
    private void connect() throws SQLException {
        conn = DriverManager.getConnection("jdbc:sqlite:dice.db");
    }

    // 3️⃣ Kreiranje tabele (ako već ne postoji)
    private void createTableIfNotExists() throws SQLException {
        String sql = """
        CREATE TABLE IF NOT EXISTS rolls (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            input TEXT,
            rolls TEXT,
            modifier INTEGER,
            total INTEGER,
            created_at TEXT
            );
        """;

        Statement stmt = conn.createStatement();
        stmt.execute(sql);
    }

    // 4️⃣ Čuvanje jednog rolla u bazu
    public void saveRoll(String input, String rolls, int modifier, int total) throws SQLException {
        String insertSql = """
        INSERT INTO rolls (input, rolls, modifier, total, created_at)
        VALUES (?, ?, ?, ?, ?)
        """;

        PreparedStatement ps = conn.prepareStatement(insertSql);
        ps.setString(1, input);
        ps.setString(2, rolls);
        ps.setInt(3, modifier);
        ps.setInt(4, total);
        ps.setString(5, LocalDateTime.now().toString());

        ps.executeUpdate();
    }

    // 5️⃣ Zatvaranje konekcije (kad program izlazi)
    public void close() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }


    // ovo sada treba implementirati u ceo proces, ovo je za kreiranje baze podataka
    // objasnjenje za ovo ima  u chat-gpt

}

