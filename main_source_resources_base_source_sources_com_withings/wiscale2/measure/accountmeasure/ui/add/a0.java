package com.withings.wiscale2.measure.accountmeasure.ui.add;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.measure.accountmeasure.ui.add.h0;
import com.withings.wiscale2.measure.heartrate.HeartRateHandler;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: AddMeasureActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.AddMeasureActivity$checkCameraAvailableAndShowHeartRateFragment$1", f = "AddMeasureActivity.kt", l = {ConstantsWs.MEASURE_TYPE_VASCULAR_AGE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class a0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    AddMeasureActivity f58123a;

    /* renamed from: b  reason: collision with root package name */
    int f58124b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AddMeasureActivity f58125c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddMeasureActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.AddMeasureActivity$checkCameraAvailableAndShowHeartRateFragment$1$1$isCameraAvailabe$1", f = "AddMeasureActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Boolean>, Object> {
        a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new kotlin.coroutines.jvm.internal.i(2, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Boolean> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            return Boolean.valueOf(HeartRateHandler.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(AddMeasureActivity addMeasureActivity, qm0.d<? super a0> dVar) {
        super(2, dVar);
        this.f58125c = addMeasureActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new a0(this.f58125c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((a0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        AddMeasureActivity addMeasureActivity;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f58124b;
        AddMeasureActivity addMeasureActivity2 = this.f58125c;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    addMeasureActivity = this.f58123a;
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                ?? iVar = new kotlin.coroutines.jvm.internal.i(2, null);
                this.f58123a = addMeasureActivity2;
                this.f58124b = 1;
                obj = BuildersKt.withContext(io2, iVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                addMeasureActivity = addMeasureActivity2;
            }
            if (!((Boolean) obj).booleanValue()) {
                addMeasureActivity.F3();
            } else {
                int i12 = m.W;
                long B3 = addMeasureActivity.B3();
                boolean C3 = addMeasureActivity.C3();
                h0.b bVar = h0.f58177j;
                m mVar = new m();
                bVar.getClass();
                h0.b.a(mVar, B3, C3);
                addMeasureActivity.E3(mVar);
            }
            a11 = nm0.y.f85009a;
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        if (nm0.k.b(a11) != null) {
            addMeasureActivity2.F3();
        }
        return nm0.y.f85009a;
    }
}
