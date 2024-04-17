package com.withings.sharing.datasharing.sendinvitation;

import android.util.Patterns;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.g6;
import androidx.compose.material3.d1;
import androidx.compose.material3.g9;
import androidx.compose.material3.i1;
import androidx.compose.material3.m8;
import androidx.compose.material3.u5;
import androidx.compose.material3.y7;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.k4;
import androidx.lifecycle.g1;
import androidx.lifecycle.n1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.common.compose.component.ToastStyle;
import com.withings.common.compose.component.a3;
import com.withings.common.compose.component.input.InputFieldType;
import com.withings.common.compose.component.l2;
import com.withings.common.compose.component.v4;
import com.withings.common.compose.component.x4;
import com.withings.common.compose.component.z4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.sharing.datasharing.sendinvitation.g;
import com.withings.sharing.datasharing.sendinvitation.h;
import com.withings.wiscale2.C1987R;
import d2.h1;
import i6.a;
import k1.j1;
import k1.r0;
import k1.v0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import okhttp3.internal.http2.Http2;
import qk.wb;
import x1.b;
/* compiled from: ShareMethodScreen.kt */
/* loaded from: classes4.dex */
public final class f0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShareMethodScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.sharing.datasharing.sendinvitation.ShareMethodScreenKt$ShareMethodContent$1$1", f = "ShareMethodScreen.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ Object f44167a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InvitationStatus f44168b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m8 f44169c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f44170d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ShareMethodScreen.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.sharing.datasharing.sendinvitation.ShareMethodScreenKt$ShareMethodContent$1$1$1", f = "ShareMethodScreen.kt", l = {113}, m = "invokeSuspend")
        /* renamed from: com.withings.sharing.datasharing.sendinvitation.f0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0613a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f44171a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ m8 f44172b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0613a(m8 m8Var, qm0.d<? super C0613a> dVar) {
                super(2, dVar);
                this.f44172b = m8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new C0613a(this.f44172b, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
                return ((C0613a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f44171a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    this.f44171a = 1;
                    if (this.f44172b.j(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ShareMethodScreen.kt */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.jvm.internal.w implements ym0.l<Throwable, nm0.y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m8 f44173a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ r0<Boolean> f44174b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(m8 m8Var, r0<Boolean> r0Var) {
                super(1);
                this.f44173a = m8Var;
                this.f44174b = r0Var;
            }

            @Override // ym0.l
            public final nm0.y invoke(Throwable th2) {
                if (!this.f44173a.k()) {
                    this.f44174b.setValue(Boolean.FALSE);
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InvitationStatus invitationStatus, m8 m8Var, r0<Boolean> r0Var, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f44168b = invitationStatus;
            this.f44169c = m8Var;
            this.f44170d = r0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(this.f44168b, this.f44169c, this.f44170d, dVar);
            aVar.f44167a = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Job launch$default;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f44167a;
            if (this.f44168b == InvitationStatus.f44089c) {
                m8 m8Var = this.f44169c;
                launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C0613a(m8Var, null), 3, null);
                launch$default.invokeOnCompletion(new b(m8Var, this.f44170d));
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShareMethodScreen.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f44175a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f44176b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ok.a f44177c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ok.a aVar, ym0.a aVar2, ym0.a aVar3) {
            super(2);
            this.f44175a = aVar2;
            this.f44176b = aVar3;
            this.f44177c = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                ok.b.a(null, "**Share Your Health Record", null, null, null, 0L, 0L, 0L, null, false, kotlin.collections.x.V(new a3.a(new l2.c(wb.f93187a), this.f44175a)), null, null, this.f44176b, this.f44177c, false, ok.b.c(), aVar2, 48, Utils.MAX_EVENT_SIZE, 39933);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShareMethodScreen.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ok.a f44178a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z4 f44179b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InvitationStatus f44180c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m8 f44181d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f44182e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f44183f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, nm0.y> f44184g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ok.a aVar, z4 z4Var, InvitationStatus invitationStatus, m8 m8Var, r0<Boolean> r0Var, CoroutineScope coroutineScope, ym0.l<? super String, nm0.y> lVar) {
            super(3);
            this.f44178a = aVar;
            this.f44179b = z4Var;
            this.f44180c = invitationStatus;
            this.f44181d = m8Var;
            this.f44182e = r0Var;
            this.f44183f = coroutineScope;
            this.f44184g = lVar;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
            boolean z5;
            e.a aVar2;
            androidx.compose.runtime.a aVar3;
            int i11;
            r0.w it = wVar;
            androidx.compose.runtime.a aVar4 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(it, "it");
            if ((intValue & 14) == 0) {
                if (aVar4.K(it)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                intValue |= i11;
            }
            if ((intValue & 91) == 18 && aVar4.h()) {
                aVar4.C();
            } else {
                e.a aVar5 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e j5 = x0.j(aVar5, 0.0f, it.d(), 0.0f, 0.0f, 13);
                l0 b10 = defpackage.c.b(aVar4, 733328855, false, aVar4, -1323940314);
                int G = aVar4.G();
                v0 l5 = aVar4.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a11 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(j5);
                if (aVar4.i() instanceof k1.d) {
                    aVar4.A();
                    if (aVar4.e()) {
                        aVar4.F(a11);
                    } else {
                        aVar4.m();
                    }
                    ym0.p c12 = com.google.protobuf.t.c(aVar4, b10, aVar4, l5);
                    if (aVar4.e() || !kotlin.jvm.internal.u.e(aVar4.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar4, G, c12);
                    }
                    l0.r.c(0, c11, j1.a(aVar4), aVar4, 2058660585);
                    androidx.compose.foundation.layout.m mVar = androidx.compose.foundation.layout.m.f4307a;
                    androidx.compose.ui.e a12 = androidx.compose.ui.input.nestedscroll.a.a(x0.h(aVar5, yk.h.o(), 0.0f, 2), this.f44178a.a(), null);
                    aVar4.s(-483455358);
                    l0 a13 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar4, -1323940314);
                    int G2 = aVar4.G();
                    v0 l6 = aVar4.l();
                    ym0.a a14 = g.a.a();
                    s1.a c13 = androidx.compose.ui.layout.y.c(a12);
                    if (aVar4.i() instanceof k1.d) {
                        aVar4.A();
                        if (aVar4.e()) {
                            aVar4.F(a14);
                        } else {
                            aVar4.m();
                        }
                        ym0.p c14 = com.google.protobuf.t.c(aVar4, a13, aVar4, l6);
                        if (aVar4.e() || !kotlin.jvm.internal.u.e(aVar4.t(), Integer.valueOf(G2))) {
                            l0.q.a(G2, aVar4, G2, c14);
                        }
                        l0.r.c(0, c13, j1.a(aVar4), aVar4, 2058660585);
                        InvitationStatus invitationStatus = InvitationStatus.f44089c;
                        InvitationStatus invitationStatus2 = this.f44180c;
                        if (invitationStatus2 != invitationStatus) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        aVar4.s(-1365208789);
                        Object t11 = aVar4.t();
                        a.C0060a.C0061a a15 = a.C0060a.a();
                        r0<Boolean> r0Var = this.f44182e;
                        if (t11 == a15) {
                            t11 = new g0(r0Var);
                            aVar4.n(t11);
                        }
                        aVar4.J();
                        f0.d(6, aVar4, (ym0.a) t11, z5);
                        aVar4.s(-2005111479);
                        if (r0Var.getValue().booleanValue()) {
                            long a16 = ((i1) aVar4.D(androidx.compose.material3.j1.e())).a();
                            CoroutineScope coroutineScope = this.f44183f;
                            m8 m8Var = this.f44181d;
                            aVar2 = aVar5;
                            aVar3 = aVar4;
                            u5.a(new j0(coroutineScope, m8Var, r0Var), null, m8Var, 0.0f, null, a16, 0L, 0.0f, 0L, null, null, null, s1.b.b(aVar4, 1758277601, new k0(invitationStatus2, this.f44184g)), aVar3, 0, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 4058);
                        } else {
                            aVar2 = aVar5;
                            aVar3 = aVar4;
                        }
                        aVar3.J();
                        aVar3.J();
                        aVar3.o();
                        aVar3.J();
                        aVar3.J();
                        androidx.compose.runtime.a aVar6 = aVar3;
                        x4.a(this.f44179b, mVar.g(aVar2, b.a.m()), aVar6, 0, 0);
                        aVar6.J();
                        aVar6.o();
                        aVar6.J();
                        aVar6.J();
                    } else {
                        a3.g.s();
                        throw null;
                    }
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShareMethodScreen.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InvitationStatus f44185a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, nm0.y> f44186b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f44187c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f44188d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z4 f44189e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f44190f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(InvitationStatus invitationStatus, ym0.l<? super String, nm0.y> lVar, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, z4 z4Var, int i11) {
            super(2);
            this.f44185a = invitationStatus;
            this.f44186b = lVar;
            this.f44187c = aVar;
            this.f44188d = aVar2;
            this.f44189e = z4Var;
            this.f44190f = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f44190f | 1);
            ym0.a<nm0.y> aVar2 = this.f44188d;
            z4 z4Var = this.f44189e;
            f0.a(this.f44185a, this.f44186b, this.f44187c, aVar2, z4Var, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShareMethodScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.sharing.datasharing.sendinvitation.ShareMethodScreenKt$ShareMethodScreen$1", f = "ShareMethodScreen.kt", l = {67}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f44191a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SendInvitationViewModel f44192b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z4 f44193c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f44194d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ShareMethodScreen.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.sharing.datasharing.sendinvitation.ShareMethodScreenKt$ShareMethodScreen$1$1", f = "ShareMethodScreen.kt", l = {70, 78}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<h, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f44195a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f44196b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ z4 f44197c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ ym0.a<nm0.y> f44198d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z4 z4Var, ym0.a<nm0.y> aVar, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f44197c = z4Var;
                this.f44198d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                a aVar = new a(this.f44197c, this.f44198d, dVar);
                aVar.f44196b = obj;
                return aVar;
            }

            @Override // ym0.p
            public final Object invoke(h hVar, qm0.d<? super nm0.y> dVar) {
                return ((a) create(hVar, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f44195a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            nm0.l.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        nm0.l.b(obj);
                        this.f44198d.invoke();
                    }
                } else {
                    nm0.l.b(obj);
                    h hVar = (h) this.f44196b;
                    if (hVar instanceof h.b) {
                        ToastStyle toastStyle = ToastStyle.f33348a;
                        this.f44195a = 1;
                        if (z4.c(this.f44197c, toastStyle, "**Invitation sent!", null, 0L, null, this, 28) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        this.f44198d.invoke();
                    } else if (hVar instanceof h.a) {
                        ToastStyle toastStyle2 = ToastStyle.f33350c;
                        this.f44195a = 2;
                        if (z4.c(this.f44197c, toastStyle2, "**An error occurred. Please try again.", null, 0L, null, this, 28) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(SendInvitationViewModel sendInvitationViewModel, z4 z4Var, ym0.a<nm0.y> aVar, qm0.d<? super e> dVar) {
            super(2, dVar);
            this.f44192b = sendInvitationViewModel;
            this.f44193c = z4Var;
            this.f44194d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new e(this.f44192b, this.f44193c, this.f44194d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f44191a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                SharedFlow<h> k02 = this.f44192b.k0();
                a aVar = new a(this.f44193c, this.f44194d, null);
                this.f44191a = 1;
                if (FlowKt.collectLatest(k02, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShareMethodScreen.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SendInvitationViewModel f44199a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(SendInvitationViewModel sendInvitationViewModel) {
            super(1);
            this.f44199a = sendInvitationViewModel;
        }

        @Override // ym0.l
        public final nm0.y invoke(String str) {
            String email = str;
            kotlin.jvm.internal.u.j(email, "email");
            this.f44199a.p0(new g.a(email));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShareMethodScreen.kt */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SendInvitationViewModel f44200a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f44201b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f44202c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f44203d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f44204e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(SendInvitationViewModel sendInvitationViewModel, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11, int i12) {
            super(2);
            this.f44200a = sendInvitationViewModel;
            this.f44201b = aVar;
            this.f44202c = aVar2;
            this.f44203d = i11;
            this.f44204e = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f44203d | 1);
            ym0.a<nm0.y> aVar2 = this.f44201b;
            ym0.a<nm0.y> aVar3 = this.f44202c;
            f0.b(this.f44200a, aVar2, aVar3, aVar, g11, this.f44204e);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InvitationStatus invitationStatus, ym0.l<? super String, nm0.y> lVar, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, z4 z4Var, androidx.compose.runtime.a aVar3, int i11) {
        int i12;
        androidx.compose.runtime.b bVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        androidx.compose.runtime.b g11 = aVar3.g(1566568454);
        if ((i11 & 14) == 0) {
            if (g11.K(invitationStatus)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(lVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(aVar)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i11 & 7168) == 0) {
            if (g11.w(aVar2)) {
                i14 = ModuleCopy.f28574b;
            } else {
                i14 = 1024;
            }
            i12 |= i14;
        }
        if ((57344 & i11) == 0) {
            if (g11.K(z4Var)) {
                i13 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i13;
        }
        if ((46811 & i12) == 9362 && g11.h()) {
            g11.C();
            bVar = g11;
        } else {
            ok.a o11 = ah.u.o(g11);
            g11.s(773894976);
            g11.s(-492369756);
            Object t11 = g11.t();
            if (t11 == a.C0060a.a()) {
                t11 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(g11), g11);
            }
            g11.J();
            CoroutineScope a11 = ((androidx.compose.runtime.k) t11).a();
            g11.J();
            boolean z5 = true;
            m8 d11 = u5.d(true, null, g11, 6, 2);
            g11.s(-386620661);
            Object t12 = g11.t();
            if (t12 == a.C0060a.a()) {
                t12 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
                g11.n(t12);
            }
            r0 r0Var = (r0) t12;
            g11.J();
            g11.s(-386620598);
            if ((i12 & 14) != 4) {
                z5 = false;
            }
            boolean K = g11.K(d11) | z5;
            Object t13 = g11.t();
            if (K || t13 == a.C0060a.a()) {
                t13 = new a(invitationStatus, d11, r0Var, null);
                g11.n(t13);
            }
            g11.J();
            k1.y.f(invitationStatus, (ym0.p) t13, g11);
            bVar = g11;
            y7.b(null, s1.b.b(g11, -488074806, new b(o11, aVar2, aVar)), null, null, null, 0, 0L, 0L, null, s1.b.b(g11, 1780547669, new c(o11, z4Var, invitationStatus, d11, r0Var, a11, lVar)), bVar, 805306416, ConstantsWs.WS_STATUS_NO_FILTER);
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new d(invitationStatus, lVar, aVar, aVar2, z4Var, i11));
        }
    }

    public static final void b(SendInvitationViewModel sendInvitationViewModel, ym0.a<nm0.y> back, ym0.a<nm0.y> finish, androidx.compose.runtime.a aVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        i6.a aVar2;
        SendInvitationViewModel sendInvitationViewModel2;
        int i16;
        SendInvitationViewModel sendInvitationViewModel3;
        kotlin.jvm.internal.u.j(back, "back");
        kotlin.jvm.internal.u.j(finish, "finish");
        androidx.compose.runtime.b g11 = aVar.g(-1106278414);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 2;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (g11.w(back)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i13 |= i14;
        }
        if ((i12 & 4) != 0) {
            i13 |= ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED;
        } else if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(finish)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i13 |= i15;
        }
        int i18 = i13;
        if (i17 == 1 && (i18 & 731) == 146 && g11.h()) {
            g11.C();
            sendInvitationViewModel3 = sendInvitationViewModel;
        } else {
            g11.M0();
            if ((i11 & 1) != 0 && !g11.v0()) {
                g11.C();
                if (i17 != 0) {
                    i18 &= -15;
                }
            } else if (i17 != 0) {
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
                    int i19 = i18 & (-15);
                    sendInvitationViewModel2 = (SendInvitationViewModel) a13;
                    i16 = i19;
                    g11.l0();
                    r0 c11 = h6.b.c(sendInvitationViewModel2.m0(), g11);
                    z4 b10 = x4.b(g11);
                    k1.y.f("events", new e(sendInvitationViewModel2, b10, finish, null), g11);
                    int i21 = i16 << 3;
                    a(((z40.j) c11.getValue()).d(), new f(sendInvitationViewModel2), back, finish, b10, g11, (i21 & ConstantsWs.HWFAILURE_ZERO) | (i21 & 7168));
                    sendInvitationViewModel3 = sendInvitationViewModel2;
                } else {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
            }
            i16 = i18;
            sendInvitationViewModel2 = sendInvitationViewModel;
            g11.l0();
            r0 c112 = h6.b.c(sendInvitationViewModel2.m0(), g11);
            z4 b102 = x4.b(g11);
            k1.y.f("events", new e(sendInvitationViewModel2, b102, finish, null), g11);
            int i212 = i16 << 3;
            a(((z40.j) c112.getValue()).d(), new f(sendInvitationViewModel2), back, finish, b102, g11, (i212 & ConstantsWs.HWFAILURE_ZERO) | (i212 & 7168));
            sendInvitationViewModel3 = sendInvitationViewModel2;
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new g(sendInvitationViewModel3, back, finish, i11, i12));
        }
    }

    public static final void c(boolean z5, ym0.l lVar, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.ui.e b10;
        boolean z11;
        r0 r0Var;
        androidx.compose.runtime.b bVar;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar.g(-1683609213);
        if ((i11 & 14) == 0) {
            if (g11.a(z5)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(lVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
            bVar = g11;
        } else {
            g11.s(-28813188);
            Object t11 = g11.t();
            if (t11 == a.C0060a.a()) {
                t11 = androidx.compose.runtime.l0.f("", androidx.compose.runtime.v0.f8878a);
                g11.n(t11);
            }
            r0 r0Var2 = (r0) t11;
            g11.J();
            g11.s(-28813123);
            boolean K = g11.K((String) r0Var2.getValue());
            Object t12 = g11.t();
            if (K || t12 == a.C0060a.a()) {
                t12 = androidx.compose.runtime.l0.f(Boolean.valueOf(Patterns.EMAIL_ADDRESS.matcher((String) r0Var2.getValue()).matches()), androidx.compose.runtime.v0.f8878a);
                g11.n(t12);
            }
            r0 r0Var3 = (r0) t12;
            k4 k4Var = (k4) androidx.appcompat.view.menu.d.b(g11);
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            b10 = androidx.compose.foundation.c.b(aVar2, ((i1) g11.D(androidx.compose.material3.j1.e())).a(), h1.a());
            androidx.compose.ui.e p11 = ah.k.p(x0.j(b10, 0.0f, 0.0f, 0.0f, yk.h.B(), 7));
            int i15 = androidx.compose.foundation.layout.e.f4229i;
            e.h o11 = androidx.compose.foundation.layout.e.o(yk.h.B());
            g11.s(-483455358);
            l0 a11 = com.withings.authentication.e.a(o11, g11, -1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(p11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                ym0.p b11 = com.withings.authentication.e.b(g11, a11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
                }
                nk.a0.f(0, 48, 28, 0L, g11, x0.h(aVar2, og.y.a(0, c11, j1.a(g11), g11, 2058660585), 0.0f, 2), null, "** Enter email address");
                androidx.compose.ui.e h11 = x0.h(aVar2, yk.h.o(), 0.0f, 2);
                InputFieldType inputFieldType = InputFieldType.f33878f;
                String u11 = ay.b.u(C1987R.string._EMAIL_, g11);
                String str = (String) r0Var2.getValue();
                g11.s(709832800);
                boolean K2 = g11.K(k4Var);
                int i16 = i12 & 112;
                boolean z12 = true;
                if (i16 == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = K2 | z11;
                Object t13 = g11.t();
                if (!z13 && t13 != a.C0060a.a()) {
                    r0Var = r0Var2;
                } else {
                    r0Var = r0Var2;
                    t13 = new z(k4Var, lVar, r0Var);
                    g11.n(t13);
                }
                ym0.a aVar3 = (ym0.a) t13;
                Object a13 = com.huawei.hms.health.a.a(g11, 709832758);
                if (a13 == a.C0060a.a()) {
                    a13 = new a0(r0Var);
                    g11.n(a13);
                }
                g11.J();
                fk.q.b(h11, inputFieldType, null, u11, str, null, null, null, null, null, null, false, null, null, 0, null, false, aVar3, (ym0.l) a13, g11, 48, 100663296, 131044);
                com.withings.common.compose.component.v0.b(0.0f, g11, 0, 1);
                androidx.compose.ui.e h12 = x0.h(aVar2, yk.h.o(), 0.0f, 2);
                boolean booleanValue = ((Boolean) r0Var3.getValue()).booleanValue();
                g11.s(709833130);
                boolean K3 = g11.K(k4Var);
                if (i16 != 32) {
                    z12 = false;
                }
                boolean z14 = K3 | z12;
                Object t14 = g11.t();
                if (z14 || t14 == a.C0060a.a()) {
                    t14 = new b0(k4Var, lVar, r0Var);
                    g11.n(t14);
                }
                g11.J();
                bVar = g11;
                com.withings.common.compose.component.l.a(h12, "** Send Invite", null, booleanValue, null, null, z5, (ym0.a) t14, g11, ((i12 << 18) & 3670016) | 48, 52);
                g9.a(bVar);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new c0(i11, lVar, z5));
        }
    }

    public static final void d(int i11, androidx.compose.runtime.a aVar, ym0.a aVar2, boolean z5) {
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar.g(-946642174);
        if ((i11 & 14) == 0) {
            if (g11.w(aVar2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.a(z5)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            androidx.compose.ui.e h11 = x0.h(x0.j(androidx.compose.ui.e.f8927a, 0.0f, yk.h.o(), 0.0f, 0.0f, 13), 0.0f, yk.h.B(), 1);
            int i15 = androidx.compose.foundation.layout.e.f4229i;
            l0 a11 = com.withings.authentication.e.a(g6.b(g11, -483455358), g11, -1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(h11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
                }
                dq.x.b(0, c11, j1.a(g11), g11, 2058660585);
                v4.b(null, ay.b.u(C1987R.string.options, g11), null, null, 0, 0.0f, 0, 0, g11, 24576, ConstantsWs.WS_STATUS_DEVASSOCERROR);
                d1.a(null, null, null, null, null, s1.b.b(g11, -588512022, new d0(aVar2, z5)), g11, 196608, 31);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new e0(i11, aVar2, z5));
        }
    }
}
