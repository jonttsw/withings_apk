package com.withings.wiscale2.measure.accountmeasure.ui.add;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import com.withings.wiscale2.measure.accountmeasure.ui.add.h0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: AddHeartRateCameraFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.AddHeartRateCameraFragment$saveMeasure$1$1", f = "AddHeartRateCameraFragment.kt", l = {ConstantsWs.WS_STATUS_WRONGDEPLOYGRP}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class q extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f58265a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m f58266b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MeasuresGroup f58267c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddHeartRateCameraFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.AddHeartRateCameraFragment$saveMeasure$1$1$1", f = "AddHeartRateCameraFragment.kt", l = {ConstantsWs.WS_STATUS_WRONGDEVICEINCREMENT}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58268a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f58269b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MeasuresGroup f58270c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, MeasuresGroup measuresGroup, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f58269b = mVar;
            this.f58270c = measuresGroup;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f58269b, this.f58270c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = CoroutineSingletons.f76214a;
            int i11 = this.f58268a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                m mVar = this.f58269b;
                User user = mVar.getUser();
                this.f58268a = 1;
                mVar.getClass();
                Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new p(mVar, user, this.f58270c, null), this);
                if (withContext != obj2) {
                    withContext = nm0.y.f85009a;
                }
                if (withContext == obj2) {
                    return obj2;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m mVar, MeasuresGroup measuresGroup, qm0.d<? super q> dVar) {
        super(2, dVar);
        this.f58266b = mVar;
        this.f58267c = measuresGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new q(this.f58266b, this.f58267c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((q) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f58265a;
        MeasuresGroup measuresGroup = this.f58267c;
        m mVar = this.f58266b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(mVar, measuresGroup, null);
            this.f58265a = 1;
            if (BuildersKt.withContext(io2, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        h0.a t12 = mVar.t1();
        if (t12 != null) {
            t12.b2(measuresGroup);
        }
        return nm0.y.f85009a;
    }
}
