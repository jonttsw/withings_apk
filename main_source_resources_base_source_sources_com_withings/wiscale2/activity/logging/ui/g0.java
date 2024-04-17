package com.withings.wiscale2.activity.logging.ui;

import android.content.DialogInterface;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.Track;
/* compiled from: EditWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class g0 extends kotlin.jvm.internal.w implements ym0.l<Track, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditWorkoutActivity f48348a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(EditWorkoutActivity editWorkoutActivity) {
        super(1);
        this.f48348a = editWorkoutActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Track track) {
        final Track event = track;
        kotlin.jvm.internal.u.j(event, "event");
        int i11 = EditWorkoutActivity.S;
        final EditWorkoutActivity editWorkoutActivity = this.f48348a;
        editWorkoutActivity.getClass();
        qc.b bVar = new qc.b(editWorkoutActivity);
        bVar.v(editWorkoutActivity.getString(C1987R.string._ADD_OVERLAPPING_ACTIVITY_CONFIRMATION_ALTERNATIVE_));
        bVar.A(editWorkoutActivity.getString(C1987R.string._YES_), new DialogInterface.OnClickListener() { // from class: com.withings.wiscale2.activity.logging.ui.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                EditWorkoutActivity.I3(EditWorkoutActivity.this, event);
            }
        });
        bVar.h(editWorkoutActivity.getString(C1987R.string._NO_), new ao.f(1));
        bVar.s();
        return nm0.y.f85009a;
    }
}
