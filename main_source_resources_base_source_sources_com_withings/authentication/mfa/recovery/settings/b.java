package com.withings.authentication.mfa.recovery.settings;

import ah.o;
import android.content.Context;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.v;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.l1;
import androidx.lifecycle.h1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.t;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.authentication.n;
import com.withings.common.compose.component.ButtonSize;
import com.withings.common.compose.component.ColorStyle;
import com.withings.common.compose.component.ToastStyle;
import com.withings.common.compose.component.input.InputFieldType;
import com.withings.common.compose.component.l;
import com.withings.common.compose.component.v4;
import com.withings.common.compose.component.z4;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import k1.j1;
import k1.v0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import l0.q;
import l0.r;
import nm0.k;
import nm0.y;
import okhttp3.internal.http2.Http2;
import r0.x;
import wk.c0;
import ym0.p;
/* compiled from: SettingsRecoveryCode.kt */
/* loaded from: classes3.dex */
public final class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsRecoveryCode.kt */
    /* loaded from: classes3.dex */
    public static final class a extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31892a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a<y> aVar) {
            super(2);
            this.f31892a = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                aVar2.s(-483455358);
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                l0 a11 = v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                int G = aVar2.G();
                v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(aVar3);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a12);
                    } else {
                        aVar2.m();
                    }
                    p c12 = t.c(aVar2, a11, aVar2, l5);
                    if (aVar2.e() || !u.e(aVar2.t(), Integer.valueOf(G))) {
                        q.a(G, aVar2, G, c12);
                    }
                    r.c(0, c11, j1.a(aVar2), aVar2, 2058660585);
                    v4.b(null, ay.b.u(C1987R.string.login_2FA_recovery_code, aVar2), ay.b.u(C1987R.string.login_2FA_recovery_code_detail, aVar2), null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
                    l.a(e1.f(x0.j(aVar3, yk.h.o(), yk.h.b(), yk.h.o(), 0.0f, 8), yk.h.r()), ay.b.u(C1987R.string._LEARN_MORE_, aVar2), null, false, ColorStyle.f33324c, ButtonSize.f33304f, false, this.f31892a, aVar2, 221184, 76);
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsRecoveryCode.kt */
    /* renamed from: com.withings.authentication.mfa.recovery.settings.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0421b extends w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f31893a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f31894b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31895c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31896d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0421b(String str, boolean z5, ym0.a<y> aVar, ym0.a<y> aVar2) {
            super(3);
            this.f31893a = str;
            this.f31894b = z5;
            this.f31895c = aVar;
            this.f31896d = aVar2;
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
                androidx.compose.ui.e f11 = x0.f(androidx.compose.ui.e.f8927a, yk.h.d());
                int i11 = androidx.compose.foundation.layout.e.f4229i;
                e.h o11 = androidx.compose.foundation.layout.e.o(yk.h.d());
                aVar2.s(-483455358);
                l0 b10 = n.b(o11, aVar2, -1323940314);
                int G = aVar2.G();
                v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a11 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(f11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a11);
                    } else {
                        aVar2.m();
                    }
                    p c12 = t.c(aVar2, b10, aVar2, l5);
                    if (aVar2.e() || !u.e(aVar2.t(), Integer.valueOf(G))) {
                        q.a(G, aVar2, G, c12);
                    }
                    r.c(0, c11, j1.a(aVar2), aVar2, 2058660585);
                    fk.q.b(null, InputFieldType.f33876d, null, null, this.f31893a, new androidx.compose.ui.text.b(ay.b.u(C1987R.string.login_2FA_recovery_code_info, aVar2), null, 6), null, null, s1.b.b(aVar2, 1885963423, new com.withings.authentication.mfa.recovery.settings.c(this.f31896d)), null, null, false, null, null, 0, null, false, null, null, aVar2, 100663344, 1572864, 458445);
                    l.c(null, ay.b.u(C1987R.string.login_2FA_getNewCode, aVar2), null, false, null, null, this.f31894b, this.f31895c, aVar2, 0, 61);
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsRecoveryCode.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31897a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z4 f31898b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f31899c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f31900d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31901e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31902f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31903g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f31904h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ym0.a<y> aVar, z4 z4Var, boolean z5, String str, ym0.a<y> aVar2, ym0.a<y> aVar3, ym0.a<y> aVar4, int i11) {
            super(2);
            this.f31897a = aVar;
            this.f31898b = z4Var;
            this.f31899c = z5;
            this.f31900d = str;
            this.f31901e = aVar2;
            this.f31902f = aVar3;
            this.f31903g = aVar4;
            this.f31904h = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f31904h | 1);
            ym0.a<y> aVar2 = this.f31902f;
            ym0.a<y> aVar3 = this.f31903g;
            b.a(this.f31897a, this.f31898b, this.f31899c, this.f31900d, this.f31901e, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsRecoveryCode.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.recovery.settings.SettingsRecoveryCodeKt$SettingsRecoveryCode$1", f = "SettingsRecoveryCode.kt", l = {74}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31905a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SettingsRecoveryCodeViewModel f31906b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z4 f31907c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f31908d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SettingsRecoveryCode.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.recovery.settings.SettingsRecoveryCodeKt$SettingsRecoveryCode$1$1", f = "SettingsRecoveryCode.kt", l = {76}, m = "invokeSuspend")
        /* loaded from: classes3.dex */
        public static final class a extends i implements p<k<? extends y>, qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f31909a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f31910b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ z4 f31911c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Context f31912d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z4 z4Var, Context context, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f31911c = z4Var;
                this.f31912d = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
                a aVar = new a(this.f31911c, this.f31912d, dVar);
                aVar.f31910b = obj;
                return aVar;
            }

            @Override // ym0.p
            public final Object invoke(k<? extends y> kVar, qm0.d<? super y> dVar) {
                return ((a) create(k.a(kVar.c()), dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f31909a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    Object c11 = ((k) this.f31910b).c();
                    if (k.b(c11) != null) {
                        ToastStyle toastStyle = ToastStyle.f33350c;
                        String string = this.f31912d.getString(C1987R.string._ERROR_);
                        u.i(string, "getString(...)");
                        this.f31910b = c11;
                        this.f31909a = 1;
                        if (z4.c(this.f31911c, toastStyle, string, null, 0L, null, this, 28) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(SettingsRecoveryCodeViewModel settingsRecoveryCodeViewModel, z4 z4Var, Context context, qm0.d<? super d> dVar) {
            super(2, dVar);
            this.f31906b = settingsRecoveryCodeViewModel;
            this.f31907c = z4Var;
            this.f31908d = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new d(this.f31906b, this.f31907c, this.f31908d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f31905a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                SharedFlow<k<y>> k02 = this.f31906b.k0();
                a aVar = new a(this.f31907c, this.f31908d, null);
                this.f31905a = 1;
                if (FlowKt.collectLatest(k02, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsRecoveryCode.kt */
    /* loaded from: classes3.dex */
    public static final class e extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f31913a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f31914b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, String str) {
            super(0);
            this.f31913a = context;
            this.f31914b = str;
        }

        @Override // ym0.a
        public final y invoke() {
            HMWebActivity.a aVar = HMWebActivity.f35395c;
            Context context = this.f31913a;
            context.startActivity(HMWebActivity.a.a(aVar, context, "url", null, this.f31914b, 16));
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsRecoveryCode.kt */
    /* loaded from: classes3.dex */
    public static final class f extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f31915a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f31916b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l1 f31917c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z4 f31918d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f31919e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(l1 l1Var, z4 z4Var, String str, String str2, CoroutineScope coroutineScope) {
            super(0);
            this.f31915a = str;
            this.f31916b = coroutineScope;
            this.f31917c = l1Var;
            this.f31918d = z4Var;
            this.f31919e = str2;
        }

        @Override // ym0.a
        public final y invoke() {
            BuildersKt__Builders_commonKt.launch$default(this.f31916b, null, null, new com.withings.authentication.mfa.recovery.settings.d(this.f31918d, this.f31919e, null), 3, null);
            this.f31917c.c(new androidx.compose.ui.text.b(this.f31915a, null, 6));
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsRecoveryCode.kt */
    /* loaded from: classes3.dex */
    public static final class g extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SettingsRecoveryCodeViewModel f31920a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(SettingsRecoveryCodeViewModel settingsRecoveryCodeViewModel) {
            super(0);
            this.f31920a = settingsRecoveryCodeViewModel;
        }

        @Override // ym0.a
        public final y invoke() {
            SettingsRecoveryCodeViewModel settingsRecoveryCodeViewModel = this.f31920a;
            settingsRecoveryCodeViewModel.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(settingsRecoveryCodeViewModel), Dispatchers.getIO(), null, new com.withings.authentication.mfa.recovery.settings.e(settingsRecoveryCodeViewModel, null), 2, null);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsRecoveryCode.kt */
    /* loaded from: classes3.dex */
    public static final class h extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SettingsRecoveryCodeViewModel f31921a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31922b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31923c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f31924d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(SettingsRecoveryCodeViewModel settingsRecoveryCodeViewModel, ym0.a<y> aVar, int i11, int i12) {
            super(2);
            this.f31921a = settingsRecoveryCodeViewModel;
            this.f31922b = aVar;
            this.f31923c = i11;
            this.f31924d = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f31923c | 1);
            b.b(this.f31921a, this.f31922b, aVar, g11, this.f31924d);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ym0.a<y> aVar, z4 z4Var, boolean z5, String str, ym0.a<y> aVar2, ym0.a<y> aVar3, ym0.a<y> aVar4, androidx.compose.runtime.a aVar5, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        androidx.compose.runtime.b g11 = aVar5.g(2094390170);
        if ((i11 & 14) == 0) {
            if (g11.w(aVar)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.K(z4Var)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.a(z5)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        }
        if ((i11 & 7168) == 0) {
            if (g11.K(str)) {
                i16 = ModuleCopy.f28574b;
            } else {
                i16 = 1024;
            }
            i12 |= i16;
        }
        if ((57344 & i11) == 0) {
            if (g11.w(aVar2)) {
                i15 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i15;
        }
        if ((458752 & i11) == 0) {
            if (g11.w(aVar3)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i12 |= i14;
        }
        if ((3670016 & i11) == 0) {
            if (g11.w(aVar4)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i12 |= i13;
        }
        if ((2995931 & i12) == 599186 && g11.h()) {
            g11.C();
        } else {
            float o11 = yk.h.o();
            float d11 = yk.h.d();
            c0.b(null, z4Var, null, aVar, null, s1.b.b(g11, 341144934, new a(aVar2)), null, null, 0L, false, new x(o11, d11, o11, d11), null, 0.0f, false, s1.b.b(g11, -450297632, new C0421b(str, z5, aVar4, aVar3)), g11, 196608 | (i12 & 112) | ((i12 << 9) & 7168), 24576, 15317);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c(aVar, z4Var, z5, str, aVar2, aVar3, aVar4, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.withings.authentication.mfa.recovery.settings.SettingsRecoveryCodeViewModel r22, ym0.a<nm0.y> r23, androidx.compose.runtime.a r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.mfa.recovery.settings.b.b(com.withings.authentication.mfa.recovery.settings.SettingsRecoveryCodeViewModel, ym0.a, androidx.compose.runtime.a, int, int):void");
    }
}
