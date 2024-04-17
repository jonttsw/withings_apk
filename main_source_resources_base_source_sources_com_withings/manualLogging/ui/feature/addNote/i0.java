package com.withings.manualLogging.ui.feature.addNote;

import android.os.Bundle;
import androidx.compose.material3.j5;
import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.manualLogging.ui.feature.addNote.AddManualLogActivity;
import com.withings.manualLogging.ui.uikit.atoms.SaveManualLogButtonStatus;
import java.util.List;
/* compiled from: AddManualLogActivity.kt */
/* loaded from: classes4.dex */
final class i0 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1 f41466a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AddManualLogActivity f41467b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f41468c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k1 k1Var, AddManualLogActivity addManualLogActivity, r8.n nVar) {
        super(4);
        this.f41466a = k1Var;
        this.f41467b = addManualLogActivity;
        this.f41468c = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        String str;
        androidx.navigation.d dVar2 = dVar;
        androidx.compose.runtime.a aVar2 = aVar;
        j5.e(num, cVar, "$this$composable", dVar2, "backStackEntry");
        k1 k1Var = this.f41466a;
        androidx.lifecycle.k0 R0 = k1Var.R0();
        AddManualLogActivity addManualLogActivity = this.f41467b;
        R0.observe(addManualLogActivity, new AddManualLogActivity.c(new z(addManualLogActivity)));
        Bundle c11 = dVar2.c();
        if (c11 != null) {
            str = c11.getString("categoryId");
        } else {
            str = null;
        }
        k1.r0 b10 = t1.d.b(k1Var.M0(), new fx.e(AddManualLogActivity.C3(addManualLogActivity), null, null, 30), aVar2);
        k1.r0 b11 = t1.d.b(k1Var.O0(), SaveManualLogButtonStatus.f41668b, aVar2);
        androidx.lifecycle.f K0 = k1Var.K0();
        kotlin.collections.i0 i0Var = kotlin.collections.i0.f76187a;
        k1.r0 b12 = t1.d.b(K0, i0Var, aVar2);
        k1.r0 b13 = t1.d.b(k1Var.T0(), i0Var, aVar2);
        if (str != null) {
            int hashCode = str.hashCode();
            r8.n nVar = this.f41468c;
            if (hashCode != -836060582) {
                if (hashCode != 2434066) {
                    if (hashCode == 1865710474 && str.equals("Symptoms")) {
                        aVar2.s(-1494820682);
                        s1.a((SaveManualLogButtonStatus) b11.getValue(), new h0(k1Var), new u(k1Var), new v(nVar, addManualLogActivity), new x(k1Var, b10), new y(nVar, addManualLogActivity), (fx.e) b10.getValue(), (List) b13.getValue(), aVar2, 18874368);
                        aVar2.J();
                    }
                } else if (str.equals("Note")) {
                    aVar2.s(-1494821560);
                    d.a((SaveManualLogButtonStatus) b11.getValue(), new e0(k1Var), new f0(k1Var), new g0(nVar, addManualLogActivity), (fx.e) b10.getValue(), null, null, aVar2, Utils.MAX_EVENT_SIZE, 96);
                    aVar2.J();
                }
            } else if (str.equals("Medicine")) {
                aVar2.s(-1494822478);
                b1.a((SaveManualLogButtonStatus) b11.getValue(), new a0(k1Var), new b0(k1Var), new c0(k1Var), new d0(nVar, addManualLogActivity), (fx.e) b10.getValue(), (List) b12.getValue(), aVar2, 2359296);
                aVar2.J();
            }
            return nm0.y.f85009a;
        }
        aVar2.s(-1494818834);
        aVar2.J();
        return nm0.y.f85009a;
    }
}
