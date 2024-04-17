package com.withings.util.database2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.camera.camera2.internal.l0;
import com.withings.device.Device;
import com.withings.user.User;
import com.withings.util.log.Fail;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTime;
/* compiled from: SQLiteDAO.java */
/* loaded from: classes4.dex */
public abstract class m<T> {
    private SQLiteOpenHelper dbHelper;
    private p<T> table;

    public m(SQLiteOpenHelper sQLiteOpenHelper, p<T> pVar) {
        this.dbHelper = sQLiteOpenHelper;
        this.table = pVar;
    }

    private ContentValues getContentValues(T t11) {
        return getContentValues(t11, (List<c<T>>) this.table.d());
    }

    private List<T> mapCursorToEntities(Cursor cursor) {
        ArrayList arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            T newEntity = newEntity();
            for (c<T> cVar : this.table.d()) {
                cVar.getMapper().b(cVar, newEntity, cursor);
            }
            arrayList.add(newEntity);
        }
        return arrayList;
    }

    protected void addColumn(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        StringBuilder b10 = l0.b("ALTER TABLE ", str, " ADD COLUMN ", str2, " ");
        b10.append(str3);
        sQLiteDatabase.execSQL(b10.toString());
    }

    public List<Device> b() {
        return (List<T>) queryAll();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long count(l lVar) {
        return count(lVar.b(), lVar.c());
    }

    public void createTable(SQLiteDatabase sQLiteDatabase) {
        this.table.b(sQLiteDatabase);
    }

    public void delete(T t11) {
        Fail.e();
        l whereEq = whereEq(this.table.e(), getId(t11).longValue());
        this.dbHelper.getWritableDatabase().delete(this.table.f(), whereEq.b(), whereEq.c());
    }

    public void deleteAll() {
        this.dbHelper.getWritableDatabase().delete(this.table.f(), null, null);
    }

    public void dropTable(SQLiteDatabase sQLiteDatabase) {
        dropTable(sQLiteDatabase, this.table);
    }

    public List<User> getAll() {
        return (List<T>) queryAll();
    }

    /* renamed from: getById  reason: collision with other method in class */
    public User m33getById(long j5) {
        return (User) queryById(j5);
    }

    protected abstract Long getId(T t11);

    public SQLiteOpenHelper getOpenHelper() {
        return this.dbHelper;
    }

    public void insert(T t11) {
        Fail.e();
        setId(t11, this.dbHelper.getWritableDatabase().insertOrThrow(this.table.f(), null, getContentValues(t11)));
    }

    protected abstract T newEntity();

    /* JADX INFO: Access modifiers changed from: protected */
    public String order(c cVar, boolean z5) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.getNameWithTable());
        if (z5) {
            str = " ASC";
        } else {
            str = " DESC";
        }
        sb2.append(str);
        return sb2.toString();
    }

    protected List<T> query(String str, String[] strArr) {
        return query(str, strArr, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<T> queryAll() {
        return query((String) null, (String[]) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public T queryById(long j5) {
        return queryOne(whereEq(this.table.e(), j5));
    }

    protected List<T> queryDistinct(l lVar, String str, String str2, String str3) {
        return query(true, lVar.b(), lVar.c(), str, str2, str3);
    }

    protected T queryOne(String str, String[] strArr) {
        return queryOne(str, strArr, null);
    }

    protected abstract void setId(T t11, long j5);

    public void update(T t11) {
        Fail.e();
        l whereEq = whereEq(this.table.e(), getId(t11).longValue());
        this.dbHelper.getWritableDatabase().update(this.table.f(), getContentValues(t11), whereEq.b(), whereEq.c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public l whereEq(c cVar, String str) {
        return new l(cVar.getNameWithTable() + " = ?", new String[]{str});
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public l whereEqIgnoreCase(c cVar, String str) {
        return new l(cVar.getNameWithTable() + " = ? COLLATE NOCASE", new String[]{str});
    }

    protected l whereGreater(c cVar, c cVar2) {
        return new l(cVar.getNameWithTable() + " > " + cVar2.getNameWithTable());
    }

    protected l whereGreaterOrEqual(c cVar, long j5) {
        return l.g(cVar, j5);
    }

    protected l whereIn(c cVar, long[] jArr) {
        String[] strArr = new String[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            strArr[i11] = String.valueOf(jArr[i11]);
        }
        return l.i(cVar, strArr);
    }

    protected l whereLower(c cVar, long j5) {
        return l.j(cVar, j5);
    }

    protected l whereLowerOrEqual(c cVar, long j5) {
        return l.k(cVar, j5);
    }

    protected l whereNotEq(c cVar, String str) {
        return new l(cVar.getNameWithTable() + " != ?", new String[]{str});
    }

    protected l whereNotIn(c cVar, int[] iArr) {
        return l.m(cVar, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public l whereNotNull(c cVar) {
        return new l(cVar.getNameWithTable() + " IS NOT NULL");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public l whereNull(c cVar) {
        return new l(cVar.getNameWithTable() + " IS NULL");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long count(String str, String[] strArr) {
        Fail.e();
        return DatabaseUtils.queryNumEntries(this.dbHelper.getReadableDatabase(), this.table.f(), str, strArr);
    }

    protected void dropTable(SQLiteDatabase sQLiteDatabase, p pVar) {
        sQLiteDatabase.execSQL("DROP TABLE " + pVar.f());
    }

    public Device getById(long j5) {
        return (Device) queryById(j5);
    }

    protected <E> ContentValues getContentValues(E e11, List<c<E>> list) {
        ContentValues contentValues = new ContentValues();
        for (c<E> cVar : list) {
            cVar.getMapper().a(cVar, e11, contentValues);
        }
        return contentValues;
    }

    protected List<T> query(String str, String[] strArr, String str2) {
        return query(str, strArr, str2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public T queryOne(l lVar) {
        return queryOne(lVar, (String) null);
    }

    protected l whereEq(c cVar, DateTime dateTime) {
        return new l(cVar.getNameWithTable() + " = ?", new String[]{String.valueOf(dateTime.getMillis())});
    }

    protected l whereGreater(c cVar, long j5) {
        return new l(cVar.getNameWithTable() + " > ?", new String[]{String.valueOf(j5)});
    }

    protected l whereNotEq(c cVar, long j5) {
        return new l(cVar.getNameWithTable() + " != ?", new String[]{String.valueOf(j5)});
    }

    protected l whereNotIn(c cVar, long[] jArr) {
        return l.n(cVar, jArr);
    }

    protected List<T> query(String str, String[] strArr, String str2, String str3) {
        return query(false, str, strArr, null, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public T queryOne(l lVar, String str) {
        return queryOne(lVar.b(), lVar.c(), str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public l whereEq(c cVar, long j5) {
        return l.e(cVar, j5);
    }

    protected l whereNotEq(c cVar, boolean z5) {
        String str = cVar.getNameWithTable() + "! = ?";
        String[] strArr = new String[1];
        strArr[0] = z5 ? "1" : "0";
        return new l(str, strArr);
    }

    protected l whereNotIn(c cVar, String[] strArr) {
        return l.o(cVar, strArr);
    }

    protected int delete(String str, String[] strArr) {
        return this.dbHelper.getWritableDatabase().delete(this.table.f(), str, strArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<T> query(l lVar) {
        return query(lVar.b(), lVar.c(), (String) null);
    }

    protected T queryOne(String str, String[] strArr, String str2) {
        List<T> query = query(str, strArr, str2, "1");
        if (query.isEmpty()) {
            return null;
        }
        return query.get(0);
    }

    public void update(T t11, l lVar, c<T>... cVarArr) {
        Fail.e();
        this.dbHelper.getWritableDatabase().update(this.table.f(), getContentValues(t11, Arrays.asList(cVarArr)), lVar.b(), lVar.c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public l whereEq(c cVar, int i11) {
        return l.d(cVar, i11);
    }

    protected l whereNotEq(c cVar, DateTime dateTime) {
        return new l(cVar.getNameWithTable() + " != ?", new String[]{String.valueOf(dateTime.getMillis())});
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int delete(l lVar) {
        return delete(lVar.b(), lVar.c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<T> query(l lVar, String str) {
        return query(lVar, str, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public l whereEq(c cVar, boolean z5) {
        return l.f(cVar, z5);
    }

    protected l whereIn(c cVar, String[] strArr) {
        return l.i(cVar, strArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public l whereNotEq(c cVar, int i11) {
        return l.l(cVar, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<T> query(l lVar, String str, String str2) {
        return query(lVar.b(), lVar.c(), str, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public l whereIn(c cVar, int[] iArr) {
        return l.h(cVar, iArr);
    }

    protected List<T> query(boolean z5, String str, String[] strArr, String str2, String str3, String str4) {
        Fail.e();
        Cursor query = this.dbHelper.getReadableDatabase().query(z5, this.table.f(), this.table.c(), str, strArr, str2, null, str3, str4);
        try {
            return mapCursorToEntities(query);
        } finally {
            query.close();
        }
    }

    public void upgradeTable(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
    }
}
