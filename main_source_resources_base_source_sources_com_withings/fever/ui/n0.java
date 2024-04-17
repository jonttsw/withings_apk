package com.withings.fever.ui;

import com.withings.user.core.models.User;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes3.dex */
public final class n0 implements Flow<List<? extends as.h>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f39371a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o0 f39372b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ User f39373c;

    /* compiled from: Emitters.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f39374a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o0 f39375b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ User f39376c;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.fever.ui.BodyTemperatureViewModel$temperatureData$lambda$7$$inlined$map$1$2", f = "BodyTemperatureViewModel.kt", l = {223}, m = "emit")
        /* renamed from: com.withings.fever.ui.n0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0514a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f39377a;

            /* renamed from: b  reason: collision with root package name */
            int f39378b;

            public C0514a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f39377a = obj;
                this.f39378b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector, o0 o0Var, User user) {
            this.f39374a = flowCollector;
            this.f39375b = o0Var;
            this.f39376c = user;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r13, qm0.d r14) {
            /*
                Method dump skipped, instructions count: 327
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.fever.ui.n0.a.emit(java.lang.Object, qm0.d):java.lang.Object");
        }
    }

    public n0(Flow flow, o0 o0Var, User user) {
        this.f39371a = flow;
        this.f39372b = o0Var;
        this.f39373c = user;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super List<? extends as.h>> flowCollector, qm0.d dVar) {
        Object collect = this.f39371a.collect(new a(flowCollector, this.f39372b, this.f39373c), dVar);
        if (collect == CoroutineSingletons.f76214a) {
            return collect;
        }
        return nm0.y.f85009a;
    }
}
