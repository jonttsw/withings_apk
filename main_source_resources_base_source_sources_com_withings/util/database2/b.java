package com.withings.util.database2;

import com.withings.util.database2.c;
import com.withings.util.log.Fail;
import u0.m0;
/* compiled from: BooleanColumn.java */
/* loaded from: classes4.dex */
public class b<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    private c.a<T, Boolean> f46355a;

    /* renamed from: b  reason: collision with root package name */
    private c.InterfaceC0638c<T, Boolean> f46356b;

    public b(String str, com.withings.reminder.database.b bVar, m0 m0Var) {
        super(str, "INTEGER", null);
        this.f46355a = bVar;
        this.f46356b = m0Var;
        setMapper(new a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean a(T t11) {
        c.a<T, Boolean> aVar = this.f46355a;
        if (aVar != null) {
            return aVar.f(t11);
        }
        Fail.j("You must override getValue, or provide a valid getter");
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(T t11, Boolean bool) {
        c.InterfaceC0638c<T, Boolean> interfaceC0638c = this.f46356b;
        if (interfaceC0638c != null) {
            interfaceC0638c.d(t11, bool);
        } else {
            Fail.j("You must override setValue, or provide a valid setter");
        }
    }

    public b(String str, boolean z5) {
        this(str, null, null);
        setIsPrimitive(z5);
    }
}
