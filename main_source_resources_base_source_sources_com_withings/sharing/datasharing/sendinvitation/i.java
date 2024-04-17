package com.withings.sharing.datasharing.sendinvitation;

import androidx.camera.camera2.internal.v1;
import androidx.lifecycle.g1;
import androidx.lifecycle.n1;
import com.withings.library.authentication.api.ConstantsWs;
import i6.a;
import java.util.List;
/* compiled from: SendInvitationNavGraph.kt */
/* loaded from: classes4.dex */
public final class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SendInvitationNavGraph.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r8.n f44213a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SendInvitationViewModel f44214b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f44215c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r8.n nVar, SendInvitationViewModel sendInvitationViewModel, ym0.a<nm0.y> aVar) {
            super(1);
            this.f44213a = nVar;
            this.f44214b = sendInvitationViewModel;
            this.f44215c = aVar;
        }

        @Override // ym0.l
        public final nm0.y invoke(r8.m mVar) {
            r8.m NavHost = mVar;
            kotlin.jvm.internal.u.j(NavHost, "$this$NavHost");
            List V = kotlin.collections.x.V(v1.d0("pop_on_next", j.f44220a));
            SendInvitationViewModel sendInvitationViewModel = this.f44214b;
            r8.n nVar = this.f44213a;
            tk.e.b(NavHost, "select_data?pop_on_next={pop_on_next}", V, new s1.a(true, -1146356522, new m(sendInvitationViewModel, nVar)), 4);
            List V2 = kotlin.collections.x.V(v1.d0("pop_on_next", n.f44232a));
            ym0.a<nm0.y> aVar = this.f44215c;
            tk.e.b(NavHost, "select_time?pop_on_next={pop_on_next}", V2, new s1.a(true, 558840019, new q(sendInvitationViewModel, aVar, nVar)), 4);
            tk.e.b(NavHost, "summary", null, new s1.a(true, -1001555436, new x(sendInvitationViewModel, aVar, nVar)), 6);
            tk.e.b(NavHost, "share_method", null, new s1.a(true, -1024554406, new s(sendInvitationViewModel, aVar, nVar)), 6);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SendInvitationNavGraph.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f44216a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f44217b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ym0.a<nm0.y> aVar, int i11) {
            super(2);
            this.f44216a = aVar;
            this.f44217b = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f44217b | 1);
            i.a(this.f44216a, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public static final void a(ym0.a<nm0.y> finish, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        i6.a aVar2;
        int i13;
        kotlin.jvm.internal.u.j(finish, "finish");
        androidx.compose.runtime.b g11 = aVar.g(-957401406);
        if ((i11 & 14) == 0) {
            if (g11.w(finish)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            g11.s(1890788296);
            n1 a11 = j6.a.a(g11);
            if (a11 != null) {
                fk0.c a12 = e6.a.a(a11, g11);
                g11.s(1729797275);
                if (a11 instanceof androidx.lifecycle.u) {
                    aVar2 = ((androidx.lifecycle.u) a11).getDefaultViewModelCreationExtras();
                } else {
                    aVar2 = a.C1058a.f71431b;
                }
                g1 a13 = j6.b.a(SendInvitationViewModel.class, a11, null, a12, aVar2, g11);
                g11.J();
                g11.J();
                r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], g11);
                androidx.navigation.compose.s.b(c11, "select_data?pop_on_next=false", null, null, null, null, null, null, null, new a(c11, (SendInvitationViewModel) a13, finish), g11, 8, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(finish, i11));
        }
    }
}
