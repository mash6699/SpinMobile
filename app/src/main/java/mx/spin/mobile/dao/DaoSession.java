package mx.spin.mobile.dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import mx.spin.mobile.dao.Pool;
import mx.spin.mobile.dao.Equipment;

import mx.spin.mobile.dao.PoolDao;
import mx.spin.mobile.dao.EquipmentDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig poolDaoConfig;
    private final DaoConfig equipmentDaoConfig;

    private final PoolDao poolDao;
    private final EquipmentDao equipmentDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        poolDaoConfig = daoConfigMap.get(PoolDao.class).clone();
        poolDaoConfig.initIdentityScope(type);

        equipmentDaoConfig = daoConfigMap.get(EquipmentDao.class).clone();
        equipmentDaoConfig.initIdentityScope(type);

        poolDao = new PoolDao(poolDaoConfig, this);
        equipmentDao = new EquipmentDao(equipmentDaoConfig, this);

        registerDao(Pool.class, poolDao);
        registerDao(Equipment.class, equipmentDao);
    }
    
    public void clear() {
        poolDaoConfig.getIdentityScope().clear();
        equipmentDaoConfig.getIdentityScope().clear();
    }

    public PoolDao getPoolDao() {
        return poolDao;
    }

    public EquipmentDao getEquipmentDao() {
        return equipmentDao;
    }

}
