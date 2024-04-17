package com.withings.nervehealth.ui;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.nervehealth.core.model.MeasureCategory;
import com.withings.periodsbar.Period;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NerveHealthMeasureListActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.NerveHealthMeasureListActivity$initMeasureListSections$1", f = "NerveHealthMeasureListActivity.kt", l = {ConstantsWs.MEASURE_TYPE_CAN, ConstantsWs.MEASURE_TYPE_NEPHRO, ConstantsWs.MEASURE_TYPE_VO2MAX_HR_MAX}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class f0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    ParcelableSnapshotMutableState f42513a;

    /* renamed from: b  reason: collision with root package name */
    int f42514b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NerveHealthMeasureListActivity f42515c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(NerveHealthMeasureListActivity nerveHealthMeasureListActivity, qm0.d<? super f0> dVar) {
        super(2, dVar);
        this.f42515c = nerveHealthMeasureListActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new f0(this.f42515c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((f0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState3;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState4;
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f42514b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        parcelableSnapshotMutableState4 = this.f42513a;
                        nm0.l.b(obj);
                        list = (List) obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    parcelableSnapshotMutableState4 = this.f42513a;
                    nm0.l.b(obj);
                    list = (List) obj;
                }
            } else {
                parcelableSnapshotMutableState4 = this.f42513a;
                nm0.l.b(obj);
                list = (List) obj;
            }
        } else {
            nm0.l.b(obj);
            NerveHealthMeasureListActivity nerveHealthMeasureListActivity = this.f42515c;
            parcelableSnapshotMutableState = nerveHealthMeasureListActivity.f42392k;
            parcelableSnapshotMutableState.setValue(null);
            parcelableSnapshotMutableState2 = nerveHealthMeasureListActivity.f42392k;
            parcelableSnapshotMutableState3 = nerveHealthMeasureListActivity.f42393l;
            int intValue = ((Number) parcelableSnapshotMutableState3.getValue()).intValue();
            if (intValue != 0) {
                if (intValue != 2) {
                    com.withings.nervehealth.ui.usecases.l lVar = nerveHealthMeasureListActivity.f42387f;
                    if (lVar != null) {
                        long D3 = NerveHealthMeasureListActivity.D3(nerveHealthMeasureListActivity);
                        MeasureCategory A3 = NerveHealthMeasureListActivity.A3(nerveHealthMeasureListActivity);
                        Period period = Period.f43723h;
                        this.f42513a = parcelableSnapshotMutableState2;
                        this.f42514b = 3;
                        obj = lVar.a(D3, A3, period, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        parcelableSnapshotMutableState4 = parcelableSnapshotMutableState2;
                        list = (List) obj;
                    } else {
                        kotlin.jvm.internal.u.s("getGuidedScanMeasureListSections");
                        throw null;
                    }
                } else {
                    com.withings.nervehealth.ui.usecases.f fVar = nerveHealthMeasureListActivity.f42388g;
                    if (fVar != null) {
                        long D32 = NerveHealthMeasureListActivity.D3(nerveHealthMeasureListActivity);
                        MeasureCategory A32 = NerveHealthMeasureListActivity.A3(nerveHealthMeasureListActivity);
                        Period period2 = Period.f43723h;
                        this.f42513a = parcelableSnapshotMutableState2;
                        this.f42514b = 2;
                        obj = fVar.a(D32, A32, period2, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        parcelableSnapshotMutableState4 = parcelableSnapshotMutableState2;
                        list = (List) obj;
                    } else {
                        kotlin.jvm.internal.u.s("getAllNerveHealthMeasureListSections");
                        throw null;
                    }
                }
            } else {
                com.withings.nervehealth.ui.usecases.q qVar = nerveHealthMeasureListActivity.f42386e;
                if (qVar != null) {
                    long D33 = NerveHealthMeasureListActivity.D3(nerveHealthMeasureListActivity);
                    MeasureCategory A33 = NerveHealthMeasureListActivity.A3(nerveHealthMeasureListActivity);
                    Period period3 = Period.f43725j;
                    this.f42513a = parcelableSnapshotMutableState2;
                    this.f42514b = 1;
                    obj = qVar.a(D33, A33, period3, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    parcelableSnapshotMutableState4 = parcelableSnapshotMutableState2;
                    list = (List) obj;
                } else {
                    kotlin.jvm.internal.u.s("getNeuropathyDiagnosticMeasureListSections");
                    throw null;
                }
            }
        }
        parcelableSnapshotMutableState4.setValue(list);
        return nm0.y.f85009a;
    }
}
