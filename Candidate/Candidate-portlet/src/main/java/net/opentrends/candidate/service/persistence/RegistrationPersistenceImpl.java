package net.opentrends.candidate.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import net.opentrends.candidate.NoSuchRegistrationException;
import net.opentrends.candidate.model.Registration;
import net.opentrends.candidate.model.impl.RegistrationImpl;
import net.opentrends.candidate.model.impl.RegistrationModelImpl;
import net.opentrends.candidate.service.persistence.RegistrationPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the registration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegistrationPersistence
 * @see RegistrationUtil
 * @generated
 */
public class RegistrationPersistenceImpl extends BasePersistenceImpl<Registration>
    implements RegistrationPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link RegistrationUtil} to access the registration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = RegistrationImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
            RegistrationModelImpl.FINDER_CACHE_ENABLED, RegistrationImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
            RegistrationModelImpl.FINDER_CACHE_ENABLED, RegistrationImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
            RegistrationModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
            RegistrationModelImpl.FINDER_CACHE_ENABLED, RegistrationImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygroupId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
            RegistrationModelImpl.FINDER_CACHE_ENABLED, RegistrationImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygroupId",
            new String[] { Long.class.getName() },
            RegistrationModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
            RegistrationModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygroupId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "registration.groupId = ?";
    private static final String _SQL_SELECT_REGISTRATION = "SELECT registration FROM Registration registration";
    private static final String _SQL_SELECT_REGISTRATION_WHERE = "SELECT registration FROM Registration registration WHERE ";
    private static final String _SQL_COUNT_REGISTRATION = "SELECT COUNT(registration) FROM Registration registration";
    private static final String _SQL_COUNT_REGISTRATION_WHERE = "SELECT COUNT(registration) FROM Registration registration WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "registration.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Registration exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Registration exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(RegistrationPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static Registration _nullRegistration = new RegistrationImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Registration> toCacheModel() {
                return _nullRegistrationCacheModel;
            }
        };

    private static CacheModel<Registration> _nullRegistrationCacheModel = new CacheModel<Registration>() {
            @Override
            public Registration toEntityModel() {
                return _nullRegistration;
            }
        };

    public RegistrationPersistenceImpl() {
        setModelClass(Registration.class);
    }

    /**
     * Returns all the registrations where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching registrations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Registration> findBygroupId(long groupId)
        throws SystemException {
        return findBygroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the registrations where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.candidate.model.impl.RegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of registrations
     * @param end the upper bound of the range of registrations (not inclusive)
     * @return the range of matching registrations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Registration> findBygroupId(long groupId, int start, int end)
        throws SystemException {
        return findBygroupId(groupId, start, end, null);
    }

    /**
     * Returns an ordered range of all the registrations where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.candidate.model.impl.RegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of registrations
     * @param end the upper bound of the range of registrations (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching registrations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Registration> findBygroupId(long groupId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId, start, end, orderByComparator };
        }

        List<Registration> list = (List<Registration>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Registration registration : list) {
                if ((groupId != registration.getGroupId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_REGISTRATION_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RegistrationModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (!pagination) {
                    list = (List<Registration>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Registration>(list);
                } else {
                    list = (List<Registration>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first registration in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching registration
     * @throws net.opentrends.candidate.NoSuchRegistrationException if a matching registration could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Registration findBygroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchRegistrationException, SystemException {
        Registration registration = fetchBygroupId_First(groupId,
                orderByComparator);

        if (registration != null) {
            return registration;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRegistrationException(msg.toString());
    }

    /**
     * Returns the first registration in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching registration, or <code>null</code> if a matching registration could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Registration fetchBygroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Registration> list = findBygroupId(groupId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last registration in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching registration
     * @throws net.opentrends.candidate.NoSuchRegistrationException if a matching registration could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Registration findBygroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchRegistrationException, SystemException {
        Registration registration = fetchBygroupId_Last(groupId,
                orderByComparator);

        if (registration != null) {
            return registration;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRegistrationException(msg.toString());
    }

    /**
     * Returns the last registration in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching registration, or <code>null</code> if a matching registration could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Registration fetchBygroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBygroupId(groupId);

        if (count == 0) {
            return null;
        }

        List<Registration> list = findBygroupId(groupId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the registrations before and after the current registration in the ordered set where groupId = &#63;.
     *
     * @param id the primary key of the current registration
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next registration
     * @throws net.opentrends.candidate.NoSuchRegistrationException if a registration with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Registration[] findBygroupId_PrevAndNext(long id, long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchRegistrationException, SystemException {
        Registration registration = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            Registration[] array = new RegistrationImpl[3];

            array[0] = getBygroupId_PrevAndNext(session, registration, groupId,
                    orderByComparator, true);

            array[1] = registration;

            array[2] = getBygroupId_PrevAndNext(session, registration, groupId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Registration getBygroupId_PrevAndNext(Session session,
        Registration registration, long groupId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_REGISTRATION_WHERE);

        query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(RegistrationModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(registration);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Registration> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the registrations where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBygroupId(long groupId) throws SystemException {
        for (Registration registration : findBygroupId(groupId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(registration);
        }
    }

    /**
     * Returns the number of registrations where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching registrations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBygroupId(long groupId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

        Object[] finderArgs = new Object[] { groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_REGISTRATION_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the registration in the entity cache if it is enabled.
     *
     * @param registration the registration
     */
    @Override
    public void cacheResult(Registration registration) {
        EntityCacheUtil.putResult(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
            RegistrationImpl.class, registration.getPrimaryKey(), registration);

        registration.resetOriginalValues();
    }

    /**
     * Caches the registrations in the entity cache if it is enabled.
     *
     * @param registrations the registrations
     */
    @Override
    public void cacheResult(List<Registration> registrations) {
        for (Registration registration : registrations) {
            if (EntityCacheUtil.getResult(
                        RegistrationModelImpl.ENTITY_CACHE_ENABLED,
                        RegistrationImpl.class, registration.getPrimaryKey()) == null) {
                cacheResult(registration);
            } else {
                registration.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all registrations.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(RegistrationImpl.class.getName());
        }

        EntityCacheUtil.clearCache(RegistrationImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the registration.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Registration registration) {
        EntityCacheUtil.removeResult(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
            RegistrationImpl.class, registration.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Registration> registrations) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Registration registration : registrations) {
            EntityCacheUtil.removeResult(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
                RegistrationImpl.class, registration.getPrimaryKey());
        }
    }

    /**
     * Creates a new registration with the primary key. Does not add the registration to the database.
     *
     * @param id the primary key for the new registration
     * @return the new registration
     */
    @Override
    public Registration create(long id) {
        Registration registration = new RegistrationImpl();

        registration.setNew(true);
        registration.setPrimaryKey(id);

        return registration;
    }

    /**
     * Removes the registration with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the registration
     * @return the registration that was removed
     * @throws net.opentrends.candidate.NoSuchRegistrationException if a registration with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Registration remove(long id)
        throws NoSuchRegistrationException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the registration with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the registration
     * @return the registration that was removed
     * @throws net.opentrends.candidate.NoSuchRegistrationException if a registration with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Registration remove(Serializable primaryKey)
        throws NoSuchRegistrationException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Registration registration = (Registration) session.get(RegistrationImpl.class,
                    primaryKey);

            if (registration == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchRegistrationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(registration);
        } catch (NoSuchRegistrationException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Registration removeImpl(Registration registration)
        throws SystemException {
        registration = toUnwrappedModel(registration);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(registration)) {
                registration = (Registration) session.get(RegistrationImpl.class,
                        registration.getPrimaryKeyObj());
            }

            if (registration != null) {
                session.delete(registration);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (registration != null) {
            clearCache(registration);
        }

        return registration;
    }

    @Override
    public Registration updateImpl(
        net.opentrends.candidate.model.Registration registration)
        throws SystemException {
        registration = toUnwrappedModel(registration);

        boolean isNew = registration.isNew();

        RegistrationModelImpl registrationModelImpl = (RegistrationModelImpl) registration;

        Session session = null;

        try {
            session = openSession();

            if (registration.isNew()) {
                session.save(registration);

                registration.setNew(false);
            } else {
                session.merge(registration);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !RegistrationModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((registrationModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        registrationModelImpl.getOriginalGroupId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] { registrationModelImpl.getGroupId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }
        }

        EntityCacheUtil.putResult(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
            RegistrationImpl.class, registration.getPrimaryKey(), registration);

        return registration;
    }

    protected Registration toUnwrappedModel(Registration registration) {
        if (registration instanceof RegistrationImpl) {
            return registration;
        }

        RegistrationImpl registrationImpl = new RegistrationImpl();

        registrationImpl.setNew(registration.isNew());
        registrationImpl.setPrimaryKey(registration.getPrimaryKey());

        registrationImpl.setId(registration.getId());
        registrationImpl.setName(registration.getName());
        registrationImpl.setEmail(registration.getEmail());
        registrationImpl.setCity(registration.getCity());
        registrationImpl.setMobileNo(registration.getMobileNo());
        registrationImpl.setPhotoFileEntryId(registration.getPhotoFileEntryId());
        registrationImpl.setResumeFileEntryId(registration.getResumeFileEntryId());
        registrationImpl.setUserId(registration.getUserId());
        registrationImpl.setGroupId(registration.getGroupId());

        return registrationImpl;
    }

    /**
     * Returns the registration with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the registration
     * @return the registration
     * @throws net.opentrends.candidate.NoSuchRegistrationException if a registration with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Registration findByPrimaryKey(Serializable primaryKey)
        throws NoSuchRegistrationException, SystemException {
        Registration registration = fetchByPrimaryKey(primaryKey);

        if (registration == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchRegistrationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return registration;
    }

    /**
     * Returns the registration with the primary key or throws a {@link net.opentrends.candidate.NoSuchRegistrationException} if it could not be found.
     *
     * @param id the primary key of the registration
     * @return the registration
     * @throws net.opentrends.candidate.NoSuchRegistrationException if a registration with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Registration findByPrimaryKey(long id)
        throws NoSuchRegistrationException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the registration with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the registration
     * @return the registration, or <code>null</code> if a registration with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Registration fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Registration registration = (Registration) EntityCacheUtil.getResult(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
                RegistrationImpl.class, primaryKey);

        if (registration == _nullRegistration) {
            return null;
        }

        if (registration == null) {
            Session session = null;

            try {
                session = openSession();

                registration = (Registration) session.get(RegistrationImpl.class,
                        primaryKey);

                if (registration != null) {
                    cacheResult(registration);
                } else {
                    EntityCacheUtil.putResult(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
                        RegistrationImpl.class, primaryKey, _nullRegistration);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(RegistrationModelImpl.ENTITY_CACHE_ENABLED,
                    RegistrationImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return registration;
    }

    /**
     * Returns the registration with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the registration
     * @return the registration, or <code>null</code> if a registration with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Registration fetchByPrimaryKey(long id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the registrations.
     *
     * @return the registrations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Registration> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the registrations.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.candidate.model.impl.RegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of registrations
     * @param end the upper bound of the range of registrations (not inclusive)
     * @return the range of registrations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Registration> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the registrations.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.candidate.model.impl.RegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of registrations
     * @param end the upper bound of the range of registrations (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of registrations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Registration> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Registration> list = (List<Registration>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_REGISTRATION);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_REGISTRATION;

                if (pagination) {
                    sql = sql.concat(RegistrationModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Registration>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Registration>(list);
                } else {
                    list = (List<Registration>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the registrations from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Registration registration : findAll()) {
            remove(registration);
        }
    }

    /**
     * Returns the number of registrations.
     *
     * @return the number of registrations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_REGISTRATION);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the registration persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.net.opentrends.candidate.model.Registration")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Registration>> listenersList = new ArrayList<ModelListener<Registration>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Registration>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(RegistrationImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
