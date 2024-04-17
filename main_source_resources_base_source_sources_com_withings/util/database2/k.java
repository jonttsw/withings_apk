package com.withings.util.database2;

import android.content.ContentValues;
import android.database.Cursor;
import com.withings.util.database2.c;
import com.withings.util.log.Fail;
/* compiled from: LongColumn.java */
/* loaded from: classes4.dex */
public class k<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    private c.a<T, Long> f46364a;

    /* renamed from: b  reason: collision with root package name */
    private c.InterfaceC0638c<T, Long> f46365b;

    /* compiled from: LongColumn.java */
    /* loaded from: classes4.dex */
    final class a implements c.b<T> {
        a() {
        }

        @Override // com.withings.util.database2.c.b
        public final void a(c cVar, T t11, ContentValues contentValues) {
            contentValues.put(cVar.getName(), k.this.a(t11));
        }

        @Override // com.withings.util.database2.c.b
        public final void b(c cVar, T t11, Cursor cursor) {
            int columnIndex = cursor.getColumnIndex(cVar.getName());
            boolean isNull = cursor.isNull(columnIndex);
            k kVar = k.this;
            if (isNull) {
                if (cVar.isPrimitive()) {
                    kVar.b(0L, t11);
                    return;
                } else {
                    kVar.b(null, t11);
                    return;
                }
            }
            kVar.b(Long.valueOf(cursor.getLong(columnIndex)), t11);
        }
    }

    public k(String str) {
        this(str, "INTEGER", null, null);
    }

    protected Long a(T t11) {
        c.a<T, Long> aVar = this.f46364a;
        if (aVar != null) {
            return aVar.f(t11);
        }
        Fail.j("You must override getValue, or provide a valid getter");
        return 0L;
    }

    protected void b(Long l5, Object obj) {
        c.InterfaceC0638c<T, Long> interfaceC0638c = this.f46365b;
        if (interfaceC0638c != null) {
            interfaceC0638c.d(obj, l5);
        } else {
            Fail.j("You must override setValue, or provide a valid setter");
        }
    }

    public k(String str, c.a<T, Long> aVar, c.InterfaceC0638c<T, Long> interfaceC0638c) {
        this(str, "INTEGER", aVar, interfaceC0638c);
    }

    public k(String str, String str2, c.a<T, Long> aVar, c.InterfaceC0638c<T, Long> interfaceC0638c) {
        super(str, str2, null);
        this.f46364a = aVar;
        this.f46365b = interfaceC0638c;
        setMapper(new a());
    }
}
