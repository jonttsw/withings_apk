package com.withings.wiscale2.settings;

import com.withings.common.compose.component.ToastStyle;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SettingsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.SettingsActivity$changePasswordScreen$1$1$1$1", f = "SettingsActivity.kt", l = {872}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class a3 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f59861a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f59862b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ com.withings.common.compose.component.z4 f59863c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f59864d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f59865e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(SettingsViewModel settingsViewModel, com.withings.common.compose.component.z4 z4Var, SettingsActivity settingsActivity, ym0.a<nm0.y> aVar, qm0.d<? super a3> dVar) {
        super(2, dVar);
        this.f59862b = settingsViewModel;
        this.f59863c = z4Var;
        this.f59864d = settingsActivity;
        this.f59865e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new a3(this.f59862b, this.f59863c, this.f59864d, this.f59865e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((a3) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f59861a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f59862b.T0();
            ToastStyle toastStyle = ToastStyle.f33351d;
            String string = this.f59864d.getString(C1987R.string.toast_password_reset);
            kotlin.jvm.internal.u.i(string, "getString(...)");
            this.f59861a = 1;
            if (com.withings.common.compose.component.z4.c(this.f59863c, toastStyle, string, null, 0L, null, this, 28) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f59865e.invoke();
        return nm0.y.f85009a;
    }
}
