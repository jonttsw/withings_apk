package com.withings.wiscale2.partner.ui;

import android.app.Application;
import com.withings.partner.model.Partner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import v10.c;
import y10.a;
/* compiled from: PartnerExchangesFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerExchangesViewModel$updateAllPartnerExchanges$1", f = "PartnerExchangesFragment.kt", l = {454}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class g1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f59085a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b1 f59086b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f59087c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(b1 b1Var, boolean z5, qm0.d<? super g1> dVar) {
        super(2, dVar);
        this.f59086b = b1Var;
        this.f59087c = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new g1(this.f59086b, this.f59087c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((g1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f59085a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            b1 b1Var = this.f59086b;
            Partner value = b1Var.y0().getValue();
            if (value != null) {
                List list = (List) b1Var.t0().getValue();
                List list2 = kotlin.collections.i0.f76187a;
                if (list == null) {
                    list = list2;
                }
                ArrayList S0 = kotlin.collections.x.S0(list);
                List list3 = (List) b1Var.r0().getValue();
                if (list3 != null) {
                    list2 = list3;
                }
                ArrayList l02 = kotlin.collections.x.l0(list2, S0);
                ArrayList arrayList = new ArrayList();
                Iterator it = l02.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    z5 = this.f59087c;
                    if (!hasNext) {
                        break;
                    }
                    Object next = it.next();
                    if (((d0) next).c() != z5) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((d0) it2.next()).b());
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    u10.u uVar = (u10.u) it3.next();
                    uVar.h(b1Var.getApplication(), b1Var.f58910a, value, z5);
                    if (uVar instanceof c.p) {
                        b1.k0(b1Var, z5);
                    } else if (uVar instanceof a.d) {
                        b1.m0(b1Var, z5);
                    }
                }
                t10.e eVar = b1Var.f58912c;
                Application application = b1Var.getApplication();
                long q11 = b1Var.f58910a.q();
                this.f59085a = 1;
                if (eVar.j(q11, application, value, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return nm0.y.f85009a;
    }
}
