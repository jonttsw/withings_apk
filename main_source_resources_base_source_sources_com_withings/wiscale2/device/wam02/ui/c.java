package com.withings.wiscale2.device.wam02.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.withings.common.device.DeviceSettingsActivity;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.ui.h;
import com.withings.wiscale2.device.wam02.ui.Wam02PolarizationActivity;
import gi.f;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import tb0.j2;
import u70.i;
/* compiled from: Wam02InfoFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/wam02/ui/c;", "Lcom/withings/wiscale2/device/common/ui/h;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class c extends h {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f54905u = 0;

    /* renamed from: t  reason: collision with root package name */
    private final int f54906t = C1987R.layout.fragment_device_info_wam02;

    public static void S1(View view, c this$0) {
        u.j(view, "$view");
        u.j(this$0, "this$0");
        Wam02PolarizationActivity.a aVar = Wam02PolarizationActivity.f54887h;
        Context context = view.getContext();
        u.i(context, "getContext(...)");
        i macAddress = this$0.F1().getMacAddress();
        u.i(macAddress, "getMacAddress(...)");
        aVar.getClass();
        Intent putExtra = new Intent(context, Wam02PolarizationActivity.class).putExtra("macAddress", macAddress);
        u.i(putExtra, "putExtra(...)");
        DeviceSettingsActivity.c cVar = DeviceSettingsActivity.f35012e;
        Context context2 = view.getContext();
        u.i(context2, "getContext(...)");
        Device F1 = this$0.F1();
        cVar.getClass();
        this$0.startActivity(DeviceSettingsActivity.c.c(context2, F1, putExtra));
    }

    public static void T1(View view, c this$0) {
        u.j(this$0, "this$0");
        u.j(view, "$view");
        Context context = view.getContext();
        u.i(context, "getContext(...)");
        this$0.M1(context);
    }

    public static void U1(c this$0) {
        u.j(this$0, "this$0");
        this$0.N1();
    }

    @Override // com.withings.wiscale2.device.common.ui.h
    public final int H1() {
        return this.f54906t;
    }

    @Override // com.withings.wiscale2.device.common.ui.h, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        j2 a11 = j2.a(view);
        a11.f99237d.setValue(String.valueOf(F1().getFirmware()));
        a11.f99238e.setSecondaryLabel(F1().getMacAddress().toString());
        a11.f99235b.setOnClickListener(new za0.b(3, view, this));
        a11.f99239f.setOnClickListener(new f(this, 14));
        a11.f99236c.setOnClickListener(new xn.b(this, view, 2));
        a11.f99234a.setOnClickListener(new uc0.d(1, this, view));
    }
}
