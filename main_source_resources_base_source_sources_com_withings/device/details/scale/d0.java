package com.withings.device.details.scale;

import android.app.ProgressDialog;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.withings.device.Device;
import com.withings.device.details.scale.b;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScaleSharingFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.scale.ScaleSharingFragment$share$1", f = "ScaleSharingFragment.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class d0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    FragmentActivity f36923a;

    /* renamed from: b  reason: collision with root package name */
    ProgressDialog f36924b;

    /* renamed from: c  reason: collision with root package name */
    int f36925c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ Object f36926d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ c0 f36927e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(c0 c0Var, qm0.d<? super d0> dVar) {
        super(2, dVar);
        this.f36927e = c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        d0 d0Var = new d0(this.f36927e, dVar);
        d0Var.f36926d = obj;
        return d0Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((d0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FragmentActivity requireActivity;
        Device w12;
        ProgressDialog progressDialog;
        CoroutineScope coroutineScope;
        Device w13;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f36925c;
        c0 c0Var = this.f36927e;
        if (i11 != 0) {
            if (i11 == 1) {
                progressDialog = this.f36924b;
                requireActivity = this.f36923a;
                coroutineScope = (CoroutineScope) this.f36926d;
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.f36926d;
            requireActivity = c0Var.requireActivity();
            kotlin.jvm.internal.u.i(requireActivity, "requireActivity(...)");
            ProgressDialog show = ProgressDialog.show(requireActivity, null, c0Var.getString(C1987R.string._LOADING_), true, false);
            b bVar = c0Var.f36915h;
            if (bVar != null) {
                w12 = c0Var.w1();
                this.f36926d = coroutineScope2;
                this.f36923a = requireActivity;
                this.f36924b = show;
                this.f36925c = 1;
                Object a11 = bVar.a(w12, this);
                if (a11 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                progressDialog = show;
                coroutineScope = coroutineScope2;
                obj = a11;
            } else {
                kotlin.jvm.internal.u.s("generateShareScaleLinkUseCase");
                throw null;
            }
        }
        b.a aVar = (b.a) obj;
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        if (aVar instanceof b.a.c) {
            qn.a aVar2 = c0Var.f36916i;
            if (aVar2 != null) {
                w13 = c0Var.w1();
                u70.e.e(requireActivity, aVar2.a(requireActivity, w13, ((b.a.c) aVar).a()));
            } else {
                kotlin.jvm.internal.u.s("getScaleShareTextUseCase");
                throw null;
            }
        } else if (aVar instanceof b.a.C0487b) {
            x70.b.d(coroutineScope, "Could not share link to scale because there is no internet", new Object[0]);
            Toast.makeText(requireActivity, (int) C1987R.string._INTERNET_NEEDED_TEXT_, 0).show();
        } else if (aVar instanceof b.a.C0486a) {
            x70.b.f(coroutineScope, ((b.a.C0486a) aVar).a(), "Could not share link to scale", new Object[0]);
            Toast.makeText(requireActivity, (int) C1987R.string._ERROR_, 0).show();
        }
        return nm0.y.f85009a;
    }
}
