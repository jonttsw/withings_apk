package com.withings.wiscale2.device.common.ui;

import android.app.ProgressDialog;
import android.content.Context;
import com.withings.core.webcontent.HMWebViewDelegate;
import com.withings.device.details.c0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: BaseDeviceInfoFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.BaseDeviceInfoFragment$onDissociateSingleUser$1", f = "BaseDeviceInfoFragment.kt", l = {ConstantsWs.WS_STATUS_UNKNOWN_ACCOUNT}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class k extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    h f54004a;

    /* renamed from: b  reason: collision with root package name */
    Context f54005b;

    /* renamed from: c  reason: collision with root package name */
    int f54006c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ Object f54007d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Context f54008e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ h f54009f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, h hVar, qm0.d<? super k> dVar) {
        super(2, dVar);
        this.f54008e = context;
        this.f54009f = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        k kVar = new k(this.f54008e, this.f54009f, dVar);
        kVar.f54007d = obj;
        return kVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((k) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        h hVar;
        Context context;
        ProgressDialog progressDialog;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f54006c;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    context = this.f54005b;
                    hVar = this.f54004a;
                    progressDialog = (ProgressDialog) this.f54007d;
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f54007d;
                hVar = this.f54009f;
                String string = hVar.getString(C1987R.string._LOADING_);
                Context context2 = this.f54008e;
                ProgressDialog show = ProgressDialog.show(context2, null, string, true, false);
                com.withings.device.details.c0 c0Var = hVar.f53950r;
                if (c0Var != null) {
                    long id2 = hVar.F1().getId();
                    this.f54007d = show;
                    this.f54004a = hVar;
                    this.f54005b = context2;
                    this.f54006c = 1;
                    Object d11 = c0Var.d(id2, this);
                    if (d11 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    context = context2;
                    progressDialog = show;
                    obj = d11;
                } else {
                    kotlin.jvm.internal.u.s("dissociateDeviceUseCase");
                    throw null;
                }
            }
            c0.a aVar = (c0.a) obj;
            if (kotlin.jvm.internal.u.e(aVar, c0.a.c.f36762a)) {
                progressDialog.dismiss();
                nn.c D1 = hVar.D1();
                if (D1 != null) {
                    D1.U1();
                }
            } else if (kotlin.jvm.internal.u.e(aVar, c0.a.b.f36761a)) {
                progressDialog.dismiss();
                nn.c D12 = hVar.D1();
                if (D12 != null) {
                    D12.U1();
                }
                ch.l lVar = hVar.f53949q;
                if (lVar != null) {
                    String string2 = context.getString(C1987R.string.dissociation_device_not_connected_android_url);
                    kotlin.jvm.internal.u.i(string2, "getString(...)");
                    context.startActivity(ch.l.a(lVar, context, null, null, string2, new HMWebViewDelegate(), 6));
                } else {
                    kotlin.jvm.internal.u.s("webIntentBuilder");
                    throw null;
                }
            } else if (aVar instanceof c0.a.C0483a) {
                progressDialog.dismiss();
                h.z1(hVar, ((c0.a.C0483a) aVar).a());
            }
            nm0.y yVar = nm0.y.f85009a;
        } catch (Throwable th2) {
            nm0.l.a(th2);
        }
        return nm0.y.f85009a;
    }
}
