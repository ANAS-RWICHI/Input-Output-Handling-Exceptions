package TP5.IO;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IProduitMetier {
    private List<Product> products;
    private final String fileName = "products.dat";
    public MetierProduitImpl() {
        products = loadFromFile();
    }
    @Override
    public void add(Product p) {
        products.add(p);
    }
    @Override
    public List<Product> getAll() {
        return products;
    }
    @Override
    public Product findById(long id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    @Override
    public void delete(long id) {
        products.removeIf(p -> p.getId() == id);
    }
    @Override
    public void saveAll() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(products);
        } catch (IOException e) {
            System.out.println("Error saving products");
        }
    }
    @SuppressWarnings("unchecked")
    private List<Product> loadFromFile() {
        File file = new File(fileName);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Product>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}