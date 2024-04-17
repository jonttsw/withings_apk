package com.withings.nervehealth.ui;

import com.withings.graph.model.NormalityZoneUiModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: NerveHealthActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.NerveHealthActivity$initFlows$graphs$1", f = "NerveHealthActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class i extends kotlin.coroutines.jvm.internal.i implements ym0.q<l00.a, NormalityZoneUiModel, qm0.d<? super List<? extends ts.d>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ l00.a f42718a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ NormalityZoneUiModel f42719b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NerveHealthActivity f42720c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(NerveHealthActivity nerveHealthActivity, qm0.d<? super i> dVar) {
        super(3, dVar);
        this.f42720c = nerveHealthActivity;
    }

    @Override // ym0.q
    public final Object invoke(l00.a aVar, NormalityZoneUiModel normalityZoneUiModel, qm0.d<? super List<? extends ts.d>> dVar) {
        i iVar = new i(this.f42720c, dVar);
        iVar.f42718a = aVar;
        iVar.f42719b = normalityZoneUiModel;
        return iVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        l00.a aVar = this.f42718a;
        NormalityZoneUiModel normalityZoneUiModel = this.f42719b;
        ArrayList arrayList = new ArrayList();
        NerveHealthActivity nerveHealthActivity = this.f42720c;
        if (normalityZoneUiModel != null) {
            if (nerveHealthActivity.f42365n != null) {
                arrayList.add(u00.b.a(nerveHealthActivity, normalityZoneUiModel, false));
            } else {
                kotlin.jvm.internal.u.s("createNormalityZoneGraph");
                throw null;
            }
        }
        if (aVar != null) {
            o00.b bVar = nerveHealthActivity.f42364m;
            if (bVar != null) {
                o00.h hVar = nerveHealthActivity.f42363l;
                if (hVar != null) {
                    ts.e a11 = bVar.a(hVar.b(aVar.a()));
                    a11.l("TAG_MAIN_GRAPH");
                    arrayList.add(a11);
                } else {
                    kotlin.jvm.internal.u.s("createTimeGraphDatumFromNerveHealthMeasures");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.u.s("createNerveHealthGraph");
                throw null;
            }
        }
        return kotlin.collections.x.Q0(arrayList);
    }
}
