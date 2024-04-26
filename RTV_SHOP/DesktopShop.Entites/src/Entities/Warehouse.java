package Entities;

import java.util.UUID;

public class Warehouse {
    UUID Id=UUID.randomUUID();
    String name;
    UUID branchId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void setBranchId(){

    }
}
