package mx.spin.mobile.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import mx.spin.mobile.dao.Equipment;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "EQUIPMENT".
*/
public class EquipmentDao extends AbstractDao<Equipment, Long> {

    public static final String TABLENAME = "EQUIPMENT";

    /**
     * Properties of entity Equipment.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Pool_id = new Property(1, Integer.class, "pool_id", false, "POOL_ID");
        public final static Property Pooleq_id = new Property(2, Integer.class, "pooleq_id", false, "POOLEQ_ID");
        public final static Property Pooleq_equipment_id = new Property(3, Integer.class, "pooleq_equipment_id", false, "POOLEQ_EQUIPMENT_ID");
        public final static Property Pooleq_qty = new Property(4, String.class, "pooleq_qty", false, "POOLEQ_QTY");
        public final static Property Pooleq_hp = new Property(5, String.class, "pooleq_hp", false, "POOLEQ_HP");
        public final static Property Equipment = new Property(6, String.class, "Equipment", false, "EQUIPMENT");
    };


    public EquipmentDao(DaoConfig config) {
        super(config);
    }
    
    public EquipmentDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"EQUIPMENT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"POOL_ID\" INTEGER," + // 1: pool_id
                "\"POOLEQ_ID\" INTEGER," + // 2: pooleq_id
                "\"POOLEQ_EQUIPMENT_ID\" INTEGER," + // 3: pooleq_equipment_id
                "\"POOLEQ_QTY\" TEXT," + // 4: pooleq_qty
                "\"POOLEQ_HP\" TEXT," + // 5: pooleq_hp
                "\"EQUIPMENT\" TEXT);"); // 6: Equipment
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"EQUIPMENT\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Equipment entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer pool_id = entity.getPool_id();
        if (pool_id != null) {
            stmt.bindLong(2, pool_id);
        }
 
        Integer pooleq_id = entity.getPooleq_id();
        if (pooleq_id != null) {
            stmt.bindLong(3, pooleq_id);
        }
 
        Integer pooleq_equipment_id = entity.getPooleq_equipment_id();
        if (pooleq_equipment_id != null) {
            stmt.bindLong(4, pooleq_equipment_id);
        }
 
        String pooleq_qty = entity.getPooleq_qty();
        if (pooleq_qty != null) {
            stmt.bindString(5, pooleq_qty);
        }
 
        String pooleq_hp = entity.getPooleq_hp();
        if (pooleq_hp != null) {
            stmt.bindString(6, pooleq_hp);
        }
 
        String Equipment = entity.getEquipment();
        if (Equipment != null) {
            stmt.bindString(7, Equipment);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Equipment readEntity(Cursor cursor, int offset) {
        Equipment entity = new Equipment( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // pool_id
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // pooleq_id
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // pooleq_equipment_id
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // pooleq_qty
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // pooleq_hp
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // Equipment
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Equipment entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPool_id(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setPooleq_id(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setPooleq_equipment_id(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setPooleq_qty(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPooleq_hp(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setEquipment(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Equipment entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Equipment entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
