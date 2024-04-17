package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.device.Device;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SleepScoreSnoringDisabledActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreSnoringDisabledActivity$changeDeviceState$1", f = "SleepScoreSnoringDisabledActivity.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class p3 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f61188a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SleepScoreSnoringDisabledActivity f61189b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepScoreSnoringDisabledActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreSnoringDisabledActivity$changeDeviceState$1$1", f = "SleepScoreSnoringDisabledActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SleepScoreSnoringDisabledActivity f61190a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SleepScoreSnoringDisabledActivity sleepScoreSnoringDisabledActivity, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f61190a = sleepScoreSnoringDisabledActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f61190a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            Device device = (Device) kotlin.collections.x.K(kn.e.c().j(SleepScoreSnoringDisabledActivity.A3(this.f61190a).q(), 63));
            if (device != null) {
                device.setIsMicMuted(false);
                kn.e.c().t(device);
                return nm0.y.f85009a;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(SleepScoreSnoringDisabledActivity sleepScoreSnoringDisabledActivity, qm0.d<? super p3> dVar) {
        super(2, dVar);
        this.f61189b = sleepScoreSnoringDisabledActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new p3(this.f61189b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((p3) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f61188a;
        SleepScoreSnoringDisabledActivity sleepScoreSnoringDisabledActivity = this.f61189b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(sleepScoreSnoringDisabledActivity, null);
            this.f61188a = 1;
            if (BuildersKt.withContext(io2, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        SleepScoreSnoringDisabledActivity.B3(sleepScoreSnoringDisabledActivity, false);
        return nm0.y.f85009a;
    }
}
