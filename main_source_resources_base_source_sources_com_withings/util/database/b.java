package com.withings.util.database;
/* compiled from: DAO.java */
/* loaded from: classes4.dex */
public abstract class b {
    private c helper;

    public void beginTransaction() {
        getHelper().j();
    }

    public void endTransaction() {
        getHelper().p();
    }

    public abstract String[] getCreateTableQuery();

    /* JADX INFO: Access modifiers changed from: protected */
    public c getHelper() {
        return this.helper;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setHelper(c cVar) {
        this.helper = cVar;
    }

    public void setTransactionSuccessful() {
        getHelper().o();
    }
}
