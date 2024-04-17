package com.withings.util.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.withings.library.authentication.api.ConstantsWs;
/* compiled from: DatabaseHelper.java */
/* loaded from: classes4.dex */
public class c extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.collection.a<Class, b> f46350a;

    /* renamed from: b  reason: collision with root package name */
    private final String f46351b;

    /* renamed from: c  reason: collision with root package name */
    private SqliteDatabaseWrapper f46352c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f46353d;

    public c(Context context, b... bVarArr) {
        super(context, "Withings-WiScale", (SQLiteDatabase.CursorFactory) null, 215);
        this.f46350a = new androidx.collection.a<>();
        this.f46353d = context;
        this.f46351b = "Withings-WiScale";
        for (b bVar : bVarArr) {
            bVar.setHelper(this);
            this.f46350a.put(bVar.getClass(), bVar);
        }
    }

    public final void a() {
        try {
            e().b();
        } catch (Exception e11) {
            x70.b.e(this, e11);
        }
        close();
        this.f46353d.deleteDatabase(this.f46351b);
    }

    public final <T extends b> T b(Class<T> cls) {
        return (T) this.f46350a.get(cls);
    }

    public final SqliteDatabaseWrapper c() {
        SQLiteDatabase readableDatabase = super.getReadableDatabase();
        SqliteDatabaseWrapper sqliteDatabaseWrapper = this.f46352c;
        if (sqliteDatabaseWrapper == null) {
            return d(readableDatabase, false);
        }
        return sqliteDatabaseWrapper;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final SqliteDatabaseWrapper d(SQLiteDatabase sQLiteDatabase, boolean z5) {
        String str = this.f46351b;
        if (str == null) {
            str = ConstantsWs.PARAMETER_VALUE_NULL;
        }
        return SqliteDatabaseWrapper.g(str, sQLiteDatabase, z5);
    }

    public final SqliteDatabaseWrapper e() {
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        SqliteDatabaseWrapper sqliteDatabaseWrapper = this.f46352c;
        if (sqliteDatabaseWrapper == null) {
            return d(writableDatabase, true);
        }
        return sqliteDatabaseWrapper;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @Deprecated
    public final SQLiteDatabase getReadableDatabase() {
        return super.getReadableDatabase();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @Deprecated
    public final SQLiteDatabase getWritableDatabase() {
        return super.getWritableDatabase();
    }

    public final void j() {
        e().a();
    }

    public final void o() {
        e().q();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        for (b bVar : this.f46350a.values()) {
            for (String str : bVar.getCreateTableQuery()) {
                sQLiteDatabase.execSQL(str);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        this.f46352c = null;
        sQLiteDatabase.setMaxSqlCacheSize(100);
        if (sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL("PRAGMA synchronous=OFF;");
            return;
        }
        sQLiteDatabase.enableWriteAheadLogging();
        sQLiteDatabase.execSQL("PRAGMA synchronous=NORMAL;");
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        this.f46352c = d(sQLiteDatabase, true);
    }

    public final void p() {
        e().e();
    }
}
