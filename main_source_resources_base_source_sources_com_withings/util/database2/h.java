package com.withings.util.database2;
/* compiled from: FloatColumn.java */
/* loaded from: classes4.dex */
public class h<T> extends c<T> {
    public h(String str, int i11) {
        this(str, (Object) null);
        setIsPrimitive(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Float a(T t11) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(T t11, Float f11) {
        throw null;
    }

    public h(String str, Object obj) {
        super(str, "REAL", null);
        setMapper(new g(this));
    }
}
