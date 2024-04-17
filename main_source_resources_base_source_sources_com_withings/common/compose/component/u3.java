package com.withings.common.compose.component;

import com.withings.common.compose.component.Status;
import com.withings.wiscale2.C1987R;
/* compiled from: SecondaryTrendCard.kt */
/* loaded from: classes3.dex */
final class u3 extends kotlin.jvm.internal.w implements ym0.q<p4, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m4 f34816a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f34817b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(m4 m4Var, boolean z5) {
        super(3);
        this.f34816a = m4Var;
        this.f34817b = z5;
    }

    @Override // ym0.q
    public final nm0.y invoke(p4 p4Var, androidx.compose.runtime.a aVar, Integer num) {
        p4 add = p4Var;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(add, "$this$add");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            m4 m4Var = this.f34816a;
            Status.Icon d11 = m4Var.d();
            String e11 = m4Var.e();
            aVar2.s(-2064115775);
            if (e11 == null) {
                e11 = ay.b.u(C1987R.string._HY_RESULT_TITLE_, aVar2);
            }
            aVar2.J();
            n4.b(null, e11, null, m4Var.f(), d11, this.f34817b, aVar2, 0, 5);
        }
        return nm0.y.f85009a;
    }
}
