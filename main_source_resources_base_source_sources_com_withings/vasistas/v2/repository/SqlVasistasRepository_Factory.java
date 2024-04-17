package com.withings.vasistas.v2.repository;

import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class SqlVasistasRepository_Factory implements b<SqlVasistasRepository> {
    private final Provider<SqlVasistasDao> sqlVasistasDaoProvider;

    public SqlVasistasRepository_Factory(Provider<SqlVasistasDao> provider) {
        this.sqlVasistasDaoProvider = provider;
    }

    public static SqlVasistasRepository_Factory create(Provider<SqlVasistasDao> provider) {
        return new SqlVasistasRepository_Factory(provider);
    }

    public static SqlVasistasRepository newInstance(SqlVasistasDao sqlVasistasDao) {
        return new SqlVasistasRepository(sqlVasistasDao);
    }

    @Override // javax.inject.Provider
    public SqlVasistasRepository get() {
        return newInstance(this.sqlVasistasDaoProvider.get());
    }
}
