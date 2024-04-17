package com.withings.weight.presentation.ui;

import com.withings.weight.presentation.entities.BodyCompGraphTags;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: BodyCompositionActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.ui.BodyCompositionActivity$getUiStateFlow$mainGraphsFlow$2", f = "BodyCompositionActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class h extends kotlin.coroutines.jvm.internal.i implements ym0.q<List<? extends ts.d>, List<? extends String>, qm0.d<? super List<? extends ts.d>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ List f47252a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ List f47253b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.weight.presentation.ui.h, kotlin.coroutines.jvm.internal.i] */
    @Override // ym0.q
    public final Object invoke(List<? extends ts.d> list, List<? extends String> list2, qm0.d<? super List<? extends ts.d>> dVar) {
        ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar);
        iVar.f47252a = list;
        iVar.f47253b = list2;
        return iVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        List list = this.f47252a;
        List list2 = this.f47253b;
        sm0.a<BodyCompGraphTags.NormalityZones> a11 = BodyCompGraphTags.NormalityZones.a();
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(a11, 10));
        Iterator it = ((kotlin.collections.c) a11).iterator();
        while (it.hasNext()) {
            arrayList.add(((BodyCompGraphTags.NormalityZones) it.next()).b());
        }
        List<ts.d> list3 = list;
        for (ts.d dVar : list3) {
            boolean z5 = false;
            if ((list2 != null || !arrayList.contains(dVar.g())) && (list2 == null || list2.contains(dVar.g()))) {
                z5 = true;
            }
            dVar.k(z5);
        }
        return list3;
    }
}
