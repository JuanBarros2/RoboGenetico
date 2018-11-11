package ufcg.edu.genetic;

import java.util.List;
import java.util.Objects;

public class Chromossome<T> {
    private List<Gene<T>> genes;

    public Chromossome(List<Gene<T>> genes){
        this.genes = genes;
    }

    public boolean mutation(){
        List<Gene<T>> init = this.genes;
        for(Gene gene: getGenes()){
            gene.doMutation();
        }
        return !Objects.equals(init, this.genes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chromossome that = (Chromossome) o;

        return Objects.equals(genes, that.genes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genes);
    }

    public List<Gene<T>> getGenes() {
        return genes;
    }
}
