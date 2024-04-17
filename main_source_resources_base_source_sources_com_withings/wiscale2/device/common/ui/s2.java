package com.withings.wiscale2.device.common.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.withings.device.DeviceModel;
import com.withings.devicesetup.Setup;
import com.withings.wiscale2.C1987R;
/* compiled from: WaitForDeviceFragment.java */
/* loaded from: classes5.dex */
public class s2 extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private Setup f54079c;

    /* renamed from: d  reason: collision with root package name */
    private String f54080d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f54081e;

    public static s2 s1(DeviceModel deviceModel) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_DEVICE_MODEL", deviceModel);
        s2 s2Var = new s2();
        s2Var.setArguments(bundle);
        return s2Var;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DeviceModel deviceModel = (DeviceModel) getArguments().getParcelable("EXTRA_DEVICE_MODEL");
        Setup e02 = fl.p.f67672b.a().d(deviceModel.b()).e0(deviceModel);
        this.f54079c = e02;
        this.f54080d = getString(e02.S());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1987R.layout.fragment_waiting_for_device, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f54081e = (TextView) view.findViewById(C1987R.id.title);
        t1(this.f54080d);
    }

    public final void t1(String str) {
        this.f54080d = str;
        TextView textView = this.f54081e;
        if (textView != null) {
            if (str == null) {
                str = getString(this.f54079c.S());
            }
            textView.setText(str);
        }
    }
}
