package com.withings.wiscale2.settings;

import com.withings.account.network.ws.AccountRemoteRepository;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.k;
/* compiled from: SettingsViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.SettingsViewModel$requestNewPassword$1", f = "SettingsViewModel.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class j5 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f60080a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60081b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(SettingsViewModel settingsViewModel, qm0.d<? super j5> dVar) {
        super(2, dVar);
        this.f60081b = settingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new j5(this.f60081b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((j5) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        xw.n nVar;
        xw.n nVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f60080a;
        SettingsViewModel settingsViewModel = this.f60081b;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                AccountRemoteRepository accountRemoteRepository = settingsViewModel.f59765h;
                String b10 = settingsViewModel.f59759b.h().b();
                this.f60080a = 1;
                if (accountRemoteRepository.requestNewPassword(b10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            a11 = nm0.y.f85009a;
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        if (!(a11 instanceof k.a)) {
            nm0.y yVar = (nm0.y) a11;
            nVar2 = settingsViewModel.f59774q;
            nVar2.postValue(new nm0.j(new Integer((int) C1987R.string._FORGOT_PASSWORD_SUCCESS_TITLE_), new Integer((int) C1987R.string._FORGOT_PASSWORD_SUCCESS_MESSAGE_)));
        }
        if (nm0.k.b(a11) != null) {
            nVar = settingsViewModel.f59774q;
            nVar.postValue(new nm0.j(new Integer((int) C1987R.string._FORGOT_PASSWORD_ERROR_TITLE_), new Integer((int) C1987R.string._FORGOT_PASSWORD_ERROR_MESSAGE_)));
        }
        return nm0.y.f85009a;
    }
}
