package com.withings.authentication.tryToLogin.mail;

import androidx.camera.camera2.internal.k0;
import androidx.navigation.b0;
import androidx.navigation.t;
import dp0.j;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.l;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TryToLoginViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.tryToLogin.mail.TryToLoginViewModel$onDeeplinkWithShortcodeClicked$1", f = "TryToLoginViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class d extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TryToLoginViewModel f32447a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f32448b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.navigation.e f32449c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f32450d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f32451e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TryToLoginViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class a extends w implements l<b0, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f32452a = new w(1);

        @Override // ym0.l
        public final y invoke(b0 b0Var) {
            b0 navigate = b0Var;
            u.j(navigate, "$this$navigate");
            navigate.g();
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TryToLoginViewModel tryToLoginViewModel, String str, androidx.navigation.e eVar, String str2, String str3, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f32447a = tryToLoginViewModel;
        this.f32448b = str;
        this.f32449c = eVar;
        this.f32450d = str2;
        this.f32451e = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new d(this.f32447a, this.f32448b, this.f32449c, this.f32450d, this.f32451e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String concat;
        t y11;
        String v11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        TryToLoginViewModel tryToLoginViewModel = this.f32447a;
        String K0 = tryToLoginViewModel.K0();
        str = tryToLoginViewModel.f32398q;
        if (K0 != null) {
            boolean e11 = u.e(this.f32448b, str);
            androidx.navigation.e eVar = this.f32449c;
            if (!e11 && ((y11 = eVar.y()) == null || (v11 = y11.v()) == null || !j.r(v11, "authentication/mailCodeInput", false))) {
                K0 = null;
            }
            if (K0 != null) {
                String str2 = this.f32450d;
                String str3 = this.f32451e;
                if (str2 != null) {
                    TryToLoginViewModel.f0(tryToLoginViewModel, K0, str2);
                } else if (str3 != null) {
                    tryToLoginViewModel.k1(str3);
                }
                String str4 = "";
                String str5 = (str2 == null || (str5 = "jwt=".concat(str2)) == null) ? "" : "";
                if (str3 != null && (concat = "code=".concat(str3)) != null) {
                    str4 = concat;
                }
                eVar.J(k0.c("authentication/mailCodeInput/", K0, "?", str5, str4), a.f32452a);
            }
        }
        return y.f85009a;
    }
}
