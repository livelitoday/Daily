package com.cins.daily.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.cins.daily.mvp.entity.NewsChannelTable;

import com.cins.daily.greendao.NewsChannelTableDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig newsChannelTableDaoConfig;

    private final NewsChannelTableDao newsChannelTableDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        newsChannelTableDaoConfig = daoConfigMap.get(NewsChannelTableDao.class).clone();
        newsChannelTableDaoConfig.initIdentityScope(type);

        newsChannelTableDao = new NewsChannelTableDao(newsChannelTableDaoConfig, this);

        registerDao(NewsChannelTable.class, newsChannelTableDao);
    }
    
    public void clear() {
        newsChannelTableDaoConfig.clearIdentityScope();
    }

    public NewsChannelTableDao getNewsChannelTableDao() {
        return newsChannelTableDao;
    }

}
