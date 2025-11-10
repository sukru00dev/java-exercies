import java.util.ArrayList;
import java.security.MessageDigest;

class Block {
    private String data;
    public String hash;
    public String previousHash;
    private long timeStamp;

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = System.currentTimeMillis();
        this.hash = calculateHash();
    }

    public String getData() {
        return data;
    }

    public String calculateHash() {
        String input = previousHash + Long.toString(timeStamp) + data;
        return applySha256(input);
    }

    public static String applySha256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(input.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < hashBytes.length; i++) {
                String hex = Integer.toHexString(0xff & hashBytes[i]);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

public class SimpleBlockchain {
    public static ArrayList<Block> blockchain = new ArrayList<Block>();

    public static void main(String[] args) {
        blockchain.add(new Block("İlk blok (Genesis Block)", "0"));
        blockchain.add(new Block("2. blok: Ahmet 10 coin aldı", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("3. blok: Mehmet 5 coin gönderdi", blockchain.get(blockchain.size()-1).hash));

        for (Block block : blockchain) {
            System.out.println("====================================");
            System.out.println("Veri: " + block.getData());
            System.out.println("Önceki Hash: " + block.previousHash);
            System.out.println("Bu Hash: " + block.hash);
        }
    }
}
