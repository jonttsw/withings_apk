package com.withings.util.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.camera.camera2.internal.l0;
import androidx.fragment.app.o;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.util.log.Fail;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes4.dex */
public final class SqliteDatabaseWrapper {

    /* renamed from: d  reason: collision with root package name */
    private static final TreeMap f46341d = new TreeMap();

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f46342e = 0;

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f46343a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f46344b;

    /* renamed from: c  reason: collision with root package name */
    private final String f46345c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Function {

        /* renamed from: a  reason: collision with root package name */
        public static final Function f46346a;

        /* renamed from: b  reason: collision with root package name */
        public static final Function f46347b;

        /* renamed from: c  reason: collision with root package name */
        public static final Function f46348c;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ Function[] f46349d;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.util.database.SqliteDatabaseWrapper$Function] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.util.database.SqliteDatabaseWrapper$Function] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.util.database.SqliteDatabaseWrapper$Function] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.util.database.SqliteDatabaseWrapper$Function] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.util.database.SqliteDatabaseWrapper$Function] */
        static {
            ?? r02 = new Enum("MIN", 0);
            f46346a = r02;
            ?? r12 = new Enum("MAX", 1);
            f46347b = r12;
            ?? r22 = new Enum("AVG", 2);
            f46348c = r22;
            f46349d = new Function[]{r02, r12, r22, new Enum("SUM", 3), new Enum(ConstantsWs.MEASURE_TYPE_STEPS_UNIT, 4)};
        }

        private Function() {
            throw null;
        }

        public static Function valueOf(String str) {
            return (Function) Enum.valueOf(Function.class, str);
        }

        public static Function[] values() {
            return (Function[]) f46349d.clone();
        }
    }

    private SqliteDatabaseWrapper(String str, SQLiteDatabase sQLiteDatabase, boolean z5) {
        this.f46345c = str;
        this.f46343a = sQLiteDatabase;
        this.f46344b = z5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SqliteDatabaseWrapper g(String str, SQLiteDatabase sQLiteDatabase, boolean z5) {
        synchronized (SqliteDatabaseWrapper.class) {
            TreeMap treeMap = f46341d;
            if (treeMap.get(str) == null) {
                treeMap.put(str, new ReentrantLock());
            }
        }
        return new SqliteDatabaseWrapper(str, sQLiteDatabase, z5);
    }

    private void i() {
        ((ReentrantLock) f46341d.get(this.f46345c)).lock();
    }

    private void o() {
        ((ReentrantLock) f46341d.get(this.f46345c)).unlock();
    }

    public final void a() {
        Fail.c("Transaction can only happen in a writable db", this.f46344b);
        x70.b.r("SqliteDatabaseWrapper", "beginTransaction()", new Object[0]);
        i();
        this.f46343a.beginTransactionNonExclusive();
    }

    public final void b() {
        Fail.c("Close can only happen on a writable db", this.f46344b);
        SQLiteDatabase sQLiteDatabase = this.f46343a;
        if (sQLiteDatabase.inTransaction()) {
            sQLiteDatabase.close();
            return;
        }
        i();
        try {
            sQLiteDatabase.close();
        } finally {
            o();
        }
    }

    public final boolean c(String str, String str2) {
        Cursor rawQuery = this.f46343a.rawQuery(o.d("PRAGMA table_info(", str, ");"), null);
        try {
            if (rawQuery.getCount() == 0) {
                return false;
            }
            rawQuery.moveToFirst();
            int columnIndex = rawQuery.getColumnIndex("name");
            while (!rawQuery.isAfterLast()) {
                if (str2.equals(rawQuery.getString(columnIndex))) {
                    rawQuery.close();
                    return true;
                }
                rawQuery.moveToNext();
            }
            return false;
        } finally {
            rawQuery.close();
        }
    }

    public final void d(String str, String str2, String[] strArr) {
        Fail.c("Delete can only happen in a writable db", this.f46344b);
        SQLiteDatabase sQLiteDatabase = this.f46343a;
        if (sQLiteDatabase.inTransaction()) {
            sQLiteDatabase.delete(str, str2, strArr);
            return;
        }
        i();
        try {
            sQLiteDatabase.delete(str, str2, strArr);
        } finally {
            o();
        }
    }

    public final void e() {
        Fail.c("Transaction can only happen in a writable db", this.f46344b);
        x70.b.r("SqliteDatabaseWrapper", "endTransaction()", new Object[0]);
        this.f46343a.endTransaction();
        o();
    }

    public final void f(String str) {
        SQLiteDatabase sQLiteDatabase = this.f46343a;
        if (sQLiteDatabase.inTransaction()) {
            sQLiteDatabase.execSQL(str);
            return;
        }
        i();
        try {
            sQLiteDatabase.execSQL(str);
        } finally {
            o();
        }
    }

    public final Cursor h(String str, Function function, String str2, String str3, String[] strArr) {
        StringBuilder sb2 = new StringBuilder("SELECT ");
        sb2.append(function.toString());
        sb2.append("(");
        sb2.append(str2);
        sb2.append(") FROM ");
        sb2.append(str);
        if (!TextUtils.isEmpty(str3)) {
            sb2.append(" WHERE ");
            sb2.append(str3);
        }
        return this.f46343a.rawQuery(sb2.toString(), strArr);
    }

    public final long j(String str, ContentValues contentValues) {
        Fail.c("Insert can only happen in a writable db", this.f46344b);
        SQLiteDatabase sQLiteDatabase = this.f46343a;
        if (sQLiteDatabase.inTransaction()) {
            return sQLiteDatabase.insert(str, null, contentValues);
        }
        i();
        try {
            return sQLiteDatabase.insert(str, null, contentValues);
        } finally {
            o();
        }
    }

    public final Cursor k(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4) {
        return this.f46343a.query(str, strArr, str2, strArr2, null, null, str3, str4);
    }

    public final ArrayList l(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, a aVar) {
        Cursor query = this.f46343a.query(str, strArr, str2, strArr2, null, null, str3, str4);
        try {
            if (!query.moveToFirst()) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList(query.getCount());
            while (!query.isAfterLast()) {
                try {
                    arrayList.add(aVar.map(query, 0));
                } catch (IllegalArgumentException unused) {
                }
                query.moveToNext();
            }
            return arrayList;
        } finally {
            query.close();
        }
    }

    public final <T> T m(String str, String[] strArr, String str2, String[] strArr2, String str3, a<T> aVar) {
        Cursor query = this.f46343a.query(str, strArr, str2, strArr2, null, null, str3, "1");
        try {
            if (!query.moveToFirst()) {
                return null;
            }
            return aVar.map(query, 0);
        } catch (IllegalArgumentException unused) {
            return null;
        } finally {
            query.close();
        }
    }

    public final Cursor n(String str, String[] strArr) {
        return this.f46343a.rawQuery(str, strArr);
    }

    public final void p(String str, String str2, String str3) {
        if (c(str, str2)) {
            return;
        }
        StringBuilder b10 = l0.b("ALTER TABLE ", str, " ADD COLUMN ", str2, " ");
        b10.append(str3);
        b10.append(";");
        f(b10.toString());
    }

    public final void q() {
        Fail.c("Transaction can only happen in a writable db", this.f46344b);
        x70.b.r("SqliteDatabaseWrapper", "setTransactionSuccessful()", new Object[0]);
        this.f46343a.setTransactionSuccessful();
    }

    public final int r(String str, ContentValues contentValues, String str2, String[] strArr) {
        Fail.c("Update can only happen in a writable db", this.f46344b);
        SQLiteDatabase sQLiteDatabase = this.f46343a;
        if (sQLiteDatabase.inTransaction()) {
            return sQLiteDatabase.update(str, contentValues, str2, strArr);
        }
        i();
        try {
            return sQLiteDatabase.update(str, contentValues, str2, strArr);
        } finally {
            o();
        }
    }
}
