package com.withings.wiscale2.mydevices;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.withings.device.DeviceModel;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.ui.SetupActivity;
import k1.r0;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: MyDevicesFragment.kt */
/* loaded from: classes5.dex */
final class d extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f58648a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ fl.o f58649b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0<Boolean> f58650c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r0<fl.o> f58651d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(q qVar, fl.o oVar, r0<Boolean> r0Var, r0<fl.o> r0Var2) {
        super(0);
        this.f58648a = qVar;
        this.f58649b = oVar;
        this.f58650c = r0Var;
        this.f58651d = r0Var2;
    }

    @Override // ym0.a
    public final y invoke() {
        Context context;
        int i11 = q.f58662l;
        this.f58650c.setValue(Boolean.FALSE);
        this.f58651d.setValue(null);
        q qVar = this.f58648a;
        FragmentActivity activity = qVar.getActivity();
        if (activity != null) {
            context = activity.getBaseContext();
        } else {
            context = null;
        }
        fl.o oVar = this.f58649b;
        Setup e02 = oVar.e0(new DeviceModel(oVar.a(), null));
        int i12 = SetupActivity.f37851v;
        v70.a.d("proximity_device_detection_clicked", "proximity_device_detection_clicked", null, true);
        qVar.startActivity(SetupActivity.Q3(context, e02).putExtra("skipInstructions", true));
        return y.f85009a;
    }
}
