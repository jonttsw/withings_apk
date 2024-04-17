package com.withings.manualLogging.ui.feature.addNote;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: AddSymptomsScreen.kt */
/* loaded from: classes4.dex */
final class p1 extends kotlin.jvm.internal.w implements ym0.l<xx.a, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ fx.e f41544a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<fx.f, nm0.y> f41545b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<fx.f> f41546c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.l<fx.f, nm0.y> f41547d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Context f41548e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p1(fx.e eVar, ym0.l<? super fx.f, nm0.y> lVar, List<fx.f> list, ym0.l<? super fx.f, nm0.y> lVar2, Context context) {
        super(1);
        this.f41544a = eVar;
        this.f41545b = lVar;
        this.f41546c = list;
        this.f41547d = lVar2;
        this.f41548e = context;
    }

    @Override // ym0.l
    public final nm0.y invoke(xx.a aVar) {
        xx.a checkBoxData = aVar;
        kotlin.jvm.internal.u.j(checkBoxData, "checkBoxData");
        boolean d11 = checkBoxData.d();
        Object obj = null;
        Context context = this.f41548e;
        if (d11) {
            ArrayList arrayList = new ArrayList();
            Iterator<fx.d> it = this.f41544a.iterator();
            while (it.hasNext()) {
                fx.d next = it.next();
                if (next instanceof fx.f) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                fx.f fVar = (fx.f) next2;
                if (kotlin.jvm.internal.u.e(pm.n.a(context, fVar.k(), fVar.j()), checkBoxData.c())) {
                    obj = next2;
                    break;
                }
            }
            fx.f fVar2 = (fx.f) obj;
            if (fVar2 != null) {
                this.f41545b.invoke(fVar2);
            }
        } else {
            Iterator<T> it3 = this.f41546c.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next3 = it3.next();
                fx.f fVar3 = (fx.f) next3;
                if (kotlin.jvm.internal.u.e(pm.n.a(context, fVar3.k(), fVar3.j()), checkBoxData.c())) {
                    obj = next3;
                    break;
                }
            }
            fx.f fVar4 = (fx.f) obj;
            if (fVar4 != null) {
                this.f41547d.invoke(fVar4);
            }
        }
        return nm0.y.f85009a;
    }
}
