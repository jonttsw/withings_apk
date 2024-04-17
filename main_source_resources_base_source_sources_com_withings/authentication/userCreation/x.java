package com.withings.authentication.userCreation;

import android.content.Context;
import android.widget.Toast;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import th.a;
/* compiled from: UserInfoNavigation.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.userCreation.UserInfoNavigationKt$onError$1", f = "UserInfoNavigation.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class x extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a.b.InterfaceC1655b f32620a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f32621b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a.b.InterfaceC1655b interfaceC1655b, Context context, qm0.d<? super x> dVar) {
        super(2, dVar);
        this.f32620a = interfaceC1655b;
        this.f32621b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new x(this.f32620a, this.f32621b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((x) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        a.b.InterfaceC1655b.e eVar = a.b.InterfaceC1655b.e.f99784a;
        a.b.InterfaceC1655b interfaceC1655b = this.f32620a;
        if (kotlin.jvm.internal.u.e(interfaceC1655b, eVar)) {
            i11 = C1987R.string._NETWORK_ERROR_;
        } else if (kotlin.jvm.internal.u.e(interfaceC1655b, a.b.InterfaceC1655b.c.f99782a)) {
            i11 = C1987R.string.login_passcode_expired_description;
        } else if (kotlin.jvm.internal.u.e(interfaceC1655b, a.b.InterfaceC1655b.f.f99785a)) {
            i11 = C1987R.string.login_passcode_too_many__attempts;
        } else if (kotlin.jvm.internal.u.e(interfaceC1655b, a.b.InterfaceC1655b.C1656a.f99780a)) {
            i11 = C1987R.string._EMAIL_EXIST_LOGIN_TITLE_;
        } else {
            i11 = C1987R.string._ERROR_;
        }
        Toast.makeText(this.f32621b, i11, 0).show();
        return y.f85009a;
    }
}
