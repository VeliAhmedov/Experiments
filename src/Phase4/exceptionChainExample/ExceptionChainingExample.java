package Phase4.exceptionChainExample;

public class ExceptionChainingExample {
    public static void connectToDatabase() throws DatabaseException {
        try {
            // Simulating a database connection error (e.g., NullPointerException)
            String dbConnection = null;
            dbConnection.length();  // This will throw NullPointerException
        } catch (NullPointerException e) {
            throw new DatabaseException("Failed to connect to the database.", e);  // Chaining the cause
        }
    }

    // Method simulating data processing, which depends on database connection
    public static void processData() throws DataProcessingException {
        try {
            connectToDatabase();  // This may throw DatabaseException
        } catch (DatabaseException e) {
            throw new DataProcessingException("Error occurred while processing data.", e);  // Chaining further
        }
    }
}
