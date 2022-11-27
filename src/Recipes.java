

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
public class Recipes {
    private double MIN_PRICE = 0;
    private String nameRecipes;
    private Map<Product, Integer> products = new HashMap<>();

    public Recipes(String nameRecipes) {

        this.nameRecipes = nameRecipes;


    }
    public void addProd(Product product, int quantity) {
        if (quantity <= 0) {
            quantity = 1;
        }
        if (this.products.containsKey(product)) {
            this.products.put(product, this.products.get(product) + quantity);
        } else {
            this.products.put(product, quantity);
        }
    }
    public double sumPricesRecipes(){
        for (Map.Entry<Product, Integer> product : this.products.entrySet()) {
            MIN_PRICE += product.getKey().getAllcost() * product.getValue();
        }
        return MIN_PRICE;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return nameRecipes.equals(recipes.nameRecipes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameRecipes);
    }
    @Override
    public String toString() {
        return products.toString().replace("[","").replace("]","");
    }

}
