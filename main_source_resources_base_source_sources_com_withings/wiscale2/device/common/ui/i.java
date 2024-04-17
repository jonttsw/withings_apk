package com.withings.wiscale2.device.common.ui;

import android.app.ProgressDialog;
import android.content.Context;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: BaseDeviceInfoFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.BaseDeviceInfoFragment$dissociateFromMyAccount$1", f = "BaseDeviceInfoFragment.kt", l = {366}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class i extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    h f53973a;

    /* renamed from: b  reason: collision with root package name */
    int f53974b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f53975c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Context f53976d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ h f53977e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, h hVar, qm0.d<? super i> dVar) {
        super(2, dVar);
        this.f53976d = context;
        this.f53977e = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        i iVar = new i(this.f53976d, this.f53977e, dVar);
        iVar.f53975c = obj;
        return iVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((i) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Dialog] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ProgressDialog progressDialog;
        h hVar;
        ProgressDialog progressDialog2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f53974b;
        Object obj2 = null;
        h hVar2 = this.f53977e;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    hVar = this.f53973a;
                    ProgressDialog progressDialog3 = (ProgressDialog) this.f53975c;
                    nm0.l.b(obj);
                    progressDialog2 = progressDialog3;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f53975c;
                ProgressDialog show = ProgressDialog.show(this.f53976d, null, hVar2.getString(C1987R.string._LOADING_), true, false);
                com.withings.device.details.c0 c0Var = hVar2.f53950r;
                if (c0Var != null) {
                    long id2 = hVar2.F1().getId();
                    this.f53975c = show;
                    this.f53973a = hVar2;
                    this.f53974b = 1;
                    if (c0Var.b(id2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    hVar = hVar2;
                    progressDialog2 = show;
                } else {
                    kotlin.jvm.internal.u.s("dissociateDeviceUseCase");
                    throw null;
                }
            }
            progressDialog2.dismiss();
            nn.c D1 = hVar.D1();
            progressDialog = progressDialog2;
            if (D1 != null) {
                D1.U1();
                obj2 = nm0.y.f85009a;
                progressDialog = progressDialog2;
            }
        } catch (Throwable th2) {
            obj2 = nm0.l.a(th2);
            progressDialog = i11;
        }
        Throwable b10 = nm0.k.b(obj2);
        if (b10 != null) {
            progressDialog.dismiss();
            h.z1(hVar2, b10);
        }
        return nm0.y.f85009a;
    }
}
