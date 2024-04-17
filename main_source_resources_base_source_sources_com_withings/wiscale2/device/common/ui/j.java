package com.withings.wiscale2.device.common.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseDeviceInfoFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.BaseDeviceInfoFragment$dissociateOtherAccounts$1", f = "BaseDeviceInfoFragment.kt", l = {ConstantsWs.WS_STATUS_PROGRAM_CLOSED}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class j extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    ProgressDialog f53999a;

    /* renamed from: b  reason: collision with root package name */
    int f54000b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f54001c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ h f54002d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, h hVar, qm0.d<? super j> dVar) {
        super(2, dVar);
        this.f54001c = context;
        this.f54002d = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new j(this.f54001c, this.f54002d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((j) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ProgressDialog progressDialog;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f54000b;
        Context context = this.f54001c;
        h hVar = this.f54002d;
        if (i11 != 0) {
            if (i11 == 1) {
                progressDialog = this.f53999a;
                try {
                    nm0.l.b(obj);
                } catch (Exception unused) {
                    progressDialog.dismiss();
                    Toast.makeText(context, (int) C1987R.string.device_dissociationOtherAccountsFailed_description, 1).show();
                    return nm0.y.f85009a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            ProgressDialog show = ProgressDialog.show(context, null, hVar.getString(C1987R.string._LOADING_), true, false);
            try {
                com.withings.device.details.c0 c0Var = hVar.f53950r;
                if (c0Var != null) {
                    long id2 = hVar.F1().getId();
                    this.f53999a = show;
                    this.f54000b = 1;
                    if (c0Var.c(id2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    progressDialog = show;
                } else {
                    kotlin.jvm.internal.u.s("dissociateDeviceUseCase");
                    throw null;
                }
            } catch (Exception unused2) {
                progressDialog = show;
                progressDialog.dismiss();
                Toast.makeText(context, (int) C1987R.string.device_dissociationOtherAccountsFailed_description, 1).show();
                return nm0.y.f85009a;
            }
        }
        nn.c D1 = hVar.D1();
        if (D1 != null) {
            D1.U1();
        }
        progressDialog.dismiss();
        Toast.makeText(context, (int) C1987R.string.device_dissociationOtherAccountsSuccessed_description, 1).show();
        return nm0.y.f85009a;
    }
}
