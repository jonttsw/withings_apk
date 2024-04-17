package com.withings.util.database2;

import android.content.ContentValues;
import android.database.Cursor;
import com.withings.util.database2.c;
import com.withings.util.log.Fail;
import org.joda.time.DateTime;
/* compiled from: DateTimeColumn.java */
/* loaded from: classes4.dex */
public class d<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    private c.a<T, DateTime> f46357a;

    /* renamed from: b  reason: collision with root package name */
    private c.InterfaceC0638c<T, DateTime> f46358b;

    /* compiled from: DateTimeColumn.java */
    /* loaded from: classes4.dex */
    final class a implements c.b<T> {
        a() {
        }

        @Override // com.withings.util.database2.c.b
        public final void a(c cVar, T t11, ContentValues contentValues) {
            Long l5;
            DateTime a11 = d.this.a(t11);
            String name = cVar.getName();
            if (a11 != null) {
                l5 = Long.valueOf(a11.getMillis());
            } else {
                l5 = null;
            }
            contentValues.put(name, l5);
        }

        @Override // com.withings.util.database2.c.b
        public final void b(c cVar, T t11, Cursor cursor) {
            DateTime dateTime;
            int columnIndex = cursor.getColumnIndex(cVar.getName());
            if (!cursor.isNull(columnIndex)) {
                if (cursor.isNull(columnIndex)) {
                    dateTime = null;
                } else {
                    dateTime = new DateTime(cursor.getLong(columnIndex));
                }
                d.this.b(t11, dateTime);
            }
        }
    }

    public d(String str, boolean z5) {
        this(str, "INTEGER".concat(z5 ? "NOT NULL DEFAULT CURRENT_TIMESTAMP" : ""), null, null);
    }

    protected DateTime a(T t11) {
        c.a<T, DateTime> aVar = this.f46357a;
        if (aVar != null) {
            return aVar.f(t11);
        }
        Fail.j("You must override getValue, or provide a valid getter");
        return new DateTime();
    }

    protected void b(T t11, DateTime dateTime) {
        c.InterfaceC0638c<T, DateTime> interfaceC0638c = this.f46358b;
        if (interfaceC0638c != null) {
            interfaceC0638c.d(t11, dateTime);
        } else {
            Fail.j("You must override setValue, or provide a valid setter");
        }
    }

    public d(String str, c.a aVar, c.InterfaceC0638c interfaceC0638c) {
        this(str, "INTEGER".concat(""), aVar, interfaceC0638c);
    }

    public d(String str, String str2, c.a<T, DateTime> aVar, c.InterfaceC0638c<T, DateTime> interfaceC0638c) {
        super(str, str2, null);
        this.f46357a = aVar;
        this.f46358b = interfaceC0638c;
        setMapper(new a());
    }
}
