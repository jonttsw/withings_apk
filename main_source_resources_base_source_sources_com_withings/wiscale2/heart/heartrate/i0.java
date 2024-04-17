package com.withings.wiscale2.heart.heartrate;

import com.withings.library.authentication.api.ConstantsWs;
import java.util.Iterator;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeartRateDayFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.heartrate.HeartRateDayViewModel", f = "HeartRateDayFragment.kt", l = {ConstantsWs.WS_STATUS_BAD_OBJECT}, m = "downloadVasistas")
/* loaded from: classes5.dex */
public final class i0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    e0 f57662a;

    /* renamed from: b  reason: collision with root package name */
    DateTime f57663b;

    /* renamed from: c  reason: collision with root package name */
    Iterator f57664c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f57665d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ e0 f57666e;

    /* renamed from: f  reason: collision with root package name */
    int f57667f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(e0 e0Var, qm0.d<? super i0> dVar) {
        super(dVar);
        this.f57666e = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f57665d = obj;
        this.f57667f |= Integer.MIN_VALUE;
        return e0.f0(this.f57666e, this);
    }
}
