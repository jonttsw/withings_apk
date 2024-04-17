package com.withings.wiscale2.vo2max.view;

import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import com.withings.vo2max.core.Vo2MaxStatus;
import m80.a;
/* compiled from: Vo2maxHeader.kt */
/* loaded from: classes5.dex */
public final class w1 extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private xw.m<Integer> f62849a;

    /* renamed from: b  reason: collision with root package name */
    private xw.m<Vo2MaxStatus> f62850b;

    /* renamed from: c  reason: collision with root package name */
    private xw.m<a.d> f62851c;

    public w1(MeasuresGroup vo2maxMeasureGroup, User user) {
        boolean z5;
        kotlin.jvm.internal.u.j(vo2maxMeasureGroup, "vo2maxMeasureGroup");
        kotlin.jvm.internal.u.j(user, "user");
        xw.m<Integer> mVar = new xw.m<>();
        this.f62849a = mVar;
        xw.m<Vo2MaxStatus> mVar2 = new xw.m<>();
        this.f62850b = mVar2;
        xw.m<a.d> mVar3 = new xw.m<>();
        this.f62851c = mVar3;
        int i11 = m80.a.f81744h;
        int d11 = user.d();
        if (user.p() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        mVar3.setValue(a.C1293a.f(d11, z5));
        mVar.setValue(Integer.valueOf(an0.a.a(vo2maxMeasureGroup.getMeasureForType(123).f95794y)));
        mVar2.setValue(a.C1293a.g((a.d) mVar3.getValue(), ((Number) mVar.getValue()).intValue()));
    }

    public final xw.m<a.d> f0() {
        return this.f62851c;
    }

    public final xw.m<Vo2MaxStatus> g0() {
        return this.f62850b;
    }

    public final xw.m<Integer> i0() {
        return this.f62849a;
    }
}
