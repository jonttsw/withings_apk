package com.withings.wiscale2.settings;

import com.withings.common.compose.component.ToastStyle;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SettingsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.SettingsActivity$createPassword$1$2$1$1$1", f = "SettingsActivity.kt", l = {831}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class k3 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f60102a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60103b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f60104c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60105d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ com.withings.common.compose.component.z4 f60106e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(SettingsViewModel settingsViewModel, r8.n nVar, SettingsActivity settingsActivity, com.withings.common.compose.component.z4 z4Var, qm0.d<? super k3> dVar) {
        super(2, dVar);
        this.f60103b = settingsViewModel;
        this.f60104c = nVar;
        this.f60105d = settingsActivity;
        this.f60106e = z4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new k3(this.f60103b, this.f60104c, this.f60105d, this.f60106e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((k3) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f60102a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f60103b.T0();
            androidx.navigation.e.P(this.f60104c, "account-security", false);
            String string = this.f60105d.getString(C1987R.string.toast_password_reset);
            ToastStyle toastStyle = ToastStyle.f33351d;
            kotlin.jvm.internal.u.g(string);
            this.f60102a = 1;
            if (com.withings.common.compose.component.z4.c(this.f60106e, toastStyle, string, null, 0L, null, this, 28) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
