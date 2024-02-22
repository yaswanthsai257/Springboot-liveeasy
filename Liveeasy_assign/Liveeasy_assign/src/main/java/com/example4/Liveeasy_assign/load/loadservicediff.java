package com.example4.Liveeasy_assign.load;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Service
public class loadservicediff implements loadservice {

    private List<Load> list;
    private int nextLoadId; // To keep track of the next load ID

    public loadservicediff() {
        list = new ArrayList<>();
        nextLoadId = 1; // Initialize nextLoadId to 1
        // Add a sample load (for demo purposes)
        list.add(new Load( "Delhi", "jaipur", "chemicals", "canter", 1,
                100L, "shipper:" + UUID.randomUUID(), "21-02-2024"));
        nextLoadId++;
    }

    @Override
    public List<Load> load() {
        return list;
    }

    @Override
    public Load Loadid(int loadid) {
        for (Load lo : list) {
            if (lo.getLoadid() == loadid) {
                return lo;
            }
        }
        return null;
    }

    @Override
    public Load addload(Load l) {
        l.setLoadid(nextLoadId++); // Set the load ID and then increment nextLoadId
        list.add(l);
        return l;
    }

    @Override
    public Load update(int loadId, Load updatedLoad) {
        for (Load l : list) {
            if (l.getLoadid() == loadId) {
                l.setLoadingPoint(updatedLoad.getLoadingPoint());
                l.setUnloadingPoint(updatedLoad.getUnloadingPoint());
                l.setProductType(updatedLoad.getProductType());
                l.setTruckType(updatedLoad.getTruckType());
                l.setNoOfTrucks(updatedLoad.getNoOfTrucks());
                l.setWeight(updatedLoad.getWeight());
                l.setComment(updatedLoad.getComment());
                l.setDate(updatedLoad.getDate());
                return l;
            }
        }
        return null;
    }

    @Override
    public boolean deleteLoad(int loadId) {
        Iterator<Load> iterator = list.iterator();
        while (iterator.hasNext()) {
            Load load = iterator.next();
            if (load.getLoadid() == loadId) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
