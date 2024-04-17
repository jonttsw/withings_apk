package com.withings.device.details.wsd.programs.alarm;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.withings.alarm.model.DeviceAlarm;
import com.withings.alarm.ui.l;
import com.withings.alarm.ui.n;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsdMultipleAlarmFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/device/details/wsd/programs/alarm/WsdMultipleAlarmFragment;", "Lcom/withings/alarm/ui/n;", "<init>", "()V", "a", "device-details-wsd_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WsdMultipleAlarmFragment extends n {

    /* compiled from: WsdMultipleAlarmFragment.kt */
    /* loaded from: classes3.dex */
    private final class a extends n.a {
        public a() {
            super();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final l onCreateViewHolder(ViewGroup parent, int i11) {
            u.j(parent, "parent");
            WsdMultipleAlarmFragment wsdMultipleAlarmFragment = WsdMultipleAlarmFragment.this;
            vg.a aVar = new vg.a(wsdMultipleAlarmFragment.requireActivity().getLayoutInflater().inflate(C1987R.layout.view_alarm_line_wsd, parent, false));
            aVar.s(wsdMultipleAlarmFragment);
            return aVar;
        }
    }

    @Override // com.withings.alarm.ui.n, com.withings.alarm.ui.l.d
    public final void P0(vg.a wsdAlarmViewHolder, DeviceAlarm deviceAlarm) {
        u.j(wsdAlarmViewHolder, "wsdAlarmViewHolder");
        u.j(deviceAlarm, "deviceAlarm");
        this.f31193e.V0(this, deviceAlarm);
    }

    @Override // com.withings.alarm.ui.n, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        a aVar = new a();
        this.f31192d = aVar;
        this.f31191c.setAdapter(aVar);
    }

    public final void x1() {
        this.f31194f = -1;
        this.f31192d.notifyDataSetChanged();
    }
}
