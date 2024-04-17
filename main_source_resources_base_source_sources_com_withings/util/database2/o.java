package com.withings.util.database2;

import com.withings.util.database2.c;
import com.withings.util.log.Fail;
/* compiled from: StringColumn.java */
/* loaded from: classes4.dex */
public class o<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    private c.a<T, String> f46370a;

    /* renamed from: b  reason: collision with root package name */
    private c.InterfaceC0638c<T, String> f46371b;

    public o(String str) {
        this(str, null, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a(T t11) {
        c.a<T, String> aVar = this.f46370a;
        if (aVar != null) {
            return aVar.f(t11);
        }
        Fail.j("You must override getValue, or provide a valid getter");
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(T t11, String str) {
        c.InterfaceC0638c<T, String> interfaceC0638c = this.f46371b;
        if (interfaceC0638c != null) {
            interfaceC0638c.d(t11, str);
        } else {
            Fail.j("You must override setValue, or provide a valid setter");
        }
    }

    public o(String str, c.a aVar, c.InterfaceC0638c interfaceC0638c, int i11) {
        super(str, "TEXT", null);
        this.f46370a = aVar;
        this.f46371b = interfaceC0638c;
        setMapper(new n(this));
    }
}
