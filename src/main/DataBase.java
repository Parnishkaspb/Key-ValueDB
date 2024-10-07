package main;

import Interfaces.IDataBase;
import Interfaces.ITable;
import java.util.HashMap;
import java.util.Map;

public class DataBase implements IDataBase<String, ITable<String, String>> {
    private Map<String , ITable<String, String>> workMap;

    public DataBase() {
        this.workMap = new HashMap<String, ITable<String, String>>();
    }

    @Override
    public void add(String key, ITable<String, String> value) {
        this.workMap.put(key, value);
    }

    @Override
    public ITable<String, String> get(String key) {
        return this.workMap.get(key);
    }

    @Override
    public void remove(String key) {
        this.workMap.remove(key);
    }

    @Override
    public void put(String key, ITable<String, String> value) {
        this.workMap.replace(key, value);
    }
}