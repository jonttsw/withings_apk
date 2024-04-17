package com.withings.wiscale2.device.common.feature.respiratoryscan;

import androidx.fragment.app.FragmentManager;
import com.withings.wiscale2.C1987R;
import gi.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.x;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: RespiratoryScanActivationActivity.kt */
/* loaded from: classes5.dex */
final class f extends w implements ym0.l<nm0.j<? extends Integer, ? extends List<? extends n>>, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RespiratoryScanActivationActivity f52450a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RespiratoryScanActivationActivity respiratoryScanActivationActivity) {
        super(1);
        this.f52450a = respiratoryScanActivationActivity;
    }

    @Override // ym0.l
    public final y invoke(nm0.j<? extends Integer, ? extends List<? extends n>> jVar) {
        boolean z5;
        nm0.j<? extends Integer, ? extends List<? extends n>> jVar2 = jVar;
        int intValue = jVar2.a().intValue();
        fn0.k<Object>[] kVarArr = RespiratoryScanActivationActivity.f52420k;
        RespiratoryScanActivationActivity respiratoryScanActivationActivity = this.f52450a;
        respiratoryScanActivationActivity.getClass();
        List<? extends n> b10 = jVar2.b();
        ArrayList arrayList = new ArrayList(x.y(b10, 10));
        int i11 = 0;
        for (Object obj : b10) {
            int i12 = i11 + 1;
            if (i11 >= 0) {
                n nVar = (n) obj;
                u.j(nVar, "<this>");
                String string = respiratoryScanActivationActivity.getString(nVar.c());
                u.i(string, "getString(...)");
                gi.b bVar = new gi.b(4, string, respiratoryScanActivationActivity.getString(nVar.a()), false, nVar.b());
                if (i11 == intValue) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                bVar.e(z5);
                arrayList.add(bVar);
                i11 = i12;
            } else {
                x.K0();
                throw null;
            }
        }
        n0 n0Var = new n0();
        n0Var.f76254a = intValue;
        FragmentManager supportFragmentManager = respiratoryScanActivationActivity.getSupportFragmentManager();
        u.i(supportFragmentManager, "getSupportFragmentManager(...)");
        j.a aVar = new j.a(supportFragmentManager);
        aVar.y(respiratoryScanActivationActivity.getString(C1987R.string.respiratoryScan_title));
        aVar.a(respiratoryScanActivationActivity.getString(C1987R.string.respiratoryScan_settings_batteryDisclaimer));
        String string2 = respiratoryScanActivationActivity.getString(C1987R.string._SET_);
        u.i(string2, "getString(...)");
        aVar.q(string2, new g(respiratoryScanActivationActivity, n0Var));
        aVar.r(new h(n0Var), arrayList);
        aVar.x();
        return y.f85009a;
    }
}
