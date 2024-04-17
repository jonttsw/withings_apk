package com.withings.fever.ui;

import androidx.compose.runtime.a;
import com.withings.graph.GraphPeriod;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
/* compiled from: BodyTemperatureScreen.kt */
/* loaded from: classes3.dex */
final class x extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f39478a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.s<GraphPeriod, Integer, Integer, Integer, Boolean, nm0.y> f39479b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.p0<k1.r0<Boolean>> f39480c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ at.a f39481d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k1.r0<List<as.h>> f39482e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(ym0.a<nm0.y> aVar, ym0.s<? super GraphPeriod, ? super Integer, ? super Integer, ? super Integer, ? super Boolean, nm0.y> sVar, kotlin.jvm.internal.p0<k1.r0<Boolean>> p0Var, at.a aVar2, k1.r0<List<as.h>> r0Var) {
        super(3);
        this.f39478a = aVar;
        this.f39479b = sVar;
        this.f39480c = p0Var;
        this.f39481d = aVar2;
        this.f39482e = r0Var;
    }

    @Override // ym0.q
    public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
        Object obj;
        l0.i AnimatedVisibility = iVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
        aVar2.s(-599270562);
        Object t11 = aVar2.t();
        Object a11 = a.C0060a.a();
        k1.r0<List<as.h>> r0Var = this.f39482e;
        if (t11 == a11) {
            boolean booleanValue = this.f39480c.f76257a.getValue().booleanValue();
            at.a aVar3 = this.f39481d;
            if (booleanValue) {
                t11 = as.k.a(r0Var.getValue(), aVar3);
            } else {
                Iterator<T> it = r0Var.getValue().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (hn.a.e(((as.h) obj).a(), aVar3.c())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                as.h hVar = (as.h) obj;
                if (hVar != null) {
                    t11 = hVar.a();
                } else {
                    t11 = null;
                }
            }
            if (t11 == null) {
                t11 = DateTime.now();
            }
            aVar2.n(t11);
        }
        DateTime dateTime = (DateTime) t11;
        aVar2.J();
        kotlin.jvm.internal.u.g(dateTime);
        List<as.h> value = r0Var.getValue();
        aVar2.s(-599270088);
        ym0.a<nm0.y> aVar4 = this.f39478a;
        boolean K = aVar2.K(aVar4);
        Object t12 = aVar2.t();
        if (K || t12 == a.C0060a.a()) {
            t12 = new w(aVar4);
            aVar2.n(t12);
        }
        aVar2.J();
        as.a.a(false, value, (ym0.l) t12, this.f39479b, dateTime, aVar2, 32838);
        return nm0.y.f85009a;
    }
}
