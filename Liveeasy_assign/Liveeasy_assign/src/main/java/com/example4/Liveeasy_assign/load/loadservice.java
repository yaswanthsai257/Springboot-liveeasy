package com.example4.Liveeasy_assign.load;

import java.util.List;

public interface loadservice {

    List<Load> load();

    Load Loadid(int loadid);

    Load addload(Load l);

    Load update(int loadId, Load updatedLoad);

    boolean deleteLoad(int loadId);
}
