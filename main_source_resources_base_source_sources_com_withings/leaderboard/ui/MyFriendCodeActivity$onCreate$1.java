package com.withings.leaderboard.ui;

import android.graphics.Bitmap;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.v;
import androidx.compose.material3.a9;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.t;
import com.withings.wiscale2.C1987R;
import en0.r;
import k1.d;
import k1.j1;
import k1.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import l0.q;
import n0.z;
import nk.a0;
import nm0.y;
import s1.b;
import x9.n;
import yk.h;
import yk.o;
import ym0.p;
/* compiled from: MyFriendCodeActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class MyFriendCodeActivity$onCreate$1 extends w implements p<a, Integer, y> {
    final /* synthetic */ MyFriendCodeActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyFriendCodeActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.leaderboard.ui.MyFriendCodeActivity$onCreate$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends w implements p<a, Integer, y> {
        final /* synthetic */ MyFriendCodeActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MyFriendCodeActivity myFriendCodeActivity) {
            super(2);
            this.this$0 = myFriendCodeActivity;
        }

        @Override // ym0.p
        public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
            invoke(aVar, num.intValue());
            return y.f85009a;
        }

        public final void invoke(a aVar, int i11) {
            String userName;
            String userHash;
            if ((i11 & 11) == 2 && aVar.h()) {
                aVar.C();
                return;
            }
            MyFriendCodeActivity myFriendCodeActivity = this.this$0;
            aVar.s(-483455358);
            e.a aVar2 = e.f8927a;
            l0 a11 = v.a(androidx.compose.foundation.layout.e.h(), aVar, -1323940314);
            int G = aVar.G();
            v0 l5 = aVar.l();
            g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(aVar2);
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
                a9.a(null, null, 0L, 0L, 0.0f, 0.0f, null, b.b(aVar, -681796296, new MyFriendCodeActivity$onCreate$1$1$1$1(myFriendCodeActivity)), aVar, 12582912, 127);
                userName = myFriendCodeActivity.getUserName();
                userHash = myFriendCodeActivity.getUserHash();
                gp0.b c13 = gp0.b.c("Withings:|:" + userName + ":|:" + userHash);
                c13.d();
                Bitmap b10 = c13.b();
                a0.f(0, 0, 28, 0L, aVar, x0.h(aVar2, h.o(), 0.0f, 2), null, ay.b.u(C1987R.string.friendRequest_codeExplanation, aVar));
                if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    z.a(n.a(b10, aVar, 8), "QR-Code", w0.a(x0.g(new LayoutWeightElement(r.f(1.0f, Float.MAX_VALUE), true), h.o(), h.q()), 1.0f), null, null, 0.0f, null, aVar, 48, 120);
                    d.j(aVar);
                    return;
                }
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            a3.g.s();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyFriendCodeActivity$onCreate$1(MyFriendCodeActivity myFriendCodeActivity) {
        super(2);
        this.this$0 = myFriendCodeActivity;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.h()) {
            aVar.C();
        } else {
            o.b(false, b.b(aVar, 343138407, new AnonymousClass1(this.this$0)), aVar, 48, 1);
        }
    }
}
