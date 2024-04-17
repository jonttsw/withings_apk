package com.withings.leaderboard.ui;

import ah.k;
import androidx.compose.material.v;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import ay.b;
import com.google.protobuf.t;
import com.withings.common.compose.component.c5;
import com.withings.wiscale2.C1987R;
import d2.f0;
import k1.d;
import k1.j1;
import k1.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import l0.q;
import nm0.y;
import ym0.p;
/* compiled from: MyFriendCodeActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class MyFriendCodeActivity$onCreate$1$1$1$1 extends w implements p<a, Integer, y> {
    final /* synthetic */ MyFriendCodeActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyFriendCodeActivity$onCreate$1$1$1$1(MyFriendCodeActivity myFriendCodeActivity) {
        super(2);
        this.this$0 = myFriendCodeActivity;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(a aVar, int i11) {
        long j5;
        if ((i11 & 11) == 2 && aVar.h()) {
            aVar.C();
            return;
        }
        e s11 = k.s(e.f8927a);
        MyFriendCodeActivity myFriendCodeActivity = this.this$0;
        aVar.s(-483455358);
        l0 a11 = v.a(androidx.compose.foundation.layout.e.h(), aVar, -1323940314);
        int G = aVar.G();
        v0 l5 = aVar.l();
        g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(s11);
        if (aVar.i() instanceof d) {
            aVar.A();
            if (aVar.e()) {
                aVar.F(a12);
            } else {
                aVar.m();
            }
            p c12 = t.c(aVar, a11, aVar, l5);
            if (aVar.e() || !u.e(aVar.t(), Integer.valueOf(G))) {
                q.a(G, aVar, G, c12);
            }
            c11.invoke(j1.a(aVar), aVar, 0);
            aVar.s(2058660585);
            j5 = f0.f63265i;
            c5.a(j5, 0L, b.u(C1987R.string.friendRequest_myFriendshipCode, aVar), true, null, null, null, null, false, new MyFriendCodeActivity$onCreate$1$1$1$1$1$1(myFriendCodeActivity), aVar, 3078, 498);
            d.j(aVar);
            return;
        }
        a3.g.s();
        throw null;
    }
}
