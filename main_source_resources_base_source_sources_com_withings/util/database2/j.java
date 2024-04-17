package com.withings.util.database2;

import android.content.ContentValues;
import android.database.Cursor;
import com.withings.util.database2.c;
import com.withings.util.log.Fail;
/* compiled from: IntColumn.java */
/* loaded from: classes4.dex */
public class j<T> extends c<T> {
    private c.a<T, Integer> getter;
    private c.InterfaceC0638c<T, Integer> setter;

    /* compiled from: IntColumn.java */
    /* loaded from: classes4.dex */
    final class a implements c.b<T> {
        a() {
        }

        @Override // com.withings.util.database2.c.b
        public final void a(c cVar, T t11, ContentValues contentValues) {
            contentValues.put(cVar.getName(), j.this.getValue(t11));
        }

        @Override // com.withings.util.database2.c.b
        public final void b(c cVar, T t11, Cursor cursor) {
            int columnIndex = cursor.getColumnIndex(cVar.getName());
            boolean isNull = cursor.isNull(columnIndex);
            j jVar = j.this;
            if (isNull) {
                if (cVar.isPrimitive()) {
                    jVar.setValue(t11, 0);
                    return;
                } else {
                    jVar.setValue(t11, null);
                    return;
                }
            }
            jVar.setValue(t11, Integer.valueOf(cursor.getInt(columnIndex)));
        }
    }

    public j(String str) {
        this(str, "INTEGER", (c.a) null, (c.InterfaceC0638c) null);
    }

    protected Integer getValue(T t11) {
        c.a<T, Integer> aVar = this.getter;
        if (aVar != null) {
            return aVar.f(t11);
        }
        Fail.j("You must override getValue, or provide a valid getter");
        return 0;
    }

    protected void setValue(T t11, Integer num) {
        c.InterfaceC0638c<T, Integer> interfaceC0638c = this.setter;
        if (interfaceC0638c != null) {
            interfaceC0638c.d(t11, num);
        } else {
            Fail.j("You must override setValue, or provide a valid setter");
        }
    }

    public j(String str, String str2) {
        this(str, str2, (c.a) null, (c.InterfaceC0638c) null);
    }

    public j(String str, boolean z5) {
        this(str, "INTEGER", (c.a) null, (c.InterfaceC0638c) null);
        setIsPrimitive(z5);
    }

    public j(String str, c.a<T, Integer> aVar, c.InterfaceC0638c<T, Integer> interfaceC0638c) {
        this(str, "INTEGER", aVar, interfaceC0638c);
    }

    public j(String str, boolean z5, c.a<T, Integer> aVar, c.InterfaceC0638c<T, Integer> interfaceC0638c) {
        this(str, "INTEGER", aVar, interfaceC0638c);
        setIsPrimitive(z5);
    }

    public j(String str, String str2, c.a<T, Integer> aVar, c.InterfaceC0638c<T, Integer> interfaceC0638c) {
        super(str, str2, null);
        this.getter = aVar;
        this.setter = interfaceC0638c;
        setMapper(new a());
    }
}
