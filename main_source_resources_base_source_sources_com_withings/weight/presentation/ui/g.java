package com.withings.weight.presentation.ui;

import com.withings.common.compose.component.m4;
import com.withings.graph.axis.a;
import com.withings.graph.decorator.i;
import com.withings.weight.presentation.ui.BodyCompositionActivity;
import com.withings.wiscale2.C1987R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jm.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import l70.t;
import m90.e;
import org.joda.time.Interval;
import xs.c;
/* compiled from: BodyCompositionActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.ui.BodyCompositionActivity$getUiStateFlow$graphStateFlow$1", f = "BodyCompositionActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class g extends kotlin.coroutines.jvm.internal.i implements ym0.t<m4, List<? extends ws.c>, m90.c, Interval, List<? extends ts.d>, qm0.d<? super e.b.a>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ m4 f47243a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ List f47244b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ m90.c f47245c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Interval f47246d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ List f47247e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ BodyCompositionActivity f47248f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BodyCompositionActivity bodyCompositionActivity, qm0.d<? super g> dVar) {
        super(6, dVar);
        this.f47248f = bodyCompositionActivity;
    }

    @Override // ym0.t
    public final Object c(m4 m4Var, List<? extends ws.c> list, m90.c cVar, Interval interval, List<? extends ts.d> list2, qm0.d<? super e.b.a> dVar) {
        g gVar = new g(this.f47248f, dVar);
        gVar.f47243a = m4Var;
        gVar.f47244b = list;
        gVar.f47245c = cVar;
        gVar.f47246d = interval;
        gVar.f47247e = list2;
        return gVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        float f11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        m4 m4Var = this.f47243a;
        List list = this.f47244b;
        final m90.c cVar = this.f47245c;
        Interval interval = this.f47246d;
        List list2 = this.f47247e;
        List list3 = list;
        boolean z5 = false;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((ws.c) it.next()).b()) {
                    z5 = true;
                    break;
                }
            }
        }
        BodyCompositionActivity.a aVar = BodyCompositionActivity.f47115k;
        final BodyCompositionActivity bodyCompositionActivity = this.f47248f;
        bodyCompositionActivity.getClass();
        c.a aVar2 = xs.c.f107461a;
        String a11 = cVar.a();
        List<i.b> f12 = cVar.f();
        if (cVar.i() && !z5) {
            f11 = 100.0f;
        } else {
            f11 = 6.0f;
        }
        return new e.b.a(list2, m4Var, list, xs.d.b(a11, f12, f11, 6, 2.0f, false, androidx.core.content.a.getColor(bodyCompositionActivity, C1987R.color.datavizGridlineDefault), new a.b() { // from class: com.withings.weight.presentation.ui.c
            @Override // com.withings.graph.axis.a.b
            public final String c(float f13, float f14) {
                BodyCompositionActivity.a aVar3 = BodyCompositionActivity.f47115k;
                m90.c mainGraphUiModel = m90.c.this;
                kotlin.jvm.internal.u.j(mainGraphUiModel, "$mainGraphUiModel");
                BodyCompositionActivity this$0 = bodyCompositionActivity;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                if (mainGraphUiModel.i()) {
                    return xs.f.a().c(f13, f14);
                }
                l70.u g11 = a.d.a(this$0).g(1);
                if (g11 instanceof l70.t) {
                    int i11 = l70.t.f78812e;
                    l70.y a12 = t.a.a(f13);
                    int a13 = an0.a.a(a12.f78869b);
                    return a12.f78868a + ":" + a13;
                }
                return xs.f.a().c(ay.a.d(g11, f13), f14);
            }
        }, 96).c(new a(interval)));
    }
}
