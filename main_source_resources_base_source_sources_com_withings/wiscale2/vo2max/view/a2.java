package com.withings.wiscale2.vo2max.view;

import android.app.Application;
import com.withings.library.measure.MeasuresGroup;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: Vo2maxNote.kt */
/* loaded from: classes5.dex */
public final class a2 extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final zx.r f62686a;

    /* renamed from: b  reason: collision with root package name */
    private final MeasuresGroup f62687b;

    /* renamed from: c  reason: collision with root package name */
    private final fy.c0 f62688c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.lifecycle.k0<String> f62689d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(Application application, zx.r rVar, MeasuresGroup measureGroup, fy.c0 c0Var) {
        super(application);
        kotlin.jvm.internal.u.j(measureGroup, "measureGroup");
        this.f62686a = rVar;
        this.f62687b = measureGroup;
        this.f62688c = c0Var;
        androidx.lifecycle.k0<String> k0Var = new androidx.lifecycle.k0<>();
        this.f62689d = k0Var;
        k0Var.setValue(measureGroup.getComment());
    }

    public final androidx.lifecycle.k0<String> i0() {
        return this.f62689d;
    }

    public final void j0(String comment) {
        kotlin.jvm.internal.u.j(comment, "comment");
        this.f62689d.setValue(comment);
        MeasuresGroup measuresGroup = this.f62687b;
        measuresGroup.setComment(comment);
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new z1(this, measuresGroup, null), 2, null);
    }
}
