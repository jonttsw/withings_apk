package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.wiscale2.track.data.Track;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SleepScoreRegularityActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreRegularityActivity$loadAndShowData$1", f = "SleepScoreRegularityActivity.kt", l = {128}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class h3 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    SleepScoreRegularityActivity f61011a;

    /* renamed from: b  reason: collision with root package name */
    int f61012b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SleepScoreRegularityActivity f61013c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepScoreRegularityActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreRegularityActivity$loadAndShowData$1$1", f = "SleepScoreRegularityActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super List<? extends Track>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SleepScoreRegularityActivity f61014a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SleepScoreRegularityActivity sleepScoreRegularityActivity, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f61014a = sleepScoreRegularityActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f61014a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<? extends Track>> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            return SleepScoreRegularityActivity.J3(this.f61014a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(SleepScoreRegularityActivity sleepScoreRegularityActivity, qm0.d<? super h3> dVar) {
        super(2, dVar);
        this.f61013c = sleepScoreRegularityActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new h3(this.f61013c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((h3) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SleepScoreRegularityActivity sleepScoreRegularityActivity;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f61012b;
        if (i11 != 0) {
            if (i11 == 1) {
                sleepScoreRegularityActivity = this.f61011a;
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            SleepScoreRegularityActivity sleepScoreRegularityActivity2 = this.f61013c;
            a aVar = new a(sleepScoreRegularityActivity2, null);
            this.f61011a = sleepScoreRegularityActivity2;
            this.f61012b = 1;
            obj = BuildersKt.withContext(io2, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            sleepScoreRegularityActivity = sleepScoreRegularityActivity2;
        }
        SleepScoreRegularityActivity.M3(sleepScoreRegularityActivity, (List) obj);
        return nm0.y.f85009a;
    }
}
