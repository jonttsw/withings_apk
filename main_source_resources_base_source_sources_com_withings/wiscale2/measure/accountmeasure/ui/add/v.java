package com.withings.wiscale2.measure.accountmeasure.ui.add;

import com.withings.library.measure.Measure;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: AddHeartRateFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.AddHeartRateFragment$loadLastMeasure$1", f = "AddHeartRateFragment.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class v extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f58280a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u f58281b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddHeartRateFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.AddHeartRateFragment$loadLastMeasure$1$1", f = "AddHeartRateFragment.kt", l = {59}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58282a;

        /* renamed from: b  reason: collision with root package name */
        u f58283b;

        /* renamed from: c  reason: collision with root package name */
        int f58284c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ u f58285d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u uVar, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f58285d = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f58285d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            u uVar;
            int i11;
            ky.a d11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i12 = this.f58284c;
            Measure measure = null;
            if (i12 != 0) {
                if (i12 == 1) {
                    i11 = this.f58282a;
                    uVar = this.f58283b;
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                uVar = this.f58285d;
                fy.p pVar = uVar.F;
                if (pVar != null) {
                    this.f58283b = uVar;
                    this.f58282a = 11;
                    this.f58284c = 1;
                    Object a11 = fy.p.a(pVar, uVar.getUser().q(), null, new int[]{11}, this, 54);
                    if (a11 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i11 = 11;
                    obj = a11;
                } else {
                    kotlin.jvm.internal.u.s("getMostRecentMeasuresGroup");
                    throw null;
                }
            }
            ky.d dVar = (ky.d) obj;
            if (dVar != null && (d11 = ly.a.d(i11, dVar)) != null) {
                measure = hy.g.d(d11, null);
            }
            uVar.B = measure;
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(u uVar, qm0.d<? super v> dVar) {
        super(2, dVar);
        this.f58281b = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new v(this.f58281b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((v) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Measure measure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f58280a;
        u uVar = this.f58281b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(uVar, null);
            this.f58280a = 1;
            if (BuildersKt.withContext(io2, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        measure = uVar.B;
        u.I1(uVar, measure);
        return nm0.y.f85009a;
    }
}
