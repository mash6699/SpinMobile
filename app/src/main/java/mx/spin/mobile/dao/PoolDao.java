package mx.spin.mobile.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import mx.spin.mobile.dao.Pool;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "POOL".
*/
public class PoolDao extends AbstractDao<Pool, Long> {

    public static final String TABLENAME = "POOL";

    /**
     * Properties of entity Pool.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Pool_id = new Property(1, Integer.class, "pool_id", false, "POOL_ID");
        public final static Property Pool_name = new Property(2, String.class, "pool_name", false, "POOL_NAME");
        public final static Property Pool_customer = new Property(3, String.class, "pool_customer", false, "POOL_CUSTOMER");
        public final static Property Pool_address = new Property(4, String.class, "pool_address", false, "POOL_ADDRESS");
        public final static Property Pool_form = new Property(5, String.class, "pool_form", false, "POOL_FORM");
        public final static Property Pool_category = new Property(6, String.class, "pool_category", false, "POOL_CATEGORY");
        public final static Property Pool_use = new Property(7, String.class, "pool_use", false, "POOL_USE");
        public final static Property Pool_type = new Property(8, String.class, "pool_type", false, "POOL_TYPE");
        public final static Property Pool_rotation = new Property(9, String.class, "pool_rotation", false, "POOL_ROTATION");
        public final static Property Pool_volume = new Property(10, String.class, "pool_volume", false, "POOL_VOLUME");
        public final static Property Pool_um = new Property(11, String.class, "pool_um", false, "POOL_UM");
        public final static Property Pool_register = new Property(12, String.class, "pool_register", false, "POOL_REGISTER");
        public final static Property Pool_modify = new Property(13, String.class, "pool_modify", false, "POOL_MODIFY");
        public final static Property Pool_delete = new Property(14, String.class, "pool_delete", false, "POOL_DELETE");
        public final static Property Pool_status = new Property(15, String.class, "pool_status", false, "POOL_STATUS");
        public final static Property Analysis = new Property(16, String.class, "analysis", false, "ANALYSIS");
        public final static Property Pool_user_id = new Property(17, Integer.class, "pool_user_id", false, "POOL_USER_ID");
    };

    private DaoSession daoSession;


    public PoolDao(DaoConfig config) {
        super(config);
    }
    
    public PoolDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"POOL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"POOL_ID\" INTEGER," + // 1: pool_id
                "\"POOL_NAME\" TEXT," + // 2: pool_name
                "\"POOL_CUSTOMER\" TEXT," + // 3: pool_customer
                "\"POOL_ADDRESS\" TEXT," + // 4: pool_address
                "\"POOL_FORM\" TEXT," + // 5: pool_form
                "\"POOL_CATEGORY\" TEXT," + // 6: pool_category
                "\"POOL_USE\" TEXT," + // 7: pool_use
                "\"POOL_TYPE\" TEXT," + // 8: pool_type
                "\"POOL_ROTATION\" TEXT," + // 9: pool_rotation
                "\"POOL_VOLUME\" TEXT," + // 10: pool_volume
                "\"POOL_UM\" TEXT," + // 11: pool_um
                "\"POOL_REGISTER\" TEXT," + // 12: pool_register
                "\"POOL_MODIFY\" TEXT," + // 13: pool_modify
                "\"POOL_DELETE\" TEXT," + // 14: pool_delete
                "\"POOL_STATUS\" TEXT," + // 15: pool_status
                "\"ANALYSIS\" TEXT," + // 16: analysis
                "\"POOL_USER_ID\" INTEGER);"); // 17: pool_user_id
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"POOL\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Pool entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer pool_id = entity.getPool_id();
        if (pool_id != null) {
            stmt.bindLong(2, pool_id);
        }
 
        String pool_name = entity.getPool_name();
        if (pool_name != null) {
            stmt.bindString(3, pool_name);
        }
 
        String pool_customer = entity.getPool_customer();
        if (pool_customer != null) {
            stmt.bindString(4, pool_customer);
        }
 
        String pool_address = entity.getPool_address();
        if (pool_address != null) {
            stmt.bindString(5, pool_address);
        }
 
        String pool_form = entity.getPool_form();
        if (pool_form != null) {
            stmt.bindString(6, pool_form);
        }
 
        String pool_category = entity.getPool_category();
        if (pool_category != null) {
            stmt.bindString(7, pool_category);
        }
 
        String pool_use = entity.getPool_use();
        if (pool_use != null) {
            stmt.bindString(8, pool_use);
        }
 
        String pool_type = entity.getPool_type();
        if (pool_type != null) {
            stmt.bindString(9, pool_type);
        }
 
        String pool_rotation = entity.getPool_rotation();
        if (pool_rotation != null) {
            stmt.bindString(10, pool_rotation);
        }
 
        String pool_volume = entity.getPool_volume();
        if (pool_volume != null) {
            stmt.bindString(11, pool_volume);
        }
 
        String pool_um = entity.getPool_um();
        if (pool_um != null) {
            stmt.bindString(12, pool_um);
        }
 
        String pool_register = entity.getPool_register();
        if (pool_register != null) {
            stmt.bindString(13, pool_register);
        }
 
        String pool_modify = entity.getPool_modify();
        if (pool_modify != null) {
            stmt.bindString(14, pool_modify);
        }
 
        String pool_delete = entity.getPool_delete();
        if (pool_delete != null) {
            stmt.bindString(15, pool_delete);
        }
 
        String pool_status = entity.getPool_status();
        if (pool_status != null) {
            stmt.bindString(16, pool_status);
        }
 
        String analysis = entity.getAnalysis();
        if (analysis != null) {
            stmt.bindString(17, analysis);
        }
 
        Integer pool_user_id = entity.getPool_user_id();
        if (pool_user_id != null) {
            stmt.bindLong(18, pool_user_id);
        }
    }

    @Override
    protected void attachEntity(Pool entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Pool readEntity(Cursor cursor, int offset) {
        Pool entity = new Pool( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // pool_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // pool_name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // pool_customer
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // pool_address
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // pool_form
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // pool_category
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // pool_use
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // pool_type
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // pool_rotation
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // pool_volume
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // pool_um
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // pool_register
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // pool_modify
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // pool_delete
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // pool_status
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // analysis
            cursor.isNull(offset + 17) ? null : cursor.getInt(offset + 17) // pool_user_id
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Pool entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPool_id(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setPool_name(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPool_customer(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setPool_address(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPool_form(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setPool_category(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setPool_use(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setPool_type(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setPool_rotation(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setPool_volume(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setPool_um(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setPool_register(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setPool_modify(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setPool_delete(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setPool_status(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setAnalysis(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setPool_user_id(cursor.isNull(offset + 17) ? null : cursor.getInt(offset + 17));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Pool entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Pool entity) {
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
