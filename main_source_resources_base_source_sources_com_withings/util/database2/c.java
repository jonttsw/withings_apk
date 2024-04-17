package com.withings.util.database2;

import android.content.ContentValues;
import android.database.Cursor;
/* compiled from: Column.java */
/* loaded from: classes4.dex */
public class c<T> {
    private String definition;
    private boolean isPrimitive;
    private b<T> mapper;
    private String name;
    private String tableName;

    /* compiled from: Column.java */
    /* loaded from: classes4.dex */
    public interface a<T, Y> {
        Y f(T t11);
    }

    /* compiled from: Column.java */
    /* loaded from: classes4.dex */
    public interface b<T> {
        void a(c cVar, T t11, ContentValues contentValues);

        void b(c cVar, T t11, Cursor cursor);
    }

    /* compiled from: Column.java */
    /* renamed from: com.withings.util.database2.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0638c<T, Y> {
        void d(T t11, Y y11);
    }

    public c(String str, String str2, b<T> bVar) {
        this.name = str;
        this.definition = str2;
        this.mapper = bVar;
    }

    public String getDefinition() {
        return this.definition;
    }

    public b<T> getMapper() {
        return this.mapper;
    }

    public String getName() {
        return this.name;
    }

    public String getNameWithTable() {
        return this.tableName + "." + this.name;
    }

    public String getTableName() {
        return this.tableName;
    }

    public boolean isPrimitive() {
        return this.isPrimitive;
    }

    public void setDefinition(String str) {
        this.definition = str;
    }

    public void setIsPrimitive(boolean z5) {
        this.isPrimitive = z5;
    }

    public void setMapper(b<T> bVar) {
        this.mapper = bVar;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setTableName(String str) {
        this.tableName = str;
    }
}
