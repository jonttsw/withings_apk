package com.withings.wiscale2.heart.afib;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AFibMeasuresListActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.afib.AFibMeasuresViewModel", f = "AFibMeasuresListActivity.kt", l = {120, 123, 126}, m = "getMeasures")
/* loaded from: classes5.dex */
public final class x extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    Object f57265a;

    /* renamed from: b  reason: collision with root package name */
    List f57266b;

    /* renamed from: c  reason: collision with root package name */
    l f57267c;

    /* renamed from: d  reason: collision with root package name */
    ArrayList f57268d;

    /* renamed from: e  reason: collision with root package name */
    boolean f57269e;

    /* renamed from: f  reason: collision with root package name */
    boolean f57270f;

    /* renamed from: g  reason: collision with root package name */
    /* synthetic */ Object f57271g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ v f57272h;

    /* renamed from: i  reason: collision with root package name */
    int f57273i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(v vVar, qm0.d<? super x> dVar) {
        super(dVar);
        this.f57272h = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f57271g = obj;
        this.f57273i |= Integer.MIN_VALUE;
        return v.f0(this.f57272h, false, false, false, this);
    }
}
