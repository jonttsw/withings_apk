package com.withings.wiscale2.settings;

import com.withings.common.compose.component.ToastStyle;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SettingsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.SettingsActivity$changePasswordScreen$1$1$2$1", f = "SettingsActivity.kt", l = {862}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class c3 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f59941a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f59942b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ com.withings.common.compose.component.z4 f59943c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f59944d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(SettingsViewModel settingsViewModel, com.withings.common.compose.component.z4 z4Var, String str, qm0.d<? super c3> dVar) {
        super(2, dVar);
        this.f59942b = settingsViewModel;
        this.f59943c = z4Var;
        this.f59944d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new c3(this.f59942b, this.f59943c, this.f59944d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((c3) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f59941a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f59942b.T0();
            ToastStyle toastStyle = ToastStyle.f33350c;
            this.f59941a = 1;
            if (com.withings.common.compose.component.z4.c(this.f59943c, toastStyle, this.f59944d, null, 0L, null, this, 28) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
