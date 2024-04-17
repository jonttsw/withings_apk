package com.withings.sharing.datasharing.acceptinvitation;

import ah.o;
import androidx.activity.a0;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.layout.x0;
import androidx.compose.runtime.v;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import androidx.lifecycle.g1;
import androidx.lifecycle.n1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.t;
import com.huawei.hms.analytics.instance.CallBack;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.authentication.n;
import com.withings.common.compose.component.v4;
import com.withings.common.compose.component.x4;
import com.withings.common.compose.component.z4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.sharing.datasharing.acceptinvitation.a;
import com.withings.sharing.datasharing.acceptinvitation.d;
import i6.a;
import k1.j1;
import k1.o1;
import k1.r0;
import k1.v0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import l0.r;
import nm0.y;
import okhttp3.internal.http2.Http2;
import wk.c0;
import ym0.p;
import ym0.q;
/* compiled from: AcceptInvitationScreen.kt */
/* loaded from: classes4.dex */
public final class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AcceptInvitationScreen.kt */
    /* loaded from: classes4.dex */
    public static final class a extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.withings.sharing.datasharing.acceptinvitation.d f44017a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z4 f44018b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44019c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44020d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44021e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f44022f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.withings.sharing.datasharing.acceptinvitation.d dVar, z4 z4Var, ym0.a<y> aVar, ym0.a<y> aVar2, ym0.a<y> aVar3, int i11) {
            super(2);
            this.f44017a = dVar;
            this.f44018b = z4Var;
            this.f44019c = aVar;
            this.f44020d = aVar2;
            this.f44021e = aVar3;
            this.f44022f = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f44022f | 1);
            ym0.a<y> aVar2 = this.f44020d;
            ym0.a<y> aVar3 = this.f44021e;
            c.a(this.f44017a, this.f44018b, this.f44019c, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AcceptInvitationScreen.kt */
    /* loaded from: classes4.dex */
    public static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d.a f44023a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d.a aVar) {
            super(2);
            this.f44023a = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                d.a aVar3 = this.f44023a;
                v4.b(null, androidx.fragment.app.o.d("** ", aVar3.d(), " has shared their health record with you"), a0.b("** via ", aVar3.c()), null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AcceptInvitationScreen.kt */
    /* renamed from: com.withings.sharing.datasharing.acceptinvitation.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0606c extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d.a f44024a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44025b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0606c(d.a aVar, ym0.a<y> aVar2) {
            super(2);
            this.f44024a = aVar;
            this.f44025b = aVar2;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.a(null, "** Accept", null, false, null, null, !this.f44024a.b(), this.f44025b, aVar2, 48, 61);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AcceptInvitationScreen.kt */
    /* loaded from: classes4.dex */
    public static final class d extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d.a f44026a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44027b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(d.a aVar, ym0.a<y> aVar2) {
            super(2);
            this.f44026a = aVar;
            this.f44027b = aVar2;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.c(null, "** Decline", null, false, null, null, !this.f44026a.b(), this.f44027b, aVar2, 48, 61);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AcceptInvitationScreen.kt */
    /* loaded from: classes4.dex */
    public static final class e extends w implements q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d.a f44028a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(d.a aVar) {
            super(3);
            this.f44028a = aVar;
        }

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h GuidedPresentation = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(GuidedPresentation, "$this$GuidedPresentation");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                androidx.compose.ui.e h11 = x0.h(x0.j(androidx.compose.ui.e.f8927a, 0.0f, yk.h.b(), 0.0f, yk.h.B(), 5), yk.h.o(), 0.0f, 2);
                int i11 = androidx.compose.foundation.layout.e.f4229i;
                e.h o11 = androidx.compose.foundation.layout.e.o(yk.h.B());
                aVar2.s(-483455358);
                l0 b10 = n.b(o11, aVar2, -1323940314);
                int G = aVar2.G();
                v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a11 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(h11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a11);
                    } else {
                        aVar2.m();
                    }
                    p c12 = t.c(aVar2, b10, aVar2, l5);
                    if (aVar2.e() || !u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    r.c(0, c11, j1.a(aVar2), aVar2, 2058660585);
                    d.a aVar3 = this.f44028a;
                    nk.a.d(null, androidx.fragment.app.o.d("** ", aVar3.d(), "’s measurements and profile are now available to you. Here is an overview of what you’ll be able to see."), 0L, null, 0, 0, null, aVar2, 0, 125);
                    y40.d.a(8, 2, aVar2, null, aVar3.e());
                    aVar2.J();
                    aVar2.o();
                    aVar2.J();
                    aVar2.J();
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AcceptInvitationScreen.kt */
    /* loaded from: classes4.dex */
    public static final class f extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d.a f44029a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44030b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44031c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44032d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z4 f44033e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f44034f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f44035g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(d.a aVar, ym0.a<y> aVar2, ym0.a<y> aVar3, ym0.a<y> aVar4, z4 z4Var, int i11, int i12) {
            super(2);
            this.f44029a = aVar;
            this.f44030b = aVar2;
            this.f44031c = aVar3;
            this.f44032d = aVar4;
            this.f44033e = z4Var;
            this.f44034f = i11;
            this.f44035g = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f44034f | 1);
            ym0.a<y> aVar2 = this.f44032d;
            z4 z4Var = this.f44033e;
            c.b(this.f44029a, this.f44030b, this.f44031c, aVar2, z4Var, aVar, g11, this.f44035g);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AcceptInvitationScreen.kt */
    /* loaded from: classes4.dex */
    public static final class g extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z4 f44036a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f44037b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f44038c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(z4 z4Var, int i11, int i12) {
            super(2);
            this.f44036a = z4Var;
            this.f44037b = i11;
            this.f44038c = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f44037b | 1);
            int i11 = this.f44038c;
            c.c(this.f44036a, aVar, g11, i11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AcceptInvitationScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.sharing.datasharing.acceptinvitation.AcceptInvitationScreenKt$AcceptInvitationScreen$1", f = "AcceptInvitationScreen.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AcceptInvitationViewModel f44039a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f44040b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(AcceptInvitationViewModel acceptInvitationViewModel, String str, qm0.d<? super h> dVar) {
            super(2, dVar);
            this.f44039a = acceptInvitationViewModel;
            this.f44040b = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new h(this.f44039a, this.f44040b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((h) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            this.f44039a.m0(new a.b(this.f44040b));
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AcceptInvitationScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.sharing.datasharing.acceptinvitation.AcceptInvitationScreenKt$AcceptInvitationScreen$2", f = "AcceptInvitationScreen.kt", l = {56}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f44041a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AcceptInvitationViewModel f44042b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z4 f44043c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44044d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44045e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44046f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ o1<com.withings.sharing.datasharing.acceptinvitation.d> f44047g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AcceptInvitationScreen.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ z4 f44048a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ym0.a<y> f44049b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ym0.a<y> f44050c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ ym0.a<y> f44051d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ o1<com.withings.sharing.datasharing.acceptinvitation.d> f44052e;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: AcceptInvitationScreen.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.sharing.datasharing.acceptinvitation.AcceptInvitationScreenKt$AcceptInvitationScreen$2$1", f = "AcceptInvitationScreen.kt", l = {59, 64, 69}, m = "emit")
            /* renamed from: com.withings.sharing.datasharing.acceptinvitation.c$i$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0607a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                Object f44053a;

                /* renamed from: b  reason: collision with root package name */
                /* synthetic */ Object f44054b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ a<T> f44055c;

                /* renamed from: d  reason: collision with root package name */
                int f44056d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0607a(a<? super T> aVar, qm0.d<? super C0607a> dVar) {
                    super(dVar);
                    this.f44055c = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f44054b = obj;
                    this.f44056d |= Integer.MIN_VALUE;
                    return this.f44055c.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(z4 z4Var, ym0.a<y> aVar, ym0.a<y> aVar2, ym0.a<y> aVar3, o1<? extends com.withings.sharing.datasharing.acceptinvitation.d> o1Var) {
                this.f44048a = z4Var;
                this.f44049b = aVar;
                this.f44050c = aVar2;
                this.f44051d = aVar3;
                this.f44052e = o1Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(com.withings.sharing.datasharing.acceptinvitation.b r11, qm0.d<? super nm0.y> r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof com.withings.sharing.datasharing.acceptinvitation.c.i.a.C0607a
                    if (r0 == 0) goto L14
                    r0 = r12
                    com.withings.sharing.datasharing.acceptinvitation.c$i$a$a r0 = (com.withings.sharing.datasharing.acceptinvitation.c.i.a.C0607a) r0
                    int r1 = r0.f44056d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L14
                    int r1 = r1 - r2
                    r0.f44056d = r1
                L12:
                    r8 = r0
                    goto L1a
                L14:
                    com.withings.sharing.datasharing.acceptinvitation.c$i$a$a r0 = new com.withings.sharing.datasharing.acceptinvitation.c$i$a$a
                    r0.<init>(r10, r12)
                    goto L12
                L1a:
                    java.lang.Object r12 = r8.f44054b
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r1 = r8.f44056d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L5c
                    if (r1 == r3) goto L54
                    if (r1 == r2) goto L4c
                    r11 = 3
                    if (r1 != r11) goto L44
                    java.lang.Object r11 = r8.f44053a
                    com.withings.sharing.datasharing.acceptinvitation.c$i$a r11 = (com.withings.sharing.datasharing.acceptinvitation.c.i.a) r11
                    nm0.l.b(r12)
                    k1.o1<com.withings.sharing.datasharing.acceptinvitation.d> r12 = r11.f44052e
                    java.lang.Object r12 = r12.getValue()
                    com.withings.sharing.datasharing.acceptinvitation.d r12 = (com.withings.sharing.datasharing.acceptinvitation.d) r12
                    boolean r12 = r12 instanceof com.withings.sharing.datasharing.acceptinvitation.d.b
                    if (r12 == 0) goto La3
                    ym0.a<nm0.y> r11 = r11.f44051d
                    r11.invoke()
                    goto La3
                L44:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L4c:
                    java.lang.Object r11 = r8.f44053a
                    com.withings.sharing.datasharing.acceptinvitation.c$i$a r11 = (com.withings.sharing.datasharing.acceptinvitation.c.i.a) r11
                    nm0.l.b(r12)
                    goto L9e
                L54:
                    java.lang.Object r11 = r8.f44053a
                    com.withings.sharing.datasharing.acceptinvitation.c$i$a r11 = (com.withings.sharing.datasharing.acceptinvitation.c.i.a) r11
                    nm0.l.b(r12)
                    goto L7b
                L5c:
                    nm0.l.b(r12)
                    boolean r12 = r11 instanceof com.withings.sharing.datasharing.acceptinvitation.b.a
                    if (r12 == 0) goto L81
                    com.withings.common.compose.component.ToastStyle r2 = com.withings.common.compose.component.ToastStyle.f33348a
                    r8.f44053a = r10
                    r8.f44056d = r3
                    r7 = 0
                    r9 = 28
                    com.withings.common.compose.component.z4 r1 = r10.f44048a
                    java.lang.String r3 = "**Invitation accepted!"
                    r4 = 0
                    r5 = 0
                    java.lang.Object r11 = com.withings.common.compose.component.z4.c(r1, r2, r3, r4, r5, r7, r8, r9)
                    if (r11 != r0) goto L7a
                    return r0
                L7a:
                    r11 = r10
                L7b:
                    ym0.a<nm0.y> r11 = r11.f44049b
                    r11.invoke()
                    goto La3
                L81:
                    boolean r11 = r11 instanceof com.withings.sharing.datasharing.acceptinvitation.b.C0605b
                    if (r11 == 0) goto La3
                    com.withings.common.compose.component.ToastStyle r11 = com.withings.common.compose.component.ToastStyle.f33351d
                    r8.f44053a = r10
                    r8.f44056d = r2
                    r7 = 0
                    r9 = 28
                    com.withings.common.compose.component.z4 r1 = r10.f44048a
                    java.lang.String r3 = "**Invitation refused"
                    r4 = 0
                    r5 = 0
                    r2 = r11
                    java.lang.Object r11 = com.withings.common.compose.component.z4.c(r1, r2, r3, r4, r5, r7, r8, r9)
                    if (r11 != r0) goto L9d
                    return r0
                L9d:
                    r11 = r10
                L9e:
                    ym0.a<nm0.y> r11 = r11.f44050c
                    r11.invoke()
                La3:
                    nm0.y r11 = nm0.y.f85009a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.sharing.datasharing.acceptinvitation.c.i.a.emit(com.withings.sharing.datasharing.acceptinvitation.b, qm0.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(AcceptInvitationViewModel acceptInvitationViewModel, z4 z4Var, ym0.a<y> aVar, ym0.a<y> aVar2, ym0.a<y> aVar3, o1<? extends com.withings.sharing.datasharing.acceptinvitation.d> o1Var, qm0.d<? super i> dVar) {
            super(2, dVar);
            this.f44042b = acceptInvitationViewModel;
            this.f44043c = z4Var;
            this.f44044d = aVar;
            this.f44045e = aVar2;
            this.f44046f = aVar3;
            this.f44047g = o1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new i(this.f44042b, this.f44043c, this.f44044d, this.f44045e, this.f44046f, this.f44047g, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            ((i) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            return CoroutineSingletons.f76214a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f44041a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                SharedFlow<com.withings.sharing.datasharing.acceptinvitation.b> j02 = this.f44042b.j0();
                a aVar = new a(this.f44043c, this.f44044d, this.f44045e, this.f44046f, this.f44047g);
                this.f44041a = 1;
                if (j02.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AcceptInvitationScreen.kt */
    /* loaded from: classes4.dex */
    public static final class j extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AcceptInvitationViewModel f44057a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(AcceptInvitationViewModel acceptInvitationViewModel) {
            super(0);
            this.f44057a = acceptInvitationViewModel;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f44057a.m0(a.C0604a.f44012a);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AcceptInvitationScreen.kt */
    /* loaded from: classes4.dex */
    public static final class k extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AcceptInvitationViewModel f44058a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(AcceptInvitationViewModel acceptInvitationViewModel) {
            super(0);
            this.f44058a = acceptInvitationViewModel;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f44058a.m0(a.c.f44014a);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AcceptInvitationScreen.kt */
    /* loaded from: classes4.dex */
    public static final class l extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f44059a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AcceptInvitationViewModel f44060b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44061c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44062d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44063e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f44064f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f44065g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, AcceptInvitationViewModel acceptInvitationViewModel, ym0.a<y> aVar, ym0.a<y> aVar2, ym0.a<y> aVar3, int i11, int i12) {
            super(2);
            this.f44059a = str;
            this.f44060b = acceptInvitationViewModel;
            this.f44061c = aVar;
            this.f44062d = aVar2;
            this.f44063e = aVar3;
            this.f44064f = i11;
            this.f44065g = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f44064f | 1);
            ym0.a<y> aVar2 = this.f44062d;
            ym0.a<y> aVar3 = this.f44063e;
            c.d(this.f44059a, this.f44060b, this.f44061c, aVar2, aVar3, aVar, g11, this.f44065g);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.withings.sharing.datasharing.acceptinvitation.d dVar, z4 z4Var, ym0.a<y> aVar, ym0.a<y> aVar2, ym0.a<y> aVar3, androidx.compose.runtime.a aVar4, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        androidx.compose.runtime.b g11 = aVar4.g(-2018452046);
        if ((i11 & 14) == 0) {
            if (g11.K(dVar)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.K(z4Var)) {
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
        if ((i11 & 57344) == 0) {
            if (g11.w(aVar3)) {
                i13 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i13;
        }
        if ((46811 & i12) == 9362 && g11.h()) {
            g11.C();
        } else if (dVar instanceof d.b) {
            g11.s(2051950079);
            c(null, g11, 0, 1);
            g11.J();
        } else if (dVar instanceof d.a) {
            g11.s(2051950148);
            int i18 = i12 >> 3;
            b((d.a) dVar, aVar, aVar2, aVar3, z4Var, g11, (i18 & 7168) | (i18 & 112) | 8 | (i18 & ConstantsWs.HWFAILURE_ZERO) | ((i12 << 9) & 57344), 0);
            g11.J();
        } else {
            g11.s(2051950398);
            g11.J();
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new a(dVar, z4Var, aVar, aVar2, aVar3, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(d.a aVar, ym0.a<y> aVar2, ym0.a<y> aVar3, ym0.a<y> aVar4, z4 z4Var, androidx.compose.runtime.a aVar5, int i11, int i12) {
        z4 z4Var2;
        int i13;
        androidx.compose.runtime.b g11 = aVar5.g(942388899);
        if ((i12 & 16) != 0) {
            i13 = i11 & (-57345);
            z4Var2 = x4.b(g11);
        } else {
            z4Var2 = z4Var;
            i13 = i11;
        }
        c0.b(null, z4Var2, null, aVar2, x40.f.f106619a, s1.b.b(g11, -2102760593, new b(aVar)), s1.b.b(g11, 7930766, new C0606c(aVar, aVar3)), s1.b.b(g11, 2118622125, new d(aVar, aVar4)), 0L, false, null, null, 0.0f, false, s1.b.b(g11, 23445865, new e(aVar)), g11, ((i13 >> 9) & 112) | 14376960 | ((i13 << 6) & 7168), 24576, 16133);
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new f(aVar, aVar2, aVar3, aVar4, z4Var2, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
        if ((r20 & 1) != 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.withings.common.compose.component.z4 r17, androidx.compose.runtime.a r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.sharing.datasharing.acceptinvitation.c.c(com.withings.common.compose.component.z4, androidx.compose.runtime.a, int, int):void");
    }

    public static final void d(String invitationHash, AcceptInvitationViewModel acceptInvitationViewModel, ym0.a<y> onBack, ym0.a<y> onInvitationAccepted, ym0.a<y> onInvitationDenied, androidx.compose.runtime.a aVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        i6.a aVar2;
        AcceptInvitationViewModel acceptInvitationViewModel2;
        AcceptInvitationViewModel acceptInvitationViewModel3;
        u.j(invitationHash, "invitationHash");
        u.j(onBack, "onBack");
        u.j(onInvitationAccepted, "onInvitationAccepted");
        u.j(onInvitationDenied, "onInvitationDenied");
        androidx.compose.runtime.b g11 = aVar.g(-1948973941);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (g11.K(invitationHash)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        int i18 = i12 & 2;
        if (i18 != 0) {
            i13 |= 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED;
        } else if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onBack)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i13 |= i15;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (g11.w(onInvitationAccepted)) {
                i16 = ModuleCopy.f28574b;
            } else {
                i16 = 1024;
            }
            i13 |= i16;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((57344 & i11) == 0) {
            if (g11.w(onInvitationDenied)) {
                i17 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i13 |= i17;
        }
        int i19 = i13;
        if (i18 == 2 && (46811 & i19) == 9362 && g11.h()) {
            g11.C();
            acceptInvitationViewModel3 = acceptInvitationViewModel;
        } else {
            g11.M0();
            if ((i11 & 1) != 0 && !g11.v0()) {
                g11.C();
                if (i18 != 0) {
                    i19 &= CallBack.OAID_TRACKING_OFF;
                }
            } else if (i18 != 0) {
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
                    g1 a13 = j6.b.a(AcceptInvitationViewModel.class, a11, null, a12, aVar2, g11);
                    g11.J();
                    g11.J();
                    i19 &= CallBack.OAID_TRACKING_OFF;
                    acceptInvitationViewModel2 = (AcceptInvitationViewModel) a13;
                    int i21 = i19;
                    g11.l0();
                    r0 c11 = h6.b.c(acceptInvitationViewModel2.k0(), g11);
                    z4 b10 = x4.b(g11);
                    k1.y.f(invitationHash, new h(acceptInvitationViewModel2, invitationHash, null), g11);
                    k1.y.f("events", new i(acceptInvitationViewModel2, b10, onInvitationAccepted, onInvitationDenied, onBack, c11, null), g11);
                    a((com.withings.sharing.datasharing.acceptinvitation.d) c11.getValue(), b10, onBack, new j(acceptInvitationViewModel2), new k(acceptInvitationViewModel2), g11, i21 & ConstantsWs.HWFAILURE_ZERO);
                    acceptInvitationViewModel3 = acceptInvitationViewModel2;
                } else {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
            }
            acceptInvitationViewModel2 = acceptInvitationViewModel;
            int i212 = i19;
            g11.l0();
            r0 c112 = h6.b.c(acceptInvitationViewModel2.k0(), g11);
            z4 b102 = x4.b(g11);
            k1.y.f(invitationHash, new h(acceptInvitationViewModel2, invitationHash, null), g11);
            k1.y.f("events", new i(acceptInvitationViewModel2, b102, onInvitationAccepted, onInvitationDenied, onBack, c112, null), g11);
            a((com.withings.sharing.datasharing.acceptinvitation.d) c112.getValue(), b102, onBack, new j(acceptInvitationViewModel2), new k(acceptInvitationViewModel2), g11, i212 & ConstantsWs.HWFAILURE_ZERO);
            acceptInvitationViewModel3 = acceptInvitationViewModel2;
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new l(invitationHash, acceptInvitationViewModel3, onBack, onInvitationAccepted, onInvitationDenied, i11, i12));
        }
    }
}
