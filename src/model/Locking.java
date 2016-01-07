package model;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.LockModeType;


public class Locking{
static LockModeType readLockType = LockModeType.PESSIMISTIC_READ;
static LockModeType writeLockType = LockModeType.PESSIMISTIC_WRITE;

public static void readLock(EntityManager em, Object o){
	em.lock(o,readLockType);
}

public static void writeLock(EntityManager em, Object o){
	em.lock(o,writeLockType);
}

public static LockModeType getReadLockType(){
	return readLockType;
}

public static LockModeType getWriteLockType(){
	return writeLockType;
}

}

