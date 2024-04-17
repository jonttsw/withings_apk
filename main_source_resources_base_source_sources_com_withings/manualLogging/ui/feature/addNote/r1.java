package com.withings.manualLogging.ui.feature.addNote;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AddSymptomsScreen.kt */
/* loaded from: classes4.dex */
final class r1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<fx.f> f41561a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f41562b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ fx.e f41563c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.l<fx.f, nm0.y> f41564d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.l<fx.f, nm0.y> f41565e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.l<fx.f, nm0.y> f41566f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r1(List<fx.f> list, Context context, fx.e eVar, ym0.l<? super fx.f, nm0.y> lVar, ym0.l<? super fx.f, nm0.y> lVar2, ym0.l<? super fx.f, nm0.y> lVar3) {
        super(2);
        this.f41561a = list;
        this.f41562b = context;
        this.f41563c = eVar;
        this.f41564d = lVar;
        this.f41565e = lVar2;
        this.f41566f = lVar3;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        boolean z5;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            List<fx.f> list = this.f41561a;
            List<fx.f> list2 = list;
            ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list2, 10));
            for (fx.f fVar : list2) {
                String a11 = pm.n.a(this.f41562b, fVar.k(), fVar.j());
                boolean contains = this.f41563c.contains(fVar);
                if (fVar.e().length() > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                arrayList.add(new xx.a(a11, contains, z5));
            }
            xx.h.a(512, aVar2, arrayList, new p1(this.f41563c, this.f41564d, this.f41561a, this.f41565e, this.f41562b), new q1(this.f41566f, list));
        }
        return nm0.y.f85009a;
    }
}
