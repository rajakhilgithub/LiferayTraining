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

import net.opentrends.studentdata.NoSuchStudentDetailsException;
import net.opentrends.studentdata.model.StudentDetails;
import net.opentrends.studentdata.model.impl.StudentDetailsImpl;
import net.opentrends.studentdata.model.impl.StudentDetailsModelImpl;
import net.opentrends.studentdata.service.persistence.StudentDetailsPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the student details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentDetailsPersistence
 * @see StudentDetailsUtil
 * @generated
 */
public class StudentDetailsPersistenceImpl extends BasePersistenceImpl<StudentDetails>
    implements StudentDetailsPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link StudentDetailsUtil} to access the student details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = StudentDetailsImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StudentDetailsModelImpl.ENTITY_CACHE_ENABLED,
            StudentDetailsModelImpl.FINDER_CACHE_ENABLED,
            StudentDetailsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StudentDetailsModelImpl.ENTITY_CACHE_ENABLED,
            StudentDetailsModelImpl.FINDER_CACHE_ENABLED,
            StudentDetailsImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StudentDetailsModelImpl.ENTITY_CACHE_ENABLED,
            StudentDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_STUDENTID = new FinderPath(StudentDetailsModelImpl.ENTITY_CACHE_ENABLED,
            StudentDetailsModelImpl.FINDER_CACHE_ENABLED,
            StudentDetailsImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByStudentId", new String[] { Long.class.getName() },
            StudentDetailsModelImpl.STUDENTID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_STUDENTID = new FinderPath(StudentDetailsModelImpl.ENTITY_CACHE_ENABLED,
            StudentDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStudentId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_STUDENTID_STUDENTID_2 = "studentDetails.studentId = ?";
    private static final String _SQL_SELECT_STUDENTDETAILS = "SELECT studentDetails FROM StudentDetails studentDetails";
    private static final String _SQL_SELECT_STUDENTDETAILS_WHERE = "SELECT studentDetails FROM StudentDetails studentDetails WHERE ";
    private static final String _SQL_COUNT_STUDENTDETAILS = "SELECT COUNT(studentDetails) FROM StudentDetails studentDetails";
    private static final String _SQL_COUNT_STUDENTDETAILS_WHERE = "SELECT COUNT(studentDetails) FROM StudentDetails studentDetails WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "studentDetails.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No StudentDetails exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No StudentDetails exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(StudentDetailsPersistenceImpl.class);
    private static StudentDetails _nullStudentDetails = new StudentDetailsImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<StudentDetails> toCacheModel() {
                return _nullStudentDetailsCacheModel;
            }
        };

    private static CacheModel<StudentDetails> _nullStudentDetailsCacheModel = new CacheModel<StudentDetails>() {
            @Override
            public StudentDetails toEntityModel() {
                return _nullStudentDetails;
            }
        };

    public StudentDetailsPersistenceImpl() {
        setModelClass(StudentDetails.class);
    }

    /**
     * Returns the student details where studentId = &#63; or throws a {@link net.opentrends.studentdata.NoSuchStudentDetailsException} if it could not be found.
     *
     * @param studentId the student ID
     * @return the matching student details
     * @throws net.opentrends.studentdata.NoSuchStudentDetailsException if a matching student details could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StudentDetails findByStudentId(long studentId)
        throws NoSuchStudentDetailsException, SystemException {
        StudentDetails studentDetails = fetchByStudentId(studentId);

        if (studentDetails == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("studentId=");
            msg.append(studentId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchStudentDetailsException(msg.toString());
        }

        return studentDetails;
    }

    /**
     * Returns the student details where studentId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param studentId the student ID
     * @return the matching student details, or <code>null</code> if a matching student details could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StudentDetails fetchByStudentId(long studentId)
        throws SystemException {
        return fetchByStudentId(studentId, true);
    }

    /**
     * Returns the student details where studentId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param studentId the student ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching student details, or <code>null</code> if a matching student details could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StudentDetails fetchByStudentId(long studentId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { studentId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_STUDENTID,
                    finderArgs, this);
        }

        if (result instanceof StudentDetails) {
            StudentDetails studentDetails = (StudentDetails) result;

            if ((studentId != studentDetails.getStudentId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_STUDENTDETAILS_WHERE);

            query.append(_FINDER_COLUMN_STUDENTID_STUDENTID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(studentId);

                List<StudentDetails> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STUDENTID,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "StudentDetailsPersistenceImpl.fetchByStudentId(long, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    StudentDetails studentDetails = list.get(0);

                    result = studentDetails;

                    cacheResult(studentDetails);

                    if ((studentDetails.getStudentId() != studentId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STUDENTID,
                            finderArgs, studentDetails);
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
            return (StudentDetails) result;
        }
    }

    /**
     * Removes the student details where studentId = &#63; from the database.
     *
     * @param studentId the student ID
     * @return the student details that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StudentDetails removeByStudentId(long studentId)
        throws NoSuchStudentDetailsException, SystemException {
        StudentDetails studentDetails = findByStudentId(studentId);

        return remove(studentDetails);
    }

    /**
     * Returns the number of student detailses where studentId = &#63;.
     *
     * @param studentId the student ID
     * @return the number of matching student detailses
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

            query.append(_SQL_COUNT_STUDENTDETAILS_WHERE);

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
     * Caches the student details in the entity cache if it is enabled.
     *
     * @param studentDetails the student details
     */
    @Override
    public void cacheResult(StudentDetails studentDetails) {
        EntityCacheUtil.putResult(StudentDetailsModelImpl.ENTITY_CACHE_ENABLED,
            StudentDetailsImpl.class, studentDetails.getPrimaryKey(),
            studentDetails);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STUDENTID,
            new Object[] { studentDetails.getStudentId() }, studentDetails);

        studentDetails.resetOriginalValues();
    }

    /**
     * Caches the student detailses in the entity cache if it is enabled.
     *
     * @param studentDetailses the student detailses
     */
    @Override
    public void cacheResult(List<StudentDetails> studentDetailses) {
        for (StudentDetails studentDetails : studentDetailses) {
            if (EntityCacheUtil.getResult(
                        StudentDetailsModelImpl.ENTITY_CACHE_ENABLED,
                        StudentDetailsImpl.class, studentDetails.getPrimaryKey()) == null) {
                cacheResult(studentDetails);
            } else {
                studentDetails.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all student detailses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(StudentDetailsImpl.class.getName());
        }

        EntityCacheUtil.clearCache(StudentDetailsImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the student details.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(StudentDetails studentDetails) {
        EntityCacheUtil.removeResult(StudentDetailsModelImpl.ENTITY_CACHE_ENABLED,
            StudentDetailsImpl.class, studentDetails.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(studentDetails);
    }

    @Override
    public void clearCache(List<StudentDetails> studentDetailses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (StudentDetails studentDetails : studentDetailses) {
            EntityCacheUtil.removeResult(StudentDetailsModelImpl.ENTITY_CACHE_ENABLED,
                StudentDetailsImpl.class, studentDetails.getPrimaryKey());

            clearUniqueFindersCache(studentDetails);
        }
    }

    protected void cacheUniqueFindersCache(StudentDetails studentDetails) {
        if (studentDetails.isNew()) {
            Object[] args = new Object[] { studentDetails.getStudentId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STUDENTID, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STUDENTID, args,
                studentDetails);
        } else {
            StudentDetailsModelImpl studentDetailsModelImpl = (StudentDetailsModelImpl) studentDetails;

            if ((studentDetailsModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_STUDENTID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { studentDetails.getStudentId() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STUDENTID, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STUDENTID, args,
                    studentDetails);
            }
        }
    }

    protected void clearUniqueFindersCache(StudentDetails studentDetails) {
        StudentDetailsModelImpl studentDetailsModelImpl = (StudentDetailsModelImpl) studentDetails;

        Object[] args = new Object[] { studentDetails.getStudentId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STUDENTID, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_STUDENTID, args);

        if ((studentDetailsModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_STUDENTID.getColumnBitmask()) != 0) {
            args = new Object[] { studentDetailsModelImpl.getOriginalStudentId() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STUDENTID, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_STUDENTID, args);
        }
    }

    /**
     * Creates a new student details with the primary key. Does not add the student details to the database.
     *
     * @param studentId the primary key for the new student details
     * @return the new student details
     */
    @Override
    public StudentDetails create(long studentId) {
        StudentDetails studentDetails = new StudentDetailsImpl();

        studentDetails.setNew(true);
        studentDetails.setPrimaryKey(studentId);

        return studentDetails;
    }

    /**
     * Removes the student details with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param studentId the primary key of the student details
     * @return the student details that was removed
     * @throws net.opentrends.studentdata.NoSuchStudentDetailsException if a student details with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StudentDetails remove(long studentId)
        throws NoSuchStudentDetailsException, SystemException {
        return remove((Serializable) studentId);
    }

    /**
     * Removes the student details with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the student details
     * @return the student details that was removed
     * @throws net.opentrends.studentdata.NoSuchStudentDetailsException if a student details with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StudentDetails remove(Serializable primaryKey)
        throws NoSuchStudentDetailsException, SystemException {
        Session session = null;

        try {
            session = openSession();

            StudentDetails studentDetails = (StudentDetails) session.get(StudentDetailsImpl.class,
                    primaryKey);

            if (studentDetails == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchStudentDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(studentDetails);
        } catch (NoSuchStudentDetailsException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected StudentDetails removeImpl(StudentDetails studentDetails)
        throws SystemException {
        studentDetails = toUnwrappedModel(studentDetails);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(studentDetails)) {
                studentDetails = (StudentDetails) session.get(StudentDetailsImpl.class,
                        studentDetails.getPrimaryKeyObj());
            }

            if (studentDetails != null) {
                session.delete(studentDetails);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (studentDetails != null) {
            clearCache(studentDetails);
        }

        return studentDetails;
    }

    @Override
    public StudentDetails updateImpl(
        net.opentrends.studentdata.model.StudentDetails studentDetails)
        throws SystemException {
        studentDetails = toUnwrappedModel(studentDetails);

        boolean isNew = studentDetails.isNew();

        Session session = null;

        try {
            session = openSession();

            if (studentDetails.isNew()) {
                session.save(studentDetails);

                studentDetails.setNew(false);
            } else {
                session.merge(studentDetails);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !StudentDetailsModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(StudentDetailsModelImpl.ENTITY_CACHE_ENABLED,
            StudentDetailsImpl.class, studentDetails.getPrimaryKey(),
            studentDetails);

        clearUniqueFindersCache(studentDetails);
        cacheUniqueFindersCache(studentDetails);

        return studentDetails;
    }

    protected StudentDetails toUnwrappedModel(StudentDetails studentDetails) {
        if (studentDetails instanceof StudentDetailsImpl) {
            return studentDetails;
        }

        StudentDetailsImpl studentDetailsImpl = new StudentDetailsImpl();

        studentDetailsImpl.setNew(studentDetails.isNew());
        studentDetailsImpl.setPrimaryKey(studentDetails.getPrimaryKey());

        studentDetailsImpl.setStudentId(studentDetails.getStudentId());
        studentDetailsImpl.setStudentName(studentDetails.getStudentName());
        studentDetailsImpl.setDepartment(studentDetails.getDepartment());
        studentDetailsImpl.setSemester(studentDetails.getSemester());
        studentDetailsImpl.setGroupId(studentDetails.getGroupId());

        return studentDetailsImpl;
    }

    /**
     * Returns the student details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the student details
     * @return the student details
     * @throws net.opentrends.studentdata.NoSuchStudentDetailsException if a student details with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StudentDetails findByPrimaryKey(Serializable primaryKey)
        throws NoSuchStudentDetailsException, SystemException {
        StudentDetails studentDetails = fetchByPrimaryKey(primaryKey);

        if (studentDetails == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchStudentDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return studentDetails;
    }

    /**
     * Returns the student details with the primary key or throws a {@link net.opentrends.studentdata.NoSuchStudentDetailsException} if it could not be found.
     *
     * @param studentId the primary key of the student details
     * @return the student details
     * @throws net.opentrends.studentdata.NoSuchStudentDetailsException if a student details with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StudentDetails findByPrimaryKey(long studentId)
        throws NoSuchStudentDetailsException, SystemException {
        return findByPrimaryKey((Serializable) studentId);
    }

    /**
     * Returns the student details with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the student details
     * @return the student details, or <code>null</code> if a student details with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StudentDetails fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        StudentDetails studentDetails = (StudentDetails) EntityCacheUtil.getResult(StudentDetailsModelImpl.ENTITY_CACHE_ENABLED,
                StudentDetailsImpl.class, primaryKey);

        if (studentDetails == _nullStudentDetails) {
            return null;
        }

        if (studentDetails == null) {
            Session session = null;

            try {
                session = openSession();

                studentDetails = (StudentDetails) session.get(StudentDetailsImpl.class,
                        primaryKey);

                if (studentDetails != null) {
                    cacheResult(studentDetails);
                } else {
                    EntityCacheUtil.putResult(StudentDetailsModelImpl.ENTITY_CACHE_ENABLED,
                        StudentDetailsImpl.class, primaryKey,
                        _nullStudentDetails);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(StudentDetailsModelImpl.ENTITY_CACHE_ENABLED,
                    StudentDetailsImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return studentDetails;
    }

    /**
     * Returns the student details with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param studentId the primary key of the student details
     * @return the student details, or <code>null</code> if a student details with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StudentDetails fetchByPrimaryKey(long studentId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) studentId);
    }

    /**
     * Returns all the student detailses.
     *
     * @return the student detailses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<StudentDetails> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the student detailses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.studentdata.model.impl.StudentDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of student detailses
     * @param end the upper bound of the range of student detailses (not inclusive)
     * @return the range of student detailses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<StudentDetails> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the student detailses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.studentdata.model.impl.StudentDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of student detailses
     * @param end the upper bound of the range of student detailses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of student detailses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<StudentDetails> findAll(int start, int end,
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

        List<StudentDetails> list = (List<StudentDetails>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_STUDENTDETAILS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_STUDENTDETAILS;

                if (pagination) {
                    sql = sql.concat(StudentDetailsModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<StudentDetails>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<StudentDetails>(list);
                } else {
                    list = (List<StudentDetails>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Removes all the student detailses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (StudentDetails studentDetails : findAll()) {
            remove(studentDetails);
        }
    }

    /**
     * Returns the number of student detailses.
     *
     * @return the number of student detailses
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

                Query q = session.createQuery(_SQL_COUNT_STUDENTDETAILS);

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
     * Initializes the student details persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.net.opentrends.studentdata.model.StudentDetails")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<StudentDetails>> listenersList = new ArrayList<ModelListener<StudentDetails>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<StudentDetails>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(StudentDetailsImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
