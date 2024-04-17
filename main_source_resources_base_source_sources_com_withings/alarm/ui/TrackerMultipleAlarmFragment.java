package com.withings.alarm.ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.withings.alarm.ui.n;
import com.withings.wiscale2.C1987R;
/* loaded from: classes3.dex */
public class TrackerMultipleAlarmFragment extends n {

    /* loaded from: classes3.dex */
    private class a extends n.a {
        a() {
            super();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final l onCreateViewHolder(ViewGroup viewGroup, int i11) {
            TrackerMultipleAlarmFragment trackerMultipleAlarmFragment = TrackerMultipleAlarmFragment.this;
            l lVar = new l(trackerMultipleAlarmFragment.getActivity().getLayoutInflater().inflate(C1987R.layout.view_alarm_line_tracker, viewGroup, false));
            lVar.f31164b = trackerMultipleAlarmFragment;
            return lVar;
        }
    }

    @Override // com.withings.alarm.ui.n, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        a aVar = new a();
        this.f31192d = aVar;
        this.f31191c.setAdapter(aVar);
    }
}
