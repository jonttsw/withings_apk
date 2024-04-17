package com.withings.wiscale2.device.hwa06.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
/* compiled from: Hwa06InfoFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/hwa06/ui/b;", "Lcom/withings/wiscale2/device/common/ui/h;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class b extends com.withings.wiscale2.device.common.ui.h {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f54337w = 0;

    /* renamed from: t  reason: collision with root package name */
    private LineCellView f54338t;

    /* renamed from: u  reason: collision with root package name */
    private LineCellView f54339u;

    /* renamed from: v  reason: collision with root package name */
    private final int f54340v = C1987R.layout.fragment_device_info_hwa06;

    public static void S1(b this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.N1();
    }

    public static void T1(b this$0, View view) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Context context = view.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        this$0.M1(context);
    }

    @Override // com.withings.wiscale2.device.common.ui.h
    public final int H1() {
        return this.f54340v;
    }

    @Override // com.withings.wiscale2.device.common.ui.h, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i11;
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C1987R.id.device_firmware);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f54338t = (LineCellView) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.device_serial);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f54339u = (LineCellView) findViewById2;
        view.findViewById(C1987R.id.button_dissociate).setOnClickListener(new sg.f(this, 13));
        view.findViewById(C1987R.id.device_walkthrough).setOnClickListener(new sg.g(this, 10));
        view.findViewById(C1987R.id.device_faq).setOnClickListener(new dq.a(this, 3));
        View findViewById3 = view.findViewById(C1987R.id.section_settings);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        String upgradeUrl = F1().getUpgradeUrl();
        if (upgradeUrl != null && upgradeUrl.length() > 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        findViewById3.setVisibility(i11);
        LineCellView lineCellView = this.f54338t;
        if (lineCellView != null) {
            lineCellView.setValue(String.valueOf(F1().getFirmware()));
            LineCellView lineCellView2 = this.f54339u;
            if (lineCellView2 != null) {
                lineCellView2.setSecondaryLabel(F1().getMacAddress().toString());
                return;
            } else {
                kotlin.jvm.internal.u.s("serialView");
                throw null;
            }
        }
        kotlin.jvm.internal.u.s("firmwareView");
        throw null;
    }
}
