package net.opentrends.studentdata.service.persistence;

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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import net.opentrends.studentdata.NoSuchStudentMarksException;
import net.opentrends.studentdata.model.StudentMarks;
import net.opentrends.studentdata.model.impl.StudentMarksImpl;
import net.opentrends.studentdata.model.impl.StudentMarksModelImpl;
import net.opentrends.studentdata.service.persistence.StudentMarksPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the student marks service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentMarksPersistence
 * @see StudentMarksUtil
 * @generated
 */
public class StudentMarksPersistenceImpl extends BasePersistenceImpl<StudentMarks>
    implements StudentMarksPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link StudentMarksUtil} to access the student marks persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = StudentMarksImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StudentMarksModelImpl.ENTITY_CACHE_ENABLED,
            StudentMarksModelImpl.FINDER_CACHE_ENABLED, StudentMarksImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StudentMarksModelImpl.ENTITY_CACHE_ENABLED,
            StudentMarksModelImpl.FINDER_CACHE_ENABLED, StudentMarksImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StudentMarksModelImpl.ENTITY_CACHE_ENABLED,
            StudentMarksModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_STUDENTID = new FinderPath(StudentMarksModelImpl.ENTITY_CACHE_ENABLED,
            StudentMarksModelImpl.FINDER_CACHE_ENABLED, StudentMarksImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByStudentId",
            new String[] { Long.class.getName() },
            StudentMarksModelImpl.STUDENTID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_STUDENTID = new FinderPath(StudentMarksModelImpl.ENTITY_CACHE_ENABLED,
            StudentMarksModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStudentId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_STUDENTID_STUDENTID_2 = "studentMarks.studentId = ?";
    private static final String _SQL_SELECT_STUDENTMARKS = "SELECT studentMarks FROM StudentMarks studentMarks";
    private static final String _SQL_SELECT_STUDENTMARKS_WHERE = "SELECT studentMarks FROM StudentMarks studentMarks WHERE ";
    private static final String _SQL_COUNT_STUDENTMARKS = "SELECT COUNT(studentMarks) FROM StudentMarks studentMarks";
    private static final String _SQL_COUNT_STUDENTMARKS_WHERE = "SELECT COUNT(studentMarks) FROM StudentMarks studentMarks WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "studentMarks.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No StudentMarks exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No StudentMarks exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(StudentMarksPersistenceImpl.class);
    private static StudentMarks _nullStudentMarks = new StudentMarksImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<StudentMarks> toCacheModel() {
                return _nullStudentMarksCacheModel;
            }
        };

    private static CacheModel<StudentMarks> _nullStudentMarksCacheModel = new CacheModel<StudentMarks>() {
            @Override
            public StudentMarks toEntityModel() {
                return _nullStudentMarks;
            }
        };

    public StudentMarksPersistenceImpl() {
        setModelClass(StudentMarks.class);
    }

    /**
     * Returns the student marks where studentId = &#63; or throws a {@link net.opentrends.studentdata.NoSuchStudentMarksException} if it could not be found.
     *
     * @param studentId the student ID
     * @return the matching student marks
     * @throws net.opentrends.studentdata.NoSuchStudentMarksException if a matching student marks could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StudentMarks findByStudentId(long studentId)
        throws NoSuchStudentMarksException, SystemException {
        StudentMarks studentMarks = fetchByStudentId(studentId);

        if (studentMarks == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("studentId=");
            msg.append(studentId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchStudentMarksException(msg.toString());
        }

        return studentMarks;
    }

    /**
     * Returns the student marks where studentId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param studentId the student ID
     * @return the matching student marks, or <code>null</code> if a matching student marks could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StudentMarks fetchByStudentId(long studentId)
        throws SystemException {
        return fetchByStudentId(studentId, true);
    }

    /**
     * Returns the student marks where studentId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param studentId the student ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching student marks, or <code>null</code> if a matching student marks could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StudentMarks fetchByStudentId(long studentId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { studentId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_STUDENTID,
                    finderArgs, this);
        }

        if (result instanceof StudentMarks) {
            StudentMarks studentMarks = (StudentMarks) result;

            if ((studentId != studentMarks.getStudentId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_STUDENTMARKS_WHERE);

            query.append(_FINDER_COLUMN_STUDENTID_STUDENTID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(studentId);

                List<StudentMarks> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STUDENTID,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "StudentMarksPersistenceImpl.fetchByStudentId(long, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    StudentMarks studentMarks = list.get(0);

                    result = studentMarks;

                    cacheResult(studentMarks);

                    if ((studentMarks.getStudentId() != studentId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STUDENTID,
                            finderArgs, studentMarks);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_STUDENTID,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (StudentMarks) result;
        }
    }

    /**
     * Removes the student marks where studentId = &#63; from the database.
     *
     * @param studentId the student ID
     * @return the student marks that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StudentMarks removeByStudentId(long studentId)
        throws NoSuchStudentMarksException, SystemException {
        StudentMarks studentMarks = findByStudentId(studentId);

        return remove(studentMarks);
    }

    /**
     * Returns the number of student markses where studentId = &#63;.
     *
     * @param studentId the student ID
     * @return the number of matching student markses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByStudentId(long studentId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_STUDENTID;

        Object[] finderArgs = new Object[] { studentId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_STUDENTMARKS_WHERE);

            query.append(_FINDER_COLUMN_STUDENTID_STUDENTID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(studentId);

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
     * Caches the student marks in the entity cache if it is enabled.
     *
     * @param studentMarks the student marks
     */
    @Override
    public void cacheResult(StudentMarks studentMarks) {
        EntityCacheUtil.putResult(StudentMarksModelImpl.ENTITY_CACHE_ENABLED,
            StudentMarksImpl.class, studentMarks.getPrimaryKey(), studentMarks);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STUDENTID,
            new Object[] { studentMarks.getStudentId() }, studentMarks);

        studentMarks.resetOriginalValues();
    }

    /**
     * Caches the student markses in the entity cache if it is enabled.
     *
     * @param studentMarkses the student markses
     */
    @Override
    public void cacheResult(List<StudentMarks> studentMarkses) {
        for (StudentMarks studentMarks : studentMarkses) {
            if (EntityCacheUtil.getResult(
                        StudentMarksModelImpl.ENTITY_CACHE_ENABLED,
                        StudentMarksImpl.class, studentMarks.getPrimaryKey()) == null) {
                cacheResult(studentMarks);
            } else {
                studentMarks.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all student markses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(StudentMarksImpl.class.getName());
        }

        EntityCacheUtil.clearCache(StudentMarksImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the student marks.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(StudentMarks studentMarks) {
        EntityCacheUtil.removeResult(StudentMarksModelImpl.ENTITY_CACHE_ENABLED,
            StudentMarksImpl.class, studentMarks.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(studentMarks);
    }

    @Override
    public void clearCache(List<StudentMarks> studentMarkses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (StudentMarks studentMarks : studentMarkses) {
            EntityCacheUtil.removeResult(StudentMarksModelImpl.ENTITY_CACHE_ENABLED,
                StudentMarksImpl.class, studentMarks.getPrimaryKey());

            clearUniqueFindersCache(studentMarks);
        }
    }

    protected void cacheUniqueFindersCache(StudentMarks studentMarks) {
        if (studentMarks.isNew()) {
            Object[] args = new Object[] { studentMarks.getStudentId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STUDENTID, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STUDENTID, args,
                studentMarks);
        } else {
            StudentMarksModelImpl studentMarksModelImpl = (StudentMarksModelImpl) studentMarks;

            if ((studentMarksModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_STUDENTID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { studentMarks.getStudentId() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STUDENTID, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STUDENTID, args,
                    studentMarks);
            }
        }
    }

    protected void clearUniqueFindersCache(StudentMarks studentMarks) {
        StudentMarksModelImpl studentMarksModelImpl = (StudentMarksModelImpl) studentMarks;

        Object[] args = new Object[] { studentMarks.getStudentId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STUDENTID, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_STUDENTID, args);

        if ((studentMarksModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_STUDENTID.getColumnBitmask()) != 0) {
            args = new Object[] { studentMarksModelImpl.getOriginalStudentId() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STUDENTID, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_STUDENTID, args);
        }
    }

    /**
     * Creates a new student marks with the primary key. Does not add the student marks to the database.
     *
     * @param markId the primary key for the new student marks
     * @return the new student marks
     */
    @Override
    public StudentMarks create(long markId) {
        StudentMarks studentMarks = new StudentMarksImpl();

        studentMarks.setNew(true);
        studentMarks.setPrimaryKey(markId);

        return studentMarks;
    }

    /**
     * Removes the student marks with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param markId the primary key of the student marks
     * @return the student marks that was removed
     * @throws net.opentrends.studentdata.NoSuchStudentMarksException if a student marks with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StudentMarks remove(long markId)
        throws NoSuchStudentMarksException, SystemException {
        return remove((Serializable) markId);
    }

    /**
     * Removes the student marks with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the student marks
     * @return the student marks that was removed
     * @throws net.opentrends.studentdata.NoSuchStudentMarksException if a student marks with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StudentMarks remove(Serializable primaryKey)
        throws NoSuchStudentMarksException, SystemException {
        Session session = null;

        try {
            session = openSession();

            StudentMarks studentMarks = (StudentMarks) session.get(StudentMarksImpl.class,
                    primaryKey);

            if (studentMarks == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchStudentMarksException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(studentMarks);
        } catch (NoSuchStudentMarksException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected StudentMarks removeImpl(StudentMarks studentMarks)
        throws SystemException {
        studentMarks = toUnwrappedModel(studentMarks);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(studentMarks)) {
                studentMarks = (StudentMarks) session.get(StudentMarksImpl.class,
                        studentMarks.getPrimaryKeyObj());
            }

            if (studentMarks != null) {
                session.delete(studentMarks);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (studentMarks != null) {
            clearCache(studentMarks);
        }

        return studentMarks;
    }

    @Override
    public StudentMarks updateImpl(
        net.opentrends.studentdata.model.StudentMarks studentMarks)
        throws SystemException {
        studentMarks = toUnwrappedModel(studentMarks);

        boolean isNew = studentMarks.isNew();

        Session session = null;

        try {
            session = openSession();

            if (studentMarks.isNew()) {
                session.save(studentMarks);

                studentMarks.setNew(false);
            } else {
                session.merge(studentMarks);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !StudentMarksModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(StudentMarksModelImpl.ENTITY_CACHE_ENABLED,
            StudentMarksImpl.class, studentMarks.getPrimaryKey(), studentMarks);

        clearUniqueFindersCache(studentMarks);
        cacheUniqueFindersCache(studentMarks);

        return studentMarks;
    }

    protected StudentMarks toUnwrappedModel(StudentMarks studentMarks) {
        if (studentMarks instanceof StudentMarksImpl) {
            return studentMarks;
        }

        StudentMarksImpl studentMarksImpl = new StudentMarksImpl();

        studentMarksImpl.setNew(studentMarks.isNew());
        studentMarksImpl.setPrimaryKey(studentMarks.getPrimaryKey());

        studentMarksImpl.setMarkId(studentMarks.getMarkId());
        studentMarksImpl.setStudentId(studentMarks.getStudentId());
        studentMarksImpl.setMark1(studentMarks.getMark1());
        studentMarksImpl.setMark2(studentMarks.getMark2());
        studentMarksImpl.setMark3(studentMarks.getMark3());
        studentMarksImpl.setMark4(studentMarks.getMark4());
        studentMarksImpl.setMark5(studentMarks.getMark5());
        studentMarksImpl.setTotal(studentMarks.getTotal());
        studentMarksImpl.setGroupId(studentMarks.getGroupId());

        return studentMarksImpl;
    }

    /**
     * Returns the student marks with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the student marks
     * @return the student marks
     * @throws net.opentrends.studentdata.NoSuchStudentMarksException if a student marks with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StudentMarks findByPrimaryKey(Serializable primaryKey)
        throws NoSuchStudentMarksException, SystemException {
        StudentMarks studentMarks = fetchByPrimaryKey(primaryKey);

        if (studentMarks == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchStudentMarksException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return studentMarks;
    }

    /**
     * Returns the student marks with the primary key or throws a {@link net.opentrends.studentdata.NoSuchStudentMarksException} if it could not be found.
     *
     * @param markId the primary key of the student marks
     * @return the student marks
     * @throws net.opentrends.studentdata.NoSuchStudentMarksException if a student marks with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StudentMarks findByPrimaryKey(long markId)
        throws NoSuchStudentMarksException, SystemException {
        return findByPrimaryKey((Serializable) markId);
    }

    /**
     * Returns the student marks with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the student marks
     * @return the student marks, or <code>null</code> if a student marks with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StudentMarks fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        StudentMarks studentMarks = (StudentMarks) EntityCacheUtil.getResult(StudentMarksModelImpl.ENTITY_CACHE_ENABLED,
                StudentMarksImpl.class, primaryKey);

        if (studentMarks == _nullStudentMarks) {
            return null;
        }

        if (studentMarks == null) {
            Session session = null;

            try {
                session = openSession();

                studentMarks = (StudentMarks) session.get(StudentMarksImpl.class,
                        primaryKey);

                if (studentMarks != null) {
                    cacheResult(studentMarks);
                } else {
                    EntityCacheUtil.putResult(StudentMarksModelImpl.ENTITY_CACHE_ENABLED,
                        StudentMarksImpl.class, primaryKey, _nullStudentMarks);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(StudentMarksModelImpl.ENTITY_CACHE_ENABLED,
                    StudentMarksImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return studentMarks;
    }

    /**
     * Returns the student marks with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param markId the primary key of the student marks
     * @return the student marks, or <code>null</code> if a student marks with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StudentMarks fetchByPrimaryKey(long markId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) markId);
    }

    /**
     * Returns all the student markses.
     *
     * @return the student markses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<StudentMarks> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the student markses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.studentdata.model.impl.StudentMarksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of student markses
     * @param end the upper bound of the range of student markses (not inclusive)
     * @return the range of student markses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<StudentMarks> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the student markses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.studentdata.model.impl.StudentMarksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of student markses
     * @param end the upper bound of the range of student markses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of student markses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<StudentMarks> findAll(int start, int end,
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

        List<StudentMarks> list = (List<StudentMarks>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_STUDENTMARKS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_STUDENTMARKS;

                if (pagination) {
                    sql = sql.concat(StudentMarksModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<StudentMarks>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<StudentMarks>(list);
                } else {
                    list = (List<StudentMarks>) QueryUtil.list(q, getDialect(),
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
     * Removes all the student markses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (StudentMarks studentMarks : findAll()) {
            remove(studentMarks);
        }
    }

    /**
     * Returns the number of student markses.
     *
     * @return the number of student markses
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

                Query q = session.createQuery(_SQL_COUNT_STUDENTMARKS);

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

    /**
     * Initializes the student marks persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.net.opentrends.studentdata.model.StudentMarks")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<StudentMarks>> listenersList = new ArrayList<ModelListener<StudentMarks>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<StudentMarks>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(StudentMarksImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
