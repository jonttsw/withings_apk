package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.wiscale2.sleep.ui.sleepscore.SecondarySleepActivity;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SecondarySleepActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SecondarySleepActivity$loadAndShowData$1", f = "SecondarySleepActivity.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class r extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    SecondarySleepActivity f61211a;

    /* renamed from: b  reason: collision with root package name */
    int f61212b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SecondarySleepActivity f61213c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k60.b f61214d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SecondarySleepActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SecondarySleepActivity$loadAndShowData$1$1", f = "SecondarySleepActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super SecondarySleepActivity.b>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SecondarySleepActivity f61215a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k60.b f61216b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SecondarySleepActivity secondarySleepActivity, k60.b bVar, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f61215a = secondarySleepActivity;
            this.f61216b = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f61215a, this.f61216b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super SecondarySleepActivity.b> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            return SecondarySleepActivity.z3(this.f61215a, this.f61216b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(SecondarySleepActivity secondarySleepActivity, k60.b bVar, qm0.d<? super r> dVar) {
        super(2, dVar);
        this.f61213c = secondarySleepActivity;
        this.f61214d = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new r(this.f61213c, this.f61214d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((r) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SecondarySleepActivity secondarySleepActivity;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f61212b;
        if (i11 != 0) {
            if (i11 == 1) {
                secondarySleepActivity = this.f61211a;
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            SecondarySleepActivity secondarySleepActivity2 = this.f61213c;
            a aVar = new a(secondarySleepActivity2, this.f61214d, null);
            this.f61211a = secondarySleepActivity2;
            this.f61212b = 1;
            obj = BuildersKt.withContext(io2, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            secondarySleepActivity = secondarySleepActivity2;
        }
        SecondarySleepActivity.C3(secondarySleepActivity, (SecondarySleepActivity.b) obj);
        return nm0.y.f85009a;
    }
}
