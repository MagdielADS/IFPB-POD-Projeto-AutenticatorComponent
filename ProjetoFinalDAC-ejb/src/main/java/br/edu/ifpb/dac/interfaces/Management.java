package br.edu.ifpb.dac.interfaces;

import br.edu.ifpb.dac.entities.Missionary;
import br.edu.ifpb.dac.entities.Tither;

/**
 *
 * @author Magdiel Bruno
 */
public interface Management {
    public void registerTither(Tither tither);
    public void updateTither(Tither tither);
    public void removeTither(Tither tither);
    public Tither searchTither(Tither tither);
    public void registerMissionary(Missionary missionary);
    public void updateMissionary(Missionary missionary);
    public void removeMissionary(Missionary missionary);
    public Missionary searchMissionary(Missionary missionary);
}
